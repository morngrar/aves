package ntnu20.imt3673.group4.aves.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.layout_observation_list_item.view.*
import ntnu20.imt3673.group4.aves.R
import ntnu20.imt3673.group4.aves.models.SingleObservation


/**
 * @brief ObservationAdapter
 * This adapter should be used by recycler view to show sightings
 */
class ObservationAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<SingleObservation> = ArrayList()

    /**
     * Creates each individual viewHolder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_observation_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {

            is ViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    /**
     * Returns the number of items inside our list
     */
    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(observationList: List<SingleObservation>) {
        items = observationList
    }

    class ViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val observationImage: ImageView = itemView.observation_image
        val observationTitle: TextView = itemView.observation_title
        val observationOwner: TextView = itemView.observation_owner

        // Binds the data to the view
        fun bind(singleObservation: SingleObservation) {
            observationTitle.setText(singleObservation.title)
            observationOwner.setText(singleObservation.uname)
            // Set the image by loading image from gitlab
            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(singleObservation.image)
                .into(observationImage)
        }
    }

}