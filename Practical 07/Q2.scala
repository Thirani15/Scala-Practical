import scala.io.StdIn.readLine

object Q2 {
    
    def calculateSqaure(numbers: List[Int]): List[Int] = 
    {
        numbers.map((x: Int) => x * x)
    }

    def main(args: Array[String]): Unit = 
    {
        var numbers: List[Int] = List()
        var continue = true

        while(continue)
        {
            println("Enter an integer (or type 'done' to finish): ")
            val input = readLine()
            if (input.toLowerCase == "done")
            {
                continue = false
            }
            else
            {
                try 
                {
                    val number = input.toInt
                    numbers = numbers :+ number
                }
                catch
                {
                    case e: NumberFormatException => println("Please enter a valid integer.")
                }
            }
            numbers
        }

        val squareNumbers = calculateSqaure(numbers)
        println("Squared Numbers: " + squareNumbers.mkString(", "))

    }
}