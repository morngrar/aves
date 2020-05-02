package ntnu20.imt3673.group4.aves

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.firebase.ui.auth.AuthUI
import kotlinx.android.synthetic.main.fragment_profile.*
import ntnu20.imt3673.group4.aves.data.FirestoreRepository
import ntnu20.imt3673.group4.aves.data.StorageUtil
import ntnu20.imt3673.group4.aves.databinding.FragmentProfileBinding
import ntnu20.imt3673.group4.aves.glide.GlideApp
import org.jetbrains.anko.clearTask
import org.jetbrains.anko.newTask
import org.jetbrains.anko.support.v4.intentFor


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

        btn_sign_out.setOnClickListener {
            AuthUI.getInstance()
                .signOut(this.requireContext())
                .addOnCompleteListener{
                    startActivity(intentFor<SignInActivity>().newTask().clearTask())
                }
        }
    }


    override fun onStart() {
        super.onStart()
        FirestoreRepository.getCurrentUser { user ->
            if(this@ProfileFragment.isVisible) {
                txt_real_name.text = user.name
                if(user.profilePicture != null) {
                    GlideApp.with(this)
                        .load(StorageUtil.pathToReference(user.profilePicture))
                        .placeholder(R.drawable.ic_image)
                        .into(avatar)
                }
            }
        }

    }

}