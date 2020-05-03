package ntnu20.imt3673.group4.aves.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe


/** ViewModel for the main fragment with recycler view of all observations */
class MainFragmentViewModel(application: Application) : AndroidViewModel(application) {

    private val firestoreViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(
        Application()
    ).create(FirestoreViewModel::class.java)

    val allObservations = firestoreViewModel.getSavedObservations()
}