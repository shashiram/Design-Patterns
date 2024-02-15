package observer;

public class ObserverTest {
    public static void main(String[] args) {

        Customer customer1=new Customer();
        customer1.setName("Shashi");

        Customer customer2=new Customer();
        customer2.setName("Ram");

        Product product=new Product();
        product.setProductName("IPhone 15");
        product.setAvailable(false);

        product.registerObserver(customer1);
        product.registerObserver(customer2);

        // after some day later, once product is available

        product.setAvailable(true);

        product.notifyObserver();

        product.removeObserver(customer2);

        product.notifyObserver();

        System.out.println("Done!");
    }
}
