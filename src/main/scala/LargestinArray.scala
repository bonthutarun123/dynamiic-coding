object LargestinArray {

    def main(args: Array[String]): Unit = {
      val arr = Array(10, 40, 50, 70, 90, 20, 44, 42, 37, 80)
      var largest = arr(0)
      for (i <- 1 until arr.length) {
        if (arr(i) > largest) {
          largest = arr(i)
        }
      }
      println(s"The largest number in the array is $largest")
    }
  }
