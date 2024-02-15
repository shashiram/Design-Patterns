package factory;

public class AnimalFactory {

    public static Animal createAnimal(String type) {
        if(type==null)
            return null;
        else if (type.equals("dog")) {
            return new Dog();
        } else if (type.equals("cat")) {
            return new Cat();
        } else return null;
    }
}
