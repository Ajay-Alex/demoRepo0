package OopDemo.src.main.kotlin

import OopDemo.src.example.myapp.aquarium.Aquarium
import OopDemo.src.example.myapp.aquarium.Plecostomus
import OopDemo.src.example.myapp.aquarium.Shark
import OopDemo.src.example.myapp.aquarium.TowerTank
import OopDemo.src.example.myapp.decor.makeDecorations

fun main() {
    //buildAquarium()
    //makeFish()
    makeDecorations()
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