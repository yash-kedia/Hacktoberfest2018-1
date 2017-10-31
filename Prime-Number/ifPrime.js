function prime(toCheck) {
  for(let i = 2; i < toCheck; i++) {
    if(toCheck % i == 0) {
      return false;
    }
  }
  return toCheck > 1;
}
