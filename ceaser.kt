
fun caesarCipher(n: Int, s: String, d: Int): String {
    // Write your code here
    var k = d
    while (k > 26) {
        k %= 26
    }

    val sb = StringBuilder()
    
    for(char in 0 until n ) {
        var asccii = s[char].toLong()
        if ((asccii >= 65 && asccii <= 90) || (asccii >=  97 && asccii <= 122)) {
                        
            if (asccii < 91 && asccii+k > 90 || asccii+k > 122) {
                asccii -= 26
            }
            asccii += k
        }
        sb.append(asccii.toChar())
    }
    return sb.toString() 
}
