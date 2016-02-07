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
    (-1, 1, false, true),
    (-4, -5, true, true),
    (-4, -5, false, false),
    (-4, 5, false, true),
    (-4, 5, true, false),
    (1, 1, false, false),
    (-1, -1, false, false),
    (1, -1, true, false),
    (-1, 1, true, false),
    (1, 1, true, false),
    (-1, -1, true, true),
    (5, -5, false, true),
    (-6, 6, false, true),
    (-5, -6, false, false),
    (-2, -1, false, false),
    (1, 2, false, false),
    (5, 6, true, false),
    (-5, -5, true, true)
  )

  test("posNeg") {
    forAll(posNegData) {
      (a: Int, b: Int, negative: Boolean, result: Boolean) =>
        posNeg(a, b, negative) should be(result)
    }
  }

  val notStringData = Table(
    ("str", "result"),
    ("candy", "not candy"),
    ("x", "not x"),
    ("not bad", "not bad"),
    ("bad", "not bad"),
    ("not", "not"),
    ("is not", "not is not"),
    ("no", "not no")
  )

  test("notString") {
    forAll(notStringData) {
      (str: String, result: String) =>
        notString(str) should be(result)
    }
  }

  val missingCharData = Table(
    ("str", "n", "result"),
    ("kitten", 1, "ktten"),
    ("kitten", 0, "itten"),
    ("Hi", 0, "i"),
    ("Hi", 1, "H"),
    ("code", 0, "ode"),
    ("code", 1, "cde"),
    ("code", 2, "coe"),
    ("code", 3, "cod"),
    ("chocolate", 8, "chocolat")
  )

  test("missingChar") {
    forAll(missingCharData) {
      (str: String, n: Int, result: String) =>
        missingChar(str, n) should be(result)
    }
  }

  val frontBackData = Table(
    ("str", "result"),
    ("code", "eodc"),
    ("a", "a"),
    ("ab", "ba"),
    ("abc", "cba"),
    ("", ""),
    ("Chocolate", "ehocolatC"),
    ("aavJ", "Java"),
    ("hello", "oellh")
  )

  test("frontBack") {
    forAll(frontBackData) {
      (str: String, result: String) =>
        frontBack(str) should be(result)
    }
  }

  val front3Data = Table(
    ("str", "result"),
    ("Java", "JavJavJav"),
    ("Chocolate", "ChoChoCho"),
    ("abc", "abcabcabc"),
    ("abcXYZ", "abcabcabc"),
    ("ab", "ababab"),
    ("a", "aaa"),
    ("", "")
  )

  test("front3") {
    forAll(front3Data) {
      (str: String, result: String) =>
        front3(str) should be(result)
    }
  }

  val backAroundData = Table(
    ("str", "result"),
    ("cat", "tcatt"),
    ("Hello", "oHelloo"),
    ("a", "aaa"),
    ("abc", "cabcc"),
    ("read", "dreadd"),
    ("boo", "obooo")
  )

  test("backAround") {
    forAll(backAroundData) {
      (str: String, result: String) =>
        backAround(str) should be(result)
    }
  }

  val or35Data = Table(
    ("n", "result"),
    (3, true),
    (10, true),
    (8, false),
    (15, true),
    (5, true),
    (9, true),
    (4, false),
    (7, false),
    (6, true),
    (17, false),
    (18, true),
    (19, false),
    (29, false),
    (20, true),
    (21, true),
    (22, false),
    (45, true),
    (99, true),
    (100, true),
    (101, false),
    (121, false),
    (122, false),
    (123, true)
  )

  test("or35") {
    forAll(or35Data) {
      (n: Int, result: Boolean) =>
        or35(n) should be(result)
    }
  }

  val front22Data = Table(
    ("str", "result"),
    ("kitten", "kikittenki"),
    ("Ha", "HaHaHa"),
    ("abc", "ababcab"),
    ("ab", "ababab"),
    ("a", "aaa"),
    ("", ""),
    ("Logic", "LoLogicLo")
  )

  test("front22") {
    forAll(front22Data) {
      (str: String, result: String) =>
        front22(str) should be(result)
    }
  }

  val startHiData = Table(
    ("str", "result"),
    ("hi there", true),
    ("hi", true),
    ("hello hi", false),
    ("he", false),
    ("h", false),
    ("", false),
    ("ho", false),
    ("hi ho", true)
  )

  test("startHi") {
    forAll(startHiData) {
      (str: String, result: Boolean) =>
        startHi(str) should be(result)
    }
  }

  val icyHotData = Table(
    ("temp1", "temp2", "result"),
    (120, -1, true),
    (-1, 120, true),
    (2, 120, false),
    (-1, 100, false),
    (-2, -2, false),
    (120, 120, false)
  )

  test("icyHot") {
    forAll(icyHotData) {
      (temp1: Int, temp2: Int, result: Boolean) =>
        icyHot(temp1, temp2) should be(result)
    }
  }

  val in1020Data = Table(
    ("a", "b", "result"),
    (12, 99, true),
    (21, 12, true),
    (8, 99, false),
    (99, 10, true),
    (20, 20, true),
    (21, 21, false),
    (9, 9, false)
  )

  test("in1020") {
    forAll(in1020Data) {
      (a: Int, b: Int, result: Boolean) =>
        in1020(a, b) should be(result)
    }
  }

  val hasTeenData = Table(
    ("a", "b", "c", "result"),
    (13, 20, 10, true),
    (20, 19, 10, true),
    (20, 10, 13, true),
    (1, 20, 12, false),
    (19, 20, 12, true),
    (12, 20, 19, true),
    (12, 9, 20, false),
    (12, 18, 20, true),
    (14, 2, 20, true),
    (4, 2, 20, false),
    (11, 22, 22, false)
  )

  test("hasTeen") {
    forAll(hasTeenData) {
      (a: Int, b: Int, c: Int, result: Boolean) =>
        hasTeen(a, b, c) should be(result)
    }
  }

  val loneTeenData = Table(
    ("a", "b", "result"),
    (13, 99, true),
    (21, 19, true),
    (13, 13, false),
    (14, 20, true),
    (20, 15, true),
    (16, 17, false),
    (16, 9, true),
    (16, 18, false),
    (13, 19, false),
    (13, 20, true),
    (6, 18, true),
    (99, 13, true),
    (99, 99, false)
  )

  test("loneTeen") {
    forAll(loneTeenData) {
      (a: Int, b: Int, result: Boolean) =>
        loneTeen(a, b) should be(result)
    }
  }

  val delDelData = Table(
    ("str", "result"),
    ("adelbc", "abc"),
    ("adelHello", "aHello"),
    ("abcdel", "abcdel"),
    ("add", "add"),
    ("ad", "ad"),
    ("a", "a"),
    ("", ""),
    ("del", "del"),
    ("adel", "a"),
    ("aadelbb", "aadelbb")
  )

  test("delDel") {
    forAll(delDelData) {
      (str: String, result: String) =>
        delDel(str) should be(result)
    }
  }

  val mixStartData = Table(
    ("str", "result"),
    ("mix snacks", true),
    ("pix snacks", true),
    ("piz snacks", false),
    ("nix", true),
    ("ni", false),
    ("n", false),
    ("", false)
  )

  test("mixStart") {
    forAll(mixStartData) {
      (str: String, result: Boolean) =>
        mixStart(str) should be(result)
    }
  }

  val startOzData = Table(
    ("str", "result"),
    ("ozymandias", "oz"),
    ("bzoo", "z"),
    ("oxx", "o"),
    ("oz", "oz"),
    ("ounce", "o"),
    ("o", "o"),
    ("abc", ""),
    ("", ""),
    ("zoo", ""),
    ("aztec", "z"),
    ("zzzz", "z"),
    ("oznic", "oz")
  )

  test("startOz") {
    forAll(startOzData) {
      (str: String, result: String) =>
        startOz(str) should be(result)
    }
  }

  val intMaxData = Table(
    ("a", "b", "c", "result"),
    (1, 2, 3, 3),
    (1, 3, 2, 3),
    (3, 2, 1, 3),
    (9, 3, 3, 9),
    (3, 9, 3, 9),
    (3, 3, 9, 9),
    (8, 2, 3, 8)
  )

  test("intMax") {
    forAll(intMaxData) {
      (a: Int, b: Int, c: Int, result: Int) =>
        intMax(a, b, c) should be(result)
    }
  }
}