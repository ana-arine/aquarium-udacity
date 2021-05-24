package spices

import Aquarium.Color


abstract class Spice2 (val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {

    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String,
            color: SpiceColor = YellowSpiceColor) : Spice2(name, spiciness, color), Grinder {
    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.GREEN  //couldn't be yellow
}

