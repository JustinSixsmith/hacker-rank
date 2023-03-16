function isIsomorphic(s, t) {
  // First check to see if the strings are the same length.
  if (s.length !== t.length) {
    return false;
  }

  // Create two maps for mapping chars to each other
  const sToTMap = new Map();
  const tToSMap = new Map();

  // Grab char pairs at index i
  for (let i = 0; i < s.length; i++) {
    const sChar = s[i];
    const tChar = t[i];

    // Add pairs to maps if it doesn't already exist
    if (!sToTMap.has(sChar) && !tToSMap.has(tChar)) {
      sToTMap.set(sChar, tChar);
      tToSMap.set(tChar, sChar);
      // If it does exist, check to see that it's consistent with the current pair
    } else if (sToTMap.get(sChar) !== tChar || tToSMap.get(tChar) !== sChar) {
      return false;
    }
  }

  // Default return true if checks make it through
  return true;
}

const s = "egg";
const t = "add";
console.log(isIsomorphic(s, t));
