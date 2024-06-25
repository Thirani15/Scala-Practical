object Q4
{
  def attendees(price: Int): Int = 
  {
     120 + 4*(15 - price)
  }

  def revenue(price: Int): Int = 
  {
    attendees(price) * price
  }


  def cost(price: Int): Int = 
  {
    val currentProfit = profit(ticketPrice)
    val profitIfIncreased = profit(ticketPrice + 5)
    val profitIfDecreased = profit(ticketPrice - 5)

    (currentProfit, profitIfIncreased, profitIfDecreased) match 
    {
      case (c, i, d) if c > i && c > d => ticketPrice
      case (c, i, d) if i > c && i > d => maxPrice(ticketPrice + 5)
      case (c, i, d) if d > c && d > i => maxPrice(ticketPrice - 5)
    }
  }

  def main(args: Array[String]): Unit = 
  {
    println(s"Best ticket price is ${maxPrice(15)}")
  }
}