fun main(){
    val arr=arrayOf(8,3,6,4,9,2)
    for(i in bubbleSort(arr))
        print("$i ")
}

fun bubbleSort(arr:Array<Int>):Array<Int>{
    for(i in 0 until arr.size-1){
        for(j in 0 until arr.size-i-1){
            if (arr[j]>arr[j+1]){
                val temp=arr[j]
                arr[j]=arr[j+1]
                arr[j+1]=temp
            }
        }
    }
    return arr
}