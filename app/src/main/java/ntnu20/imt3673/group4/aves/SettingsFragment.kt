package ntnu20.imt3673.group4.aves

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SwitchPreferenceCompat


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

        /**
         * Haptics:
         * Change description of summary for the haptics preference
         */
        val hapticsPreference: SwitchPreferenceCompat? = findPreference("pref_haptics")
        hapticsPreference?.summaryProvider =
            Preference.SummaryProvider<SwitchPreferenceCompat> { preference ->
                if (preference.isChecked) {
                    "Haptics are enabled"
                } else {
                    "Haptics are disabled"
                }
            }
    }

}
