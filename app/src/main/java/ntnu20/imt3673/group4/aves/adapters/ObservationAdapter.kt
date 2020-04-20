package ntnu20.imt3673.group4.aves.adapters

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ntnu20.imt3673.group4.aves.data.ObservationData
import ntnu20.imt3673.group4.aves.databinding.ObservationCardBinding
import java.io.File
import java.util.*


/**
 * @brief ObservationAdapter
 * This adapter should be used by recycler view to show sightings
 */
class ObservationAdapter : ListAdapter<ObservationData, ObservationAdapter.ViewHolder>(ObservationDifferenceCallback()){
    /** View holder */
    class ViewHolder(val binding: ObservationCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ObservationCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }


    /** Adds variable bindings to the UI elements */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val observation = getItem(position)

        holder.binding.lblCardBirdName.text = observation.birdName
        holder.binding.lblCardTime.text = Date(observation.time).toString()
        holder.binding.lblCardLocation.text = "Loc: %4.4f, %4.4f".format(observation.latitude, observation.longitude)
        holder.binding.lblCardCloudiness.text = "Cloud cover: ${observation.cloudiness}%"
        holder.binding.lblCardPressure.text = "Pressure: ${observation.pressure} hPa"
        holder.binding.lblCardRain.text = "Rain: ${observation.rain} mm"
        holder.binding.lblCardWindspeed.text = "Wind speed: ${observation.windSpeed} mps"

        if (observation.imagePath != "") {
            val file = File(observation.imagePath)
            holder.binding.imgBirdPreview.setImageURI(Uri.fromFile(file))
        }
    }
    /**
     * @brief EntryDifferenceCallback
     */
    class ObservationDifferenceCallback : DiffUtil.ItemCallback<ObservationData>() {
        // What determines if two items are the same?
        override fun areItemsTheSame(oldItem: ObservationData, newItem: ObservationData): Boolean {
            return oldItem.id == newItem.id
        }

        // Check if the contents of the items with same id is the same
        override fun areContentsTheSame(oldItem: ObservationData, newItem: ObservationData): Boolean {
            return oldItem.time == newItem.time
        }
    }

}