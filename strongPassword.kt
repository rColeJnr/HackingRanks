// check if password meets criteria to be considered a storng password
// return the number of characters to be added to meet minimum requirement

// I didn't feel challenged at all by this problem, bcs i have solved similar problms
// while learning regex, so i just took a java solution from 'discussions'

fun minimumNumber(n: Int, p: String): Int {

    var rulesMet = 0

    if (s.matches(".*[a-z].*".toRegex())) rulesMet++
    if (s.matches(".*[A-Z].*".toRegex())) rulesMet++
    if (s.matches(".*[0-9].*".toRegex())) rulesMet++
    if (s.matches(".*[!@#$%^&*()+-].*".toRegex())) rulesMet++

    return if (rulesMet < 4 || (n < 6) ){
        Math.max(4 - rulesMet, 6 - n)
    }
    
    else 0

}