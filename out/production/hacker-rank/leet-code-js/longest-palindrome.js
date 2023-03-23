function charCounter(counts, char) {
  counts[char] ? (counts[char] += 1) : (counts[char] = 1);
  return counts;
}

function longestPalindrome(s) {
  let length = 0;
  let odd = 0;
  // Create a map to count letters in string
  const counts = s
    .split("") // Split letters into array
    .reduce(charCounter, {}); // Count up all the letters

  // Count up even letter counts and one odd
  for (const key in counts) {
    if (counts[key] % 2 === 0) {
      length += counts[key];
    } else {
      length += counts[key] - 1;
      odd = 1;
    }
  }
  // Add one single leftover letter as center in palindrome
  if (odd === 1) length++;

  return length;
}

const s = "babad";
console.log(longestPalindrome(s));
