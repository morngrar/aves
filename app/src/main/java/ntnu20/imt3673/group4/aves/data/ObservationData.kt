package ntnu20.imt3673.group4.aves.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

/** Data type for storing observations into database */
@Entity(tableName = "observations")
@Parcelize
data class ObservationData(
    @PrimaryKey//(autoGenerate = true)
    var id: String,
    val birdName: String,
    var description: String?,
    val imagePath: String,
    val time: Long,
    val latitude: Double,
    val longitude: Double,
    val rain: String,
    val windSpeed: String,
    val cloudiness: String,
    val pressure: String   // probably better to use the onboard sensor if available
) : Parcelable