package ntnu20.imt3673.group4.aves

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_edit_profile.*
import ntnu20.imt3673.group4.aves.databinding.FragmentProfileBinding


class FragmentEditProfile : Fragment() {

    private lateinit var views: FragmentProfileBinding

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        views = FragmentProfileBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_edit_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

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
            val actionDestFragmentProfile = FragmentEditProfileDirections.actionDestFragmentProfile()
            Navigation.findNavController(it).navigate(actionDestFragmentProfile)
        }

        btn_save.setOnClickListener{
            // TODO: save text field data and avatar

            // clear text fields
            //edit_real_name.text!!.clear()

            // TODO: Clear avatar change?

            // change fragment
            val actionDestFragmentProfile = FragmentEditProfileDirections.actionDestFragmentProfile()
            Navigation.findNavController(it).navigate(actionDestFragmentProfile)
        }
    }
}
