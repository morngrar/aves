package ntnu20.imt3673.group4.aves.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.EventListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import ntnu20.imt3673.group4.aves.data.FirestoreRepository
import ntnu20.imt3673.group4.aves.data.ObservationData
import ntnu20.imt3673.group4.aves.observationList

class FirestoreViewModel : ViewModel() {
    val TAG = "FIRESTORE_VIEW_MODEL"
    var firebaseRepository = FirestoreRepository()
    var savedObservations : MutableLiveData<List<ObservationData>> = MutableLiveData()

    // save observation to firebase
    fun saveObservationToFirebase(observationData: ObservationData){
        firebaseRepository.saveObservationData(observationData).addOnFailureListener {
            Log.e(TAG,"Failed to save observation!")
        }
    }

    // get realtime updates from firebase regarding saved observations
    fun getSavedObservations(): LiveData<List<ObservationData>> {
        firebaseRepository.getSavedObservations().addSnapshotListener(EventListener<QuerySnapshot> { value, e ->
            if (e != null) {
                Log.w(TAG, "Listen failed.", e)
                savedObservations.value = null
                return@EventListener
            }

            var savedObservationList : MutableList<ObservationData> = mutableListOf()
            for (doc in value!!) {
                var observationData = doc.toObject(ObservationData::class.java)
                Log.d("AAAgetSavedcc ", doc.toString())
                savedObservationList.add(observationData)
            }
            savedObservations.value = savedObservationList
            Log.d("AAAsavedObservations: ", savedObservations.value.toString())
        })

        return savedObservations
    }

    // get realtime updates from firebase regarding all observations
    fun getAllObservations(): LiveData<List<ObservationData>> {
        firebaseRepository.getAllObservations().addSnapshotListener(EventListener<QuerySnapshot> { value, e ->
            if (e != null) {
                Log.w(TAG, "Listen failed.", e)
                savedObservations.value = null
                return@EventListener
            }

            var savedObservationList : MutableList<ObservationData> = mutableListOf()
            for (doc in value!!) {
                var addressItem = doc.toObject(ObservationData::class.java)
                savedObservationList.add(addressItem)
            }
            savedObservations.value = savedObservationList
        })

        return savedObservations
    }


    // delete an observation from firebase
    fun deleteObservation(observationData: ObservationData){
        firebaseRepository.deleteObservation(observationData).addOnFailureListener {
            Log.e(TAG,"Failed to delete observation")
        }
    }


}