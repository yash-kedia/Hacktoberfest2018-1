/**
* Language: Kotlin
* Author: Arnold Szabo
* Github: https://github.com/szaboa
*
* Check if the first given argument is prime or not
*/

fun main(args: Array<String>) {
  if (args.isEmpty()) {
    println("Please provide a number as command-line  argument")
    return
  }

  val number: Int

  try {
    number = args[0].toInt()
    } catch (e: NumberFormatException) {
      println("The provided imput is not a number")
      return
    }

    if (number < 0) {
      println("The provided number must be positive")
      return
    }

    val isPrime = (2..number / 2).none { number % it == 0 }

    val text = "The number $number " + if (isPrime) "is prime!" else "is not prime!"
    println(text)
  }
