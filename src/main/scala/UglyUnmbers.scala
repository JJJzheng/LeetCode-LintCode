object UglyUnmbers {
  def src.java.main(args: Array[String]): Unit = {
    println(uglyNumber_Solution(7))
  }
  def isUgly(num: Int): Boolean = {
    false
  }

  def uglyNumber_Solution(index : Int) : Int = {
    if (index < 7)
      return index
    var res = new Array[Int](index) //7
    res(0) = 1
    var t2 = 0
    var t3 = 0
    var t5 = 0
    for (i <- 0 to 7) {
      println(i)
      res(i) = Math.min(res(t2) * 2, Math.min(res(t3) * 3, res(t5) * 5))
      if (res(i) == res(t2) * 2)
        t2 += 1
      if (res(i) == res(t3) * 3)
        t3 += 1
      if (res(i) == res(t5) * 5)
        t5 += 1
    }
//    for (i <- res.indices)
//      println(res(i) + " i =" + i)
    res(index - 1)
  }
}
