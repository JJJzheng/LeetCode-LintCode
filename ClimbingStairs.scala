object ClimbingStairs {

  def main(args: Array[String]): Unit = {
    println(climbStairs3(15))
  }

  /**
    * 解法2：递归效率太低，  利用斐波那契数思想：f(n) = f(n-1) + f(n-2)
    * @param n
    * @return
    */
  def climbStairs2(n: Int): Int = {
    if (n == 1)
      return 1
    if (n == 2)
      return 2
    //开数组容易爆
    var arr : Array[Int] = new Array(n + 1)
    arr(1) = 1
    arr(2) = 2
    for (i <- 3 to n) {
      arr(i) = arr(i - 1) + arr(i - 2)
    }
    arr(n)

  }


  def climbStairs3(n: Int): Int = {
    var arr : Array[Int] = Array(1,2)
    if (n <= 2)
      arr(n - 1)

    var fn1 = arr(0)
    var fn2 = arr(1)
    var ans = 0
    for (i <- 3 to n) {
      ans = fn1 + fn2
      fn1 = fn2
      fn2 = ans
    }
    ans
  }

  /**
    * 题目大意：爬楼梯，一次可以爬 1或 2个
    * 解法1：递归，本地测试正常，提交后发现超时
    * @param n
    * @return
    */
  var times :  Int = 0
  def climbStairs(n: Int): Int = {
    findPath(n)
    times
  }

  def findPath(n : Int) : Unit = {
    if (n == 0) {
      times += 1
      return
    }

    if (n >= 2) {
      climbStairs(n - 1)
      climbStairs(n - 2)
    } else {
      climbStairs(n - 1)
    }
  }
}
