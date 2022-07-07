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
    var ans= IntArray(2)
    print(nums)
    for(i in 0 until nums.size-2){
        for(j in i+1 until nums.size-1){
            if(i+j==target) {
                println("[$i,$j]")
                ans[0]=i
                ans[1]=j
                print(ans)
                break
            }

        }
    }
    print("No ans")
}