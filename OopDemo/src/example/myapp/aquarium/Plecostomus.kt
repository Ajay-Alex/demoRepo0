package OopDemo.src.example.myapp.aquarium

class Plecostomus(fishColour: FishColour = GoldColour):  FishAction,
    FishColour by fishColour {

    override fun eat() {
        println("eat algae")
    }
}