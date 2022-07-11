package OopDemo.src.example.myapp.aquarium

open class Aquarium(var length: Int = 0, var width: Int = 0, open var height: Int = 0) {
    init {
        println("aquarium initializing")
        //println("Volume: ${width * length * height / 1000} l")
    }
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            if(length!=0&&width!=0)height = (value * 1000) / (width * length)
        }
    open val shape ="rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9
    fun printSize() {
        println(shape)
        println("""Width: $width cm ,
            |Length: $length cm ,
            |Height: $height cm """.trimMargin())
        println("Volume: $volume l Water: $water l (${water / volume * 100.0}% full)")
    }

}