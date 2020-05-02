package ntnu20.imt3673.group4.aves.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ntnu20.imt3673.group4.aves.BirdImage
import ntnu20.imt3673.group4.aves.searchRegister

class BirdSearchViewModel : ViewModel() {
    private var _birdList = MutableLiveData(searchRegister.values.toList())
    val birdList: LiveData<List<List<BirdImage>>>
        get() = _birdList
}
