object RomantoInteger {
  def main(args: Array[String]): Unit = {
    println(romanToInt("MMMCMXLIX"))
    println(romanToInt(""))
  }

  /**
    * 题目大意：把罗马数字转换为阿拉伯数字
    * 解法： 这里有个坑，就是 比如 CD 这样的 400 数字，需要判断后面的数字是否大于前面的， D > C 所以得知  真正的数字在 C 300 和 D 500 之前
    * @param s
    * @return
    */
  def romanToInt(s: String): Int = {
    if (s == null || s == "" || s.length == 0)
      0
    var str = scala.collection.mutable.Map('M' -> 1000, 'C' -> 100, 'D' -> 500, 'X' -> 10, 'L' -> 50, 'I' -> 1, 'V' -> 5)
    var last: Int = 0
    var now: Int = 0
    var num: Int = 0
    for (i <- 0 until s.length) {
      now = str(s.charAt(i))
//      println(now)
      if (now > last) {
        num -= last * 2
      }
      num += now
      last = now
    }
    num
  }
}
