object StringtoInteger {
  def main(args: Array[String]): Unit = {
    println(myAtoi(" -1"))
  }
  def myAtoi(str: String): Int = {

    if (str == "")
      return 0


    var ans: Array[Char] = str.toCharArray
    var num: Int = 0
    var sign: Int = 1
    for (i <- ans.indices) {
      if (ans(i) == '-')
        sign = -1
      var n: Int = ans(i).toInt - 48
      if (n >= 0 && n <= 9) {
        num *= 10
        num += n
      }
    }
   num * sign
  }




}
