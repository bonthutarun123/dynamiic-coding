object CelsiusToFahrenheitConverter {
  def main(args: Array[String]): Unit = {
    println("Enter a value in Celsuis: ")
  val celsius = scala.io.StdIn.readInt()
  val fahrenheit = (celsius * 9 / 5) + 32 // Convert Celsius to Fahrenheit
  println(s"$celsius degrees Celsius is equal to $fahrenheit degrees Fahrenheit.")
}
}
