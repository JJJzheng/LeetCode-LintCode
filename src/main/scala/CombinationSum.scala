import com.sun.prism.impl.Disposer.Target

/**
  * 需要返回一个 List[List[Int]] 不知道怎么设置这个参数，解题失败
  */
object CombinationSum {
  var ans : List[List[Int]] = List()
  var cans : Array[Int]  =  Array[Int]()
  def src.java.main(args: Array[String]): Unit = {

  }
  def combinationSum(candidates: Array[Int], target: Int): List[List[Int]] = {
    if (candidates.length <= 0)
      return null
    this.cans = candidates
    cans.sorted
    ans
  }


  def findCombination(list: List[Int], target: Int, now : Int): Unit = {
    if (target == 0) {
      var nowList : List[Int] = List()
      nowList :: ans
    } else {
      for (i <- now until cans.length) {

      }
    }

  }
}
