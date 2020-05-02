package ntnu20.imt3673.group4.aves.adapters

import android.content.Context
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ntnu20.imt3673.group4.aves.BirdImage
import ntnu20.imt3673.group4.aves.databinding.BirdSearchCardBinding

class BirdSearchAdapter(val context: Context): ListAdapter<List<BirdImage>, BirdSearchAdapter.ViewHolder>(BirdSearchDifferenceCallback()) {
    class ViewHolder(val binding: BirdSearchCardBinding) : RecyclerView.ViewHolder(binding.root)

    /**
     * @brief BirdSearchDifferenceCallback
     */
    class BirdSearchDifferenceCallback : DiffUtil.ItemCallback<List<BirdImage>>() {
        // What determines if two items are the same?
        override fun areItemsTheSame(oldItem: List<BirdImage>, newItem: List<BirdImage>): Boolean {
            return oldItem[0].id == newItem[0].id
        }

        // Check if the contents of the items with same id is the same
        override fun areContentsTheSame(oldItem: List<BirdImage>, newItem: List<BirdImage>): Boolean {
            return oldItem[0].id == newItem[0].id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = BirdSearchCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val resultItem = getItem(position)

        holder.binding.txtBirdSearchResultName.text = resultItem[0].name
        holder.binding.imgBirdSearchPreview.setImageBitmap(BitmapFactory.decodeResource(context.resources, resultItem[0].thumbnail))
    }
}