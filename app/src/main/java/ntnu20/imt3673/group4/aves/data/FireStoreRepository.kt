package ntnu20.imt3673.group4.aves.data

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import java.lang.NullPointerException

object FirestoreRepository {

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
        val a = firestoreDB.collection("users").document(currentUserDocRef.toString())
        return currentUserDocRef
    }

    // save observation to firebase
    fun saveObservationData(observationData: ObservationData): Task<Void> {
        val documentReference = firestoreDB.collection("users").document(user!!.email.toString())
            .collection("myObservations").document(observationData.id.toString())
        return documentReference.set(observationData)
    }

    // get the users saved observations from firebase
    fun getSavedObservations(): CollectionReference {
        return firestoreDB.collection("users/${user!!.email.toString()}/myObservations")
    }

    // delete an observation
    fun deleteObservation(observationData: ObservationData): Task<Void> {
        val documentReference =
            firestoreDB.collection("users/${user!!.email.toString()}/myObservations")
                .document(observationData.id.toString())

        return documentReference.delete()
    }
}