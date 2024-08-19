object Q1 
{
  def calculateInterest(amount: Double): Double = 
  {
    if (amount <= 20000) 
    {
      amount * 0.02
    } 
    else if (amount <= 200000) 
    {
      amount * 0.04
    } 
    else if (amount <= 2000000) 
    {
      amount * 0.035
    } 
    else 
    {
      amount * 0.065
    }
  }

  def main(args: Array[String]): Unit = 
  {
    val amount = 5000000.0
    val interest = calculateInterest(amount)
    println(s"Interest on Rs. $amount is Rs. $interest")
  }
}
