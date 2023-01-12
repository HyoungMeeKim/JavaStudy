class Node {
    int data;
    Node left;
    Node right;
}

class Tree {
    public Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node makeNode(Node left, int data, Node right) {
        Node node = new Node();
        node.data = data;
        node.left = left;
        node.right = right;
        return node;
    }

    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
}
/*
        (1)
       ↙   ↘
    (2)     (3)
   ↙   ↘
(4)     (5)
Inorder   (left, root, right): 4 2 5 1 3
Preorder  (root, left, right): 1 2 4 5 3
Postorder (left, right, root): 4 5 2 3 1
*/

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node n4 = t.makeNode(null, 4, null);
        System.out.println("n4: " + n4 + ", left: " + n4.left + ", right: " + n4.right + ", data: " + n4.data);

        Node n5 = t.makeNode(null, 5, null);
        System.out.println("n5: " + n5 + ", left: " + n5.left + ", right: " + n5.right + ", data: " + n5.data);

        Node n2 = t.makeNode(n4, 2, n5);
        System.out.println("n2: " + n2 + ", left: " + n2.left + ", right: " + n2.right + ", data: " + n2.data);

        Node n3 = t.makeNode(null, 3, null);
        System.out.println("n3: " + n3 + ", left: " + n3.left + ", right: " + n3.right + ", data: " + n3.data);

        Node n1 = t.makeNode(n2, 1, n3);
        System.out.println("n1: " + n1 + ", left: " + n1.left + ", right: " + n1.right + ", data: " + n1.data);
        t.setRoot(n1);
        t.inorder(t.getRoot());
        System.out.println();
        t.preorder(t.getRoot());
        System.out.println();
        t.postorder(t.getRoot());
    }
}
