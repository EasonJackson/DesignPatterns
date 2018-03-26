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
    - [Decorator Pattern](#decorator-pattern)
- Behavioral Design Patterns
    - [Template Method Pattern](#template-method-pattern)
    - [Mediator Pattern](#mediator-pattern)
    - [Chain of Responsibility Pattern](#Chain-of-Responsibility-Pattern)
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

Singleton pattern allows instantiation of only one instance of a class in the JVM.

- Eager initialization

    Using ```private static final Singleton instance``` and ```private Constructor()``` can prevent instantiating another instance.

    Using ```public getInstance() {return instance;}``` allows retrieving the same instance every time it is needed.

- Static block initialization
	
	Both eager and static block initializations create a new private of the class during the loading stage. For static block initialization, it add an opportunity for exception handling during the initialization of the instance.

- Lazy Initialization

	Eager and static block initialize the instance before using it. Opposite to this, lazy initialization creates the instance right before some program needs it. It is implemented just by moving the ```new Constructor()``` into the ```getInstance()``` method. The first time it checks whether the instance is ```null``` and then create the instance. Later it will return the already created instance.

- Thread Safe Singleton

	Simply one can just add ```synchronized``` to the ```getInstance()``` method. The performance is reduced by the synchronized block.

- Bill Pugh Singleton Implementation

	Bill Pugh singleton uses a private static inner class to hold the singleton instance.

- Using Reflection to destroy Singleton Pattern

	Using reflection, one can modify the accessibility of constructor ```constructor.setAccessible(true)```.

- Enum Singleton

	To solve problems associated with reflection, try to use Enum to provide singleton. Enum hides constructor from clients, and is globally accessible. Enum does not imply lazy initialization.

- Serialization and Deserialization

	Override ```readResolve()``` method.

- Cloneable

	Override ```clone()``` method. ```clone()``` method throws ```CloneNotSupportedException```

Some implementations in Java frameworks:

1. Spring beans are by default singletons (per application)

[Example of singleton](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/Singleton)

---

#### Factory Pattern

Factory pattern transfers the responsibility of instantiation new instances from the clients' end, to the factory class. Factory pattern usually contains a method ```getProduct(Params)```, which return an instance required by the ```Params```. The goal of a factory pattern is NOT to call ```new Constructor()``` on initializing of each object, instead using the uniform interface.

Factory pattern is especially useful in a few cases. When there is a lot of subclasses and it would be very inconvenient to have every class ready on the clients' end. In such case, using factory pattern allows the clients to generate different subclasses instance with an uniform api ```getProduct(Params)```. The method could also be designed as a static method, as ```Factory.getProduct(Params)```.

In another case when the designer wants to hide the implementation details of constructors from the clients, it would also be very convenient to use factory pattern to fulfill the requirement. Using a ```private``` modifier on methods other than ```getProduct()``` will encapsulate the details of implementations of instantiation of concrete instances.

In a third situation when the initialization of an instance may involve initializing other objects. These creating methods would be trivial to clients, and factory method could help abstract the creation process.

```Params``` can be String, Integer or other types of classes that ```getProduct``` can use to differentiate which type of object to return. A good practice is using ```Enum``` to remove the chance of raising parameter exceptions.

Some implementations in Java classes:

1. java.util.Calendar, ResourceBundle and NumberFormat ```getInstance()``` methods uses Factory pattern.
    
2.  ```valueOf()``` method in wrapper classes like Boolean, Integer etc.

Strategy pattern is very commonly combined with factory pattern: based on the input params the factory can return the correct strategy clients' want.

[Example of factory pattern](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/FactoryPattern)

---

#### Abstract Factory Pattern

Abstract factory pattern is similar to the factory pattern. The abstract factory pattern abstract the concrete factories with a uniform API from them.

Abstract factory uses an interface ```interface AbstractFactory``` with an abstract method  ```AbstractProductClass getProduct()```. All the concrete factories must implement the ```AbstractFactory```, which means they can (and have to) override and implement their own creation methods. The return product must be a subclass instance of ```AbstractProductClass```.

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

```Builder``` class has a public modifier allowing client program to call it. The constructor is therefore set private to prevent access from client.

[Example of builder pattern](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/Builder)

---

#### Prototype Pattern

Prototype pattern aims to make it easy for object creation. When the cost of initialing an instance is large, and all the instances have the same or a similar property, prototype can quickly duplicate the original instance. It works on classes that implements ```Clonable``` interface in Java.

A shallow copy or a deep copy of the prototype instance are optional in the pattern, depend on how the implementation should work. For most cases where an "individual" object is required, a deep copy is necessary to avoid corrupting data. However a deep copy will apparently cost more memory in that case.

[Example of prototype pattern](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/Prototype)

---

### Structural

#### Adapter Pattern

Adapter pattern aims to glue two unrelated interfaces together so that classes and methods in one interface can be converted for usage in another interface. Adapter is necessary between two ready-built interfaces whose methods are not easy to be modified.

Adapter is defined as an interface, in which all the prototype methods are defined (as contracts between two interfaces it tries to connect). It can also be defined as an abstract class, however a class adapter cannot extend two classes at the same time.

There are two different implementations of adapter pattern:
1. Class adapter, a class extends one of the interfaces/classes, and implements the adapter interfaces meanwhile.
2. Object adapter, a class implements the adapter interfaces, and contains an instance as its component of the interfaces/classes being glued.

One of the most common example is the plug-in converter.

[Example of adapter patter](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/Adapter)

---

#### Composite Pattern

Composite patterns represents a part-whole hierarchy. When a collection of components can compose a whole unit, and there are lots of common behaviors of these components, a composite is used to combine those components. The unified structure can also be treated as "one" component.

In a composite pattern there usually exist three object:

1. A base component, which is either an interface or an abstract class used to represent the basic common behaviors in the composite.
2. A leaf component, as the unit element in the composite structure. A leaf component does not have any components.
3. Composite, which is consisted of leaf components and other components. A composite implements or extends the base component class/interface, which makes it possible to have a nested composite as its component.

- Traverse with an iterator.

- Transparency vs safety.

    Methods defined in the interface will be inherited by all subclass, and this could be dangerous for some subclass who do not need nor can provide proper behaviors.
    
    Methods defined only in composites will remove the risky behavior of the leaf components. In this case transparency is traded off with safety.
    
[Example of composite pattern](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/Composite)
    
---

#### Proxy Pattern

Well defined, a proxy pattern

 > Provide a surrogate or placeholder for another object to control access to it.
 
 It constraints the privilege of clients' program to execute some methods: admin privilege versus user privilege.

[Example of proxy pattern](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/ProxyPattern)

---

#### Flyweight Pattern

Flyweight pattern is design for reduce the memory consumption new objects in a program.

Three typical cases that require flyweight pattern:

1. The number of objects need to be created in a program is huge.
2. Object together can consume large memory.
3. The time complexity of initializing a new object is high.

Flyweight pattern try to reuse the ready objects that is maintained in the data structures, as cached objects. Make the objects sharable could reduce the memory cost in a program, in such a case the intrinsic attributes of these objects are the same, while the extrinsic attributes are subjected to changes.

Flyweight pattern is important for memory resource limited device, such as mobile devices and embedded systems. One example of using flyweight pattern is the string pool in Java. Java maintains a collection of string literals in heap, containing all the literals that are created in the program. Creating new string references straightly with "" will be pointing to the existing object in the heap, if not applicable, JVM will create a new one and put it into the heap then let the reference pointing to it. As strings in Java are immutable objects, sharing of them between different processes/threads will not generated risky behaviors. Opposite to this case, Java also provides another optional of creating string objects that are not in the string pool but are treated the same as other objects. This is done through calling ```new String()``` constructor.

[Example of flyweight pattern](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/Flyweight)

---

#### Facade Pattern

Facade pattern provides a wrapping up interface of all the methods in the entire subsystem. It serves like a service center where the receptionist can hook you up to the target department you are looking for. 

Facade pattern tries not to hide the details of behaviors from the clients. It is an optional design pattern from the aspect of clients, but in practice is a good optional for clients to access all the methods when the subsystem gets growing over complex.

To subsystem, the facade object will look very much like a switcher, and it should not rely on the dependency of facade interface at all.

The facade would also be on top of a hierarchical interfaces.

Factory pattern is used together with facade pattern to provide clients a better interface.

[Example of facade pattern](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/Facade)

---

#### Bridge Pattern

Bridge pattern is designed for

> Decouple an abstraction from its implementation so that the two can vary independently.

When there are hierarchies of implementations in both interfaces, the combinations of concrete classes can grow exponentially fast. In such a case the maintaining of each implementation can be ridiculously difficult.

To deal with that case, it is very common to have one of the interface maintaining a protected instance variable of the other interface, which will serves as a concrete implementation instance later. In this way a "bridge" is built between such two interfaces.

[Example of bridge pattern](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/Bridge)

---

#### Decorator Pattern

A decorator adds on features to or change the behavior of a basic class at runtime. This provides the power of boosting a class without modifying its code.

Decorator pattern is implemented as a composite or inheritance of the root type class. In the class definition, a decorator holds an instance of the basic class. It wraps up the method of the basic class via providing its new method with the same signature, which makes the clients' program think they are using the same method as the basic type.

As a decorator itself implements the root type, the instance it generates and returns will have overridden methods of the super class type. A decorator also can be an interface with many different concrete decorator implementations.

Decorator pattern is used a lot in Java IO classes, such as ```FileReader```, ```BufferedReader```.

[Example of decorator pattern](https://github.com/EasonJackson/DesignPatterns/tree/master/src/com/eason/JavaPatterns/Decorator) 

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

## Author

* **EasonJackson** - *@2017* 
