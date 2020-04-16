package ntnu20.imt3673.group4.aves

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Toast
import ntnu20.imt3673.group4.aves.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {

    private lateinit var views : FragmentSettingsBinding

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        views = FragmentSettingsBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}