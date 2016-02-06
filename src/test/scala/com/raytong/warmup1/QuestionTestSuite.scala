package com.raytong.warmup1

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks._
import com.raytong.warmup1.Question._

@RunWith(classOf[JUnitRunner])
class QuestionTestSuite extends FunSuite with Matchers {

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
        sleepIn(weekday, vacation) should be(result)
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
        monkeyTrouble(aSmile, bSmile) should be(result)
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
        sumDouble(a, b) should be(result)
    }
  }

  val diff21Data = Table(
    ("n", "result"),
    (19, 2),
    (10, 11),
    (21, 0),
    (22, 2),
    (25, 8),
    (30, 18),
    (0, 21),
    (1, 20),
    (2, 19),
    (-1, 22),
    (-2, 23),
    (50, 58)
  )

  test("diff21") {
    forAll(diff21Data) {
      (n: Int, result: Int) =>
        diff21(n) should be(result)
    }
  }

  val parrotTroubleData = Table(
    ("talking", "hour", "result"),
    (true, 6, true),
    (true, 7, false),
    (false, 6, false),
    (true, 21, true),
    (false, 21, false),
    (false, 20, false),
    (true, 23, true),
    (false, 23, false),
    (true, 20, false),
    (false, 12, false)
  )

  test("parrotTrouble") {
    forAll(parrotTroubleData) {
      (talking: Boolean, hour: Int, result: Boolean) =>
        parrotTrouble(talking, hour) should be(result)
    }
  }

  val makes10Data = Table(
    ("a", "b", "result"),
    (9, 10, true),
    (9, 9, false),
    (1, 9, true),
    (10, 1, true),
    (10, 10, true),
    (8, 2, true),
    (8, 3, false),
    (10, 42, true),
    (12, -2, true)
  )

  test("makes10") {
    forAll(makes10Data) {
      (a: Int, b: Int, result: Boolean) =>
        makes10(a, b) should be(result)
    }
  }

  val nearHundredData = Table(
    ("a", "result"),
    (93, true),
    (90, true),
    (89, false),
    (110, true),
    (111, false),
    (121, false),
    (0, false),
    (5, false),
    (191, true),
    (189, false),
    (190, true),
    (200, true),
    (210, true),
    (211, false),
    (290, false)
  )

  test("nearHundred") {
    forAll(nearHundredData) {
      (a: Int, result: Boolean) =>
        nearHundred(a) should be(result)
    }
  }

  val posNegData = Table(
    ("a", "b", "negative", "result"),
    (1, -1, false, true),
    (-1, 1, false, true)
  )

  test("posNeg") {
    forAll(posNegData) {
      (a: Int, b: Int, negative: Boolean, result: Boolean) =>
      posNeg(a, b, negative) should be(result)
    }
  }
}
