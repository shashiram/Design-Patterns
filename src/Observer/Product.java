package Observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{

    public String productName;
    public List<Observer> observers=new ArrayList<Observer>();

    public Boolean isAvailable;


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObserver() {
        if (isAvailable){
            System.out.println("Notifying all customers ");
            observers.forEach(x-> x.update(productName));
        }

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
