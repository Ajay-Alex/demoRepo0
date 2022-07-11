package OopDemo.src.example.myapp.Aquarium

class Shark: FishColour, FishAction {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}