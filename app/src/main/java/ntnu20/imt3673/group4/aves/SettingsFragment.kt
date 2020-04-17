package ntnu20.imt3673.group4.aves

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.preference.PreferenceFragmentCompat
import ntnu20.imt3673.group4.aves.databinding.FragmentSettingsBinding


class SettingsFragment : PreferenceFragmentCompat() {

    private lateinit var views : FragmentSettingsBinding

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.preferences, rootKey)
    }

}
