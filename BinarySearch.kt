fun main(){
    var arr= listOf<Int>(1,2,3,4,5,6,7,8,9)
    println(binSearch(arr,0,8,1))
}

fun binSearch(arr:List<Int>, fromIndex:Int, toIndex:Int, target:Int) :Int{
    var mid:Int
    var start=fromIndex
    var end=toIndex
    while(start<=end){
        mid=(start+end)/2
        println(arr[mid])
        if(arr[mid]==target){
            return mid
            break
        }
        else if(arr[mid]>target){
            end=mid-1
        }
        else{
            start=mid+1
        }

    }
    return -1
}