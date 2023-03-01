# Vertauschen von Elementen

Bei [`DynamicArray`](../examples/src/main/java/de/reinerh/courses/java/lists/dynarrays/DynamicArray.java)
ist bereits eine Methode `swap` implementiert, die zwei Elemente vertauscht.

Überlegen Sie sich, wie eine solche `swap`-Methode für verkettete Listen aussehen müsste.

* Zeichnen Sie sich zunächst auf Papier (o.Ä.) Listen mit Pfeilen auf,
  die die Nachbarschaftsbeziehungen von Elementen darstellen.
  Benennen Sie dabei die Elemente und zeichnen Sie dann die Pfeile ein,
  wie sie nach dem Vertauschen aussehen müssen.
* Schreiben Sie sich den Vertauschungs-Algorithmus dann zunächst als
  Pseudocode auf: Welche Elemente müssen Sie zunächst isolieren,
  um die Vertauschung durchführen zu können?
* Implementieren Sie die Vertauschung.
* Entwerfen und implementieren Sie Tests, um Ihre Lösung zu prüfen.
  * Ganz im Sinne von TDD können Sie die Tests auch zuerst schreiben.
* Gibt es Sonderfälle, die separat behandelt werden müssen?
  Schreiben Sie ggf. auch dafür Tests.
  