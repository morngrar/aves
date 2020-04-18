package ntnu20.imt3673.group4.aves

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import ntnu20.imt3673.group4.aves.databinding.FragmentAddObservationBinding
import ntnu20.imt3673.group4.aves.viewmodels.AddObservationViewModel


class AddObservationFragment : Fragment() {

    companion object {
        fun newInstance() = AddObservationFragment()
    }

    private val viewModel: AddObservationViewModel by viewModels()
    private lateinit var binding: FragmentAddObservationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_observation, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.vm = viewModel
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel

        
    }

}
