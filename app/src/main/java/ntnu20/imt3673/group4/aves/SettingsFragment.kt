package ntnu20.imt3673.group4.aves

import android.os.Bundle
import android.widget.Toast
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import ntnu20.imt3673.group4.aves.data.FirestoreRepository

/** Fragment for changing settings in the app */
class SettingsFragment : PreferenceFragmentCompat() {

    var firebaseRepository = FirestoreRepository()

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)

        val resetPasswordButton: Preference? = findPreference("btn_reset_pwd")
        resetPasswordButton!!.onPreferenceClickListener =
            Preference.OnPreferenceClickListener {
                Toast.makeText(requireContext(), "Email sent", Toast.LENGTH_SHORT).show()
                firebaseRepository.resetPassword()
                true
            }
    }
}
