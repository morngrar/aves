package ntnu20.imt3673.group4.aves

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_activity_main.*
import ntnu20.imt3673.group4.aves.adapter.ObservationAdapter
import ntnu20.imt3673.group4.aves.dataSource.dummyData
import ntnu20.imt3673.group4.aves.databinding.FragmentActivityMainBinding


class MainActivityFragment : Fragment() {

    private lateinit var views : FragmentActivityMainBinding
    private lateinit var observationAdapter: ObservationAdapter
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        views = FragmentActivityMainBinding.inflate(inflater, container, false)
        return views.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        /* Initiates the recycler view*/
        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet() {
        val data = dummyData.createDataSet()
        observationAdapter.submitList(data)
    }

    /**
     * Function initiates the recycler view and applies the adapter
     */
    private fun initRecyclerView() {
        recycler_view.apply {
            layoutManager = LinearLayoutManager(requireContext())
            observationAdapter = ObservationAdapter()
            adapter = observationAdapter
        }
    }
}