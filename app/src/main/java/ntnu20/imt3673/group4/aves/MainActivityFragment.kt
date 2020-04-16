package ntnu20.imt3673.group4.aves

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Toast
import ntnu20.imt3673.group4.aves.databinding.FragmentActivityMainBinding


class MainActivityFragment : Fragment() {

    private lateinit var views : FragmentActivityMainBinding
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        views = FragmentActivityMainBinding.inflate(inflater, container, false)
        return views.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}