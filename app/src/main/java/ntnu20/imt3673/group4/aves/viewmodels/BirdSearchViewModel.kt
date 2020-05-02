package ntnu20.imt3673.group4.aves.viewmodels

import androidx.lifecycle.*
import ntnu20.imt3673.group4.aves.searchRegister

class BirdSearchViewModel : ViewModel() {
    private val completeBirdList = searchRegister.values.toList()

    var searchString: MutableLiveData<String> = MutableLiveData("")

    val filteredBirdList = Transformations.map(searchString) {
        if (it.isEmpty()) {
            completeBirdList
        } else {
            searchRegister.filterKeys {key ->
                it.toLowerCase().toRegex().containsMatchIn(key)
            }.values.toList()
        }
    }

}
