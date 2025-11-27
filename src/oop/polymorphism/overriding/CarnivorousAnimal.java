package oop.polymorphism.overriding;

public class CarnivorousAnimal extends Animal{

    @Override
    public void eat() {

        System.out.println("Eating Flesh");
    }
}
