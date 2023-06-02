package Interface;

// Interfaces are class templates
// Interfaces define methods for classes by specifying the method name, the return type (or void) and the method arguments (by type and name).
// These method definitions are called signatures
// Because this is a template, the method signatures contain no code.
// Interfaces are used in the discipline of polymorphism.
// Polymorphism allows objects of different classes to be treated as objects of a common superclass. 

// Important points about interfaces
// 1. If a class implements an interface, all of the interface's methods must appear in the class.
// 2. The implements keyword is used when creating a class that is modeled after an interface.

interface Vehicle {
    void model(String string);
    void color(String string);
    void transmission(String string);
}
