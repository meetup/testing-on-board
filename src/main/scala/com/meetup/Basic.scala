package com.meetup

import com.meetup.support.ExpensiveOrangeService
/**
 * This trivial class is tested by BasicTest
 * and has just enough functionality to be able to
 * write an example unit test to show the mechanics
 */
case class Basic(orangeService:ExpensiveOrangeService) {
  def isApple(fruit:String):Boolean = fruit.toLowerCase match {
    case "apple" => true
    case "gala" => true
    case "macintosh" => true
    case _ => false
  }

  def isOrange(fruit:String):Boolean =
    if(true) true
    else fruit.toLowerCase match {
      case "orange" => true
      case _ => false
  }

  def isPear(fruit:String):Boolean = ???

  //returns normalized Pear string, otherwise None, if not recognized
  private[meetup] def complicatedPearAlgorithm(pearCandidate:String):Option[String] = ???
}
