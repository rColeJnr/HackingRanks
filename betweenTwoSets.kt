/*
There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
1. The elements of the first array are all factors of the integer being considered
2. The integer being considered is a factor of all elements of the second array
*/

fun main(args: Array<String>) {
    val toPrint = getTotal(arrayOf(2,4), arrayOf(16,24))
    println(toPrint)
}

fun getTotal(arr: Array<Int>, brr: Array<Int>) : Int {

    var result = 0

    loop@for( i in arr.sortedArray().last()..brr.sortedArray().first()) {

        for (a in arr) {
            if (i % a != 0) {
                break
            }
        }
        
        for (b in brr) {
            if (i % b != 0) {
                break
            }
        }

        result++

    }
    
    return result

}