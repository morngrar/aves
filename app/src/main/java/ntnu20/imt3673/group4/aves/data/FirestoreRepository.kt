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

    private val currentUserDocRef: DocumentReference
        get() = firestoreDB.document(
            "users/${FirebaseAuth.getInstance().uid
                ?: throw NullPointerException("UID is null.")}"
        )


    fun initCurrentUserIfFirstTime(onComplete: () -> Unit) {
        currentUserDocRef.get().addOnSuccessListener { docSnap ->
            if (!docSnap.exists()) {
                val newUser = User(user?.displayName ?: "")
                currentUserDocRef.set(newUser).addOnSuccessListener {
                    onComplete()
                }
            } else
                onComplete()
        }
    }

    fun updateCurrentUser(
        name: String = ""
    ) {
        val userFieldMap = mutableMapOf<String, Any>()
        if (name.isNotBlank()) userFieldMap["name"] = name
        currentUserDocRef.update(userFieldMap)
    }

    fun getUser(): DocumentReference {
        return currentUserDocRef
    }

    fun resetPassword() {
        var emailAddress = ""
        if(user?.email != null)
            emailAddress = user!!.email.toString()
        FirebaseAuth.getInstance().sendPasswordResetEmail(emailAddress)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Log.d(TAG, "Email sent.")
                }
            }
    }

    fun deleteUser() {
        user!!.delete()
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Log.d("AVES", "User account deleted.")
                }
            }
    }


    // save observation to firebase
    fun saveObservationData(observationData: ObservationData): Task<DocumentReference> {
        return firestoreDB.collection("users").document("tempuser").collection("observations")
            .add(observationData)
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
        var collectionReference =
            firestoreDB.collection("users/observations") // temp path for testing
        // TODO: change this to check all individual users observations
        return collectionReference
    }

    // delete an observation
    fun deleteObservation(observationData: ObservationData): Task<Void> {
        var documentReference = firestoreDB.collection("users/tempuser/observations")
            .document(observationData.id.toString())
        //TODO: user ${user!!.uid} instead of tempuser
        return documentReference.delete()
    }

}