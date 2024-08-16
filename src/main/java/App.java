import java.util.Scanner;
import java.util.Random;

public class App {

    // User to enter move

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Dwayne(Rock), Brendan(Paper), Johnny(Scissors). Select Your Character");

        String character = scanner.nextLine();

        // Dwayne = Rock, Brendan = Paper, Johnny = Scissors
        int compMove = random.nextInt(3);

        String stringCompMove = "";


        switch (compMove){
            case 0:
                stringCompMove = "Dwayne";
                System.out.println("CPU Throws:Dwayne");
                break;
            case 1:
                stringCompMove = "Brendan";
                System.out.println("CPU Throws: Brendan");
                break;
            case 2:
                stringCompMove = "Johnny";
                System.out.println("CPU Throws: Johnny");
        }

        if (character.equals(stringCompMove)){
        System.out.println("Draw");
        } else if (character.equals("Dwayne") && stringCompMove.equals("Brendan")) {
            System.out.println("Player Lose");
        } else if (character.equals("Dwayne") && stringCompMove.equals("Johnny")){
            System.out.println("Player Win");
        } else if (character.equals("Brendan") && stringCompMove.equals("Johnny")){
            System.out.println("Player Lose");
        } else if (character.equals("Brendan") && stringCompMove.equals("Dwayne")) {
            System.out.println("Player Win");
        } else if (character.equals("Johnny") && stringCompMove.equals("Dwayne")) {
            System.out.println("Player Lose");
        } else if (character.equals("Johnny") && stringCompMove.equals("Brendan")){
            System.out.println("Player Lose");


    }






    //Valid move entered check

    //Randomizer element for opponents move

    // Win, Lose, Draw?

    // If Player chose rock,

    //Opponent Rock - Draw
    //Opponent Paper - Player Lose
    //Opponent Scissors - Player Win

    // If Player chose Paper,
    //Opponent Rock - Player Win
    //Opponent Paper - Draw
    //Opponent Scissors - Player Lose

    // If Player chose Scissors,
    //Opponent Rock - Player Lose
    //Opponent Paper - Player win
    //Opponent Scissors - Draw


    //Play again? loop?

    //quit?


}

