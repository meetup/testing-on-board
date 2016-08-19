package com.meetup;

import com.meetup.support.ExpensiveOrangeService;

import java.util.Optional;

/**
 * simple java class to test in scala test class BasicJavaTest.scala
 */
public class SolutionBasicJava {

    final private ExpensiveOrangeService expensiveOrangeService;

    public SolutionBasicJava(ExpensiveOrangeService expensiveOrangeService) {
        this.expensiveOrangeService = expensiveOrangeService;
    }
    /** given a string, tells ya whether that string represents an Apple */
    public boolean isApple(String fruit) {
        String f = fruit.toLowerCase();
        return f.equals("apple") || f.equals("gala") || f.equals("macintosh");
    }

    public boolean isOrange(String fruit) {
        String f = fruit.toLowerCase();
        return expensiveOrangeService.estIlUneOrange(f) || f.equals("orange");
    }

    public boolean isPear(String fruit) {
        return complicatedPearAlgorithm(fruit).isPresent() || fruit.equals("pear");
    }

    //notice we use "protected" instead of scala's package-private
    protected Optional<String> complicatedPearAlgorithm(String pearCandidate) {
        return pearCandidate.startsWith("p") ? Optional.of(pearCandidate) :Optional.empty();
    }
}
