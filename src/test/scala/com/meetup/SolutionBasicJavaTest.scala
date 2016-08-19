package com.meetup

import java.util.Optional

import com.meetup.support.ExpensiveOrangeService

import scala.compat.java8.OptionConverters._
import org.scalatest.mock.MockitoSugar
import org.scalatest.FunSpec
import org.mockito.Mockito.{doReturn, doThrow, spy, when}
import org.mockito.Matchers.{eq => mockEq}

class SolutionBasicJavaTest extends FunSpec with MockitoSugar {
  describe("Apple checker (basic example)") {
    it("should recognize apples") {
      val underTest = new SolutionBasicJava(mock[ExpensiveOrangeService])
      assert(underTest.isApple("apple"))
      assert(underTest.isApple("MacIntosh"))
      assert(underTest.isApple("gAla"))
    }
    it("should recognize when something is not an apple") {
      val underTest = new SolutionBasicJava(mock[ExpensiveOrangeService])
      assert( ! underTest.isApple("pear") )
      assert( ! underTest.isApple("Bulbasaur") )
      assert( ! underTest.isApple("Steve Jobs") )
    }
  }

  describe("Orange checker (mock example)") {
    it("should recognize oranges") {
      val underTest = new SolutionBasicJava(mock[ExpensiveOrangeService])
      assert(underTest.isOrange("orange"))
    }
    it("should recognize oranges, if our expensive 3rd party orange-identifier says so") {
      val mockExpensiveOrangeService = mock[ExpensiveOrangeService]
      val underTest = new SolutionBasicJava(mockExpensiveOrangeService)
      when(mockExpensiveOrangeService.estIlUneOrange(mockEq("l'orange"))).thenReturn(true)
      assert(underTest.isOrange("l'orange"))
      assert( ! underTest.isOrange("not an orange") )
    }
    it("should recognize when something is not an orange") {
      val mockExpensiveOrangeService = mock[ExpensiveOrangeService]
      val underTest = new SolutionBasicJava(mockExpensiveOrangeService)
      assert( ! underTest.isOrange("not an orange") )
      when(mockExpensiveOrangeService.estIlUneOrange(mockEq("l'orange"))).thenReturn(false)
      assert( ! underTest.isOrange("still not an orange") )
    }
  }

  describe("Pear checker (spy example)") {
    it("should recognize pears") {
      val underTest = new SolutionBasicJava(mock[ExpensiveOrangeService])
      assert(underTest.isPear("pear"))
    }
    it("should recognize pears, if our complicated algorithm (tested in its own unit elsewhere) determine it to be a pear") {
      //todo remember, don't test that algo here!
      val spyUnderTest = spy(new SolutionBasicJava(mock[ExpensiveOrangeService]))
      doReturn(Optional.of("p e a r")).when(spyUnderTest).complicatedPearAlgorithm(mockEq("p e a r"))
      assert(spyUnderTest.isPear("p e a r")) // new thing works
      assert(spyUnderTest.isPear("pear")) // old stuff still works
    }
    it("should recognize when something is not an pear") {
      val underTest = new SolutionBasicJava(mock[ExpensiveOrangeService])
      assert( ! underTest.isPear("not a pear") )
    }
  }

  describe("Complicated algorithm (package private example)") {
    it("should recognize fancy pears") {
      val underTest = new SolutionBasicJava(mock[ExpensiveOrangeService])
      assert(underTest.complicatedPearAlgorithm("p").asScala.contains("p"))
      assert(underTest.complicatedPearAlgorithm("p e a r").asScala.contains("p e a r"))
      assert(underTest.complicatedPearAlgorithm("p -- anything that starts with 'p'").asScala.contains("p -- anything that starts with 'p'"))
    }
    it("should ignore apples") {
      val underTest = new SolutionBasicJava(mock[ExpensiveOrangeService])
      assert(underTest.complicatedPearAlgorithm("doesn't start with 'p'").asScala.isEmpty)
    }
  }

}
