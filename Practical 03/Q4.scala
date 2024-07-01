object Q4 
{
  def sumOfEvens(numbers: List[Int]): Int = 
  {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = 
  {
    val inputList = List(10, 13, 8, 2, 25, 54)
    val sumEven = sumOfEvens(inputList)
    println(s"The sum of even numbers in the list is $sumEven")
  }
}
