package ntnu20.imt3673.group4.aves.location

import android.content.Context
import android.os.Looper
import android.util.Log
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices

/** Utility for getting the location for an observation */
object LocationUtility {
    const val LOCATION_PERMISSION_REQUEST_CODE = 999 // arbitrary code for identifying request

    // public variables read by consumer
    var latitude: Double = 0.0
    var longitude: Double = 0.0

    // Configures a listener for location updates
    fun configureLocationListener(ctx: Context) {
        val fusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(ctx)

        val locationRequest = LocationRequest()
            .setInterval(2000)
            .setFastestInterval(2000)
                // Here we're asking for the highest grade of updates possible,
                // will have to downgrade this, or limit it to just a single fragment
                // TODO: in the final version
            .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)

        // sending the request
        fusedLocationProviderClient.requestLocationUpdates(
            locationRequest,
            object : LocationCallback() { // the callback that will run periodically
                override fun onLocationResult(locationResult: LocationResult) {
                    super.onLocationResult(locationResult)

                    Log.d("LOCATION UTILITY", "updating coordinates...")
                    for (location in locationResult.locations) {
                        latitude = location.latitude
                        longitude = location.longitude
                    }
                }
            },
            Looper.myLooper()
        )
    }
}