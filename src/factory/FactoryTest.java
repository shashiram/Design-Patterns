package factory;

public class FactoryTest {

    public static void main(String[] args) {
        String type=args.length==0?null:args[0];
        Animal animal=AnimalFactory.createAnimal(type);
        if(animal!=null)
            animal.sound();
        else
            System.out.println("no animal found...");
    }
}
