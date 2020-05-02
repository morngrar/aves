package ntnu20.imt3673.group4.aves

import android.app.Application
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.MarkerOptions
import ntnu20.imt3673.group4.aves.place.Place
import ntnu20.imt3673.group4.aves.place.PlacesReader
import ntnu20.imt3673.group4.aves.viewmodels.FirestoreViewModel


class BirdRadarFragment : Fragment() {

    private lateinit var mMap: GoogleMap
    private val places: List<Place> by lazy {
        PlacesReader(this.requireContext()).read()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var mapFragment = SupportMapFragment.newInstance()
        val fragmentTransaction =
            childFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.map_fragment, mapFragment)
        fragmentTransaction.commit();

        mapFragment.getMapAsync { googleMap -> addMarkers(googleMap) }


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bird_radar, container, false)
    }

    /**
     * Adds marker representations of the places list on the provided GoogleMap object.
     */
    private fun addMarkers(googleMap: GoogleMap) {
        Log.d("addMarkers ", googleMap.toString())
        places.forEach { place ->
            Log.d("Added new place: ", place.toString())
            val marker = googleMap.addMarker(
                MarkerOptions()
                    .title(place.name)
                    .position(place.latLng) // TODO: this does not work.
            )
       }
    }
}
