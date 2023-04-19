import scala.io.StdIn

object seekhobigdata {

  object PrintString {
    def main(args: Array[String]): Unit = {
      println("Enter the number of times to print:")

      val numTimes = StdIn.readInt()

      for (i <- 1 to numTimes) {
        println("seekho big data")
      }
    }
  }

}
