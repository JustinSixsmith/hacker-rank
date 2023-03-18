function numberOfSteps(num) {
  let count = 0;
  while (num > 0) {
    if (num % 2 === 0) {
      num /= 2;
      count++;
    } else {
      num -= 1;
      count++;
    }
  }
  return count;
}

const num = 100;
console.log(stepsToZero(num));
