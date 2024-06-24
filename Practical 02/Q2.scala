object Q2
{
    def main(args : Array[String]) : Unit =
    {
        var a = 2
        var b = 3
        var c = 4
        var d = 5
        var k = 4.3f

        println(s"--b * a + c * d-- = ${(b + 1)* a + c * (d - 1)}")

        println(s"a++ = ${a + 1}")

        var g = 5.6f
        println(s"-2 * (g - k) + c = ${(-2) * (g - k) + c}")

        println(s"c = c++ = ${c + 1}")
        
        println(s"c = ++c * ++a = ${(c + 1) * (a + 1)}")
    }
}