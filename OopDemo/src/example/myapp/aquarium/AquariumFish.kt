package OopDemo.src.example.myapp.aquarium

interface FishColour{
    val color: String
}

interface FishAction  {
    fun eat()
}

object GoldColour: FishColour{
    override val color: String
        get() = "gold"
}