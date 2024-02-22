package strategy;

public class AttackingStrategy implements TeamStrategy{
    @Override
    public void play() {
        System.out.println("playing in attacking mode....");
    }
}
