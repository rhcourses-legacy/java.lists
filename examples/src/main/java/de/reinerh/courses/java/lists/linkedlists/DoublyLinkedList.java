package de.reinerh.courses.java.lists.linkedlists;

public class DoublyLinkedList {
    private DoublyLinkedListElement anchor;
    private int size;

    /**
     * Konstruktor. Erzeugt eine neue, leere Liste.
     */
    public DoublyLinkedList() {
        this.anchor = new DoublyLinkedListElement();
        this.size = 0;
    }

    /**
     * @return true, falls die Liste leer ist.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * add hängt ein neues Element ans Ende der Liste an.
     * @param key Der key, der im neuen Element eingetragen wird.
     */
    public void add(int key) {
        var newElement = new DoublyLinkedListElement(key);

        anchor.previous.add(newElement);
        size++;
    }

    /**
     * add fügt ein neues Element in die Liste ein.
     * @param pos Die Position, an der eingefügt wird.
     * @param key Der key, der im neuen Element eingetragen wird.
     */
    public void add(int pos, int key) {
        var newElement = new DoublyLinkedListElement(key);
        anchor.next.add(pos, newElement);
        size++;
    }

    /**
     * @return Das Element an Stelle pos.
     */
    public int get(int pos) {
        return anchor.next.get(pos);
    }

    /**
     * toString liefert eine menschenlesbare String-Repräsenation der Liste.
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (var current = anchor.next; current != anchor; current = current.next) {
            builder.append(current.toString());
            if (current.next != anchor) {
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
