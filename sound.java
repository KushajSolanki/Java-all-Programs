public class sound {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();
    }
}
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
