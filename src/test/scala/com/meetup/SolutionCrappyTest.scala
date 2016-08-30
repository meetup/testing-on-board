package com.meetup

import java.util.Properties

import com.meetup.SolutionCrappy._
import org.scalatest.{FunSpec, GivenWhenThen}
import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito.{doReturn, spy, verify}

class SolutionCrappyTest extends FunSpec with GivenWhenThen with MockitoSugar {

  import TestUtil._

  describe("Specification 1: myMethod") {
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

  describe("Specification 2: methodWithFinalInput (without db side effect)") {
    val underTest = new SolutionCrappy
    it("params(true, <ignored>, <ignored>) should return true ") {
      //you can use a mock for lightweight purposes,
      // but final classes can't be mocked, in this case, since the class is just a value class, it can simply be used
      // in fact, sometimes a class is final
      underTest.methodWithFinalInput(new CrappyInput(true, "ignored", mock[UnusedSubInput]))
    }
    it("params(false, <ignored>, <ignored>) should return false ") {
      underTest.methodWithFinalInput(new SolutionCrappy.CrappyInput(false, "ignored", mock[UnusedSubInput]))
    }
  }

  describe("Specification 3: methodWithInconvienentNew (without api side effect)") {
    it("should call service that calls API") {

      Given("spy and mock setup of external inputs")
      val underTest = spy(new SolutionCrappy)
      val mockInconvenientService = mock[InconvenientService]
      doReturn(mockInconvenientService).when(underTest).surgicalRefactorOfConstruction()

      When("tested method is called")
      underTest.methodWithInconvienentNew()

      Then("command is called on external service")
      verify(mockInconvenientService).get("command-to-run-important-things")
    }

  }

//    describe("Notice that SolutionCrappy.veryImportantCodeThatPeopleAreScaredToChange() is STILL not deterministic") {
//      it("should be deterministic, but is not. Sometimes this passes, sometimes this fails") {
//        val underTest = new SolutionCrappy
//        assert(underTest.veryImportantCodeThatPeopleAreScaredToChange("test"))
//      }
//    }

}

object TestUtil {
  val MISSING_PROPERTY = "missing"
  val FOUND_PROPERTY = "found"
  val FOUND_PROPERTY_VALUE = "found value"
  val PROPERTIES = new Properties()
  PROPERTIES.put(FOUND_PROPERTY,FOUND_PROPERTY_VALUE)


}

