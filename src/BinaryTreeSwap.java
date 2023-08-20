import java.util.ArrayList;
import java.util.List;

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

    private Node createTree(List<List<Integer>> indexes, int index) {
        if (index == -1 || index > indexes.size()) return null;

        Node node = new Node(index);
        node.left = createTree(indexes, indexes.get(index - 1).get(0));
        node.right = createTree(indexes, indexes.get(index - 1).get(1));

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

    public static List<List<Integer>> swapNodes(List<List<Integer>> indexes, List<Integer> queries) {
        BinaryTreeSwap tree = new BinaryTreeSwap();

        tree.root = tree.createTree(indexes, 1);

        List<List<Integer>> results = new ArrayList<>();
        for (int k : queries) {
            tree.swapNodesAtKDepth(tree.root, 1, k);

            List<Integer> inOrderResult = new ArrayList<>();
            tree.inOrderTraversal(tree.root, inOrderResult);

            results.add(inOrderResult);
        }

        return results;
    }
}