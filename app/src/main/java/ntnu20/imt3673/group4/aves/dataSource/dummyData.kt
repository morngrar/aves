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
                    "https://git.gvk.idi.ntnu.no/course/imt3673/students/sveinkab/project-work/assignment-2-aves/-/raw/c-branch/images/blueTit.jpg",
                    "Tom Thomas"
                )
            )
            list.add(
                SingleObservation(
                    "House Sparrow",
                    "Curabitur vehicula euismod purus eu finibus. Maecenas facilisis euismod ante, at feugiat diam congue ut.",
                    "https://git.gvk.idi.ntnu.no/course/imt3673/students/sveinkab/project-work/assignment-2-aves/-/raw/c-branch/images/houseSparrow.jpg",
                    "John Doe"
                )
            )
            list.add(
                SingleObservation(
                    "Black Tailed Hawfinch",
                    "Curabitur vehicula euismod purus eu finibus.",
                    "https://git.gvk.idi.ntnu.no/course/imt3673/students/sveinkab/project-work/assignment-2-aves/-/raw/c-branch/images/blackTailedHawfinch.jpg",
                    "Jane Doe"
                )
            )
            return list
        }
    }
}