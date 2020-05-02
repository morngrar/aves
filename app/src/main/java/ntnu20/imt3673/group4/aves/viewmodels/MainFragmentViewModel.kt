package ntnu20.imt3673.group4.aves.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModelProvider
import ntnu20.imt3673.group4.aves.data.ObservationDatabase

/** ViewModel for the main fragment with recycler view of all observations */
class MainFragmentViewModel(application: Application) : AndroidViewModel(application) {
    private val db = ObservationDatabase.getInstance(application)
    private val firestoreViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(
        Application()
    ).create(FirestoreViewModel::class.java)

    val allObservations = db.observations().getAllObservations()
    //val allObservations = firestoreViewModel.getSavedObservations()
}