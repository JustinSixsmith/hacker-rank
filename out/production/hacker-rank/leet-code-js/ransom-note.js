// function canConstruct(ransomNote, magazine) {
//   for (let i = 0; i < ransomNote.length; i++) {
//     if (!magazine.includes(ransomNote[i])) {
//       return false;
//     }
//     magazine = magazine.replace(ransomNote[i], "");
//   }
//   return true;
// }

function canConstruct(ransomNote, magazine) {
  // Create a Map to store the frequency of each character in magazine
  const charFrequency = new Map();
  for (const char of magazine) {
    charFrequency.set(char, (charFrequency.get(char) || 0) + 1);
  }

  // Iterate through the ransomNote string
  for (const char of ransomNote) {
    // If the character is not present in the Map or has a frequency of zero, return false
    if (!charFrequency.has(char) || charFrequency.get(char) === 0) {
      return false;
    }
    // Decrement the frequency of the character in the Map
    charFrequency.set(char, charFrequency.get(char) - 1);
  }

  // If all characters in ransomNote have been found in magazine, return true
  return true;
}

const ransomNote = "aa";
const magazine = "asldjflksdab";

console.log(canConstruct(ransomNote, magazine));
