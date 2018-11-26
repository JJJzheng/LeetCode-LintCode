object JudgeRouteCircle {
  def src.java.main(args: Array[String]): Unit = {
    println(judgeCircle("UD"))
    println(judgeCircle("LL"))
    println(judgeCircle(""))
  }

  /**
    * 题目大意：傻逼题目
    * 解法：不想说 已AC
    * @param moves
    * @return
    */
  def judgeCircle(moves: String): Boolean = {
    if (moves == null || moves.length == 0)
      true
    var left: Int = 0
    var right: Int = 0
    var ch: Array[Char] = moves.toCharArray
    for (i <- ch.indices) {
      if (ch(i) == 'R')
        left += 1
      if (ch(i) == 'L')
        left -= 1
      if (ch(i) == 'U')
        right += 1
      if (ch(i) == 'D')
        right -= 1
    }
//    println("L: " + left + " R: " + right)
    if (left == 0 && right == 0)
      true
    else
      false
  }
}
