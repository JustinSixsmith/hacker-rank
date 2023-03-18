function canConstruct(ransomNote, magazine) {
  for (let i = 0; i < ransomNote.length; i++) {
    if (!magazine.includes(ransomNote[i])) {
      return false;
    }
    magazine = magazine.replace(ransomNote[i], "");
  }
  return true;
}

const ransomNote = "aa";
const magazine = "aab";

console.log(canConstruct(ransomNote, magazine));
