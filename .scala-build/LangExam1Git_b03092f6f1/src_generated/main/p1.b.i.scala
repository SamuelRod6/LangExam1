

final class p1$u002Eb$u002Ei$_ {
def args = p1$u002Eb$u002Ei_sc.args$
def scriptPath = """p1.b.i.sc"""
/*<script>*/
def modPow(a: Int, b: Int, c: Int): Int = {
  c >= 2
  if (b == 0) 1
  else {
    val aModC = a % c
    (aModC * modPow(aModC, b - 1, c)) % c
  }
}

print(modPow(2, 3, 3)) // 2
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

