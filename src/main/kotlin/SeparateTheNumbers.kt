fun separateTheNumbers(s: String) {
    /// a beautiful number is such that, x1, 1 + x1, 2 + x1, n + xn => x2 = 1 + x1, etc
    val sb = StringBuilder()
    val sLen = s.length
    var i = 0
    while (i < sLen / 2 && s[0] != '0') {
        val nums: MutableList<Long> = ArrayList()
        sb.append(s[i])
        val item1 = sb.toString().toLong()
        nums.add(item1)
        val len = sb.length
        if (len < sLen && s[len] != '0') {
            var bd = StringBuilder(len + 1)
            for (j in len until s.length) {
                bd.append(s[j])
                val current = bd.toString().toLong()
                val k = nums.size
                if (bd.length == 1 && bd[0] == '0' || (j == sLen - 1) && (current < k + item1) || (current > k + item1)) {
                    nums.clear()
                    break
                }
                if (current == k + item1) {
                    nums.add(current)
                    bd = StringBuilder(len + 1)
                }
            }
        }
        if (nums.size > 1) {
            println("YES " + nums[0])
            return
        }
        i++
    }
    println("NO")
}