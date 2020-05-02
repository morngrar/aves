package ntnu20.imt3673.group4.aves

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ntnu20.imt3673.group4.aves.viewmodels.BirdSearchViewModel


class BirdSearch : Fragment() {

    companion object {
        fun newInstance() = BirdSearch()
    }

    private lateinit var viewModel: BirdSearchViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bird_search_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BirdSearchViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
