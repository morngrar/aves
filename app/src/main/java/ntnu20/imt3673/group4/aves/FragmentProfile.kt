package ntnu20.imt3673.group4.aves

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_profile.*


class FragmentProfile : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val mA: MainActivity = activity as MainActivity
        // TODO: mA.fragName = "profile" or similar. Wait until main activity is done.

        /**
         * Clickable text and buttons
         */
        btn_edit_profile.setOnClickListener{

        }

        txt_my_friends.setOnClickListener {

        }

        txt_my_observations.setOnClickListener {

        }
    }
}
