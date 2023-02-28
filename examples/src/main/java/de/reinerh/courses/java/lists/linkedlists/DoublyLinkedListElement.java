package de.reinerh.courses.java.lists.linkedlists;

public class DoublyLinkedListElement {
    int key;
    protected DoublyLinkedListElement previous;
    protected DoublyLinkedListElement next;

    /**
     * Konstruktor. Erzeugt ein Listenelement mit dem 0 als key.
     * Schließt den Nachbar-Kreis mit sich selbst.
     */
    public DoublyLinkedListElement() {
        this(0);
    }

    /**
     * Konstruktor. Erzeugt ein Listenelement mit dem angegebenen key.
     * Schließt den Nachbar-Kreis mit sich selbst.
     */
    public DoublyLinkedListElement(int key) {
        this.key = key;
        this.next = this;
        this.previous = this;
    }

    /**
     * add hängt ein Element direkt hinter this an.
     * 
     * @param newElement Das anzuhängende Element.
     */
    public void add(DoublyLinkedListElement newElement) {

        // Vorher:  this <-> n
        // Nachher: this <-> newElement <-> n
        var n = this.next;

        this.next = newElement;
        newElement.previous = this;
        newElement.next = n;
        n.previous = newElement;
    }

    /**
     * add fügt ein Element an der angegebenen Position ab this in die Liste ein.
     * 
     * @param pos Die Position, an der eingefügt werden soll.
     * @param newElement Das anzuhängende Element.
     */
    public void add(int pos, DoublyLinkedListElement newElement) {
        if (pos == 0) {
            previous.add(newElement);
            return;
        }
        if (pos > 0) {
            next.add(pos-1, newElement);
        } else {
            previous.add(pos+1, newElement);
        }
    }
    
    /**
     * @return Das Element an Stelle pos.
     */
    public int get(int pos) {
        if (pos == 0) {
            return key;
        }
        return next.get(pos-1);
    }

    /**
     * toString liefert eine menschenlesbare String-Repräsenation des Listenelements.
     */
    public String toString() {
        return String.format("%d", this.key);
    }
}
