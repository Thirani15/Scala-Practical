import scala.io.StdIn.readLine

object Q2 
{
  def numberMatching(number: Int): String = 
   {
      val numberType: Int => String = 
      {
        case number if number <= 0 => "Input is a Negative/Zero."
        case number if number % 2 == 0 => "Input is an Even number."
        case _ => "Input is an Odd number."
      }

      numberType(number)
   }
  

  def main(args: Array[String]): Unit =
  {
    println("Enter an integer: ");
    val num = readLine()

    try
    {
        val n = num.toInt
        println(numberMatching(n))
    }
    catch
    {
        case _: NumberFormatException =>
        println(s"'$num' is not a valid integer.")
    }
  }
}
