// Given two arrays of integers, find which elements in the second array are missing from the first array.

fun missingNumbers(arr: Array<Int>, brr: Array<Int>): Array<Int> {

    // Write your code here
    val sB = brr.sortedArray()
    val result = MutableList(brr.size) { a -> sB[a] }
    for (a in arr) {
        result.remove(a)
    }
    
    return result

}