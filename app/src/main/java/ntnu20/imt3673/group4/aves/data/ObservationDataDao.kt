package ntnu20.imt3673.group4.aves.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

/**
 * Dao defines a function interface against database queries
 */
@Dao
interface ObservationDataDao {
    @Query("SELECT * FROM observations ORDER BY time DESC")
    fun getAllObservations() : LiveData<List<ObservationData>>

    @Insert
    suspend fun insertObservation(observation: ObservationData)
}