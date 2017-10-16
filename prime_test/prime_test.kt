/**
 * Language: Kotlin
 * Author: Arnold Szabo
 * Github: https://github.com/szaboa
 *
 * Check if the first given argument is prime or not
 */

fun main(args: Array<String>) {
    if (args.size == 0) {
        println("Please provide a number as command-line  argument")
        return
    }
    
 	var isPrime = true
    var number: Int
    
    try{
    	number = args[0].toInt()
    }catch(e: NumberFormatException){
        println("The provided imput is not a number")
        return
    }
    
    if (0.compareTo(number) > 0){
        println("The provided number must be positive")
    }
    
    for (i in 2..number/2){
        if (number % i == 0){
            isPrime = false
            break
        }
    }
    
    if (isPrime){
        println("The number $number is prime!")
    }else{
        println("The number $number is not prime!")
    }
    
}
    
