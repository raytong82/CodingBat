package com.raytong.warmup1

object Question {

  def sleepIn(weekday: Boolean, vacation: Boolean): Boolean = {
    vacation || !weekday
  }

  def monkeyTrouble(aSmile: Boolean, bSmile: Boolean): Boolean = {
    !(aSmile ^ bSmile)
  }

  def sumDouble(a: Int, b: Int): Int = {
    if (a == b) a * 4
    else a + b
  }

  def diff21(n: Int): Int = {
    if (n > 21) Math.abs(n - 21) * 2
    else Math.abs(21 - n)
  }

  def parrotTrouble(talking: Boolean, hour: Int): Boolean = {
    talking && (hour < 7 || hour > 20)
  }

  def makes10(a: Int, b: Int): Boolean = {
    a == 10 || b == 10 || a + b == 10
  }

  def nearHundred(n: Int): Boolean = {
    Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10
  }

  def posNeg(a: Int, b: Int, negative: Boolean): Boolean = {
    if (negative) a < 0 && b < 0
    (a > 0 && b < 0) || (a < 0 && b > 0)
  }

  def notString(str: String): String = {
    if (str.startsWith("not")) str
    else "not " + str
  }
  
  def missingChar(str: String, n: Int): String = {
    str.substring(0, n) + str.substring(n + 1)
  }
  
  def frontBack(str: String): String = {
    val len = str.length
    if (len <= 1) str
    else str.charAt(len - 1) + str.substring(1, len - 1) + str.charAt(0)
  }
  
  def front3(str: String): String = {
    if (str.length <= 3) str * 3
    else str.substring(0, 3) * 3
  }
  
  def backAround(str: String): String = {
    val len = str.length
    val last = str.charAt(len - 1)
    last + str + last
  }
  
  def or35(n: Int): Boolean = {
    n % 3 == 0 || n % 5 == 0
  }
  
  def front22(str: String): String = {
    if (str.length < 2) str + str + str
    val first2 = str.substring(0, 2)
    first2 + str + first2
  }
  
  def startHi(str: String): Boolean = {
    str.startsWith("hi")
  }
}