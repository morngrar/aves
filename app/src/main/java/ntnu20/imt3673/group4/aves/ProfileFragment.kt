package ntnu20.imt3673.group4.aves

import android.annotation.SuppressLint
import android.app.Application
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.firebase.ui.auth.AuthUI
import kotlinx.android.synthetic.main.fragment_profile.*
import ntnu20.imt3673.group4.aves.data.FirestoreRepository
import ntnu20.imt3673.group4.aves.databinding.FragmentProfileBinding
import ntnu20.imt3673.group4.aves.viewmodels.FirestoreViewModel
import org.jetbrains.anko.clearTask
import org.jetbrains.anko.newTask
import org.jetbrains.anko.support.v4.intentFor


/** Fragment for viewing the user's profile */
class ProfileFragment : Fragment() {

    private lateinit var views: FragmentProfileBinding
    private val firestoreViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(
        Application()
    ).create(FirestoreViewModel::class.java)

    private val user = firestoreViewModel.getCurrentUser()
    private val myObs = firestoreViewModel.getSavedObservations()
    private lateinit var totalSightings: String

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        views = FragmentProfileBinding.inflate(inflater, container, false)
        user.observe(viewLifecycleOwner, Observer {
            txt_real_name.text = it.name
        })
        myObs.observe(viewLifecycleOwner, Observer {
            txt_total_sightings.text = "Total sightings: ${it.size.toString()}"
        })

        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        /* Edit profile */
        btn_edit_profile.setOnClickListener {
            val actionDestFragmentEditProfile =
                ProfileFragmentDirections.actionDestFragmentEditProfile()
            Navigation.findNavController(it).navigate(actionDestFragmentEditProfile)
        }

        btn_sign_out.setOnClickListener {
            AuthUI.getInstance()
                .signOut(this.requireContext())
                .addOnCompleteListener {
                    startActivity(intentFor<SignInActivity>().newTask().clearTask())
                }
        }

    }

}