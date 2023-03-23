function maxProfit(prices) {
  let minPrice = Number.MAX_VALUE;
  let maxProfit = 0;

  for (const price of prices) {
    if (price < minPrice) {
      minPrice = price;
    } else if (price - minPrice > maxProfit) {
      maxProfit = price - minPrice;
    }
  }
  return maxProfit;
}

const prices = [7, 1, 5, 8, 3, 6, 4, 2];
console.log(maxProfit(prices));
