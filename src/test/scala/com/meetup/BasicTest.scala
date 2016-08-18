package com.meetup

import org.scalatest.mock.MockitoSugar
import org.scalatest.FunSpec
import com.meetup.support.ExpensiveOrangeService

/**
 * normally, this file would be authored before/simultaneously with Basic.scala
 * please know the test solution and original class were authored in this way
 */
class BasicTest extends FunSpec with MockitoSugar {

  describe("Apple checker (basic example)") {
    it("should recognize apples") {
      //todo
    }
    it("should recognize when something is not an apple") {
      //todo
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
