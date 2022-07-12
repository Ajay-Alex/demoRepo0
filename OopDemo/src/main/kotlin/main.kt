package OopDemo.src.main.kotlin

import OopDemo.src.example.myapp.aquarium.Aquarium
import OopDemo.src.example.myapp.aquarium.Plecostomus
import OopDemo.src.example.myapp.aquarium.Shark
import OopDemo.src.example.myapp.aquarium.TowerTank

fun main() {
    //makeFish()
    //makeDecorations()
    val list:MutableList<Any> = MutableList(5){idx -> 0}
    list.add(2,"asasas")
    var arr:ArrayList<Any> = ArrayList()
    arr.add("fgfgfg")
    arr.add(22)
    arr.add(0,9.8)
    //println(arr.size)
    list.add(5)
    val decorations = mutableListOf( 1,"pagoda", "plastic plant", "alligator", "flowerpot")
    decorations.add(5)
    buildAquarium(arr)

    //println(decorations[5])

}

fun buildAquarium(array: MutableList<Any>){
    for(i in array){
        println(i)
    }
    //val aquarium= Aquarium(25,25,40)
    //aquarium.printSize()
    //val tower = TowerTank(40,25)
    //tower.printSize()
}
fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}