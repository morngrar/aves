package ntnu20.imt3673.group4.aves

import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.checkSelfPermission
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_observation.*
import ntnu20.imt3673.group4.aves.databinding.FragmentObservationBinding
import java.util.jar.Manifest


class ObservationFragment : Fragment() {

    private lateinit var views: FragmentObservationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        views = FragmentObservationBinding.inflate(inflater, container, false)


//        btn_capture.setOnClickListener {
//            // If system os is Marshmallow or above, we need to request runtime permission
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                if (checkSelfPermission(android.Manifest.permission.CAMERA)
//                    == PackageManager.PERMISSION_DENIED
//                ) {
//
//                }
//            }
//        }

        return inflater.inflate(R.layout.fragment_observation, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}

//override fun onRequestPermissionsResult(requestCode: Int,permissions: Array<out String>,grantResults: IntArray) {
//    super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//    //When User Presses Allow Or Deny
//    when(requestCode){
//        PERMISSION_CODE ->{
//            if(grantResults.size>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED&&grantResults[1]==PackageManager.PERMISSION_GRANTED){
//                //Permission Granted
//                OpenCamera()
//            }else{
//                //Permission Denied
//                Toast.makeText(this,"Permission Denied",1).show()
//            }
//        }
//    }
//}