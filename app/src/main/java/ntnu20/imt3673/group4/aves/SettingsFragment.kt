package ntnu20.imt3673.group4.aves


import android.app.AlertDialog
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SwitchPreferenceCompat
import com.firebase.ui.auth.AuthUI
import ntnu20.imt3673.group4.aves.data.FirestoreRepository
import org.jetbrains.anko.clearTask
import org.jetbrains.anko.newTask
import org.jetbrains.anko.support.v4.intentFor

/** Fragment for changing settings in the app */
class SettingsFragment : PreferenceFragmentCompat() {

    var firebaseRepository = FirestoreRepository()

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)

        /** Button to apply changes in the settings */
        val restartButton: Preference? = findPreference("btn_restart_app")
        restartButton!!.onPreferenceClickListener =
            Preference.OnPreferenceClickListener { //code for what you want it to do
                activity?.recreate();
                true
            }

        val resetPasswordButton: Preference? = findPreference("btn_reset_pwd")
        resetPasswordButton!!.onPreferenceClickListener =
            Preference.OnPreferenceClickListener {
                Toast.makeText(requireContext(), "Email sent", Toast.LENGTH_SHORT).show()
                firebaseRepository.resetPassword()
                true
            }
    }
}
