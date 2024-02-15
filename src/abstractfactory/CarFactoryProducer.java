package abstractfactory;

public class CarFactoryProducer {

    public static CarFactory getCarFactory(String factoryType){
        if(factoryType.equals("audi"))
            return new AudiFactory();
        if(factoryType.equals("mercedes"))
            return new MercedesFactory();

        return null;
    }
}
