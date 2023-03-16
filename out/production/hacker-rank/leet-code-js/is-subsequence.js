// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

function isSubsequence(s, t) {
  let count = 0;
  // Look at chars in s and find them in sequence in t
  for (let i = 0; i < s.length; i++) {
    const charS = s[i];
    for (let j = 0; j < t.length; j++) {
      const charT = t[j];
      // Count the matches and compare with s length
      if (charS === charT) count++;
    }
  }
  // If we don't make it all the way, return false
  if (count !== s.length) return false;
  // Default return true if checks pass
  return true;
}

const s = "abc";
const t = "ahbgdc";
console.log(isSubsequence(s, t));
