package ntnu20.imt3673.group4.aves

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import ntnu20.imt3673.group4.aves.adapters.BirdSearchAdapter
import ntnu20.imt3673.group4.aves.adapters.ObservationAdapter
import ntnu20.imt3673.group4.aves.data.ObservationData

@BindingAdapter("app:observationList")
fun observationList(view: RecyclerView, observations: List<ObservationData>?) {
    observations?.let {
        (view.adapter as ObservationAdapter).submitList(it)
    }
}



@BindingAdapter("app:searchResultList")
fun searchResultList(view: RecyclerView, results: List<List<BirdImage>>?) {
    results?.let {
        (view.adapter as BirdSearchAdapter).submitList(it)
    }
}
