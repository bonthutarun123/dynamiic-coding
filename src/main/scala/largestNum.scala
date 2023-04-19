object largestNum {
  def main(args: Array[String]): Unit = {
    var largest = Int.MinValue
    for (i <- 1 to 10) {
      print(s"Enter number $i: ")
      val number = scala.io.StdIn.readInt()
      if (number > largest) {
        largest = number
      }
    }
    println(s"The largest number is $largest")
  }
}
