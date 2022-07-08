fun main(){
    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2}
    println(waterFilter(dirtyLevel))

    val waterFilter2:(Int)->Float={dirty2->(dirty2.toFloat()/3)}
    println(waterFilter2(dirtyLevel))
    println(updateDirty(dirtyLevel,waterFilter2))
    println(updateDirty(dirtyLevel,::increaseDirty))
    dirtyLevel = 19;
    println(updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel.toFloat()*2.3f})
}

fun updateDirty(dirty: Int, operation: (Int) -> Float): Float {
    return operation(dirty/3)
}

fun increaseDirty(start:Int):Float=start.toFloat()*5.5f
