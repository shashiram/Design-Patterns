package strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        TeamStrategy def=new DefensiveStrategy();
        TeamStrategy att=new AttackingStrategy();

        Team teamIndia=new TeamIndia("india");
        Team teamBrazil=new TeamBrazil("brazil");

        teamBrazil.setStrategy(def);
        teamIndia.setStrategy(att);

        teamIndia.playGame();
        teamBrazil.playGame();

        System.out.println("change strategy..");
        teamBrazil.setStrategy(att);
        teamIndia.setStrategy(def);

        teamIndia.playGame();
        teamBrazil.playGame();



    }
}
