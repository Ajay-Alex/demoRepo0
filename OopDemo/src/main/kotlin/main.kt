package OopDemo.src.main.kotlin

import OopDemo.src.example.myapp.Aquarium
import OopDemo.src.example.myapp.Plecostomus
import OopDemo.src.example.myapp.Shark
import OopDemo.src.example.myapp.TowerTank

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