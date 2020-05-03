package ntnu20.imt3673.group4.aves.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.BitmapFactory
import android.view.FocusFinder
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.internal.ContextUtils.getActivity
import ntnu20.imt3673.group4.aves.BirdImage
import ntnu20.imt3673.group4.aves.BirdSearchDirections
import ntnu20.imt3673.group4.aves.databinding.BirdSearchCardBinding
import ntnu20.imt3673.group4.aves.viewmodels.BirdSearchViewModel

class BirdSearchAdapter(
    val context: Context,
    val viewModel: BirdSearchViewModel
) : ListAdapter<List<BirdImage>, BirdSearchAdapter.ViewHolder>(BirdSearchDifferenceCallback()) {

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
        override fun areContentsTheSame(
            oldItem: List<BirdImage>,
            newItem: List<BirdImage>
        ): Boolean {
            return oldItem[0].id == newItem[0].id
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            BirdSearchCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    @SuppressLint("RestrictedApi")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val resultItem = getItem(position)


        holder.itemView.setOnClickListener {

            val window = getActivity(context)?.window
            val inputManager: InputMethodManager? =
                context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?
            inputManager?.hideSoftInputFromWindow(
                window?.getCurrentFocus()?.getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS
            )

            viewModel.chosenBird.value = resultItem
            // change fragment
            val action = BirdSearchDirections.actionBirdSearchToDetail()
            Navigation.findNavController(it).navigate(action)
            //Navigation.findNavController(it).navigate(actionDestFragmentProfile)
        }
        holder.binding.txtBirdSearchResultName.text = resultItem[0].name
        holder.binding.imgBirdSearchPreview.setImageBitmap(
            BitmapFactory.decodeResource(
                context.resources,
                resultItem[0].thumbnail
            )
        )
    }
}