package app13LinkedList;

public class LinkedList {
    public Node head;
    
    public LinkedList() {
        head = null;
    }
    
    public void createNode(String movieName, int ticketSold) {
        Node node = new Node(movieName, ticketSold);
        node.next = head;
        head = node;
    }
}
