# Intro

We're going to cover two kinds of testing: unit and component

They exist in the context of the Testing Pyramid
![Image of Testing Pyramid](doc/pyramid.png)

A **Unit Test** validates a single assumption about a behavior, by isolating a unit of expected inputs and outputs (plus any side-effects).

A **Component Test** will also isolate inputs on a piece of code, but allow that code to run through the boundaries of the subsystem (e.g. if your subsystem uses a database, it will hit a test-localized copy of the database)

References:
http://martinfowler.com/bliki/TestPyramid.html
http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata

# Pre-requisites

You should have the following installed:
sbt

# Basics - Unit Testing

All right, let's look at an example.

Our first example is the scala class that needs testing is "Basic" found at src/main/scala/com/meetup/Basic.scala

The corresponding test is in the identical package in the typical Maven folder structure for unit tests:
src/main/scala/com/meetup/BasicTest.scala
(besides being in same package, note the naming convention of the file)

The solution file is at:
src/main/scala/com/meetup/SolutionBasicTest.scala

The way you run the test is like this, at the root of the project:
```
# to run this test only:
sbt test-only com.meetup.BasicTest

# to run all unit tests in this project:
sbt test 
```
