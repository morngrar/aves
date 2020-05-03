package ntnu20.imt3673.group4.aves.adapters

import android.content.Context
import android.graphics.BitmapFactory
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ntnu20.imt3673.group4.aves.BirdImage
import ntnu20.imt3673.group4.aves.databinding.BirdSearchDetailCardBinding

class BirdSearchDetailAdapter(val context: Context): ListAdapter<BirdImage, BirdSearchDetailAdapter.ViewHolder>(BirdSearchDetailDifferenceCallback()) {
    class ViewHolder(val binding: BirdSearchDetailCardBinding) : RecyclerView.ViewHolder(binding.root)

    /**
     * @brief BirdSearchDetailDifferenceCallback
     */
    class BirdSearchDetailDifferenceCallback : DiffUtil.ItemCallback<BirdImage>() {
        // What determines if two items are the same?
        override fun areItemsTheSame(oldItem: BirdImage, newItem: BirdImage): Boolean {
            return oldItem.id == newItem.id
        }

        // Check if the contents of the items with same id is the same
        override fun areContentsTheSame(oldItem: BirdImage, newItem: BirdImage): Boolean {
            return oldItem.id == newItem.id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = BirdSearchDetailCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val resultItem = getItem(position)
        holder.binding.imgBirdSearchDetailCard.setImageBitmap(BitmapFactory.decodeResource(context.resources, resultItem.id))

        holder.binding.txtBirdSearchDetailLicense.text = resultItem.license
        Log.d("AVES", "License info: ${holder.binding.txtBirdSearchDetailLicense.text}")
    }

}
