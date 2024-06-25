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
    500+attendees(price) * 3
  }

  def profit(price: Int): Int = 
  {
    revenue(price) - cost(price)
  }
    
    
  def main(args: Array[String]): Unit = 
    {
        print(profit(5), profit(10), profit(15), profit(20))
        print(profit(25), profit(30), profit(35), profit(40))
    }

}