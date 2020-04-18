package ntnu20.imt3673.group4.aves.location

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.LocationManager
import android.provider.Settings
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity

object PermissionUtility {
    fun haveFineLocationPermission(ctx: Context) : Boolean {
        return ContextCompat.checkSelfPermission(
            ctx,
            Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED
    }

    fun locationIsEnabled(ctx: Context) : Boolean {
        val locationManager: LocationManager =
            ctx.getSystemService(Context.LOCATION_SERVICE) as LocationManager

        return locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
                || locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
    }

    fun requestFineLocationPermission(activity: FragmentActivity, reqID: Int) {
        ActivityCompat.requestPermissions(
            activity,
            arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
            reqID
        )
    }

    fun showGPSAlertDialog(ctx: Context) {
        AlertDialog.Builder(ctx)
            .setTitle("Enable GPS")
            .setMessage("Need GPS for tracking observations")
            .setCancelable(false)
            .setPositiveButton("Enable now") {
                _, _ ->
                ctx.startActivity(Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS))
            }
            .show()
    }
}