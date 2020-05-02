package ntnu20.imt3673.group4.aves.data

data class User(
    val name: String,
    val profilePicture: String?,
    val myObservations: List<ObservationData>
) {
    constructor() : this("", null, emptyList<ObservationData>() as MutableList<ObservationData>)
}