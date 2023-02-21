fun main(args: Array<String>): Unit {

    print("Coding is fun")

}

fun closestNumbers(arr: Array<Int>): Array<Int> {
    // Write your code here

    if(arr.size <= 1) return arr
    
    val sArr = arr.sortedArray()
    val result = mutableListOf<Int>()

    var minDiff = sArr[1] - sArr[0]

    for (num in 0 until arr.size-1){
        var diff = sArr[num+1] - sArr[num]
        if ( diff < minDiff ) {
            minDiff = diff
        }
        if ( diff == minDiff ) {
            result.add(sArr[num])
            result.add(sArr[num+1])
        }
    }
    
    return result.toTypedArray()
}
