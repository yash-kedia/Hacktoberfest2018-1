package main

import "fmt"

func fibonacci(number int) int {
	if number <= 1 {
		return number
	} else {
		currentF := 0
		lastF := 1
		for i := 0; i < number; i++ {
			aux := currentF
			currentF = currentF + lastF
			lastF = aux
		}

		return currentF
	}
}

func main() {
	for i := 0; i<10; i++ {
		fmt.Println(fibonacci(i))
	}
}