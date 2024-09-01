class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")
  
    private val gcdValue = gcd(n.abs, d.abs)
    val numerator: Int = if (d < 0) -n / gcdValue else n / gcdValue
    val denominator: Int = d.abs / gcdValue

    def neg: Rational = new Rational(-numerator, denominator)

    //To calculate GCD
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    override def toString: String = s"$numerator/$denominator"
}

object Q1 {

    def main(args: Array[String]): Unit =
    {
        val x = new Rational(3, 4)
        val negX = x.neg
        println(negX) // Output: -3/4
    }
}


