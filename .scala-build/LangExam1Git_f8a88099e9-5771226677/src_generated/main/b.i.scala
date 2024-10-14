

final class b$u002Ei$_ {
def args = b$u002Ei_sc.args$
def scriptPath = """b.i.sc"""
/*<script>*/
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
/*</script>*/ /*<generated>*//*</generated>*/
}

object b$u002Ei_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new b$u002Ei$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export b$u002Ei_sc.script as `b.i`

