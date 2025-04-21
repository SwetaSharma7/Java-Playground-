// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Polymorphism {
    public static void main(String[] args) {
        Animal a;  // Parent class reference

        a = new Dog();   // Dog object
        a.makeSound();   // Output: Dog barks

        a = new Cat();   // Cat object
        a.makeSound();   // Output: Cat meows
    }
}
