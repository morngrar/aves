package ntnu20.imt3673.group4.aves.data

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore

class FirestoreRepository {

    val TAG = "FIREBASE_REPOSITORY"
    var firestoreDB = FirebaseFirestore.getInstance()
    var user = FirebaseAuth.getInstance().currentUser


    // save observation to firebase
    fun saveObservationData(observationData: ObservationData): Task<Void> {
        var documentReference = firestoreDB.collection("users").document(user!!.email.toString())
            .collection("observations").document(observationData.id.toString())
        return documentReference.set(observationData)
    }

    // get the users saved observations from firebase
    fun getSavedObservations(): CollectionReference {
        var collectionReference = firestoreDB.collection("users/${user!!.email.toString()}/observations")
        return collectionReference
    }

    // delete an observation
    fun deleteObservation(observationData: ObservationData): Task<Void> {
        var documentReference =  firestoreDB.collection("users/${user!!.email.toString()}/Observations")
            .document(observationData.id.toString())

        return documentReference.delete()
    }

}