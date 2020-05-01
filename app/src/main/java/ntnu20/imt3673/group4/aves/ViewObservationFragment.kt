package ntnu20.imt3673.group4.aves

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_view_observation.*
import ntnu20.imt3673.group4.aves.adapters.ObservationAdapter

import ntnu20.imt3673.group4.aves.databinding.FragmentViewObservationBinding

class ViewObservationFragment : Fragment() {
    private lateinit var views: FragmentViewObservationBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        views = FragmentViewObservationBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_view_observation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Get the arguments passed with action
        arguments?.let {
            val safeArgs = ViewObservationFragmentArgs.fromBundle(it)
            view_birdName.text = safeArgs.ObservationToView.birdName
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        // Get the arguments passed with action
//        arguments?.let {
//            val safeArgs = ViewObservationFragmentArgs.fromBundle(it)
//            Log.d("aaaaaaaaa",safeArgs.toString())
//        }
    }
}