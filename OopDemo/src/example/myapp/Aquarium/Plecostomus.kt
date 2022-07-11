package OopDemo.src.example.myapp.Aquarium

class Plecostomus(fishColour: FishColour = GoldColour):  FishAction,
    FishColour by fishColour {

    override fun eat() {
        println("eat algae")
    }
}