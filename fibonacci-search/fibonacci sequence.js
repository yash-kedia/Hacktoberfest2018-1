function fibonacci(times) {
  let a = 1;
  let b = 0;
  let c;

  for (let i = 0; i < times; i++) {
    c = a;
    a += b;
    b = c;
    console.log(b);
  }
}
