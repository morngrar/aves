package ntnu20.imt3673.group4.aves.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.EventListener
import com.google.firebase.firestore.QuerySnapshot
import ntnu20.imt3673.group4.aves.data.FirestoreRepository
import ntnu20.imt3673.group4.aves.data.ObservationData
import ntnu20.imt3673.group4.aves.data.User

class FirestoreViewModel : ViewModel() {
    val TAG = "FIRESTORE_VIEW_MODEL"

    var firebaseRepository = FirestoreRepository()
    var savedObservations : MutableLiveData<List<ObservationData>> = MutableLiveData()
    var userObject: MutableLiveData<User> = MutableLiveData()

    fun getCurrentUser() : LiveData<User>{
        firebaseRepository.getUser().addSnapshotListener(EventListener<DocumentSnapshot> {user, e ->
            if(e != null) {
                Log.w(TAG, "Listen failed.", e)
                userObject.value = null
                return@EventListener
            }
            val tempUser = user!!.toObject(User::class.java)
            userObject.value = tempUser
        })
        return  userObject
    }
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

            val savedObservationList : MutableList<ObservationData> = mutableListOf()
            for (doc in value!!) {
                val observationData = doc.toObject(ObservationData::class.java)
                savedObservationList.add(observationData)
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