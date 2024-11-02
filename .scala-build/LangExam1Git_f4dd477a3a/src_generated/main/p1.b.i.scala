

final class p1$u002Eb$u002Ei$_ {
def args = p1$u002Eb$u002Ei_sc.args$
def scriptPath = """p1.b.i.sc"""
/*<script>*/
def modPow(a: Int, b: Int, c: Int): Int = {
  // Verificamos que los valores sean enteros no negativos
  require(a >= 0 && b >= 0, "a, b and c must be non-negative")
  // Verificamos que el módulo sea mayor a 1
  require(c >= 2, "Modulus must be more than 1")
  if (b == 0) 1
  else
    (a % c * modPow(a, b - 1, c)) % c
}

/*</script>*/ /*<generated>*//*</generated>*/
}

object p1$u002Eb$u002Ei_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new p1$u002Eb$u002Ei$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export p1$u002Eb$u002Ei_sc.script as `p1.b.i`

