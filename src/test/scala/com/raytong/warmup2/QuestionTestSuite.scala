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

  val countXXData = Table(
    ("str", "result"),
    ("abcxx", 1),
    ("xxx", 2),
    ("xxxx", 3),
    ("abc", 0),
    ("Hello there", 0),
    ("Hexxo thxxe", 2),
    ("", 0),
    ("Kittens", 0),
    ("Kittensxxx", 2)
  )

  test("countXX") {
    forAll(countXXData) {
      (str: String, result: Int) =>
        countXX(str) should be(result)
    }
  }

  val doubleXData = Table(
    ("str", "result"),
    ("axxbb", true),
    ("axaxax", false),
    ("xxxxx", true),
    ("xaxxx", false),
    ("aaaax", false),
    ("", false),
    ("abc", false),
    ("x", false),
    ("xx", true),
    ("xax", false),
    ("xaxx", false)
  )

  test("doubleX") {
    forAll(doubleXData) {
      (str: String, result: Boolean) =>
        doubleX(str) should be(result)
    }
  }

  val stringBitsData = Table(
    ("str", "result"),
    ("Hello", "Hlo"),
    ("Hi", "H"),
    ("Heeololeo", "Hello"),
    ("HiHiHi", "HHH"),
    ("", ""),
    ("Greetings", "Getns"),
    ("Chocoate", "Coot"),
    ("pi", "p"),
    ("Hello Kitten", "HloKte"),
    ("hxaxpxpxy", "happy")
  )

  test("stringBits") {
    forAll(stringBitsData) {
      (str: String, result: String) =>
        stringBits(str) should be(result)
    }
  }

  val stringSplosionData = Table(
    ("str", "result"),
    ("Code", "CCoCodCode"),
    ("abc", "aababc"),
    ("ab", "aab"),
    ("x", "x"),
    ("fade", "ffafadfade"),
    ("There", "TThTheTherThere"),
    ("Kitten", "KKiKitKittKitteKitten"),
    ("Bye", "BByBye"),
    ("Good", "GGoGooGood"),
    ("Bad", "BBaBad")
  )

  test("stringSplosion") {
    forAll(stringSplosionData) {
      (str: String, result: String) =>
        stringSplosion(str) should be(result)
    }
  }

  val last2Data = Table(
    ("str", "result"),
    ("hixxhi", 1),
    ("xaxxaxaxx", 1),
    ("axxxaaxx", 2),
    ("xxaxxaxxaxx", 3),
    ("xaxaxaxx", 0),
    ("xxxx", 2),
    ("13121312", 1),
    ("11212", 1),
    ("13121311", 0),
    ("1717171", 2),
    ("hi", 0),
    ("h", 0),
    ("", 0)
  )

  test("last2") {
    forAll(last2Data) {
      (str: String, result: Int) =>
        last2(str) should be(result)
    }
  }

  val arrayCount9Data = Table(
    ("nums", "result"),
    (List(1, 2, 9), 1),
    (List(1, 9, 9), 2),
    (List(1, 9, 9, 3, 9), 3),
    (List(1, 2, 3), 0),
    (List(), 0),
    (List(4, 2, 4, 3, 1), 0),
    (List(9, 2, 4, 3, 1), 1)
  )

  test("arrayCount9") {
    forAll(arrayCount9Data) {
      (nums: List[Int], result: Int) =>
        arrayCount9(nums) should be(result)
    }
  }

  val arrayFront9Data = Table(
    ("nums", "result"),
    (List(1, 2, 9, 3, 4), true),
    (List(1, 2, 3, 4, 9), false),
    (List(1, 2, 3, 4, 5), false),
    (List(9, 2, 3), true),
    (List(1, 9, 9), true),
    (List(1, 2, 3), false),
    (List(1, 9), true),
    (List(5, 5), false),
    (List(2), false),
    (List(9), true),
    (List(), false),
    (List(3, 9, 2, 3, 3), true)
  )

  test("arrayFront9") {
    forAll(arrayFront9Data) {
      (nums: List[Int], result: Boolean) =>
        arrayFront9(nums) should be(result)
    }
  }
}