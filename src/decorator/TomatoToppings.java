package decorator;

public class TomatoToppings extends Toppings{


    TomatoToppings(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public void desc() {

    }

    @Override
    public Double cost() {
        System.out.println("add tomato toppings cost");
        return this.pizza.cost()+2.5;
    }
}
