package ntnu20.imt3673.group4.aves.location

import android.app.Activity
import android.content.Context
import android.os.Looper
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices

object LocationUtility {
    const val LOCATION_PERMISSION_REQUEST_CODE = 999

    var latitude: Double = 0.0
    var longitude: Double = 0.0

    fun configureLocationListener(ctx: Context) {
        val fusedLocationProviderClient =
            LocationServices.getFusedLocationProviderClient(ctx)

        val locationRequest = LocationRequest()
            .setInterval(2000)
            .setFastestInterval(2000)
            .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)

        fusedLocationProviderClient.requestLocationUpdates(
            locationRequest,
            object : LocationCallback() {
                override fun onLocationResult(locationResult: LocationResult) {
                    super.onLocationResult(locationResult)

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