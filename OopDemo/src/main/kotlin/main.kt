package OopDemo.src.main.kotlin

import OopDemo.src.example.myapp.Aquarium

fun main() {
    buildAquarium()
}

fun buildAquarium(){
    val aquarium6= Aquarium(10,10,10)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
}