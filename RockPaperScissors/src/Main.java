import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] rps = {"r","p","s"};

        while (true)
        {
            String computerMove = rps[random.nextInt(rps.length)];
            String playerMove;

            while (true)
            {
                System.out.print("Please enter your move (r-p-s):");
                playerMove = scanner.nextLine();

                if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s"))
                {
                    break;
                }

                System.out.println(playerMove + " is not a valid move!");
            }

            System.out.println("Computer played: "+computerMove);

            if(playerMove.equals(computerMove))
            {
                System.out.println("The game was a tie");
            }
            else if(playerMove.equals("r") )
            {
                if(computerMove.equals("p"))
                    System.out.println("You lose!");
                else if(computerMove.equals("s"))
                    System.out.println("You win!");
            }
            else if(playerMove.equals("p") )
            {
                if(computerMove.equals("r"))
                    System.out.println("You win!");
                else if(computerMove.equals("s"))
                    System.out.println("You lose!");
            }
            else if(playerMove.equals("s"))
            {
                if(computerMove.equals("r"))
                    System.out.println("You lose!");
                else if(computerMove.equals("p"))
                    System.out.println("You win!");
            }

            System.out.println("Play again? (y/n): ");
            String playAgain = scanner.nextLine();

            if(!playAgain.equals("y"))
            {
                break;
            }

            scanner.close();
        }
    }
}