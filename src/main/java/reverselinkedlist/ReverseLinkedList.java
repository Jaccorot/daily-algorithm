package reverselinkedlist;

public class ReverseLinkedList {

    static Node readyNode() {
        Node linkNode1 = new Node();
        linkNode1.index = 1;
        Node linkNode2 = new Node();
        linkNode2.index = 2;
        Node linkNode3 = new Node();
        linkNode3.index = 3;
        Node linkNode4 = new Node();
        linkNode4.index = 4;
        Node linkNode5 = new Node();
        linkNode5.index = 5;
        Node linkNode6 = new Node();
        linkNode6.index = 6;
        linkNode1.next = linkNode2;
        linkNode2.next = linkNode3;
        linkNode3.next = linkNode4;
        linkNode4.next = linkNode5;
        linkNode5.next = linkNode6;
        return linkNode1;
    }

    public static Node reverseNode(Node node) {
        Node preNode = null;
        while (node != null) {

            Node next = node.next;

            node.next = preNode;

            preNode = node;
            node = next;
        }
        return preNode;
    }

    public static void main(String[] args) {
        Node temp = reverseNode(readyNode());
        while (temp!= null) {
            System.out.println(temp.index);
            temp = temp.next;
        }
    }
}
