package ListaDupla;

public class node {
    public String element;
    public node next;
    public node prev;

    public node(String element, node next, node prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}