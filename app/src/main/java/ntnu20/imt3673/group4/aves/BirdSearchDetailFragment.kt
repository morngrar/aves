package ntnu20.imt3673.group4.aves

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import ntnu20.imt3673.group4.aves.adapters.BirdSearchDetailAdapter
import ntnu20.imt3673.group4.aves.databinding.FragmentBirdSearchDetailBinding
import ntnu20.imt3673.group4.aves.viewmodels.BirdSearchViewModel

class BirdSearchDetailFragment : Fragment() {

    private val viewModel: BirdSearchViewModel by activityViewModels()
    private lateinit var binding: FragmentBirdSearchDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_bird_search_detail,
            container,
            false
        )
        binding.lifecycleOwner = viewLifecycleOwner
        binding.vm = viewModel
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.recyclerBirdSearchDetail.apply {
            adapter = BirdSearchDetailAdapter(context)
            layoutManager = LinearLayoutManager(context)
        }

    }
}
