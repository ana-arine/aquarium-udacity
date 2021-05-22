package Aquarium

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {
    override val color = "grey"
    override fun eat() {
        println("Hunt and eat fish")
    }
}


class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"

    override fun eat() {
        println("Munch on algae")
    }
}
//Interface doesn't have constructor
interface FishAction {
    fun eat()
}


