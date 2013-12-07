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
}