package ch03.FootballPlayers;

public class FootballPlayer {
    int no;
    String name;
    boolean inPlay;
    int minutes;
    int numberOfGoals;

    void play(int minutesToPlay){
        minutes += minutesToPlay;
    }

    void score(int goals){
        numberOfGoals += goals;
    }

    void getInfo(){
        System.out.println("Name : " + name + "\n" + "Number : " + no + "\n" + "Total Minute : " + minutes + "\n" + "Total Goal : " + numberOfGoals);

    }
}
