package abstractfactory;

public class MercedesFactory implements CarFactory{
    @Override
    public Car createCar(String carType) {
        if (carType.equals("C"))
            return new AClass();
        if (carType.equals("S"))
            return new SClass();
        return null;
    }
}
