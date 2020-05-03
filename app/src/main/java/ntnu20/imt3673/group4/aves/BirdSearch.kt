package ntnu20.imt3673.group4.aves

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import ntnu20.imt3673.group4.aves.adapters.BirdSearchAdapter
import ntnu20.imt3673.group4.aves.databinding.FragmentActivityMainBinding
import ntnu20.imt3673.group4.aves.databinding.FragmentBirdSearchBinding
import ntnu20.imt3673.group4.aves.viewmodels.BirdSearchViewModel


class BirdSearch : Fragment() {

    private val viewModel: BirdSearchViewModel by activityViewModels()
    private lateinit var binding : FragmentBirdSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_bird_search, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.vm = viewModel
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.recyclerBirdSearchResults.apply {
            adapter = BirdSearchAdapter(context, viewModel)
            layoutManager = LinearLayoutManager(context)
        }
    }

}
