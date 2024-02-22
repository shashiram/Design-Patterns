package strategy;

public abstract class Team {
    TeamStrategy strategy ;
    String name ;

    Team(String name){
        this.name=name;
    }
    void playGame(){
        System.out.print("team info :"+this.name+ " ");
        this.strategy.play();
    }

    public void setStrategy(TeamStrategy strategy) {
        this.strategy = strategy;
    }
}
