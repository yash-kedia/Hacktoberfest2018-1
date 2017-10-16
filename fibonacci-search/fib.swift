// LANGUAGE: Swift
// AUTHOR: Hans Christian Cristobal
// GITHUB: https://github.com/Hansuuuuuuuuuu

func fib(num: Int) -> Int {
    guard num != 0, num != 1 else { 
    	return num 
    }

    return fib(num: num - 1) + fib(num: num - 2)
}


print(fib(num: 2))