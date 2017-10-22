package main

import "fmt"

func main(){
	for i := 0; i < 100; i++ {
		fmt.Printf("%d ", i)
		if isPrime(i) {
			fmt.Println("It's a prime number")
		} else {
			fmt.Println("Not a prime number")
		}
	}
}

func isPrime(number int) (bool) {
	if number < 0 {
		return false
	}
	
	if (number == 1){
		return false
	}
		
	isPrime := true
	
	for i := 2; i <= number/2; i++ {
		if (number % i) == 0 {
			isPrime = false
			break
		}
	}
	
	return isPrime
}
