# Python program to display the Fibonacci sequence up to n-th term


def fib(n):
    """Function to return fibonacci sequence"""
    if n <= 1:
        return n
    else:
        return fib(n-1) + fib(n-2)

# Read number of terms from user
n_terms = input("Please enter number of terms you want for Fibonacci : ")

# check if the number of terms is valid
if n_terms <= 0:
    print("Plese enter a positive integer greater than ZERO(0)")
else:
    print("Fibonacci sequence:")
    for i in range(n_terms):
        print(fib(i))
