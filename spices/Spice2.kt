package spices

abstract class Spice2 (val name: String, val spiciness: String = "mild") {

    private val heat2: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )
    val spice = Spice("cayenne", spiciness = "spicy")

    val spicelist = spices1.filter { it.heat2 < 5 }

    fun makeSalt() = Spice("Salt")
}

class Curry() {
    override val spiciness: String
}


fun main(){

            }

