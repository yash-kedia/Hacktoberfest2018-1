/**
 * Language: Kotlin
 * Author: Arnold Szabo
 * Github: https://github.com/szaboa
 *
 * Generate the first n terms from the Fibonacci Sequence
 */

fun fibonacci(n: Int) : Int{
    if (n <= 1) {
        return n
    }else{
    	return fibonacci(n-1) + fibonacci(n-2)   
    }
}

fun main(args: Array<String>) {
    if (args.size == 0) {
        println("Please provide a number as command-line  argument")
        return
    }
    
    var terms: Int
    
    // check if input is valid number
    try{
    	terms = args[0].toInt()
    }catch(e: NumberFormatException){
        println("The provided imput is not a number")
        return
    }
    
    // check if the input is a positive number
    if (0.compareTo(terms) > 0){
        println("The provided number must be positive")
    }
    
    println("Fibonacci sequence:")
    for (i in 0..terms){
    	println(fibonacci(i))
    }
}
