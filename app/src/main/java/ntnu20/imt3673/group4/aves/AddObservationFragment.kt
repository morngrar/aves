package ntnu20.imt3673.group4.aves

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class AddObservationFragment : Fragment() {

    companion object {
        fun newInstance() = AddObservationFragment()
    }

    private lateinit var viewModel: AddObservationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_observation, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AddObservationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
