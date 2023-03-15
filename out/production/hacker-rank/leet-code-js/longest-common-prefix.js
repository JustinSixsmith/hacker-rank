function longestCommonPrefix(strs) {
  // If str is empty, return ""

  if (!strs.length) {
    return "";
  }

  // Start with the shortest string in the array
  let minStr = strs.reduce((a, b) => (a.length <= b.length ? a : b));

  // Iterate for as many times there are chars in minStr
  for (let i = 0; i < minStr.length; i++) {
    // Compare chars from string to minStr, once they stop matching, slice at that point
    for (let string of strs) {
      if (string[i] !== minStr[i]) {
        return minStr.slice(0, i);
      }
    }
  }

  return minStr;
}

// Example usage
let strings = ["flower", "flow", "flight"];
console.log(longestCommonPrefix(strings)); // Output: "fl"

strings = ["dog", "racecar", "car"];
console.log(longestCommonPrefix(strings)); // Output: ""
