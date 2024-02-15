package decorator;

public class PanPizza implements Pizza{
    @Override
    public void desc() {
        System.out.println("pan pizza");
    }

    @Override
    public Double cost() {
        System.out.println("add pizza cost");
        return 10d;
    }
}
