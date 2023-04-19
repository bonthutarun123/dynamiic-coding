object alternateEvennumbers {
  def main(args: Array[String]): Unit = {
    print("Enter the start number: ")
    val start = scala.io.StdIn.readInt()
    print("Enter the end number: ")
    val end = scala.io.StdIn.readInt()
    for (i <- start to end by 2) {
      if (i % 2 == 0) {
        println(i)
      }
    }
  }

}
