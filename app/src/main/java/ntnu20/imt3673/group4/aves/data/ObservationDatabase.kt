package ntnu20.imt3673.group4.aves.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ObservationData::class], version = 2)
abstract class ObservationDatabase : RoomDatabase() {

    // Get the booking dao
    abstract fun observations(): ObservationDataDao

    companion object {
        // singleton instantiation
        @Volatile private var dbInstance: ObservationDatabase? = null

        /**
         * @brief getInstance gets the database that holds local observation entries
         */
        fun getInstance(context: Context): ObservationDatabase {
            return dbInstance ?: synchronized(this) {
                dbInstance ?: buildDatabase(context).also { dbInstance = it }
            }
        }

        /* Used to create database for first time use */
        private fun buildDatabase(context: Context): ObservationDatabase {
            return Room.databaseBuilder(
                context,
                ObservationDatabase::class.java,
                "expenses"
            ).build()
        }
    }
}