package abstractfactory;

public class AudiFactory implements CarFactory{
    @Override
    public Car createCar(String carType) {

        if (carType.equals("A3"))
            return new AudiA3();
        if (carType.equals("A5"))
            return new AudiA5();
        return null;
    }
}
