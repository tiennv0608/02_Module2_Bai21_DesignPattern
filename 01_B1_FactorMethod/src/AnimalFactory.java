public class AnimalFactory {
    public Animal getAnimal(String type){
        if ("ScoobyDoo".equals(type)){
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
