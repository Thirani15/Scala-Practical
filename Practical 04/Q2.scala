object Q2
{
    def main(args : Array[String]) : Unit =
    {
        println("Please provide exactly one integer argument : ")
        val number = scala.io.StdIn.readLine()
        
        try
        {
            val input = number.toInt

            input match 
            {
                case n if n <= 0 => println("Negative/Zero is input")
                case n if n % 2 == 0 => println("Even number is given")
                case _ => println("Odd number is given")
            }
        }
        catch
            {
                case _: NumberFormatException => println("Invalid integer")
            }

        
    }
}