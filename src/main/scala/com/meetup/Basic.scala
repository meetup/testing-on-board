package com.meetup

import com.meetup.support.ExpensiveOrangeService
/**
 * This trivial class is tested by BasicTest
 * and has just enough functionality to be able to
 * write an example unit test to show the mechanics
 */
case class Basic(orangeService:ExpensiveOrangeService) {

  /** given a string, tells ya whether that string represents an Apple */
  def isApple(fruit:String):Boolean = fruit.toLowerCase match {
    case "apple" => true
    case "gala" => true
    case "macintosh" => true
    case _ => false
  }

  /** given a string, tells ya whether that string represents an Orange */
  def isOrange(fruit:String):Boolean =
    if(orangeService.estIlUneOrange(fruit)) true // use fancy French service to offload test
    else fruit.toLowerCase match {
      case "orange" => true
      case _ => false
  }

  /** given a string, tells ya whether that string represents a Pear */
  def isPear(fruit:String):Boolean = complicatedPearAlgorithm(fruit)
      .orElse( if (fruit == "pear") Some("pear") else None )
      .isDefined

  //returns normalized Pear string, otherwise None, if not recognized
  // notice, making something package-private makes it testable (if test is in same package)
  // while controlling access
  private[meetup] def complicatedPearAlgorithm(pearCandidate:String):Option[String] =
    if(pearCandidate.startsWith("p"))
      Some(pearCandidate)
    else
      None
}
