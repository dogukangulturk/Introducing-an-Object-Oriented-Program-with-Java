package FootballPlayers;

public class FootballPlayerTest {
    public static void main(String[] args) {
        FootballPlayer alex = new FootballPlayer();
        alex.no = 10;
        alex.name = "Alex de Souza";
        alex.minutes = 0;
        alex.inPlay = true;
        alex.numberOfGoals = 0;

        alex.play(90);
        alex.score(3);

        System.out.println("Number of goals Alex scored : "
        + alex.numberOfGoals );

        System.out.println("Alex played totaly : "
        +alex.minutes + " so far.");

        alex.getInfo();

    }
}
