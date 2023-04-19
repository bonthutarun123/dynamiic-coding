object biggestnumber {
  def main(args: Array[String]): Unit = {
    println("Enter three numbers: ")
    val a = scala.io.StdIn.readInt()
    val b = scala.io.StdIn.readInt()
    val c = scala.io.StdIn.readInt()

    val biggest = if (a >= b && a >= c) {
      a
    } else if (b >= a && b >= c) {
      b
    } else {
      c
    }

    println(s"The biggest number is $biggest.")
  }
}
