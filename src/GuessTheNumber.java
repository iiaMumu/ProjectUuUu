import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void INFORMATION2() {
        int count = 0;
        int guess = -1;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int number = random.nextInt(6);
        while (count < 3 && guess != number) {
            System.out.print("Отгадай число от 1 до 5: ");
            guess = sc.nextInt();
            if (number != guess) {
                System.out.println("" +
                        ((guess > number)? "мимо" : "мимо"));
                count++;
            }
        }
        System.out.println("Ты " +
                ((guess == number)? "Победил!" : "Проиграл :с: " + number));
    }
}