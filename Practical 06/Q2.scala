import scala.io.StdIn.readLine

object Q2 
{

  def getStudentInfo(): (String, Int, Int, Double, Char) = 
  {
    val name = readLine("Enter Student's name: ")
    val marks = readLine("Enter Student's marks: ").toInt
    val totalMarks = readLine("Enter total possible marks: ").toInt

    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }

    (name, marks, totalMarks, percentage, grade)
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = 
  {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks: $marks / $totalMarks")
    println(s"Percentage: ${"%.2f".format(percentage)}%")
    println(s"Grade: $grade")
  }

  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = 
  {
    if (name.isEmpty) 
    {
      (false, Some("Name cannot be empty"))
    } 
    else if (marks < 0 || totalMarks <= 0) 
    {
      (false, Some("Marks and total marks must be positive integers"))
    } 
    else if (marks > totalMarks) 
    {
      (false, Some("Marks cannot exceed total possible marks"))
    } 
    else 
    {
      (true, None)
    }
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = 
  {
    var isValid = false
    var studentInfo: (String, Int, Int, Double, Char) = null

    while (!isValid) 
    {
      try 
      {
        studentInfo = getStudentInfo()
        val (name, marks, totalMarks, _, _) = studentInfo
        val (valid, errorMsg) = validateInput(name, marks, totalMarks)
        if (valid) 
        {
          isValid = true
        } 
        else 
        {
          println(s"Invalid input: ${errorMsg.get}")
        }
      } 
      catch 
      {
        case e: NumberFormatException => println("Invalid input: Marks and total marks must be integers")
        case _: Exception => println("Unexpected error occurred")
      }
    }

    studentInfo
  }

  def main(args: Array[String]): Unit = 
  {
    val studentInfo = getStudentInfoWithRetry()
    printStudentRecord(studentInfo)
  }
}
