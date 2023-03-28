var fib = function (n) {
  // Find the nth Fibonacci number.
  if (n <= 1) {
    return n;
  }
  return fib(n - 1) + fib(n - 2);
};

console.log(fib(8));
