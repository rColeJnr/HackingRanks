fun main(args: Array<String>) {

    separateNumbers("1234")
}

fun separateNumbers(s: String): Unit {
    // Write your code here
    
    val yes = "NO"
    val no = "YES"
    val len = s.length
    if(!(len <= 1 || s[0] == '0')) {
    
        val sb = StringBuilder()
        
        for(char in 0 until len/2) {
            sb.append(s[char])
            var num = sb.toString().toLong()
            val numb = StringBuilder(len)
            
            while(numb.toString().length < len) {
                numb.append(num)
                num++
            }
            if (numb.toString() == s) {
                println("$no ${s.subSequence(0, char+1)}")
                return
            }
            
        }
    }
    
    println(yes)

}
