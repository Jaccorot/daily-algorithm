package binarytree;

import java.util.LinkedList;

public class BinaryTree {

    public Node init() {
        Node J = new Node(8, null, null);
        Node H = new Node(4, null, null);
        Node G = new Node(2, null, null);
        Node F = new Node(7, null, J);
        Node E = new Node(5, H, null);
        Node D = new Node(1, null, G);
        Node C = new Node(9, F, null);
        Node B = new Node(3, D, E);
        Node A = new Node(6, B, C);
        return A;   //返回根节点
    }



    public void preOrderTranversal(Node root) {
        if (root != null) {
            System.out.println(root.getData());

            if (root.getLeftNode() != null) {
                preOrderTranversal(root.getLeftNode());
            }

            if (root.getRightNode() != null) {
                preOrderTranversal(root.getRightNode());
            }

        }
    }

    public void inOrderTranversal(Node root) {
        if (root != null) {

            if (root.getLeftNode() != null) {
                inOrderTranversal(root.getLeftNode());
            }

            System.out.println(root.getData());

            if (root.getRightNode() != null) {
                inOrderTranversal(root.getRightNode());
            }
        }
    }

    public void postOrderTranversal(Node root) {
        if (root != null) {

            if (root.getLeftNode() != null) {
                postOrderTranversal(root.getLeftNode());
            }

            if (root.getRightNode() != null) {
                postOrderTranversal(root.getRightNode());
            }

            System.out.println(root.getData());
        }
    }

    public void levelTraverse(Node root) {
        if (root == null) {
            return;
        }
        LinkedList<Node> queue = new LinkedList<> ();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.getData() + "  ");
            if (node.getLeftNode() != null) {
                queue.offer(node.getLeftNode());
            }
            if (node.getRightNode() != null) {
                queue.offer(node.getRightNode());
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = tree.init();

        System.out.println("前序");
        tree.preOrderTranversal(root);
        System.out.println("中序");
        tree.inOrderTranversal(root);
        System.out.println("后序");
        tree.postOrderTranversal(root);

        System.out.println("层级");
        tree.levelTraverse(root);
    }


}
