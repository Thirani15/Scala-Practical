class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  // Normalize the sign to ensure the denominator is always positive
  private val gcdValue = gcd(n.abs, d.abs)
  val numerator: Int = if (d < 0) -n / gcdValue else n / gcdValue
  val denominator: Int = d.abs / gcdValue

  def sub(that: Rational): Rational = {
    val newNumerator = this.numerator * that.denominator - this.denominator * that.numerator
    val newDenominator = this.denominator * that.denominator
    new Rational(newNumerator, newDenominator)
  }

  //To calculate the greatest common divisor (GCD)
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  override def toString: String = s"$numerator/$denominator"
}

object Q2 {

  def main(args: Array[String]): Unit = 
  {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    val result = x.sub(y).sub(z)

    println(result) // Output: the result of (3/4 - 5/8 - 2/7)
  }
}


