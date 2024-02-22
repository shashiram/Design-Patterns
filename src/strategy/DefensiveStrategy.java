package strategy;

public class DefensiveStrategy implements TeamStrategy{
    @Override
    public void play() {
        System.out.println("Playing in defensive mode....");
    }
}
