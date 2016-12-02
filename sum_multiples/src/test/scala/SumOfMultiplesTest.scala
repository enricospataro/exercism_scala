/**
  * Created by espataro on 02/12/16.
  */
import org.scalatest.{FunSuite, Matchers}

class SumOfMultiplesTest extends FunSuite with Matchers {

  val sum = new SumOfMultiples

  test("([3, 5], 1)") {
    sum.compute(Set(3, 5), 1) should be (0)
  }

  test("([3, 5], 4)") {
    sum.compute(Set(3, 5), 4) should be (3)
  }

  test("([3, 5), 10") {
    sum.compute(Set(3, 5), 10) should be (23)
  }

  test("[3, 5], 100") {
    sum.compute(Set(3, 5), 100) should be (2318)
  }

  test("[3, 5], 1000") {
    sum.compute(Set(3, 5), 1000) should be (233168)
  }

  test("[4, 7], 10") {
    sum.compute(Set(4, 7), 10) should be (19)
  }

  test("[4, 7], 25") {
    sum.compute(Set(4, 7), 25) should be (126)
  }

  test("[43, 47] 10000") {
    sum.compute(Set(43, 47), 10000) should be (2203160)
  }

  test("[1] 100") {
    sum.compute(Set(1), 100) should be (4950)
  }

  test("[] 10000") {
    sum.compute(Set(), 10000) should be (0)
  }
}
