package de.reinerh.courses.java.lists.dynarrays;

public class DynamicArray {
    private int[] elements;
    private int size;
    private int maxSize;

    /**
     * Konstruktor. Erzeugt ein leeres DynamicArray.
     */
    public DynamicArray() {
        this.size = 0;
        this.maxSize = 1;
        this.elements = new int[maxSize];
    }

    /**
     * @return Das Element an Stelle pos.
     */
    public int get(int pos) {
        return elements[pos];
    }

    /**
     * add hängt ein neues Element ans Ende der Liste an.
     * @param key Der anzuhängende Wert.
     */
    public void add(int key) {
        if (size == maxSize) {
            reallocate(2*maxSize);
        }
        elements[size++] = key;
    }

    /**
     * add fügt ein neues Element in die Liste ein.
     * @param pos Die Stelle, an der eingefügt werden soll.
     * @param key Der Wert, der eingefügt werden soll.
     */
    public void add(int pos, int key) {
        int currentPos = size;
        add(key);
        while (currentPos > pos) {
            swap(currentPos, --currentPos);
        }

    }

    /**
     * swap vertauscht die Elemente an den Stellen i und j.
     */
    public void swap(int i, int j) {
        int temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }

    /**
     * toString liefert eine menschenlesbare String-Repräsentation der Liste.
     */
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int pos = 0; pos < size; pos++) {
            builder.append(elements[pos]);
            if (pos < size-1) {
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * reallocate reserviert ein neues internes Array und kopiert die bestehenden Elemente.
     * 
     * @param newMaxSize Die Anzahl der zu reservierenden Elemente.
     * Ist newMaxSize kleiner als die Länge der Liste, 
     * bleiben nur die ersten newMaxSize Elemente erhalten.
     */
    private void reallocate(int newMaxSize) {
        int[] newElements = new int[newMaxSize];
        int newSize = Math.min(this.size, newMaxSize);

        for (int i = 0; i < newSize; i++) {
            newElements[i] = this.elements[i];
        }
        this.elements = newElements;
        this.maxSize = newMaxSize;
        this.size = newSize;
    }
}
