// Note to self, pay more attention to problem description, 
//would have saved me 2 hours of debugging something tht had 
//nothing to do with my code
// instead am the one who didn't fully understand the problem.
fun towerBreakers(n: Int, height: Int): Int {
    // Write your code here

    var p1 = true
    
    val towers = IntArray(n) { 1*height }
    
    var playing = true
    var index = 0
    while(playing) {
     
        if (towers[index] != 1) {
            towers[index] = 1
          
            if (index == n-1) index = 0 else index++ 
        }else {
            playing = false
            
        }
        p1 = !p1
        
    }
    
    return if (p1) 1 else 2
}