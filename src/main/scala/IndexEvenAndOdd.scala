object IndexEvenAndOdd {

    def main(args: Array[String]): Unit = {
      print("Enter the size of the array: ")
      val size = scala.io.StdIn.readInt()

      var arr = new Array[Int](size)
      for (i <- 0 until size) {
        print(s"Enter element $i: ")
        arr(i) = scala.io.StdIn.readInt()
      }

      print("Elements at odd indexes: ")
      for (i <- 1 until size by 2) {
        print(s"${arr(i)} ")
      }

      println()

      print("Elements at even indexes: ")
      for (i <- 0 until size by 2) {
        print(s"${arr(i)} ")
      }
    }

}
