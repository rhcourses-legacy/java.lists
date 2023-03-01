# Komplexitätsanalyse

Untersuchen Sie die `add`- sowie `get`-Methoden der Listen-Klassen daraufhin, wie viel Aufwand sie verursachen.
Konkreter: Beantworten Sie jeweils für
[`SinglyLinkedList`](../examples/src/main/java/de/reinerh/courses/java/lists/linkedlists/SinglyLinkedList.java),
[`DoublyLinkedList`](../examples/src/main/java/de/reinerh/courses/java/lists/linkedlists/DoublyLinkedList.java) und
[`DynamicArray`](../examples/src/main/java/de/reinerh/courses/java/lists/dynarrays/DynamicArray.java)
die folgenden Fragen:

Wenn `n` die Länge der Liste ist, ...

* ... wie lange dauert das Hinzufügen eines Elements mittels `add` am Ende der Liste in Abhängigkeit von `n`?
* ... wie lange dauert das Hinzufügen eines Elements mittels `add` in der Mitte der Liste in Abhängigkeit von `n`?
* ... wie lange dauert der Zugriff auf ein Element an einer der Liste mittels `get` in Abhängigkeit von `n`?

Die Fragen "wie lange dauert ..." ist dabei etwas schwammig formuliert.
Es geht hier nicht darum, jeden einzelnen Schritt zu zählen und dann eine genaue Angabe zu machen.
Das Ziel ist vielmehr, den Zeitaufwand in ein Verhältnis zur Länge der Liste zu setzen.
Dabei kommt es nicht auf einzelne Anweisungen an, sondern z.B. auf die Anzahl der Schleifendurchläufe oder Vergleiche,
die durchgeführt werden müssen.
Ob eine Schleife zwei oder vier Anweisungen enthält, ist nicht von Bedeutung.
Ob sie aber eine lineare oder eine quadratische Anzahl an Wiederholungen im Verhältnis zur Länge der Liste hat,
kann einen sehr großen Unterschied machen.
