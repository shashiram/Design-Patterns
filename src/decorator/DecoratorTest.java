package decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Pizza pizza = new PanPizza();

        pizza = new TomatoToppings(pizza);
        pizza = new OnionToppings(pizza);
        System.out.println(pizza.cost());

    }
}
