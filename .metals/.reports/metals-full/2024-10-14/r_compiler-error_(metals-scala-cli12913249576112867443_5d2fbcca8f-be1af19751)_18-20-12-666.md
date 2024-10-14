file:///C:/Users/Samuel%20Rodriguez/AppData/Local/Temp/metals-scala-cli12913249576112867443/.scala-build/metals-scala-cli12913249576112867443_5d2fbcca8f-be1af19751/src_generated/main/pregunta1.b.ii.sc.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition isMagicMatrix is defined in
  C:/Users/Samuel Rodriguez/AppData/Local/Temp/metals-scala-cli12913249576112867443/.scala-build/metals-scala-cli12913249576112867443_5d2fbcca8f-be1af19751/src_generated/main/pregunta1.b.ii.sc.scala
and also in
  C:/Users/Samuel Rodriguez/Desktop/LangExam1Git/pregunta1.b.ii.sc
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 383
uri: file:///C:/Users/Samuel%20Rodriguez/AppData/Local/Temp/metals-scala-cli12913249576112867443/.scala-build/metals-scala-cli12913249576112867443_5d2fbcca8f-be1af19751/src_generated/main/pregunta1.b.ii.sc.scala
text:
```scala


final class pregunta1$u002Eb$u002Eii$_ {
def args = pregunta1$u002Eb$u002Eii_sc.args$
def scriptPath = """<WORKSPACE>\pregunta1.b.ii.sc"""
/*<script>*/
def isMagicMatrix(matrix: Array[Array[Int]]): Boolean = {
  val n = matrix.length
  // Sumamos los elementos de cada fila, columna y diagonales
  val sumRow = matrix.map(_.sum).distinct@@
  val sumCol = matrix.transpose.map(_.sum).distinct
  val sumMainDiag = (0 until n).map(i => matrix(i)(i)).sum
  val sumSecDiag = (0 until n).map(i => matrix(i)(n-i-1)).sum
  // Verificamos que la suma de cada una sea la misma
  sumRow.size == 1 && sumCol.size == 1 && sumRow.head == sumCol.head && 
    sumRow.head == sumMainDiag && sumRow.head == sumSecDiag
};

// Ejemplo de uso de isMagicMatrix con la matriz del ejemplo del examen
val matrix = Array(Array(8, 1, 6), Array(3, 5, 7), Array(4, 9, 2))
val isMagic = isMagicMatrix(matrix)
  if isMagic then
    println("It's magic!")
  else 
    println("Sorry, you got no magic")
}
```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition isMagicMatrix is defined in
  C:/Users/Samuel Rodriguez/AppData/Local/Temp/metals-scala-cli12913249576112867443/.scala-build/metals-scala-cli12913249576112867443_5d2fbcca8f-be1af19751/src_generated/main/pregunta1.b.ii.sc.scala
and also in
  C:/Users/Samuel Rodriguez/Desktop/LangExam1Git/pregunta1.b.ii.sc
One of these files should be removed from the classpath.