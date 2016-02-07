package com.raytong.warmup2

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks._
import com.raytong.warmup2.Question._

@RunWith(classOf[JUnitRunner])
class QuestionTestSuite extends FunSuite with Matchers {

  val stringTimesData = Table(
    ("str", "n", "result"),
    ("Hi", 2, "HiHi"),
    ("Hi", 3, "HiHiHi"),
    ("Hi", 1, "Hi"),
    ("Hi", 0, ""),
    ("Hi", 5, "HiHiHiHiHi"),
    ("Oh Boy!", 2, "Oh Boy!Oh Boy!"),
    ("x", 4, "xxxx"),
    ("", 4, ""),
    ("code", 2, "codecode"),
    ("code", 3, "codecodecode")
  )

  test("stringTimes") {
    forAll(stringTimesData) {
      (str: String, n: Int, result: String) =>
        stringTimes(str, n) should be(result)
    }
  }

  val frontTimesData = Table(
    ("str", "n", "result"),
    ("Chocolate", 2, "ChoCho"),
    ("Chocolate", 3, "ChoChoCho"),
    ("Abc", 3, "AbcAbcAbc"),
    ("Ab", 4, "AbAbAbAb"),
    ("A", 4, "AAAA"),
    ("", 4, ""),
    ("Abc", 0, "")
  )

  test("frontTimes") {
    forAll(frontTimesData) {
      (str: String, n: Int, result: String) =>
        frontTimes(str, n) should be(result)
    }
  }
}