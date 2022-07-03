import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {  
    
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      //List and random choice for computer move  
      String[] rps = {"rock", "paper", "scissors"};
      String computerMove = rps[new Random().nextInt(rps.length)];
      
      String playerMove;
      
      while(true) {
        System.out.println("Please enter your choice (rock, paper, or scissors)");
        playerMove = scanner.nextLine();
        if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {
          break;
        }
        System.out.println(playerMove + " is not a valid move.");
      }
      // Check the game outcome
      System.out.println("Computer played: " + computerMove);
      //Check if the game is a tie
      if (playerMove.equals(computerMove)) {
        System.out.println("Its a tie!");
      }
      else if (playerMove.equals("rock")) {
        if (computerMove.equals("paper")) {
          System.out.println("You lose!");
          
        } else if (computerMove.equals("s")) {
          System.out.println("You win!");
        }
      }
      
      else if (playerMove.equals("paper")) {
        if (computerMove.equals("rock")) {
          System.out.println("You win!");
          
        } else if (computerMove.equals("scissors")) {
          System.out.println("You lose!");
        }
      }
      
      else if (playerMove.equals("scissors")) {
        if (computerMove.equals("paper")) {
          System.out.println("You win!");
          
        } else if (computerMove.equals("rock")) {
          System.out.println("You lose!");
        }
      }
      // PLay again option
      System.out.println("Play again? (y/n)");
      String playAgain = scanner.nextLine();
      
      if (!playAgain.equals("y")) {
        break;
      }
    }
    scanner.close();
  }
}
;