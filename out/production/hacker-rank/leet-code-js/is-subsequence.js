// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

// function isSubsequence(s, t) {
//   let count = 0;
//   // Look at chars in s and find them in sequence in t
//   for (const char of s) {
//     const charS = char;
//     for (const char of t) {
//       const charT = char;
//       // Count the matches and compare with s length
//       if (charS === charT) count++;
//     }
//   }

//   return count === s.length;
// }

function isSubsequence(s, t) {
  let sIndex = 0;
  let tIndex = 0;

  // Match char from s to char in t
  while (sIndex < s.length && tIndex < t.length) {
    if (s[sIndex] === t[tIndex]) {
      // Once found, advance index in s
      sIndex++;
    }
    tIndex++;
  }
  // If we make it to the end of s, it's true
  return sIndex === s.length;
}

const s = "abc";
const t = "ahbgdc";
console.log(isSubsequence(s, t));
