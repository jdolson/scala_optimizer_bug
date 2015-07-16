package bug

final case class Bust (x: Long) extends AnyVal {
  @inline def bar: Long = 10000L / (if (x < 0) -2 else 2)
}
