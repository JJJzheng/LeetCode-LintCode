object LongestPalindromicSubstring {
  def main(args: Array[String]): Unit = {
    println(longestPalindrome("babad"))
  }

  var lo: Int = 0
  var maxLength: Int = 0

  /**
    * 题目大意：求一个字符串的最大回文子串
    * 解法：遍历
    * @param s
    * @return
    */
  def longestPalindrome(s: String): String = {
    if (s == null)
      null
    if (s.length < 2)
      s
    for (i <- 0 until s.length) {
      findPalidrome(s, i, i)
      findPalidrome(s, i ,i + 1)
    }
    println("lo: " + lo + " maxLength: " + maxLength)
    println(s.charAt(maxLength))
    s.substring(lo,lo +  maxLength)
  }

  def findPalidrome(s: String, left: Int, right: Int): Unit = {
    var l = left
    var r = right
    while (l >= 0 && r < s.length && s.charAt(l) == s.charAt(r)) {
      l -= 1
      r += 1
    }

    if (maxLength < r - l - 1) {
      lo = l + 1
      maxLength = r - l - 1
    }
  }

}
