package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {

    val size: Int
    //init works as a constructor and we can put a logic in it to initialize our properties.

    init {

    }
    init {
        if (friendly) {
            size = volumeNeeded
        } else {

        } // if the fish is aggressive  (friendly = false), it will ned twice the minimum volume.

    }
}