import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 8;
        int finals = 0;
        boolean playagain = true;
        System.out.println("Welcome to Number Guess Game....");
        System.out.println("Hey, you have " + chances + " chances to win the game");

        while (playagain) {
            int rand = getrandN(1, 100);
            boolean guess = false;

            for (int i = 0; i < chances; i++) {
                System.out.println("Enter your guess:");
                int user = sc.nextInt();

                if (user == rand) {
                    guess = true;
                    finals += 10;
                    System.out.println("Your guess is correct!");
                    break; // Exit loop after correct guess
                } else if (user > rand) {
                    System.out.println("You have entered too high a number!!");
                } else {
                    System.out.println("You have entered too low a number!!");
                }
            }

            if (!guess) {
                System.out.println("Sorry! You lost. The number was " + rand);
            }

            System.out.println("Your final score is: " + finals);
            System.out.println("Do you want to play again? (y/n)");

            // Consume the newline character left by nextInt()
            sc.nextLine();
            String input = sc.nextLine();
            playagain = input.equalsIgnoreCase("y");
        }
    }

    public static int getrandN(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
