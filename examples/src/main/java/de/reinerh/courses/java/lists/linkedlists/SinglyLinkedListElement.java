package de.reinerh.courses.java.lists.linkedlists;

public class SinglyLinkedListElement {
    int key;
    SinglyLinkedListElement next;

    /**
     * Konstruktor. Erzeugt ein Listenelement mit dem angegebenen key.
     * Die Liste geht dann mit tail weiter.
     */
    public SinglyLinkedListElement(int key, SinglyLinkedListElement tail) {
        this.key = key;
        this.next = tail;
    }

    /**
     * Konstruktor. Erzeugt ein leeres Listenelement.
     * Verwendet dafür den Konstruktor mit key und tail.
     */
    public SinglyLinkedListElement() {
        this(0,null);
    }
    
    /**
     * Konstruktor. Erzeugt ein Listenelement mit dem angegebenen key.
     * Verwendet dafür den Konstruktor mit key und tail.
     */
    public SinglyLinkedListElement(int key) {
        this(key, new SinglyLinkedListElement());
    }

    /**
     * @return true, falls die Liste leer ist.
     */
    public boolean isEmpty() {
        return this.next == null;
    }

    /**
     * add hängt ein Element ans Ende der Liste an.
     * Diese Funktion ist nur korrekt, falls die Liste nicht leer ist.
     * 
     * @param newElement Das anzuhängende Element.
     */
    public void add(SinglyLinkedListElement newElement) {
        if (this.isEmpty()) {
            // Fehler: Wenn this leer ist, sind wir ein Element zu weit.
            // Hier können wir nichts mehr anhängen.
            return;
        }
        if (next.isEmpty()) {
            // Wenn next leer ist, ist this das letzte Element der Liste.
            // Dann ersetzen wir next durch das neue Element.
            next = newElement;
            return;
        }
        // Wenn next noch nicht leer ist, dann sind wir noch nicht am Ende angekommen
        // und gehen rekursiv weiter.
        next.add(newElement);
    }

    /**
     * add fügt ein Element an der angegebenen Position in die Liste ein.
     * Diese Funktion ist nur korrekt, falls die Liste nicht leer und pos != 0 ist.
     * 
     * @param pos Die Position, an der eingefügt werden soll.
     * @param newElement Das anzuhängende Element.
     */
    public void add(int pos, SinglyLinkedListElement newElement) {
        if (this.isEmpty() || pos == 0) {
            // Fehler: Wenn this leer ist, sind wir ein Element zu weit.
            // Hier können wir nichts mehr anhängen.
            // Auch bei pos == 0 können wir nichts machen. Dann müsste theoretisch this
            // ersetzt werden, dies hätte aber schon beim Vorgänger passieren müssen,
            // oder in SinglyLinkedList.add.
            return;
        }
        if (pos == 1) {
            // Wenn pos == 1 ist, dann muss nach this eingefügt werden.
            // Da die Liste nicht notwendigerweise leer ist, wird thsi.next an newElement
            // angehängt.
            newElement.next = this.next;
            this.next = newElement;
            return;
        }
        // Wenn next noch nicht leer ist, dann sind wir noch nicht am Ende angekommen
        // und gehen rekursiv weiter. Dabei reduzieren wir pos um 1, weil next eine
        // kürzere Liste ist.
        next.add(pos-1, newElement);
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
