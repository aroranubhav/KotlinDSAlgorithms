package arrays

/**
    Write a short program that takes in an input n.

    For each multiple of 3, print "Fizz" instead of the number.

    For each multiple of 5, print "Buzz" instead of the number.

    For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
 */

class FizzBuzz {
    fun fizzBuzz(n: Int): ArrayList<String> {

        val result = ArrayList<String>()

        for (num in 1..n) {
            if (num % 3 == 0 && num % 5 == 0) {
                result.add("FizzBuzz")
            } else if (num % 3 == 0) {
                result.add("Fizz")
            } else if (num % 5 == 0) {
                result.add("Buzz")
            } else {
                result.add(num.toString())
            }
        }
        return result
    }
}

fun main() {
    val fizzBuzz = FizzBuzz()
    val n = 15
    println(fizzBuzz.fizzBuzz(n))
}

/**
Complexity : Time : O(n) | Space : O(n)
*/


