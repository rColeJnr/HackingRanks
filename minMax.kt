// You will be given a list of integers, , and a single integer . You must create an array of length  from elements of  such that its unfairness is minimized. Call that array . Unfairness of an array is calculated as

fun maxMin(k: Int, arr: Array<Int>): Int {
      // Write your code here

      val unfair = arr.sortedArray()
      var result = Int.MIN_VALUE
      
      result = unfair[k-1] - unfair[0]
      for (i in 1 .. arr.size-k) {
          if (unfair[k+i-1] - unfair[i] < result) {
              result = unfair[k+i-1] - unfair[i]
          }
      }
      return result
}