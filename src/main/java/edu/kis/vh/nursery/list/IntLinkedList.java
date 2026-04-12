package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private final int TOP_ERROR= -1;
    private final int POP_ERROR = -1;
    // TODO: Rozważyć użycie wyjątków zamiast zwracania -1
    private Node last;
    private int i;
    // TODO: Rozważyć usunięcie atrybutu i, w chwili obecnej jest nieużywany

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    // TODO: Rozważyć zmianę implementacji tej metody albo jej usunięcie, gdyż zawsze zwraca false
    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return TOP_ERROR;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return POP_ERROR;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}

class Node {

    private final int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
