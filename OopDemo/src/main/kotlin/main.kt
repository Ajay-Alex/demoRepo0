package OopDemo.src.main.kotlin

import OopDemo.src.example.myapp.Aquarium.Aquarium
import OopDemo.src.example.myapp.Aquarium.Plecostomus
import OopDemo.src.example.myapp.Aquarium.Shark
import OopDemo.src.example.myapp.Aquarium.TowerTank

fun main() {
    //buildAquarium()
    makeFish()
}

fun buildAquarium(){
    val aquarium= Aquarium(25,25,40)
    aquarium.printSize()
    val tower = TowerTank(40,25)
    tower.printSize()
}
fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}