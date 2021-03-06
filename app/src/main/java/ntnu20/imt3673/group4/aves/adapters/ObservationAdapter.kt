package ntnu20.imt3673.group4.aves.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Matrix
import android.media.ExifInterface
import android.media.ThumbnailUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ntnu20.imt3673.group4.aves.MainActivityFragmentDirections
import ntnu20.imt3673.group4.aves.data.ObservationData
import ntnu20.imt3673.group4.aves.databinding.ObservationCardBinding
import java.io.FileNotFoundException
import java.util.*


/**
 * @brief ObservationAdapter
 * This adapter should be used by recycler view to show sightings
 */
class ObservationAdapter(val context: Context) :
    ListAdapter<ObservationData, ObservationAdapter.ViewHolder>(ObservationDifferenceCallback()) {

    /** View holder */
    class ViewHolder(val binding: ObservationCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ObservationCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }


    /** Adds variable bindings to the UI elements */
    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val observation = getItem(position)

        holder.binding.lblCardBirdName.text = observation.birdName
        holder.binding.lblCardDescription.text = observation.description
        holder.binding.lblCardTime.text = Date(observation.time).toString()
        holder.binding.lblCardCloudiness.text = "Cloud cover: ${observation.cloudiness}%"
        holder.binding.lblCardRain.text = "Rain: ${observation.rain} mm"
        holder.binding.lblCardWindspeed.text = "Wind speed: ${observation.windSpeed} mps"
        holder.binding.lblCardTemperature.text = "Temperature: ${observation.temperature}??C"
        holder.binding.lblCardCount.text = "Number seen: ${observation.count}"

        if (observation.imagePath != "") {
            try {
                val thumbWidth = 100//holder.binding.imgBirdPreview.width
                val thumbHeight = 100//holder.binding.imgBirdPreview.height
                var thumbnail = ThumbnailUtils.extractThumbnail(
                    BitmapFactory.decodeFile(observation.imagePath),
                    thumbWidth,
                    thumbHeight
                );

                val exif = ExifInterface(observation.imagePath)
                val orientation = exif.getAttributeInt(
                    ExifInterface.TAG_ORIENTATION,
                    ExifInterface.ORIENTATION_NORMAL
                )

                val matrix = Matrix()
                if (orientation == ExifInterface.ORIENTATION_ROTATE_90) {
                    matrix.postRotate(90.0f)
                    thumbnail = Bitmap.createBitmap(
                        thumbnail, 0, 0, thumbnail.width, thumbnail.height, matrix, true
                    );
                }

                holder.binding.imgBirdPreview.setImageBitmap(thumbnail!!)
            } catch (e: FileNotFoundException) {
                // do nothing - default pic will be used
            }
        }

        holder.itemView.setOnClickListener {
            // Get the action from the navigation, navigate to the destination the action leads to
            // with the observation as a parameter
            val actionDestViewObservation =
                MainActivityFragmentDirections.actionViewObservation(observation)
            Navigation.findNavController(it).navigate(actionDestViewObservation)
        }
    }

    /**
     * @brief ObservationDifferenceCallback
     */
    class ObservationDifferenceCallback : DiffUtil.ItemCallback<ObservationData>() {
        // What determines if two items are the same?
        override fun areItemsTheSame(oldItem: ObservationData, newItem: ObservationData): Boolean {
            return oldItem.id == newItem.id
        }

        // Check if the contents of the items with same id is the same
        override fun areContentsTheSame(
            oldItem: ObservationData,
            newItem: ObservationData
        ): Boolean {
            return oldItem.time == newItem.time
        }
    }

}