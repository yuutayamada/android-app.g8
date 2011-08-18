# Android App in Scala

[giter8](http://github.com/n8han/giter8) template to get an Android
sbt project up and running in a matter of seconds

## How to use

To use this template, g8 needs to be installed first. Read g8's [readme](http://github.com/n8han/giter8#readme).

All done? Now fire up your favorite shell and enter

    g8 philcali/android-app
    cd <name-of-app>
    sbt update
    sbt compile

## What you get

Your android sbt project contains 2 subprojects:

* MainProject
    * generated AndroidManifest.xml
    * MainActivity.scala (the "hello world" activity)
* TestProject
