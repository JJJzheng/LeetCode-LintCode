import scala.collection.mutable.ArrayBuffer

object LengthofLastWord {

  def main(args: Array[String]): Unit = {
    println(lengthOfLastWord("   "))
  }

  /**
    * 题目大意：要求句子的最后一个单词的长度
    * 解法：使用split 分片，然后转化成Char数组直接求长度
    * @param s
    * @return
    */
  def lengthOfLastWord(s: String): Int = {
    if (s == null || s.length <= 0)
      return 0
    var ans  : Array[String] = s.split(" ")
    if (ans.length <= 0)
      return 0
    ans(ans.length - 1).toCharArray.length()
  }
}
