object Palindromenumberspresent {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 100
    var count = 0

    for (num <- start to end) {
      if (num.toString == num.toString.reverse) {
        count += 1
      }
    }

    println(s"Number of palindromes between $start and $end: $count")
  }
}
