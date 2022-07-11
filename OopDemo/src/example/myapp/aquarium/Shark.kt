package OopDemo.src.example.myapp.aquarium

class Shark: FishColour, FishAction {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}