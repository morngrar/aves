package ntnu20.imt3673.group4.aves

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import ntnu20.imt3673.group4.aves.databinding.FragmentViewObservationBinding

class ViewObservationFragment : Fragment() {
    private lateinit var views: FragmentViewObservationBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        views = FragmentViewObservationBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_view_observation, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}