object DiskArea
{
    def area(radius : Double) : Double =
    {
        math.Pi * radius * radius
    }

    def main(args : Array[String]) : Unit =
    {
        val radius = 5
        println(s"Area of a Disk with radius $radius is ${area(radius)}")
    }
}