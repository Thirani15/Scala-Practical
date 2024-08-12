object WholesaleCost
{
    def totalWholesaleCost(copies : Int) : Double =
    {
        val coverPrice = 24.95
        val discount = 0.40
        val discountedPrice = coverPrice * (1 - discount)
        val shippingCost = if (copies <= 50) 3.0 else 3.0 + (copies - 50) * 0.75
        (discountedPrice * copies) + shippingCost
    }

    def main(args : Array[String]) : Unit =
    {
        val copies = 60
        println(s"Total wholesale cost for $copies copies is ${totalWholesaleCost(copies)}")
    }
}