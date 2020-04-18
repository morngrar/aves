package ntnu20.imt3673.group4.aves.dataSource

import ntnu20.imt3673.group4.aves.models.SingleObservation

class dummyData {

    companion object {

        fun createDataSet() : ArrayList<SingleObservation> {
            val list = ArrayList<SingleObservation>()
            list.add(
                SingleObservation(
                    "Blue Tit",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                    "",
                    "Tom Thomas"
                )
            )
            list.add(
                SingleObservation(
                    "House Sparrow",
                    "Curabitur vehicula euismod purus eu finibus. Maecenas facilisis euismod ante, at feugiat diam congue ut.",
                    "",
                    "John Doe"
                )
            )
            list.add(
                SingleObservation(
                    "Black Tailed Hawfinch",
                    "Curabitur vehicula euismod purus eu finibus.",
                    "",
                    "Jane Doe"
                )
            )
            return list
        }
    }
}