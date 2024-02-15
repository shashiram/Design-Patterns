package abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        CarFactory mercedesCarFactory=CarFactoryProducer.getCarFactory("mercedes");

        Car sclass=mercedesCarFactory.createCar("S");

        sclass.drive();

    }
}
