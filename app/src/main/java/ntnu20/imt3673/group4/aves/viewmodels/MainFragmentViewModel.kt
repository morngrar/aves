package ntnu20.imt3673.group4.aves.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import ntnu20.imt3673.group4.aves.data.ObservationDatabase

class MainFragmentViewModel(application: Application) : AndroidViewModel(application) {
    private val db = ObservationDatabase.getInstance(application)

    val allObservations = db.observations().getAllObservations()
}