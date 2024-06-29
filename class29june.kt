//Functions
//Q1. Write a function that takes two integers and returns the larger of the two.
//Q2. Write a function sumOfList that takes a list of integers and returns the sum of all elements.
//Q3. Implement a function named isPalindrome that checks whether a given string is a palindrome (reads the same backward as forward).
//Q4. Create a function factorial that takes an integer n and returns the factorial of n using recursion.

//1.
fun main() {
    val result = largerNum(56,78)
    println("$result is larger between two given number")
}
fun largerNum(Num1: Int,Num2: Int): Int{
    if (Num1 > Num2)
        return Num1
    return Num2
}

//2.
fun main() {
    val list1 = listOf(1, 2, 3, 4, 5)
    val sum = sumOfList(list1)
    println("$sum is the sum of the given numbers")
}

fun sumOfList(list1: List<Int>): Int {
    var sum = 0
    for (i in list1) {
        sum += i
    }
    return sum
}

//4.
fun main() {
    val result = fact(57)
    println("$result is the factorial of 18")
}

fun fact(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * fact(n - 1)
    }
}

//3.
fun main() {

    isPalindrome("MALAYALAM")
}
fun isPalindrome(str: String){
    var s = ""
    for ( i in str.length - 1 downTo 0){
        s = s + str[i]
    }
    if(s == str){
    	println("$str is Palindrome")
    }
    else{
        println("$str is not Palindrome")
    }
}

//Class

//1. Define a BankAccount class with properties accountNumber and balance.
// Implement methods deposit and withdraw to modify the balance, and getBalance to return the current balance.

fun main() {
    val account = BankAccount("123677689", 10000.0)
    account.deposit(2890.0)
    account.withdraw(1900.0)
    println("Current balance: $${account.getBalance()}")
}

class BankAccount(val accountNumber: String, var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $$amount. New balance: $$balance")
        } else {
            println("Invalid")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrew $$amount. New balance: $$balance")
        } else {
            println("Invalid")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}


//2. Inheritance and Polymorphism: 
//Create an abstract class Shape with an abstract method area. 
//Create two subclasses Rectangle and Circle that implement the area method. 
//Add another method perimeter in both subclasses and demonstrate polymorphism.

fun main() {
    val r = Rectangle(89.0, 48.0)
    var r_area = r.area()
    var r_peri = r.perimeter()
    println("Area of the rectangle is $r_area")
    println("Perimeter of the rectangle is $r_peri")
    val c = Circle(70.0)
    var c_area = c.area()
    var c_peri = c.perimeter()
    println("Area of the rectangle is $c_area")
    println("Perimeter of the circle is $c_peri")
}

abstract class Shape {
    abstract fun area(): Double
}

class Rectangle(val a: Double, val b: Double) : Shape() {
    override fun area(): Double {
        return a * b
    }
    fun perimeter(): Double{
        return 2 * (a + b)
    }
}
class Circle(val r: Double) : Shape() {
    override fun area(): Double {
        return 3.14 * r * r
    }
    fun perimeter(): Double{
        return 2 * 3.14 * r
    }
}


//3. Interface Implementation:
//Create an interface Drawable with a method drawInfo. Implement this interface in two classes Square and Triangle and print the info about the shapes.

interface Drawable{
    fun drawInfo()
}

class Square(var length : Int) : Drawable{
    override fun drawInfo(){
        println("It is a square with length $length")
    }
}
class Triangle(var length : Int, var height : Int) : Drawable{
    override fun drawInfo(){
        println("It is a triangle with length $length and height $height")
    }
}
fun main(){
    val s= Square(6)
    s.drawInfo()
    val t = Triangle(3,4)
    t.drawInfo()
    
}
