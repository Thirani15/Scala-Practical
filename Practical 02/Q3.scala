object Q3
{
    //To find normal hour salary
    def normalPay(Normalhrs :Int) :Int = 250 * Normalhrs

    //To find OT hour salary
    def otPay(OThrs : Int) : Int = 85 * OThrs

    //To find total salary
    def totalPay(Normalhrs : Int, OThrs : Int) : Int = 
    {
        normalPay(Normalhrs) + otPay(OThrs)
    }

    //To calculate tax
    def tax(Normalhrs : Int, OThrs : Int) : Double =
    {
        if(totalPay(Normalhrs, OThrs) == totalPay(40, 30)) totalPay(Normalhrs, OThrs) * 0.12 
        else 0
    }

    //To calculate take home salary
    def takehomesal(Normalhrs : Int, OThrs : Int) : Double =
    {
        totalPay(Normalhrs, OThrs) - tax(Normalhrs, OThrs)
    }

    def main(args : Array[String]) : Unit =
    {
        val Normalhrs = 40
        val OThrs = 30

        println(s"Take home salary of the employee = ${takehomesal(Normalhrs, OThrs)}")
    }
}