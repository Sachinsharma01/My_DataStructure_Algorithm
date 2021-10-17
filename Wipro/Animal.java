package Wipro;

public abstract class Animal {
    public abstract void shout();
    public void speak(){
        System.out.println("Animal Speak");
    }
    public Animal() {
        System.out.println("Animal is Created!");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("Dog");
    }
}
class Horse extends Animal {
    @Override
    public void shout() {
        System.out.println("Horse");
    }
    public void run() {
        System.out.println("Horse Run");
    }
    public void speak(){
        super.speak();
    }
    public Horse() {
        this(10);
        System.out.println("Horse is Created!");
    }
    public Horse(int a) {
        System.out.println("Horse : " + a);
    }
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("Cat");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.shout(); // Dynamic method Dispatch
        Animal animal1 = new Horse();
        animal1.shout();
        Horse horse = new Horse();
        horse.run();
        Animal animal2 = new Cat();
        animal2.shout();
    }
}