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
    def listSplosion(list: List[Char]): List[Char] = {
      if (list.length <= 1) list
      else listSplosion(list.init) ++ list
    }
    listSplosion(str.toList).mkString
  }

  def last2(str: String): Int = {
    val len = str.length
    if (len <= 2) 0
    else {
      val two = str.substring(len - 2, len)
      val head = str.substring(0, len - 1)
      def matched(s: String): Int = {
        if (s.length < 2) 0
        else {
          val score = if (s.startsWith(two)) 1 else 0
          matched(s.substring(1)) + score
        }
      }
      matched(head)
    }
  }

  def arrayCount9(nums: List[Int]): Int = {
    nums.filter(_ == 9).size
  }

  def arrayFront9(nums: List[Int]): Boolean = {
    def sub(nums: List[Int], count: Int): Boolean = {
      if (count == 0) false
      else nums match {
        case x :: xs => if (x == 9) true else sub(xs, count - 1)
        case _ => false
      }
    }
    sub(nums, 4)
  }

  def array123(nums: List[Int]): Boolean = {
    def findNum(target: Int): Boolean = {
      nums.contains(target)
    }
    findNum(1) && findNum(2) && findNum(3)
  }

  def stringMatch(a: String, b: String): Int = {
    if (a.length < 2 || b.length < 2) 0
    else {
      val aList = a.toList
      val aTail = aList.tail
      val bList = b.toList
      val bTail = bList.tail
      val aZip = aList zip aTail
      val bZip = bList zip bTail
      def toFilter(t: ((Char, Char), (Char, Char))): Boolean = {
        val ((x1, x2), (y1, y2)) = t
        x1 == y1 && x2 == y2
      }
      aZip zip bZip filter (toFilter) size
    }
  }

  def stringX(str: String): String = {
    if (str.length <= 2) str
    else {
      val list = str.toList
      val first = str.head
      val remained = str.tail
      val last = remained.last
      val filtered = remained.init.filter(_ != 'x').toList
      (first :: filtered) :+ last mkString
    }
  }

  def altPairs(str: String): String = {
    val list = str.toList zipWithIndex
    val fst = list filter (_._2 % 4 == 0)
    val snd = list filter (_._2 % 4 == 1)
    def combine(t: ((Char, Int), (Char, Int))): String = {
      val ((x1, i1), (x2, i2)) = t
      List(x1, x2) mkString
    }
    fst zip snd map (combine) mkString
  }
}