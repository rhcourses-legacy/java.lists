package de.reinerh.courses.java.lists.linkedlists;

public class SinglyLinkedList {
    private SinglyLinkedListElement head;

    /**
     * Konstruktor. Erzeugt eine neue, leere Liste.
     */
    public SinglyLinkedList() {
        this.head = new SinglyLinkedListElement();
    }

    /**
     * @return true, falls die Liste leer ist.
     */
    public boolean isEmpty() {
        return head.isEmpty();
    }

    /**
     * add hängt ein neues Element ans Ende der Liste an.
     * @param key Der key, der im neuen Element eingetragen wird.
     */
    public void add(int key) {
        SinglyLinkedListElement newElement = new SinglyLinkedListElement(key);

        if (isEmpty()) {
            head = newElement;
            return;
        }
        head.add(newElement);
    }

    /**
     * add fügt ein neues Element in die Liste ein.
     * @param pos Die Position, an der eingefügt wird.
     * @param key Der key, der im neuen Element eingetragen wird.
     */
    public void add(int pos, int key) {
        if (pos == 0) {
            head = new SinglyLinkedListElement(key, head);
            return;
        }
        head.add(pos, new SinglyLinkedListElement(key));
    }

    /**
     * @return Das Element an Stelle pos.
     */
    public int get(int pos) {
        return head.get(pos);
    }

    /**
     * toString liefert eine menschenlesbare String-Repräsenation der Liste.
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (var current = head; !current.isEmpty(); current = current.next) {
            builder.append(current.toString());
            if (!current.next.isEmpty()) {
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
