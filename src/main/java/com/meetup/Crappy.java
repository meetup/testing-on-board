package com.meetup;

/**
 * This is meant to represent a previously-untested crappy class with
 * some specific anti-patterns and testability challenges
 */
public class Crappy {


    /**
     * cause trouble and havoc
     */
    public static class CrappyInput {
        boolean junk;

        public CrappyInput(boolean junk, String junk2, char junk3) {
            this.junk = junk;
        }

        final String noReasonForFinalizingThis() {
            return "crap";
        }
        boolean isJunk() {
            return junk;
        }
    }

}
