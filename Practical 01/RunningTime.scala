object RunningTime 
{
  def totalRunningTime(): Int = 
  {
    val easyPaceKm = 2
    val tempoPaceKm = 3
    val easyPaceMinPerKm = 8
    val tempoPaceMinPerKm = 7

    val easyPaceTime = easyPaceKm * easyPaceMinPerKm
    val tempoPaceTime = tempoPaceKm * tempoPaceMinPerKm
    val totalTime = easyPaceTime * 2 + tempoPaceTime

    totalTime
  }

  def main(args: Array[String]): Unit = 
  {
    println(s"Total running time is ${totalRunningTime()} minutes.")
  }
}