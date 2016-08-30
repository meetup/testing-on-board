package com.meetup;

/**
 * One possible solution to Specification 2:Requirement 2
 *
 * The original static initializer was initializing the app,
 * an activity that should be coordinated and one of the reasons for DI frameworks
 * additionally, it depends on configuration, which is another usefulness of DI frameworks
 *
 * This class is meant to encapsulate all initialization activity for an application
 *
 * todo: this class should be hardened by making sure to clean up the entire app,
 * todo: help provide graceful shutdown,
 * todo: support dynamic configurablity,
 * todo: etc
 *
 * for our exercise we just leave it with encapsulation
 */
public class SolutionCrappyApplicationInitializer {

    public void startAppication() {
        new SolutionCrappy().init();
    }
}
