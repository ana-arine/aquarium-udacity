package Aquarium

import SimpleSpice

fun main (args: Array<String>) {
    buildAquarium()

    val simpleSpice = SimpleSpice()
    println("${simpleSpice.spiceName} ${simpleSpice.heat}")
}

private fun buildAquarium() {
    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length}  " +
            "Width: ${myAquarium.width}  " +
            "Height: ${myAquarium.height}")

    myAquarium.height = 80

    println("Height: ${myAquarium.height} cm")
    println("Volume: ${myAquarium.volume} liters")




}


