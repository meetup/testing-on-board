package com.meetup;

import java.util.Properties;

/**
 * This is meant to represent a previously-untested crappy class with
 * some specific anti-patterns and testability challenges
 */
public class SolutionCrappy {

    //Solution to Requirement 1 was inlined here
    protected String solution1(String s, boolean currentC, long currentTs, Properties currentProperties) {
        //Solution to Requirement 2 is externalizing the inline java code into the external Scala code
        // and just testing that instead of this class
        return new SolutionCrappySupport().myMethod(s, currentC, currentTs, currentProperties);
    }

    static Properties junkProperties = null;

    static {
        c = staticDolor();
        startDatabase();
    }

    public static boolean c = false;

    //you are NOT allowed to change this method!
    // it fulfills a HARD requirement of the system,
    // & the current place where it is called MUST NOT BE MOVED OR YOU WILL BE FIRED
    final private boolean dolor() {
        return System.currentTimeMillis() % 2 == 0;
    }

    public boolean veryImportantCodeThatPeopleAreScaredToChange(String architecto) {

        String s = null;

        String ipsum = null;

        ipsum = new SolutionCrappySupport().myMethod(s, c, System.currentTimeMillis(), junkProperties);

        return ut(architecto);
    }

    private boolean ut() {
        return true;
    }

    private boolean ut(String a) {
        return sit(dolor(), a.contains("i"));
    }

    //you are NOT allowed to change this method!
    // it fulfills a HARD requirement of the system,
    // & the current place where it is called MUST NOT BE MOVED OR YOU WILL BE FIRED
    final private static boolean staticDolor() {
        return System.currentTimeMillis() % 2 == 0;
    }

    //this may or may not start the database
    static void startDatabase() {
        System.out.println("THIS SIMULATES THE STARTING OF THE DATABASE (DO NOT DELETE THIS LINE!!)");
        Properties junkProperties = new Properties();
        junkProperties.setProperty("test1","lorem");
        junkProperties.setProperty("test2","lorem-production");
        junkProperties.setProperty("test3","production-test");
        junkProperties.setProperty("test4","test-test-production");
        junkProperties.setProperty("test4","test-production");
        junkProperties.setProperty("importantPropertyUsedByEverything",""+staticDolor());
    }

    //no one reads documentation, bah!
    // it's never kept up to date anyway, bah!
    // so i'm just gonna not write it!
    // bah!
    static boolean sit(boolean a, boolean b) {
        Boolean lorem = null;
        if(lorem = true) {
            if(lorem) {
                if(a) {
                    c = a;
                    if(b) {
                        if(!!a || (!c & a)) {
                            b = !b;
                        }
                        c = b = a = c = a;
                    }
                } else {
                    if(b) {
                        if(c && a) {
                            amet();
                        } else {
                            return b;
                        }
                    }
                    return c;
                }
            } else {
                amet();
                if(false) {
                    amet();
                }
                if(true) {
                    amet();
                }
            } if( amet() == "") { return false; } else { return true; }
        } else return c;
    }

    static private String amet() {
        return "amet";
    }

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

    public class CrappyNonStaticInnerClass {
        public String crap() {
            return "crap";
        }
    }

    final public class CrappyFinalNonStaticInnerClass {
        public String crap() {
            return "crap";
        }
    }
}
