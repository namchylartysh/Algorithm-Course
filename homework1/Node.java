package algorythms.homework1;

public class Node {
    public Node left;
    public Node right;
    public Integer value;

    private static boolean isNodeExist(Node node) {
        return node != null && node.value != null;
    }

    private static void createNode(Node node, Integer value) {
        node.left = new Node();
        node.right = new Node();
        node.value = value;
    }

    private static void insert(Node node, int value) { // recurs
        if(!isNodeExist(node)) {
            createNode(node, value);
        } else if(value < node.value) {
            insert(node.left, value);
        } else {
            insert(node.right, value);
        }
    }

    // TODO
    private static Node search(Node node, int value) {
        return null;
    }

    private static Node getMin(Node node) {
        if(!isNodeExist(node)) {
            return null;
        }
        if (!isNodeExist(node.left)) {
            return node;
        }
        return getMin(node.left);
    }

    private static Node getMax(Node node) {
        if(!isNodeExist(node)) {
            return null;
        }
        if (!isNodeExist(node.right)) {
            return node;
        }
        return getMax(node.right);

    }

    private static void inOrderTraversal(Node node) {
        if(!isNodeExist(node)) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println("[" + node.value + "]");
        inOrderTraversal(node.right);
    }

    private static void directOrderTraversal(Node node) {
        if(!isNodeExist(node)) {
            return;
        }
        System.out.println("[" + node.value + "]");
        directOrderTraversal(node.left);
        directOrderTraversal(node.right);
    }
    private static void postOrderTraversal(Node node) {
        if(!isNodeExist(node)) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println("[" + node.value + "]");
    }


    public static void main(String[] args) {
        Integer[] digit = {9, 2, 5, 13, 6, 10, 14, 7, 33};
        Node node = new Node();
        createNode(node, 9);

        for (int i = 1; i < digit.length; i++) {
            insert(node, digit[i]);
        }
    }
}
