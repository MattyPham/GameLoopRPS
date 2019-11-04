import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String playerpoint1;
        String playerpoint2;
        int p = 0;
        int pp = 0;
        System.out.println("Let's play Rock paper scissors!");
        System.out.println("Best of three.");
        System.out.println("Please choose one of the following");
        System.out.println("Rock");
        System.out.println("Paper");
        System.out.println("Scissors");

        for (int i = 0;i<9;i++){
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Player's Score    :     " + p + ".");
            System.out.println("Computer's Score  :     " + pp + ".");
            System.out.println("--------------------------------------------------------------------------------");
            if (p == 3)
            {
                System.out.println("Congratulations! You won this game of RPS!");
                break;
            }
            if (pp == 3){
                System.out.println("It looks like I have won this game of RPS, good game to you.");
                break;
            }

            if (i > 0) {
                System.out.println("Let's play again!");
            }
            System.out.println("You play your move first.");

            String name = scan.nextLine();
            if (name.equalsIgnoreCase("Rock")) {
                int computerChoice = (int) (Math.random() * 3) + 1;
                if (computerChoice == 1) {
                    System.out.println("I play rock!");
                    p++;
                    pp++;

                    System.out.println("It's a tie");
                } else if (computerChoice == 2) {
                    System.out.println("I choose scissors!");
                    p++;
                    System.out.println("Aw, looks like you won.");
                } else if (computerChoice == 3) {
                    System.out.println("I choose paper!");
                    pp++;
                    System.out.println("Ha, I am victorious this time around.");
                }
            }

            if (name.equalsIgnoreCase("Scissors")) {
                int computerChoice = (int) (Math.random() * 3) + 1;
                if (computerChoice == 1) {
                    System.out.println("I choose rock!");
                    pp++;
                    System.out.println("I crush your scissors thus, I have won.");
                } else if (computerChoice == 2) {
                    System.out.println("I choose scissors!");
                    p++;
                    pp++;
                    System.out.println("Scissors can't cut through their own kind, this is a tie.");
                } else if (computerChoice == 3) {
                    System.out.println("I choose paper!");
                    p++;
                    System.out.println("You have cut me down into shreds of paper, this is my loss..");
                }
            }

            if (name.equalsIgnoreCase("Paper")) {
                int computerChoice = (int) (Math.random() * 3) + 1;
                if (computerChoice == 1) {
                    System.out.println("I choose rock!");
                    p++;
                    System.out.println("Looks like I've been mauled by your paper, this is your win.");
                } else if (computerChoice == 2) {
                    System.out.println("I choose scissors!");
                    pp++;
                    System.out.println("My scissors ripped through your paper, this is my win.");
                } else if (computerChoice == 3) {
                    System.out.println("I choose paper!");
                    p++;
                    pp++;
                    System.out.println("Well paper against paper is useless, its a tie!");
                }
            }

        }

    }
}



