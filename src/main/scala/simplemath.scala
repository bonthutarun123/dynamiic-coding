import scala.io.StdIn

object simplemath {
  def main(args: Array[String]): Unit = {
    println("Enter the first number:")
    val num1 =  StdIn.readInt()

    println("Enter the second number:")
    val num2 =  StdIn.readInt()

    println("Enter the math operation (+, -, *, /):")
    val operation = StdIn.readLine()

  val result = operation match {
      case "+" => num1 + num2
      case "-" => num1 -num2
      case "*" => num1 * num2
      case "/" => num1 / num2
      case "_ "=> "Invalid operation"
    }

    println(s"The result is: $result")
  }
}
