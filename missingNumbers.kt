// Given two arrays of integers, find which elements in the second array are missing from the first array.

fun missingNumbers(arr: Array<Int>, brr: Array<Int>): Array<Int> {
    // Write your code here

    val bMap = mutableMapOf<Int, Int>() 
    val ll = mutableListOf<Int>()

    for (s in brr) {
        var freq = bMap.get(s) ?: 0
        bMap.put(s, ++freq)
    }

    for (a in arr) {
        var freq = bMap.get(a)!!
        bMap[a] = --freq
    }

    for (b in brr) {
        var freq = bMap.get(b)!!
        if (freq != 0) {
            bMap[b] = --freq
            ll.add(b)
        }
    }

    // idk why we need to call toSortedSet(), 
    return ll.toTypedArray().toSortedSet().toTypedArray()

}