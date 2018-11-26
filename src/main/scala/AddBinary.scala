object AddBinary {
  def src.java.main(args: Array[String]): Unit = {
    addBinary("11", "11")

  }

  /**
    * 题目大意：二进制数相加
    * 解法：被自己蠢哭，居然转化成10进制再相加再转化成二进制。。。应该直接用二进制相加  1 1 得 0 进一  1 0 得 0 
    * @param a
    * @param b
    * @return
    */
  def addBinary(a: String, b: String): String = {
    /*if (a == null && b == null)
      return  ""
    if (a == null && b != null)
      return b
    if (a != null && b == null)
      return a

    var length = 0
    if (a.length >= b.length)
      length = a.length - b.length
    if (a.length < b.length)
      length = b.length - a.length



    val charA : Array[Char] = a.toCharArray
    val charB : Array[Char] = b.toCharArray
    var ans : String = new String("")
    var next = 0
    for (i <- 0 until length reverse) {
      if (charA(i).toInt + charB(i).toInt + next == 0) {
        next = 0
        ans += "0"
      } else if (charA(i).toInt + charB(i).toInt + next == 1) {
        next = 0
        ans += "1"
      } else if (charA(i).toInt + charB(i).toInt + next == 2) {
        next = 1
        ans += "0"
      } else if (charA(i).toInt + charB(i).toInt + next == 3) {
        next = 1
        ans += "1"
      }
    }*/

    "666"
  }
}
