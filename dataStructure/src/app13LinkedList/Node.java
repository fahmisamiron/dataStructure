package app13LinkedList;

public class Node {
    
    String movieName;
    int ticketSold;
    Node next;
    
    public Node(String movieName, int ticketSold) {
        this.movieName = movieName;
        this.ticketSold = ticketSold;
    }
    
    public void Display() {
        System.out.println(movieName + " , " + ticketSold + " million dollars");
    }
    
    public String toString() {
        return movieName;
    }
    
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
    }
}