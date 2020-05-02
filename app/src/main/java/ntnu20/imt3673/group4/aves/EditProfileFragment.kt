package ntnu20.imt3673.group4.aves

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_edit_profile.*
import ntnu20.imt3673.group4.aves.data.FirestoreRepository
import ntnu20.imt3673.group4.aves.data.StorageUtil
import ntnu20.imt3673.group4.aves.databinding.FragmentProfileBinding
import ntnu20.imt3673.group4.aves.glide.GlideApp
import java.io.ByteArrayOutputStream

/** Fragment for changing profile information */

class FragmentEditProfile : Fragment() {

    private lateinit var views: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        views = FragmentProfileBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_edit_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        /* Save changes */
        btn_save.setOnClickListener {
                // save text field data and avatar
//                if() {
//                    StorageUtil.uploadProfilePhoto(selectedImageBytes) {imagePath ->
//                        FirestoreRepository.updateCurrentUser(edit_real_name.text.toString(),
//                        imagePath)
//                    }
//                } else
                    FirestoreRepository.updateCurrentUser(edit_real_name.text.toString(),
                        null)

            // clear text fields
            //edit_real_name.text!!.clear()

            // change fragment
            val actionDestFragmentProfile =
                FragmentEditProfileDirections.actionDestFragmentProfile()
            Navigation.findNavController(it).navigate(actionDestFragmentProfile)
        }

        /* Change avatar when clicking the current avatar */
        avatar.setOnClickListener {
            pickImageFromGallery();
        }

        /* Change avatar when clicking the text as well */
        text_change_avatar.setOnClickListener {
            pickImageFromGallery();
        }

        /* Cancel editing profile */
        btn_cancel.setOnClickListener {
            // clear text fields
            //edit_real_name.text!!.clear()

            // TODO: Clear avatar change?

            // change fragment
            val actionDestFragmentProfile =
                FragmentEditProfileDirections.actionDestFragmentProfile()
            Navigation.findNavController(it).navigate(actionDestFragmentProfile)
        }
    }

    /** Pick image from gallery to replace current avatar */
    private fun pickImageFromGallery() {
        //Intent to pick image
        val intent = Intent(Intent.ACTION_PICK)
        intent.putExtra(Intent.EXTRA_MIME_TYPES, arrayOf("image/jpeg", "image/png"))
        intent.type = "image/*"
        startActivityForResult(intent, 1000)
    }

    /** Update the DB's image path and replace avatar with the chosen image */
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK && requestCode == 1000) {
            avatar.setImageURI(data?.data)
        }
    }
}
