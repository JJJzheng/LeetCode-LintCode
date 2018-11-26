object IntegertoRoman {
  def src.java.main(args: Array[String]): Unit = {
    println(intToRoman(900))
  }

  /**
    * 题目大意：根据数字得出罗马数字
    * 解法：很无聊的一题，对应数字即可
    * @param num
    * @return
    */
  def intToRoman(num: Int): String = {
    var M: Array[String] = Array("", "M", "MM", "MMM")
    var C: Array[String] = Array("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
    var X: Array[String] = Array("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
    var I: Array[String] = Array("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")

    M(num / 1000) + C((num / 100) % 10) + X((num / 10) % 10) + I(num % 10)

  }
}
