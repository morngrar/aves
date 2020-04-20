package ntnu20.imt3673.group4.aves

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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

        avatar.setOnClickListener{
            // TODO: Change avatar
            pickImageFromGallery();
        }

        text_change_avatar.setOnClickListener {
            pickImageFromGallery();
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

    private fun pickImageFromGallery() {
        //Intent to pick image
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, 1000)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK && requestCode == 1000){
            avatar.setImageURI(data?.data)
        }
    }
}
