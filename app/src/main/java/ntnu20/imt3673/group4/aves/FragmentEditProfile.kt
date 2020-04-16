package ntnu20.imt3673.group4.aves

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_edit_profile.*


class FragmentEditProfile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val mA: MainActivity = activity as MainActivity
        // TODO: mA.fragName = "edit_profile" or similar. Wait until main activity is done.

        /**
         * Clickable text and buttons
         */
        avatar.setOnClickListener{
                // TODO: Change avatar
            }

        btn_cancel.setOnClickListener{
            // clear text fields
            //edit_real_name.text!!.clear()

            // TODO: Clear avatar change?

            // change fragment
            mA.supportFragmentManager.findFragmentByTag("main")
            mA.supportFragmentManager.popBackStack()
        }

        btn_save.setOnClickListener{
            // TODO: save text field data and avatar

            // clear text fields
            //edit_real_name.text!!.clear()

            // TODO: Clear avatar change?

            // change fragment
            mA.supportFragmentManager.findFragmentByTag("main")
            mA.supportFragmentManager.popBackStack()
        }
    }
}
