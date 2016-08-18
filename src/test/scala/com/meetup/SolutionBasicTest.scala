package com.meetup

import org.scalatest.mock.MockitoSugar
import org.scalatest.FunSpec

/**
 * normally, this file would be authored before/simultaneously with Basic.scala
 * please know the test solution and original class were authored in this way
 */
class SolutionBasicTest extends FunSpec with MockitoSugar {

  describe("Apple checker (basic example)") {
    it("should recognize apples") {
      val underTest = Basic(mock[ExpensiveOrangeService])
      assert(underTest.isApple("apple") == true)
      assert(underTest.isApple("MacIntosh") == true)
      assert(underTest.isApple("gAla") == true)
    }
    it("should recognize when something is not an apple") {
      val underTest = Basic(mock[ExpensiveOrangeService])
      assert(underTest.isApple("pear") == false)
      assert(underTest.isApple("Bulbasaur") == false)
      assert(underTest.isApple("Steve Jobs") == false)
    }
  }

  describe("Orange checker (mock example)") {
    it("should recognize oranges") {
      //todo
    }
    it("should recognize oranges, if our expensive 3rd party orange-identifier says so") {
      //todo remember, don't test that 3rd party here!
    }
    it("should recognize when something is not an orange") {
      //todo
    }
  }

  describe("Pear checker (spy example)") {
    it("should recognize pears") {
      //todo
    }
    it("should recognize pears, if our complicated algorithm (tested in its own unit elsewhere) determine it to be a pear") {
      //todo remember, don't test that algo here!
    }
    it("should recognize when something is not an pear") {
      //todo
    }
  }

  describe("Complicated algorithm (package private example)") {
    it("should recognize fancy pears") {
      //todo
    }
    it("should ignore apples") {
      //todo
    }
  }
}
