/*
 * MAGIC 8-BALL
 * This program belongs to Eduardo A. Sosa Torres
 * Username: WakkoTheWarner
 * GitHub: https://github.com/wakkoTheWarner
 * Created in 8/3/2021
 * Version: 1.0
 */

import java.util.Scanner;
public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // variables
        String repeat = "no";

        // code
        System.out.print("Would you like to shake the Magic-8-Ball? ");
        repeat = scanner.next();
        System.out.println("");
        while (repeat.equalsIgnoreCase("yes")) {
            startingProgram();
            System.out.println("");
            System.out.print("Would you like to shake the Magic-8-Ball again? ");
            repeat = scanner.next();
            System.out.println("");
        }
        sayingGoodbye();
        System.exit(0);
    }

    public static void startingProgram() {
        // variable
        int randomizer;
        String magicEightBall = "";

        //code
        randomizer = (int)(1 + (20 * Math.random()));
        switch (randomizer) {
            case 1:
                magicEightBall = "It is Certain.";
                break;
            case 2:
                magicEightBall = "It is decidedly so.";
                break;
            case 3:
                magicEightBall = "Without a doubt.";
                break;
            case 4:
                magicEightBall = "Yes definitely.";
                break;
            case 5:
                magicEightBall = "You may rely on it.";
                break;
            case 6:
                magicEightBall = "As I see it, yes.";
                break;
            case 7:
                magicEightBall = "Most likely.";
                break;
            case 8:
                magicEightBall = "Outlook good.";
                break;
            case 9:
                magicEightBall = "Yes.";
                break;
            case 10:
                magicEightBall = "Signs point to yes.";
                break;
            case 11:
                magicEightBall = "Reply hazy, try again.";
                break;
            case 12:
                magicEightBall = "Ask again later.";
                break;
            case 13:
                magicEightBall = "Better not tell you now.";
                break;
            case 14:
                magicEightBall = "Cannot predict now.";
                break;
            case 15:
                magicEightBall = "Concentrate and ask again.";
                break;
            case 16:
                magicEightBall = "Don't count on it.";
                break;
            case 17:
                magicEightBall = "My reply is no.";
                break;
            case 18:
                magicEightBall = "My sources say no.";
                break;
            case 19:
                magicEightBall = "Outlook not so good.";
                break;
            case 20:
                magicEightBall = "Very doubtful.";
                break;
        }
        System.out.println("***   MAGIC 8-BALL SAYS: \"" + magicEightBall + "\"   ***");
        return;
    }

    public static void sayingGoodbye() {
        System.out.println("***   MAGIC 8-BALL SAYS: \"Goodbye.\"   ***");
    }
}
