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

Some implementations in Java frameworks:

1. Spring beans are by default singletons (per application)

[Example of singleton](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/Singleton)

---

#### Factory Pattern

Factory pattern transfers the resposibility of instatiation new instances from the clients' end, to the factory class. Factory pattern usually contains a method ```getProduct(Params)```, which return an instance required by the ```Params```. The goal of a factory pattern is NOT to call ```new Constructor()``` on initializing of each object, instead using the uniform interface.

Factory pattern is especially useful in a few cases. When there is a lot of subclasses and it would be very inconvinient to have every class ready on the clients' end. In such case, using factory pattern allows the clients to generate different subclasses instance with an uniform api ```getProduct(Params)```. The method could also be designed as a static method, as ```Factory.getProduct(Params)```.

In another case when the designer wants to hide the implementation details of constructors from the clients, it would also be very convinient to use factory pattern to fulfill the requirement. Using a ```private``` modifier on methods other than ```getProduct()``` will encapsulate the details of implementations of instatiation of concrete instances.

In a third situation when the initialization of an instance may involve initializing other objects. These creating methods would be trivial to clients, and factory method could help abstract the creation process.

```Params``` can be String, Integer or other types of classes that ```getProduct``` can use to differentiate which type of object to return. A good practice is using ```Enum``` to remove the chance of raising parameter exceptions.

Some implementations in Java classes:

1. java.util.Calendar, ResourceBundle and NumberFormat ```getInstance()``` methods uses Factory pattern.
    
2.  ```valueOf()``` method in wrapper classes like Boolean, Integer etc.

[Example of factory pattern](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/FactoryPattern)

---

#### Abstract Factory Pattern

Abstract factory pattern is similar to the factory pattern. The abstract factory pattern abstract the concrete factories with a uniform API from them.

Abstract factory uses an interface ```interface AbstractFactory``` with an abstracte method  ```AbstractProductClass getProduct()```. All the concrete factories must implement the ```AbstractFactory```, which means they can (and have to) override and implement their own creation methods. The return product must be a subclass instance of ```AbstractProductClass```.

[Example of abstract factory pattern](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/AbstractFactoryPattern)

---

#### Builder Pattern

Builder pattern is used to solve problems for initialization instances with too many attributes, or with some optional attributes.

Considering the telescoping constructor pattern, the constructor requires a great amount of parameters provided with a certain order. As a set of parameters will contain duplicated types, or types that are not well explained with the constructor, it will be hard to organize the input from the clients' side.

For instance, a constructor ```MyConstructor(int p1, int p2, int p3, int p4)``` takes four ```int``` type parameters. When creating an instance with such a constructor, it will be hard for a client to understand or remember what is the meaning of each param. A miss-ordered input will not cause trouble for the compiler, but could raise issues during runtime.

A alternative is to use JavaBeans. It allows inconsistency in the order of setting up all the attributes of an instance. However it comes with another disadvantage that
> A JavaBean maybe in an inconsistent state partway through its construction <Effective Java, by Joshua Bloch>.

Not all the attributes are set at the same time when the instance is initialized, and immutability of objects is not guaranteed.

Builder pattern is preferably implemented with a static nested class ```Builder```. It includes all the required attributes in the constructor of ```Builder```, while for all the other optional attributes, it provides set method with a self-explained signature.  Finally the nested ```Builder``` class also has a method ```build()``` which returns the same instance it generates.

```Builder``` class has a public modifier allowing client program to call it. The constructor is therefore set private to prevent accessment from client.

[Example of builer pattern](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/Builder)

---

#### Prototype Pattern

Prototype pattern aims to make it easy for object creation. When the cost of initializating an instance is large, and all the instances have the same or a similar property, prototype can quickly duplicate the original instance. It works on classes that implements ```Clonable``` interface in Java.

A shallow copy or a deep copy of the prototype instance are optional in the pattern, depend on how the implementation should work. For most cases where an "individual" object is required, a deep copy is necessary to avoid corrupting data. However a deep copy will apparently cost more memory in that case.

[Example of prototype pattern](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/Prototype)

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
