fun main() {
    var num = 121
    var rem : Int
    var temp = 0
    var og =  num
   
    while (temp !=0){
        rem = temp % 10
        og = og * 10 + rem
        temp /= 10
    }
    if (num == og)
    	println("$num is palindrome")
    else
    	println("not a palindrome")
}
