object SphereVolume
{
    def volOfSphere(r : Double) : Double = (4.0 / 3.0) * math.Pi * r * r * r

    def main(args : Array[String]) : Unit =
    {
        val r = 5
        println(s"Volume of a sphere with radius $r is ${volOfSphere(r)}")
    }
}