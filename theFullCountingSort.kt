// Use the counting sort to order a list of strings associated with integers. 
// If two strings are associated with the same integer, they must be printed in their 
// original order, i.e. your sorting algorithm should be stable. There is one other 
// twist: strings in the first half of the array are to be replaced with the character - 
// (dash, ascii 45 decimal).

fun countSort(arr: array<String>) {
    // Write your code here
    val size = arr.size
    val myMap = mutableMapOf<Int, String>()
    
    for (a in 0 until size){
        val key = arr[a][0].first().toString().toInt()
        if (a < size/2) {arr[a] = arrayOf("$key -")}
        var value = myMap.get(key) 
        if (value == null) {
            value = arr[a][0].subSequence(1, arr[a][0].length).toString()
        } else {
            value = "$value${arr[a][0].subSequence(1, arr[a][0].length)}"
        }
        myMap.put(key, value)
    }
    
    myMap.values.forEach{print("$it ")}
}