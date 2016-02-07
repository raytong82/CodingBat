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
    if (str.length <= 1) 0
    else {
      val s1 = str.toList
      val s2 = s1.tail
      s1.zip(s2).filter(isXX).size
    }
  }

  def doubleX(str: String): Boolean = {
    val i = str.indexOf('x')
    str.indexOf('x', i+1) == i+1
  }

  def stringBits(str: String): String = {
    str.toList.zipWithIndex.filter(_._2 % 2 == 0).map(_._1).mkString
  }

  def stringSplosion(str: String): String = {
    if (str.length <= 1) str
    else {
      val list = str.toList
      stringSplosion(list.init.mkString) :+ list.last
    }
  }
}