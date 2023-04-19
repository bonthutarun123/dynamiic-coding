object palindromenumChecking {

  def main(args: Array[String]): Unit = {
    val numbers = Array(121, 245, 3663, 78987, 1234)

    for (num <- numbers) {
      if (num.toString == num.toString.reverse) {
        println(s"$num is a palindrome.")
      } else {
        println(s"$num is not a palindrome.")
      }
    }
  }
}

