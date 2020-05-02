package ntnu20.imt3673.group4.aves.data

import android.util.Log
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore

class FirestoreRepository {

    val TAG = "FIREBASE_REPOSITORY"
    var firestoreDB = FirebaseFirestore.getInstance()
    var user = FirebaseAuth.getInstance().currentUser


    // save observation to firebase
    fun saveObservationData(observationData: ObservationData): Task<DocumentReference> {
           return firestoreDB.collection("users").document("tempuser").collection("observation").add(observationData)
        //TODO: user ${user!!.uid} instead of tempuser
    }

    // get the users saved observations from firebase
    fun getSavedObservations(): CollectionReference {
        var collectionReference = firestoreDB.collection("users/tempuser/observations")
        //TODO: user ${user!!.uid} instead of tempuser
        return collectionReference
    }

    // get the all saved observations from firebase
    fun getAllObservations(): CollectionReference {
        var collectionReference = firestoreDB.collection("users/observations") // temp path for testing
        return collectionReference
    }

    // delete an observation
    fun deleteObservation(observationData: ObservationData): Task<Void> {
        var documentReference =  firestoreDB.collection("users/tempuser/Observations")
            .document(observationData.id.toString())
        //TODO: user ${user!!.uid} instead of tempuser
        return documentReference.delete()
    }

}