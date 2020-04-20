package ntnu20.imt3673.group4.aves


import android.os.Bundle
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SwitchPreferenceCompat

/** Fragment for changing settings in the app */
class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)

        /**
         * Location:
         * Change description of summary for the location preference
         */
        val locationPreference: SwitchPreferenceCompat? = findPreference("pref_location")
        locationPreference?.summaryProvider =
            Preference.SummaryProvider<SwitchPreferenceCompat> { preference ->
                if (preference.isChecked) {
                    "Location is enabled"
                } else {
                    "Location is disabled"
                }

            }

        /** Button to apply changes in the settings */
        val restartButton: Preference? = findPreference("btn_restart_app")
        restartButton!!.onPreferenceClickListener =
            Preference.OnPreferenceClickListener { //code for what you want it to do
                activity?.recreate();
                true
            }
    }
}
