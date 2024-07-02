//Coding Questions on Coroutines in Kotlin:

//1. Basic Coroutine Example:
// Write a simple coroutine in Kotlin that prints "Hello" and then "World" after a 1-second delay.

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        println("Hello")
        delay(1000L)
        println("World")
    }
}

//2. Coroutine with Exception Handling:
//Write a coroutine in Kotlin that handles exceptions during the execution of tasks.
//Basic try-catch Example:
// Write a Kotlin function that takes two integers and divides the first by the second. Use a try-catch block to handle any potential division by zero exceptions and return a meaningful error message.

fun divideSafely(numerator: Int, denominator: Int): String {
    return try {
        (numerator / denominator).toString() 
    } catch (e: ArithmeticException) {
        "Error: Division by zero is not allowed."
    }
}

// Create a custom exception class in Kotlin called InvalidAgeException. Write a function that checks a person's age and throws InvalidAgeException if the age is less than 18.

class InvalidAgeException(message: String) : Exception(message)

fun checkAge(age: Int) {
    if (age < 18) {
        throw InvalidAgeException("You must be at least 18 years old.")
    } else {
        println("Age is valid.")
    }
}

fun main() {
    try {
        checkAge(6) 
    } catch (e: InvalidAgeException) {
        println(e.message)
    }
}

//Write a Kotlin function that accesses an array element by index. Use a finally block to print a message indicating the end of the operation, regardless of whether an exception was thrown

fun accessArrayElement(arr: Array<Int>, index: Int): Int {
    try {
        return arr[index]
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Error: Index out of bounds.")
        throw e
    } finally {
        println("Array access operation completed.")
    }
}

fun main() {
    val numbers = arrayOf(1, 2, 3, 4)

    try {
        val result1 = accessArrayElement(numbers, 2)
        println("Accessed element: $result1")

        val result2 = accessArrayElement(numbers, 9)
        println("Accessed element: $result2")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Exception caught in main function.")
    }
}
//3. Coroutine with Timeout:
// Write a Kotlin program using coroutines that performs a long-running task but cancels it if it takes more than 2 seconds to complete. Use the withTimeoutfunction to achieve this.

import kotlinx.coroutines.*

fun main() = runBlocking {
    val result = withTimeoutOrNull(2000L) {
        longRunningTask() 
    }

    if (result == null) {
        println("timed out!")
    } else {
        println("completed and result: $result")
    }
}

suspend fun longRunningTask(): String {
    delay(3000L)
    return "Task result"
}
