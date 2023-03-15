// function longestCommonPrefix(strs) {
//   // If str is empty, return ""

//   if (!strs.length) {
//     return "";
//   }

//   // Start with the shortest string in the array
//   let minStr = strs.reduce((a, b) => (a.length <= b.length ? a : b));

//   // Iterate for as many times there are chars in minStr
//   for (let i = 0; i < minStr.length; i++) {
//     // Compare chars from string to minStr, once they stop matching, slice at that point
//     for (let string of strs) {
//       if (string[i] !== minStr[i]) {
//         return minStr.slice(0, i);
//       }
//     }
//   }

//   return minStr;
// }

// // Example usage
// let strings = ["flower", "flow", "flight"];
// console.log(longestCommonPrefix(strings)); // Output: "fl"

// strings = ["dog", "racecar", "car"];
// console.log(longestCommonPrefix(strings)); // Output: ""

// function pivotIndex(nums) {
//   let leftSum = 0;
//   let rightSum = 0;
//   let pivot = -1;
//   for (let i = 0; i < nums.length; i++) {
//     let pivotIndex = i + 1;
//     leftSum += nums[i];
//     for (let j = nums.length - 1; j > nums[pivotIndex]; j--) {
//       rightSum += nums[j];
//     }
//     if (leftSum === rightSum) {
//       pivot = pivotIndex;
//       break;
//     }
//   }
//   return pivot;
// }

// Right sum equals total of array to start
function pivotIndex(nums) {
  let rightSum = nums.reduce((a, b) => a + b, 0);
  let leftSum = 0;

  // Loop over array, subtracting the num at index i to find new right sum
  for (let i = 0; i < nums.length; i++) {
    rightSum -= nums[i];

    // Compare with left sum, and if equal, return i
    if (leftSum === rightSum) return i;

    // If not move left sum up an index and add
    leftSum += nums[i];
  }

  return -1;
}

const nums = [1, 7, 3, 6, 5, 6];
console.log(pivotIndex(nums));
