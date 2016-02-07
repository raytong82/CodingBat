package com.raytong.warmup2

object Question {
  
  def stringTimes(str: String, n: Int): String = {
    str * n
  }

  def frontTimes(str: String, n: Int): String = {
    val front = if (str.length > 3) str.substring(0, 3) else str
    front * n
  }

  def countXX(str: String): Int = {
    def isXX(t: (Char, Char)): Boolean =
      t._1 == t._2 && t._1 == 'x'
    val s1 = str.toList
    val s2 = s1.tail
    s1 zip s2 filter (isXX) size
  }
}