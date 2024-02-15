package observer;

public class Customer implements Observer{
    public String name;
    @Override
    public void update(String productName) {
        System.out.println("Hey "+ name + " , "+productName+" is available now ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
