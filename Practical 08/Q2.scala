import scala.io.StdIn.readLine

object Q2
{
    def decideMultiples(num: Int): String = 
    {
        val categorizeNumber: Int => String = 
        {
            case num if num % 3 == 0 && num % 5 == 0 => "Multiple of Both Three and Five"
            case num if num % 3 == 0 => "Multiple of Three"
            case num if num % 5 == 0 => "Multiple of Five"
            case _ => "Not a Multiple of Three or Five"
        }

        categorizeNumber(num)
    }


    def main(args: Array[String]): Unit = 
    {
        println("Enter an integer : ")
        val input = readLine()

        try
        {
            val num = input.toInt
            println(decideMultiples(num))
        }
        catch
        {
            case _: NumberFormatException =>
            println(s"'$input' is not a valid integer.")
        }
    }
}