package com.meetup;

/**
 * simple java class to test in scala test class BasicJavaTest.scala
 */
public class BasicJava {
    /** given a string, tells ya whether that string represents an Apple */
    public boolean isApple(String fruit) {
        String f = fruit.toLowerCase();
        return f.equals("apple") || f.equals("gala") || f.equals("macintosh");
    }

    //implement the rest
}
