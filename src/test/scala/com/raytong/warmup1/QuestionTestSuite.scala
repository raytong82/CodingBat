import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers._
import org.scalatest.prop.TableDrivenPropertyChecks._
import com.raytong.warmup1.Question._

@RunWith(classOf[JUnitRunner])
class QuestionTestSuite extends FunSuite {

  val sleepInData = Table(
    ("weekday", "vacation", "result"),
    (false, false, true),
    (true, false, false),
    (false, true, true),
    (true, true, true)
  )
  test("sleepIn") {
    forAll(sleepInData) {
      (weekday: Boolean, vacation: Boolean, result: Boolean) =>
        sleepIn(weekday, vacation) should be === result
    }
  }

  val monkeyTroubleData = Table(
    ("aSmile", "bSmile", "result"),
    (true, true, true),
    (false, false, true),
    (true, false, false),
    (false, true, false)
  )

  test("monkeyTrouble") {
    forAll(monkeyTroubleData) {
      (aSmile: Boolean, bSmile: Boolean, result: Boolean) =>
        monkeyTrouble(aSmile, bSmile) should be === result
    }
  }

  val sumDoubleData = Table(
    ("a", "b", "result"),
    (1, 2,3),
    (3,2,5),
    (2,2,8),
    (-1,0,-1),
    (3,3,12),
    (0,0,0),
    (0,1,1),
    (3,4,7)
  )

  test("sumDouble") {
    forAll(sumDoubleData) {
      (a: Int, b: Int, result: Int) =>
        sumDouble(a, b) should be === result
    }
  }
}