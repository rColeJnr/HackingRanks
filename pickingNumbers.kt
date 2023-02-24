fun main(args: Array<String>) {
    // sort the array
    val arr = arrayOf(3,4,2,6,7,55,76,90,56,14,57,5,58,34)
    val result = pickingNumbers(arr.sortedArray())
    println(result)
}

fun pickingNumbers(arr: Array<Int>): Int {
    // Write your code here
    
    var result = Int.MIN_VALUE
    var sum = 1
    var start = 0
    for (i in 1 until arr.size) {
        if ((arr[i] - arr[start]) < 2) {
            sum++
        } else {
            result = Math.max(result, sum)
            sum = 1
            start = i
        }
    }
    
    return Math.max(result, sum)
}
