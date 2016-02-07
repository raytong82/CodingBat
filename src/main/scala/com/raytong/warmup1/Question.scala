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
    else (a > 0 && b < 0) || (a < 0 && b > 0)
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
    if (str.length < 2) str * 3
    else str.substring(0, 2) + str + str.substring(0, 2)
  }
  
  def startHi(str: String): Boolean = {
    str.startsWith("hi")
  }
  
  def icyHot(temp1: Int, temp2: Int): Boolean = {
    if (temp1 < 0) temp2 > 100
    else if (temp2 < 0) temp1 > 100
    else false
  }
  
  def in1020(a: Int, b: Int): Boolean = {
    (a >= 10 && a <= 20) || (b >= 20 && b <= 10)
  }
  
  def isTeen(a: Int) = a >= 13 && a <= 19
  
  def hasTeen(a: Int, b: Int, c: Int): Boolean = {
    List(a, b, c).exists(isTeen)
  }
  
  def loneTeen(a: Int, b: Int): Boolean = {
    List(a, b).filter(isTeen).size == 1
  }
  
  def delDel(str: String): String = {
    if (str.indexOf("del") == 1) str.replace("del", "")
    else str
  }
  
  def minStart(str: String): Boolean = {
    if (str.length < 3) false;
    else str.charAt(1) == 'i' && str.charAt(2) == 'x'
  }
  
  def startOz(str: String): String = {
    val len = str.length
    if (len >= 1 && str.charAt(0) == 'o')
      if (len >= 2 && str.charAt(1) == 'z') "oz"
      else "o"
    else if (len >= 2 && str.charAt(1) == 'z') "z"
    ""
  }
  
  def intMax(a: Int, b: Int, c: Int): Int = {
    List(a, b, c).reduceLeft(_ max _)
  }
  
  def close10(a: Int, b: Int): Int = {
    val absA = Math.abs(a - 10)
    val absB = Math.abs(b - 10)
    if (absA == absB) 0
    else if (absA < absB) absA
    else absB
  }

  def inRange(x: Int)(start: Int, end: Int) = x >= start && x <= end

  def in3050(a: Int, b: Int): Boolean = {
    val list = List(a, b)
    def in3040(x: Int) = inRange(x)(30, 40)
    def in4050(x: Int) = inRange(x)(40, 50)
    list.forall(x => in3040(x)) || list.forall(x => in4050(x))
  }
  
  def max1020(a: Int, b: Int): Int = {
    def in1020(x: Int) = inRange(x)(10, 20)
    List(a, b).filter(x => in1020(x)).max
  }
  
  def stringE(str: String): Boolean = {
    val count = str.toList.filter(_ == 'e').size
    count >= 1 && count <= 3
  }
  
  def lastDigit(a: Int, b: Int): Boolean = {
    a % 10 == b % 10
  }
  
  def endUp(str: String): String = {
    val len = str.length
    if (len <= 3) str.toUpperCase
    else str.substring(0, len-3) + str.substring(len-3).toUpperCase
  }
  
  def everyNth(str: String, n: Int): String = {
    str.toList.zipWithIndex.filter(_._2 % 2 == 0).map(_._1).toString
  }
}