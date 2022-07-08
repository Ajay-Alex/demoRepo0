package OopDemo.src.example.myapp

class Aquarium(var length: Int = 0, var width: Int = 0, var height: Int = 0) {
    init {
        println("aquarium initializing")
        //println("Volume: ${width * length * height / 1000} l")
    }
    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            if(length!=0&&width!=0)height = (value * 1000) / (width * length)
        }
    fun printSize() {
        println("""Width: $width cm ,
            |Length: $length cm ,
            |Height: $height cm """.trimMargin())
        println("Volume: $volume l")
    }

}