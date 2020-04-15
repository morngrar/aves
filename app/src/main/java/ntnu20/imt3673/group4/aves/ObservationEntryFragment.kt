package ntnu20.imt3673.group4.aves
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.viewModels
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.observation_view.*


class ObservationEntryFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.observation_view);

        val camBtn = cameraBtn.setOnClickListener {

        }

    }
}