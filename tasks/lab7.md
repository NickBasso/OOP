# Object Oriented Programming - lab #7

_Work duration: 4-8 hours_

## Topic: Abstract classes

### Objectives:
  - Practice with abstract classes
  - Familiarize with method overriding.
  
### Tasks:

  - _Basic Level_ (mark 5 || 6):
    1. Implement the following class hierarchy and define the objects (as explained):

    2. Base class Figure with the following abstract methods - getArea(), getPerimeter() which should return the area and the perimeter of some figure.

    3. Implement the following child classes of Figure - Square, Rectangle, Triangle. (Each one is forced to implement the getArea ad getPerimeter methods).

  __In main: create by a object of each type of Figure and put all of them in a array of Figures.__
    
 - _Medium Level_ (mark 7 || 8):
    1. Create a class FigureController which has a method which takes as parameter a list of Figures and return the one with the biggest area (It means you need first to create a list of figures).

    2. Create another method which does the same but that returns the figure with the biggest perimeter.

    3. In main function call the method from this FigureController and give as parameter the list of figures created in task1 and print in console the result.
    
  - _Advanced Level_ (mark 9 || 10):
    1. Create a new Figure (Circle) without declaring a class separately, directly in main function - using Anonymous class concept. Call and print in console the area and perimeter of this newly object.
    2. Add this circle object to the list of figures from previous task and call again the method from FigureController which returns the biggest area.
 

### Tools & perequisites:
  - IDEs: Intellij IDEA, Eclipse, Netbeans.
  - Programming languages: Java. 

### References:
  - [Intellij IDEA](https://www.jetbrains.com/idea/)
  - [Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
  - [Java language](https://www.tutorialspoint.com/java/)
  - [Java Abstract class](https://www.tutorialspoint.com/java/java_abstraction.htm)
