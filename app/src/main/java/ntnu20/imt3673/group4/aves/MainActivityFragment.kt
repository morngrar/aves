package ntnu20.imt3673.group4.aves

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import ntnu20.imt3673.group4.aves.adapters.ObservationAdapter
import ntnu20.imt3673.group4.aves.databinding.FragmentActivityMainBinding


class MainActivityFragment : Fragment() {

    private lateinit var binding : FragmentActivityMainBinding

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_activity_main, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.recyclerView.apply {
            adapter = ObservationAdapter()
            layoutManager = LinearLayoutManager(context)
        }
    }
}