function checkPrime(n) {
  isPrime = true
  
  for (i = 2; i <= Math.floor(Math.sqrt(n)); i++) {
    if (n % i === 0) {
      isPrime = false;
      break;
        }
    }
  return isPrime
}