object Q3
{
  def mean(num1: Int, num2: Int): Float = 
  {
    val meanValue = (num1 + num2) / 2.0
    BigDecimal(meanValue).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat
  }

  def main(args: Array[String]): Unit = 
  {
    val num1 = 15
    val num2 = 33
    val result = mean(num1, num2)
    println(s"The mean of $num1 and $num2 is $result")
  }
}

