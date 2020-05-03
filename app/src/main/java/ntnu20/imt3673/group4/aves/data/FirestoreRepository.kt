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
                var name: String = ""   // Get the name linked with the google sign in provided data
                var email: String = ""
                val cUser = FirebaseAuth.getInstance().currentUser
                cUser?.let {
                    // Name from sign-in provider
                    name = cUser.displayName.toString()
                    email = cUser.email.toString()
                }
                val newUser = User(name, email)
                currentUserDocRef.set(newUser).addOnSuccessListener {
                    onComplete()
                }
            } else
                onComplete()
        }
    }

    fun updateCurrentUser(
        name: String = "",
        email: String = ""
    ) {
        val userFieldMap = mutableMapOf<String, Any>()
        if (name.isNotBlank()) userFieldMap["name"] = name
        if (email.isNotBlank()) userFieldMap["email"] = email
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
        return firestoreDB.collection("observations").document(user!!.uid).collection("observations")
            .add(observationData)
    }

    // get the users saved observations from firebase
    fun getSavedObservations(): CollectionReference {
        return firestoreDB.collection("observations/${user!!.uid}/observations")
    }

    // delete an observation
    fun deleteObservation(observationData: ObservationData): Task<Void> {
        val documentReference = firestoreDB.collection("observations/${user!!.uid}/observations")
            .document(observationData.id.toString())
        return documentReference.delete()
    }

}