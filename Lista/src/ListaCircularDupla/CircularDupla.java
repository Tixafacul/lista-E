package ListaCircularDupla;

public class CircularDupla {
    private Node head;

    public CircularDupla() {
        head = null;
    }

    public void adicionar(String element) {
        Node newNode = new Node(element, head, head != null ? head.prev : null);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;
            tail.next = newNode;
            head.prev = newNode;
            newNode.prev = tail;
            newNode.next = head;
        }
    }

    public void remover(String element) {
        if (head == null) return;

        Node current = head;
        do {
            if (current.element.equals(element)) {
                if (current.next == current) {
                    head = null;
                } else {
                    if (current == head) {
                        head = head.next;
                    }
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        } while (current != head);
    }

    public void imprimir() {
        if (head == null) return;

        Node current = head;
        do {
            System.out.print(current.element + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public void imprimirReverso() {
        if (head == null) return;

        Node current = head.prev;
        do {
            System.out.print(current.element + " ");
            current = current.prev;
        } while (current != head.prev);
        System.out.println();
    }
}