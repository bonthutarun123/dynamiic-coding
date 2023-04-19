object evenodd {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val input = scala.io.StdIn.readInt()
    if (input % 2 == 0)
      println(s"$input is even")
    } else {
      println(s"$input is odd")
    }
  }
}
