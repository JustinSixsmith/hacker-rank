function maxProfit(prices) {
  // Iterate through the array
  let maxProfit = 0;
  for (let i = 1; i < prices.length; i++) {
    const todaysPrice = prices[i];

    // Look at the future prices
    for (let j = i - 1; j >= 0; j--) {
      const futurePrice = prices[j];
      // if the future price minus the current price is greater than the max profit
      const profit = todaysPrice - futurePrice;
      if (profit > maxProfit) {
        maxProfit = profit;
      }
    }
  }
  return maxProfit;
}

const prices = [7, 1, 5, 3, 6, 4];
console.log(maxProfit(prices));
