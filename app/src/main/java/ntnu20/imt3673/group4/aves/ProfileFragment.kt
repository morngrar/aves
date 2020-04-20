package ntnu20.imt3673.group4.aves

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_profile.*
import ntnu20.imt3673.group4.aves.databinding.FragmentProfileBinding

/** Fragment for viewing the user's profile */
class ProfileFragment : Fragment() {

    private lateinit var views: FragmentProfileBinding

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        views = FragmentProfileBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        /* Edit profile */
        btn_edit_profile.setOnClickListener {
            val actionDestFragmentEditProfile = ProfileFragmentDirections.actionDestFragmentEditProfile()
            Navigation.findNavController(it).navigate(actionDestFragmentEditProfile)
        }

    }

}