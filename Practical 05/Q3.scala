object Q3 
{
    def fibonacciSeries(n: Int): Int = 
    {
        if (n <= 1) n 
        else fibonacciSeries(n - 1) + fibonacciSeries(n - 2) 
    }

    def printFibonacciSeries(n: Int): Unit = 
    {
        def printSequence(count: Int, num: Int = 0): Unit = 
        {
            if (count > 0) 
            {
                print(fibonacciSeries(num) + " ")
                printSequence(count - 1, num + 1)
            }
        }
        printSequence(n)
        println()
    }

    def main(args: Array[String]): Unit = 
    {
        val n = 10 

        println(s"Printing $n Fibonacci numbers:")
        printFibonacciSeries(n)
    }
}