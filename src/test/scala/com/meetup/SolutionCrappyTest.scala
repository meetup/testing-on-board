package com.meetup

import java.util.Properties

import org.scalatest.FunSpec
import org.scalatest.mock.MockitoSugar

object TestUtil {
  val MISSING_PROPERTY = "missing"
  val FOUND_PROPERTY = "found"
  val FOUND_PROPERTY_VALUE = "found value"
  val PROPERTIES = new Properties()
  PROPERTIES.put(FOUND_PROPERTY,FOUND_PROPERTY_VALUE)
}

class SolutionCrappyTest extends FunSpec with MockitoSugar {

  import TestUtil._

  describe("Requirement 1: myMethod") {
    it("should return timestamp message, if string is null") {
      val currentTimestamp = 111l
      assert( SolutionCrappySupport().myMethod(null, true, currentTimestamp, PROPERTIES) == "the current timestamp is: 111")
    }
    it("should return timestamp message, if c is false") {
      val currentTimestamp = 222l
      assert( SolutionCrappySupport().myMethod(FOUND_PROPERTY, false, currentTimestamp, PROPERTIES) == "the current timestamp is: 222")
    }
    it("should return timestamp message, if properties didn't exist") {
      val currentTimestamp = 333l
      assert( SolutionCrappySupport().myMethod(MISSING_PROPERTY, true, currentTimestamp, PROPERTIES) == "the current timestamp is: 333")
      assert( SolutionCrappySupport().myMethod(MISSING_PROPERTY, true, currentTimestamp, null) == "the current timestamp is: 333")
    }
    it("should properties value exists for the passed in string & c is true") {
      val currentTimestamp = 444l
      assert( SolutionCrappySupport().myMethod(FOUND_PROPERTY, true, currentTimestamp, PROPERTIES) == FOUND_PROPERTY_VALUE)
    }
  }


}
