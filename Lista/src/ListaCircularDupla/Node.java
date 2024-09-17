package ListaCircularDupla;
public class Node {
    String element;
    Node next;
    Node prev;

    public Node(String element, Node next, Node prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}