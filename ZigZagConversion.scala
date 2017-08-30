object ZigZagConversion {
  def main(args: Array[String]): Unit = {
    println(convert("",1))
  }
  def convert(s: String, numRows: Int): String = {
    if (numRows <= 1 || s.length < 3 || s.length < numRows)
      s
    var s2: String = ""
    var zigSpan: Int = numRows * 2 - 2
    for (i <- 0 until numRows) {
      var j = i
      while (j < s.length) {
        s2 += s.charAt(j).toString
        println(s2)
        if (i != 0 && i != numRows - 1 && (zigSpan + j - 2 * i) < s.length)
          s2 += s.charAt(zigSpan + j - 2 * i).toString
        j += zigSpan
      }
    }
    
    s2
  }
}
