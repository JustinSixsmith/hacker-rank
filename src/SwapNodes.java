import java.util.ArrayList;
import java.util.List;

public class SwapNodes {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public class BinaryTreeSwap {
        Node root;

        private Node createTree(int[][] indexes, int index) {
            if (index == -1 || index > indexes.length) return null;

            Node node = new Node(index);
            node.left = createTree(indexes, indexes[index - 1][0]);
            node.right = createTree(indexes, indexes[index - 1][1]);

            return node;
        }

        private void swapNodesAtKDepth(Node node, int depth, int k) {
            if (node == null) return;

            if (depth % k == 0) {
                Node temp = node.left;
                node.left = node.right;
                node.right = temp;
            }

            swapNodesAtKDepth(node.left, depth + 1, k);
            swapNodesAtKDepth(node.right, depth + 1, k);
        }

        private void inOrderTraversal(Node node, List<Integer> result) {
            if (node == null) return;

            inOrderTraversal(node.left, result);
            result.add(node.data);
            inOrderTraversal(node.right, result);
        }

        public List<List<Integer>> swapNodes(int[][] indexes, int[] queries) {
            root = createTree(indexes, 1);

            List<List<Integer>> results = new ArrayList<>();
            for (int k : queries) {
                swapNodesAtKDepth(root, 1, k);

                List<Integer> inOrderResult = new ArrayList<>();
                inOrderTraversal(root, inOrderResult);

                results.add(inOrderResult);
            }

            return results;
        }
    }
}
