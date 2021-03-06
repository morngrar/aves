package ntnu20.imt3673.group4.aves

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import ntnu20.imt3673.group4.aves.data.toPlace
import ntnu20.imt3673.group4.aves.location.LocationUtility
import ntnu20.imt3673.group4.aves.location.PermissionUtility
import ntnu20.imt3673.group4.aves.place.Place
import ntnu20.imt3673.group4.aves.viewmodels.FirestoreViewModel


class BirdRadarFragment : Fragment() {
    private val firestoreViewModel: FirestoreViewModel by activityViewModels()

    private lateinit var places: MutableList<Place>
    private var latitude = 0.0
    private var longitude = 0.0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val mapFragment = SupportMapFragment.newInstance()
        val fragmentTransaction =
            childFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.map_fragment, mapFragment)
        fragmentTransaction.commit();

        places = mutableListOf<Place>()
        getLocation()

        val allObservations = firestoreViewModel.getSavedObservations()

        allObservations.observe(viewLifecycleOwner, Observer { it ->
            it.forEach {
                places.add(it.toPlace())
            }
        })

        mapFragment.getMapAsync {
                googleMap -> addMarkers(googleMap)  // Add markers for observations
                googleMap.setOnMapLoadedCallback {
                    googleMap.moveCamera(CameraUpdateFactory.   // Set map camera to users location
                    newLatLngZoom(LatLng(latitude, longitude), 12.0F))
                }
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bird_radar, container, false)
    }

    /** Gets the current location */
    private fun getLocation() {
        if (PermissionUtility.haveFineLocationPermission(requireContext())) {
            Log.d("AVES", "havePermission")
            latitude = LocationUtility.latitude
            longitude = LocationUtility.longitude
        } else {
            Log.d("AVES", "havePermission is false")
        }
    }

    /**
     * Adds marker representations of the places list on the provided GoogleMap object.
     */
    private fun addMarkers(googleMap: GoogleMap) {
        Log.d("addMarkers ", googleMap.toString())
        places.forEach { place ->
            Log.d("Added new place: ", place.toString())
            googleMap.addMarker(
                MarkerOptions()
                    .title(place.name)
                    .position(place.latLng)
            )
       }
    }
}
