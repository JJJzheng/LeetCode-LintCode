object PlusOne {
  def main(args: Array[String]): Unit = {
    val arr = plusOne(Array(9))
    for (i <- arr.indices)
      print(arr(i) +"  ")
  }

  /**
    * 还未重构
    * 题目大意：数组的所有数字是数字每个位拆分的，要求加一，判断进位
    * @param digits
    * @return
    */
  def plusOne(digits: Array[Int]): Array[Int] = {
    if (digits == null || digits.length <= 0)
      return null
    if (digits.length == 1 && digits(0) == 9)
      return Array(1,0)
    var num = 0
    var i = digits.length - 1
    digits(digits.length - 1) += 1
    var flag : Boolean = true
    while (flag) {
      digits(i) += num
      num = 0
      if (digits(i) > 9) {
        num = 1
        digits(i) -= 10
      }
      if (i <= 1)
        flag = false
      i -= 1
    }
    if (num == 0) {
      digits
    } else if (digits(0) + num <= 9) {
      digits(0) += num
      digits
    } else {
      var newArr : Array[Int] = new Array[Int](digits.length + 1)
      newArr(0) =( digits(0) + num ) / 10
      digits(0) += num - 10
      for (i <- digits.indices)
        newArr(i + 1) = digits(i)
      newArr
    }

  }
}
