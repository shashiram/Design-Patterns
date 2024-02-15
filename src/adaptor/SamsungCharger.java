package adaptor;

public class SamsungCharger implements Charger{
    private String mobName;
    @Override
    public void assignMobile(String mobName) {
        this.mobName=mobName;
    }

    @Override
    public void supplyCharge() {

        System.out.println(this.mobName + " charging...");
    }
}
