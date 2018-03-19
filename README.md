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
	
	Both eager and static block initializations create a new private of the class during the loading stage. For static block initialization, it add an opportunity for exception handling during the initialiation of the instance.

- Lazy Initialization

	Eager and static block initialize the instance before using it. Opposite to this, lazy initialization creates the instance right before some program needs it. It is implemented just by moving the ```new Constructor()``` into the ```getInstance()``` method. The first time it checks whether the instance is ```null``` and then create the instance. Later it will return the already created instance.

- Thread Safe Singleton

	Simply one can just add ```synchronized``` to the ```getInstance()``` method. The performance is reduced by the sychronized block.

- Bill Pugh Singleton Implementation

	Bill Pugh singleton uses a private static inner class to hold the singleton instance.

- Using Reflection to destroy Singleton Pattern

	Using reflection, one can modify the accessability of constructor ```constructor.setAccessible(true)```.

- Enum Singleton

	To solve problems associated with reflection, try to use Enum to provide singleton. Enum hides constructor from clients, and is globly accessible. Enum does not imply lazy initialation.

- Serialization and Deserialization

	Override ```readResolve()``` method.

- Clonable

	Override ```clone()``` method. ```clone()``` method throws ```CloneNotSupportedException```


#### Factory Pattern
#### Abstract Factory Pattern
#### Builder Pattern
#### Prototype Pattern

---

### Structural

#### Adapter Pattern
#### Composite Pattern
#### Proxy Pattern
#### Flyweight Pattern
#### Facade Pattern
#### Bridge Pattern
#### Decorator Pattern

---

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
