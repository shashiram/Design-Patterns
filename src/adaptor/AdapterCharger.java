package adaptor;

public class AdapterCharger implements Chargeable {

    public Charger charger;

    AdapterCharger(Charger charger){
        this.charger=charger;
    }

    @Override
    public void setMobName(String mobName) {
        charger.assignMobile(mobName);
    }

    @Override
    public void charge() {
        charger.supplyCharge();
    }
}
