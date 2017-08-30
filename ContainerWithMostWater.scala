object ContainerWithMostWater {
  def main(args: Array[String]): Unit = {
    println(maxArea(Array(1, 1)))
  }

  /**
    * 总结：读题真的给我 造成了很大的困扰
    * @param height
    * @return
    */
  def maxArea(height: Array[Int]): Int = {
    if (height.length < 2 || height == null)
      0
    var max: Int = 0

//    left 和 right 代表 横坐标 从两端开始
    var left: Int = 0
    var right: Int = height.length - 1

    while (left < right) {
      max = Math.max(max, (right - left) * Math.min(height(left), height(right)))

//      保留高的点，低的点向高点靠拢
      if (height(left) < height(right))
        left += 1
      else
        right -= 1

    }
    max
  }
}
