/* 1.print pattern
 5space 1*, 0space 9* */

fun main(){
    var n = 6
    for(i in 1 until n){
        for(j in 1 until (n-i) ){
            print(" ")
        }
        for( p in 1 until (2*i) ){
        print("*")
        }
        println()
    }
  for (i in n downTo 1) {
        for (j in (n - i) downTo 1) {
            print(" ")
        }
        for (p in (2 * i - 3) downTo 1) {
            print("*")
        }
        println()
    }
  
}
/*2.  Armstrong Number*/
fun main() {
    val n = 371
    var num = n
    var q = 0
    var r: Int
    var s: Int
    
    while (num != 0) {
        r = num % 10
        s = r * r * r
        q += s
        num /= 10
    }
    
    if (q == n) {
        println("$n is Armstrong")
    } else {
        println("$n is Not Armstrong")
    }
}

/*3.gcd using euclidean method*/

fun main(){
    var a = 8
    var b = 10
    var temp : Int
    var result : Int
    while(b > 0){
        temp = b
        b = a % b
        a = temp
    }
    result = a
    println("$result is the required gcd")
}

/* 4.frequency of letters in a string*/

fun main(){
    var ch: Char
    val inputstr = "kjahah2179jdlahdahd6332jhdkWDAW"
    val indstr = inputstr.filter{ it.isLetter() }.toLowerCase()
    println(indstr)
    
    val freq = IntArray(25)
     for (ch in indstr) {
        val index = ch - 'a'
        freq[index]++
    }
    
     for(i in 0 until 25){
         if(freq[i]>0){
            println("freq of ${'a' + i} : ${freq[i]}")
         }
    }
}


/* 5. duck number check*/

fun main() {
    val num = 10980998
    var no = num
    var k=0
    
    while(no != 0){
        if(no % 10 == 0){
            println("$num is a duck number")
            k++
            break
        }
        no = no / 10
    }
    if(k==0){
        println("$num is not a duck number")
    }
}
