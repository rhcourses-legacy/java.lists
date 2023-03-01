# Fehlerbehandlung

Die Beispiel-Implementierungen zu den Listen-Datentypen sind noch nicht sicher.
D.h. sie prüfen bspw. nicht in jedem Fall, ob die Positionsangaben beim Einfügen
von Elementen sinnvoll sind.

## Aufgaben

* Analysieren Sie die Klassen
[`SinglyLinkedList`](../examples/src/main/java/de/reinerh/courses/java/lists/linkedlists/SinglyLinkedList.java),
[`DoublyLinkedList`](../examples/src/main/java/de/reinerh/courses/java/lists/linkedlists/DoublyLinkedList.java) und
[`DynamicArray`](../examples/src/main/java/de/reinerh/courses/java/lists/dynarrays/DynamicArray.java)
daraufhin, ob es potenzielle Abstürze gibt.
* Formulieren Sie Tests, die diese Abstürze sichtbar machen.
* Formulieren Sie auch Tests, die das erwartete Verhalten präzisieren
  (z.B. bei
  [`DoublyLinkedList.add()`](../examples/src/main/java/de/reinerh/courses/java/lists/linkedlists/DoublyLinkedList.java))
* Reparieren Sie die Tests.
