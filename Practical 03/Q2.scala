object Q2 
{
  def filterStrings(strings: List[String]): List[String] = 
  {
    strings.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = 
  {
    val inputList = List("We","Humans","Scala","programming","fun","awesome")
    val filteredList = filterStrings(inputList)
    println(filteredList) 
  }
}