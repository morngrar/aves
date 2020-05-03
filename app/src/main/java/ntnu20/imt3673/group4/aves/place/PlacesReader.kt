// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package ntnu20.imt3673.group4.aves.place

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.map
import com.google.android.gms.maps.model.LatLng
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import ntnu20.imt3673.group4.aves.R
import ntnu20.imt3673.group4.aves.data.ObservationData
import ntnu20.imt3673.group4.aves.data.toPlace
import ntnu20.imt3673.group4.aves.viewmodels.FirestoreViewModel
import java.io.InputStream
import java.io.InputStreamReader

class PlacesReader(private val context: Context) {

    private val firestoreViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(
        Application()
    ).create(FirestoreViewModel::class.java)

    val allObservations = firestoreViewModel.getSavedObservations()

    private val gson = Gson()

    private val inputStream: InputStream
        get() = context.resources.openRawResource(R.raw.places)

//    fun read(): List<Place> {
//        Log.d("AEAEread()", "a")
//        val itemType = object : TypeToken<List<PlaceResponse>>() {}.type
//        val reader = InputStreamReader(inputStream)
//        return gson.fromJson<List<PlaceResponse>>(reader, itemType).map {
//            it.toPlace()
//        }
//    }

    fun read(): List<Place> {
        Log.d("AEAEread()", "b")
        val itemType = object : TypeToken<List<PlaceResponse>>() {}.type
        val reader = InputStreamReader(inputStream)
        return gson.fromJson<List<PlaceResponse>>(reader, itemType).map {
            it.toPlace()
        }
    }

}
