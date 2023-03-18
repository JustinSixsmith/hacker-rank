// function middleNode(head) {
//   // Create a new array to store nodes
//   // Iterate over the list of nodes and count the number of nodes in the list
//   let count = 0;
//   let current = head;

//   while (current) {
//     count++;
//     current = current.next;
//   }
//   return count / 2;
// }

function middleNode(head) {
  // Initialize middle and end nodes
  let middle = head;
  let end = head;

  while (end != null && end.next != null) {
    middle = middle.next;
    end = end.next.next;
  }

  return middle;
}
