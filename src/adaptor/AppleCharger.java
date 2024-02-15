package adaptor;

public class AppleCharger implements Chargeable {
    private String mobName;
    @Override
    public void setMobName(String mobName) {
        this.mobName=mobName;
    }

    @Override
    public void charge() {
        System.out.println(mobName + " charging..");
    }
}
