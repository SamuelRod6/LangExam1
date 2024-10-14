def isMagicMatrix(matrix: Array[Array[Int]]): Boolean = {
  val n = matrix.length
  // Sumamos los elementos de cada fila, columna y diagonales
  val sumRow = matrix.map(_.sum).distinct
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
