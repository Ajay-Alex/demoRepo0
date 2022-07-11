package OopDemo.src.main.kotlin

import OopDemo.src.example.myapp.Aquarium
import OopDemo.src.example.myapp.TowerTank

fun main() {
    buildAquarium()
}

fun buildAquarium(){
    val aquarium= Aquarium(25,25,40)
    aquarium.printSize()
    val tower = TowerTank(40,25)
    tower.printSize()
}