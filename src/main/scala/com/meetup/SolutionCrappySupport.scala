package com.meetup

import java.util.Properties

import scala.util.Try

/**
  * part of solution used in SolutionCrappy.java
  */
class SolutionCrappySupport {
  def myMethod (nullableString: String, currentC: Boolean, currentTimestamp: Long, p: Properties): String =
  {
    val defaultMsg: String = "the current timestamp is: %s".format(currentTimestamp)
    if (nullableString == null || p == null || !currentC) return defaultMsg
    val value: Option[String] = Option(p.getProperty(nullableString))
    value.getOrElse(defaultMsg)
  }
}

object SolutionCrappySupport {
  def apply() = new SolutionCrappySupport()
}
