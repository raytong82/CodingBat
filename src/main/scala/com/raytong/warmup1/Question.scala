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
}