package ListaDupla;

public class ListaDupla {
    private node head;
    private node tail;

    public ListaDupla() {
        head = null;
        tail = null;
    }

    public void adicionar(String element) {
        node newNode = new node(element, null, tail);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
    }

    public void remover(String element) {
        node current = head;
        while (current != null && !current.element.equals(element)) {
            current = current.next;
        }
        if (current != null) {
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                head = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            } else {
                tail = current.prev;
            }
        }
    }

    public void imprimir() {
        node current = head;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void imprimirReverso() {
        node current = tail;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.prev;
        }
        System.out.println();
    }
}