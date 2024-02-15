package decorator;

public class OnionToppings extends Toppings{

    OnionToppings(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public void desc() {

    }

    @Override
    public Double cost() {
        System.out.println("add onion toppings cost");
        return pizza.cost()+1.5;
    }
}
