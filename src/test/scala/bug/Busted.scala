package bug

object Busted {
  def main(args: Array[String]) {
    val p = Bust(-1L)
    val y = p.bar
    println(y) // should print -5000 but prints 39
  }
}
