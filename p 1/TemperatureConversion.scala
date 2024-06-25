object TemperatureConversion
{
    def celciusToFarenheit(celcius : Double) : Double = celcius * 1.8000 + 32.00

    def main(args : Array[String]) : Unit =
    {
        val celcius = 35
        println(s"$celcius C is equal to ${celciusToFarenheit(celcius)} F.")
    }
    
}