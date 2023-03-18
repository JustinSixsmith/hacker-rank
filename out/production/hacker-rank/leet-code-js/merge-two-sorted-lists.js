function mergeTwoLists(list1, list2) {
  let newList = [...list1, ...list2];
  return newList.sort((a, b) => a - b);
}

const list1 = [1, 2, 4];
const list2 = [1, 3, 4];

console.log(mergeTwoLists(list1, list2));
