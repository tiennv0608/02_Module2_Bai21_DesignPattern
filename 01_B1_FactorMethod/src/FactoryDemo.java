public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.getAnimal("feline");
        System.out.println("animal1 sound: " + animal1.makeSound());
        Animal animal2 = animalFactory.getAnimal("ScoobyDoo");
        System.out.println("animal2 sound: " + animal2.makeSound());
    }
}
