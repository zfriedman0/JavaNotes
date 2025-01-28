public class Polymorphism {
    /*
     * Polymorphism occurs when we have classes that are related to each other by inheritance.
     * The act of using inherited methods to perform different tasks.
     * Allows us to perform a single action in different ways.
     */
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.animalSound();

        Pig myPig = new Pig();
        myPig.animalSound();

        Dog myDog = new Dog();
        myDog.animalSound();
    }
    
}

class Animal {
    public void animalSound() {
        System.out.println("Amorphous noises from the ether.");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: oui oui");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bojour");
    }
}
