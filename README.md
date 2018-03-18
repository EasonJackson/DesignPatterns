# Design Patterns in Java

A design pattern learning memo.


---
## List
- Creational Design Patterns
    - [Singleton Pattern](#singleton-pattern)
    - [Factory Pattern](#factory-pattern)
    - [Abstract Factory Pattern](#abstract-factory-pattern)
    - [Builder Pattern](#builder-pattern)
    - [Prototype Pattern](#prototype-pattern)
- Structural Design Patterns
    - [Adapter Pattern](#adapter-pattern)
    - [Composite Pattern](#composite-pattern)
    - [Proxy Pattern](#proxy-pattern)
    - [Flyweight Pattern](#flyweight-pattern)
    - [Facade Pattern](#facade-pattern)
    - [Bridge Pattern](#bridge-pattern)
    - [Decorator Pattern](@decorator-pattern)
- Behavioral Design Patterns
    - [Template Method Pattern](#template-method-pattern)
    - [Mediator Pattern](#mediator-pattern)
    - [Chain of Responsibility Pattern](#chain-of-resposibility-pattern)
    - [Observer Pattern](#observer-pattern)
    - [Strategy Pattern](#strategy-pattern)
    - [Command Pattern](#command-pattern)
    - [State Pattern](#state-pattern)
    - [Visitor Pattern](#visitor-pattern)
    - [Interpreter Pattern](#interpreter-pattern)
    - [Iterator Pattern](#iterator-pattern)
    - [Memento Pattern](#memento-pattern)

---
## Details

---

### Creational

#### Singleton Pattern

Singleton pattern allows instatiation of only one instance of a class in the JVM.

- Eager initialization
Using ```private static final Singleton instance``` and ```private Constructor()``` can prevent instatiating another instance.
Using ```public getInstance() {return instance;}``` allows retriving the same instance every time it is needed.

- Static block initialization
- Lazy Initialization
- Thread Safe Singleton
- Bill Pugh Singleton Implementation
- Using Reflection to destroy Singleton Pattern
- Enum Singleton
- Serialization and Singleton

#### Factory Pattern
#### Abstract Factory Pattern
#### Builder Pattern
#### Prototype Pattern

### Structural

#### Adapter Pattern
#### Composite Pattern
#### Proxy Pattern
#### Flyweight Pattern
#### Facade Pattern
#### Bridge Pattern
#### Decorator Pattern

### Behavioral

#### Template Method Pattern
#### Mediator Pattern
#### Chain of Responsibility Pattern
#### Observer Pattern
#### Strategy Pattern
#### Command Pattern
#### State Pattern
#### Visitor Pattern
#### Interpreter Pattern
#### Iterator Pattern
#### Memento Pattern

## Authors

* **EasonJackson** - *@2017* 
