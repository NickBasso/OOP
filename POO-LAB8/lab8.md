# Object Oriented Programming - lab #8

_Work duration: 4-8 hours_

## Topic: Polymorphism and Interfaces

### Objectives:
  - Practice with polymorphism, (override operation).
  - Familiarize with all rules of method overriding.
  
### Tasks:

  - _Basic Level_ (mark 5 || 6):
    1. Implement the following class hierarchy and define as explained the objects:

    2. Base Class GeometricBody with the following abstract methods - getSurface(), getVolume() which should return the surface and the volume of some figure.

    3. Implement the following child classes of GeometricBody - Cub, Sphere, Parallelepiped. (Each one is forced to implement the getSurface ad getVolume methods).

  __In main: create by a object of each type of GeometricBody and put all of them in a array of GeometricBody's.__
    
 - _Medium Level_ (mark 7 || 8):
    1. Create a class GeometricBodyController which has a method which gets as parameter a list of GeometricBody's and return the one with the biggest Volume.

    2. Create another method which does the same but that gives the body with the biggest Surface.

    3. In main call the method from this GeometricBodyController and give as parameter the list of bodies created in task1 and print the result in console.
    
  - _Advanced Level_ (mark 9 || 10):
    1. Change the abstract class GeometricBody to a interface and resolve any errors if occured.


### Tools & perequisites:
  - IDEs: Intellij IDEA, Eclipse, Netbeans.
  - Programming languages: Java. 

### References:
  - [Intellij IDEA](https://www.jetbrains.com/idea/)
  - [Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
  - [Java language](https://www.tutorialspoint.com/java/)
  - [Java Interfaces](https://www.tutorialspoint.com/java/java_interfaces.htm)
