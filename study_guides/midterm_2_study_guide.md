## Midterm 2 Study Guide

__Reminder: Midterm 2 is 12 APR!__

### Software Design
* Why is software design a "wicked" process?
* Essential vs Accidental difficulties
* Minimizing and managing complexity
* What is a subsystem?
  * Should these be loosely or tightly coupled?
  * Should they have high or low cohesion?
* Be able to describe/recognize a code smell
* Top-Down vs Bottom-Up Design
  * Be able to describe
  * Be able to decide which to use for a project
* Understand common architectural patterns
  * Layered Architecture
  * Model-View-Controller
  * n-Tier
  * Client-Server
  * Pipeline
  * Event-Driven
  * Big Ball o' Mud
  
### Object-Oriented Analysis and Design
* UML (Unified Moeling Language)
  * Static vs Dynamic views
  * Class Diagram
    * Generalization
    * Aggregation
    * Composition
  * Sequence Diagram
    * Be able to read
  * SOLID Principles
    * Understand all of them
    * Realize when they are being broken
    * Heuristics vs Laws

### Quality Assurance
* Internal vs External Quality
* Ways to improve quality
  * Testing, pair programming, code reviews, etc
  * Multi-modal reviews
* Limitations of testing

### Working on Legacy and Other People's Code
* When should you modify legacy code?
* Questions to ask before you do so
* Pinning tests
  * What are they?
  * When do you use them?
  * How do they differ from "regular" unit tests?
* Be able to describe what seams are, and find one in code
* Understand change points
* Understand inflection points
* Understand and be able to implement sprout methods
* Understand and be able to implement wrap methods
* TUFs and TUCs

### Integration and the Software Pipeline
* Phased vs incremental vs Continuous integration
  * Benefits / downsides of each
* Integration strategies:
  * Top-down
  * Bottom-up
  * Risk-oriented
  * Feature-oriented
* Understand feature toggles

### Programming With Concurrency
* Why use threads?
* Understand Concurrency vs Parallelism
* Understand the differences between processes and threads
* Be able to create use threading in Java
  * Threads vs Runnables
  * Running
  * Starting
  * Joining
* Synchronization
  * Method level
  * On a lock object
* Data race - be able to diagnose/implement
  * Ways to avoid: synchronization, no shared mutable state
* Deadlock - be able to diagnose/implement
* Livelock - be able to diagnose/implement

### Concurrency in Java
* Understand Atomic variables
  * Be able to use appropriately
* HashMap vs Hashtable
  * Which is thread-safe?
* What are benefits/drawbacks of using thread-safe collections?

### Design Patterns
* Why do we use patterns?
* For each design pattern, be able to recognize/implement
* For each design pattern, understand why it would be used
* Design patterns:
  * Null check
  * Utility
  * Singleton
  * Factory
  * Decorator
  * Pool
  * Iterator
  * Strategy
  * Null Object

### Software Craftsmanship
* Why is it difficult to quantify how good a software engineer is?
* Know the three traits of a Great Programmer
  * Laziness, Impatience, Hubris
* Define and explain intellectual humility
* What is UPOD?
* What is "managing up"?
* Ways of reducing complexity:
  * Pure functions
  * Minimizing deepness
  * Minimizing shared mutable state
  * Using a code style guide
  * Using conventions
  * Short methods
  
### Trade-Offs in Software Engineering
* Be able to make trade-offs using the "cost/benefit" method described in class
* Be able to distinguish between NECESSARY and NICE-TO-HAVE features and quality attributes
* Understand difference in trade-offs in internal quality vs external quality.  Which are preferable?  When?
