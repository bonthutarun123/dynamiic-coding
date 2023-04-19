object ArrayOddeven {
  def main(args: Array[String]): Unit = {
    val arr = Array(10, 40, 50, 70, 90, 20, 44, 42, 37, 80)
    var oddCount = 0
    var evenCount = 0

    for (elem <- arr) {
      if (elem % 2 == 0) {
        evenCount += 1
      } else {
        oddCount += 1
      }
    }

    println(s"The array has $evenCount even numbers and $oddCount odd numbers")
  }
}
