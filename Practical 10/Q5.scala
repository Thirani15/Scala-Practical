object Q5 {

  def main(args: Array[String]): Unit = 
  {
    val words = List("apple", "banana", "cherry", "date")
    val totalCount = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalCount")
  }

  def countLetterOccurrences(words: List[String]): Int = 
  {
    // Use map to transform each word into its length
    val lengths = words.map(_.length)

    // Use reduce to sum up all the lengths
    val totalLength = lengths.reduce(_ + _)

    totalLength
  }
}
