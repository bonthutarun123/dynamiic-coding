import scala.io.StdIn

object countevennumbers {
  def main(args: Array[String]): Unit = {
    print("Enter the start number: ")
    val start = StdIn.readInt()
    print("Enter the end number: ")
    val end = StdIn.readInt()
    var count = 0
    for (i <- start to end) {
      if (i % 2 == 0) {
        count += 1
      }
    }
    println(s"There are $count even numbers between $start and $end.")
  }
}
