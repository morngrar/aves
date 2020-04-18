package ntnu20.imt3673.group4.aves

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import ntnu20.imt3673.group4.aves.databinding.FragmentAddObservationBinding
import ntnu20.imt3673.group4.aves.location.LocationUtility
import ntnu20.imt3673.group4.aves.location.PermissionUtility
import ntnu20.imt3673.group4.aves.viewmodels.AddObservationViewModel


class AddObservationFragment : Fragment() {

    companion object {
        fun newInstance() = AddObservationFragment()
    }

    private val viewModel: AddObservationViewModel by viewModels()
    private lateinit var binding: FragmentAddObservationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_add_observation, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.vm = viewModel
        return binding.root
    }

    private fun getLocationAndWeather() = lifecycleScope.launch {

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // Ensuring permissions
        when {
            PermissionUtility.haveFineLocationPermission(requireContext()) -> {
                when {
                    PermissionUtility.locationIsEnabled(requireContext()) -> {
                        LocationUtility.configureLocationListener(requireContext())
                    }
                    else -> {
                        PermissionUtility.showGPSAlertDialog(requireContext())
                    }
                }
            }
            else -> {
                PermissionUtility.requestFineLocationPermission(
                    this.requireActivity(),
                    LocationUtility.LOCATION_PERMISSION_REQUEST_CODE
                )
            }
        }

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode) {
            LocationUtility.LOCATION_PERMISSION_REQUEST_CODE -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    when {
                        PermissionUtility.locationIsEnabled(requireContext()) -> {
                            LocationUtility.configureLocationListener(requireContext())
                        }
                        else -> {
                            PermissionUtility.showGPSAlertDialog(requireContext())
                        }
                    }
                }
            }
            else -> {
                Toast.makeText(
                    requireContext(),
                    "Don't have location permission",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }


}
