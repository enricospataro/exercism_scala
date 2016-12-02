/**
  * Created by espataro on 02/12/16.
  */
class SumOfMultiples {

  def compute(multiplesOf: Set[Int], n: Int): Int = {
    val set = for {
      x <- multiplesOf
      i <- 1 to n
      a = x * i
      if (a < n)
    } yield a

    set.toList.foldLeft(0)(_ + _)
  }
}
