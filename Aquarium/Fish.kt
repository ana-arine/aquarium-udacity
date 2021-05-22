package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {

    val size: Int
    //init works as a constructor and we can put a logic in it to initialize our properties.

    init {
        println("First init block")
    }

    constructor() : this(true, 9) {
        println("Running secondary constructor")
    }

    init {
        if (friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        } // if the fish is aggressive  (friendly = false), it will need twice the minimum volume.
    }

    init {
        println("constructed fish of size $volumeNeeded final size ${this.size}")
    }

    init {
        println("Last init block")
    }
}

fun makeDefaultFish() = Fish(true, 50)

fun fishExample() {
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}

//To write good Kotlin code, just use one primary constructor and init blocks.
//When you need more flexibility, consider adding helper functions like makeDefaultFish().