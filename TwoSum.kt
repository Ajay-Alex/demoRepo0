/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/
fun main(){
    println("**START**")
    var nums= arrayOf(3,2,4)
    twoSum(nums,6)
}
fun twoSum(nums: Array<Int>,target: Int){
    for(i in 0 until nums.size-1){
        for(j in i+1 until nums.size){
            if((nums[i]+nums[j])==target) {
                println("[$i,$j]")
                return
            }
        }
    }
    print("No ans")
}