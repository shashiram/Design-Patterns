package adaptor;

public class AdapterTest {
    public static void main(String[] args) {
        Chargeable appleCharger=new AppleCharger();
        appleCharger.setMobName("iphone 6s");

        ChargerUtils.doCharge(appleCharger);

        System.out.println("----- Samsung charger----- ");

        Charger samsungCharger=new SamsungCharger();

        Chargeable adapterCharger=new AdapterCharger(samsungCharger);
        adapterCharger.setMobName("Galaxy Note 3");
        ChargerUtils.doCharge(adapterCharger);

    }
}
