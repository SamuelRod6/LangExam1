def modPow(a: Int, b: Int, c: Int): Int = {
  // Verificamos que los valores sean enteros no negativos
  require(a >= 0 && b >= 0, "a, b and c must be non-negative")
  // Verificamos que el módulo sea mayor a 1
  require(c >= 2, "Modulus must be more than 1")
  if (b == 0) 1
  else {
    val aModC = a % c
    (aModC * modPow(aModC, b - 1, c)) % c
  }
}
