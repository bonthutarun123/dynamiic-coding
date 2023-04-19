import scala.io.StdIn

object rangechecknumbers {

  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    val num = StdIn.readInt()
    if (num < 0 || num > 100) {
      println("Invalid Input")
    }
    else {
      if (90 to 100 contains num) {
        println("Super Smart")
      }
      else if (80 to 90 contains num) {
        println("Smart")
      }
      else if (70 to 80 contains num) {
        println("Smart Enough")
      }
      else if (60 to 70 contains num) {
        println("Just Smart")
      }
      else if (35 to 60 contains num) {
        println("no Smart")
      }
      else if (0 to 35 contains num) {
        println("dump")
      }
    }
  }
}