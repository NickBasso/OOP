# Object Oriented Programming - lab #2

_Work duration: 4-8 hours_

## Topic: Object instantiations via constructors, basic data structures

### Objectives:
  - Familiarize with object constructions.
  - All side effects regarding constructors in Java.
  - Practice with Queue.
  
### Tasks:

  - _Basic Level_ (mark 5 || 6):
    - Create a program, where you should instantiate 3 objects of Box type (which should have the following instance variables -> height, width and depth), via its constructor in 3 different ways: 

    1. Without parameters (all the instance variables should have default value 1)
    2. With 1 parameter (all the instance variables should have same value)
    3. With 3 parameters (for each instance variable)
    
 - _Medium Level_ (mark 7 || 8):
    - Create a class Queue and instantiate 2 objects of this type. Each queue should have as state the number of elements from it and can be created via constructors with and without parameter. If it is created with parameter, then it should have that parameter value maximum size, otherwise it should not have that limitation.
    
    You should be able to add to queue via a `queue.push(Type value);` method. Also You should be able to extract the items from queue via `queue.pop();` method.
    
    The rule for push and pop to queue you should consider from Data Structures course or find somewhere in web, the rule of `FIFO`.
    
    In the program after you create the queues (with param and without), add by 3 values to queue and then extract last value from each of them and print in console.
    
  - _Advanced Level_ (mark 9 || 10):
    - Implement two methods for surface area and volume calculation of a box and use it on a box created with 3 different instance variables. Print the results in console.
    
    - In class Queue add a method for that checks if the object is empty and one that checks if the object is full (in case queue has no parameters, it should say it is never full, otherwise it should check the number of elements compared to the queue size). Also use these methods in a program and print the results in console.

### Tools & perequisites:
  - IDEs: Intellij IDEA, Eclipse, Netbeans.
  - Programming languages: Java. 
  - Frameworks and technologies: -.


### References:
  - [Intellij IDEA](https://www.jetbrains.com/idea/)
  - [Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
  - [Java language](https://www.tutorialspoint.com/java/)
  - [Java Constructors](https://www.tutorialspoint.com/java/java_constructors.htm)
  
