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
  // Put letters from magazine into a map with the letters as keys and the number of times they appear as values
  const letters = {};
  for (let i = 0; i < magazine.length; i++) {
    letters[magazine[i]] = (letters[magazine[i]] || 0) + 1;
  }
  console.log(letters);

  // Iterate through the ransom note and check if the letter is present in the magazine
  for (let i = 0; i < ransomNote.length; i++) {
    if (letters[ransomNote[i]] === undefined || letters[ransomNote[i]] === 0) {
      return false;
    }
    letters[ransomNote[i]] -= 1;
  }

  // Return true if the ransom note can be constructed from the magazine
  return true;
}

const ransomNote = "aa";
const magazine = "asldjflksdab";

console.log(canConstruct(ransomNote, magazine));
