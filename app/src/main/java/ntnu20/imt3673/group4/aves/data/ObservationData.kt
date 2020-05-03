package ntnu20.imt3673.group4.aves.data

import android.os.Parcelable
import android.util.Log
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.android.gms.maps.model.LatLng
import kotlinx.android.parcel.Parcelize
import ntnu20.imt3673.group4.aves.place.Place

/** Data type for storing observations into database */
@Entity(tableName = "observations")
@Parcelize
data class ObservationData(
    @PrimaryKey//(autoGenerate = true)
    var id: String = "",
    val ownerID: String = "",
    val birdName: String = "",
    val description: String? = "",
    val count: String? ="",
    val imagePath: String ="",
    val time: Long = 0,
    val latitude: Double = 0.0,
    val longitude: Double = 0.0,
    val rain: String? = "",
    val temperature: String? = "",
    val windSpeed: String? = "",
    val cloudiness: String? = "",
    val pressure: String? = ""   // probably better to use the onboard sensor if available
) : Parcelable

fun ObservationData.toPlace(): Place = Place(
    name = birdName,
    latLng = LatLng(latitude, longitude)
)