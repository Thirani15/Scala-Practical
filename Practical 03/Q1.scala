object Q1 
{
  def stringReverse(s: String): String = 
  {
    if (s.isEmpty) ""
    else stringReverse(s.tail) + s.head
  }

  def main(args: Array[String]): Unit = 
  {
    val inputString = "program"
    val reversedString = stringReverse(inputString)
    println(s"Original string: $inputString")
    println(s"Reversed string: $reversedString")
  }
}
