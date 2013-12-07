package com.raytong.warmup1

object Question {

  def sleepIn(weekday: Boolean, vacation: Boolean): Boolean = {
    vacation || !weekday
  }
}