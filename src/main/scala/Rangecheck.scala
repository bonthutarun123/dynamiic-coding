import scala.io.StdIn

object Rangecheck {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val num = StdIn.readInt()

    if (num >= 0 && num <= 100) {
      println("The number is within the range of 0 to 100.")
    } else {
      println("The number is outside the range of 0 to 100.")
    }
  }
}
