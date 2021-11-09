import java.util.Random;
import java.util.Scanner;

public class Orakul {
    public static void INFORMATION() {
        System.out.println("Hello!It's <Orakul> with advice ♥ \n Enjoy!");
        int a;
        String i;
        System.out.println("You'r verb");
        Scanner scyc = new Scanner(System.in);
        i = scyc.nextLine();
        String[]supchic = {"Да","Нет","Скорее нет","Скорее да","ты бебил :/"};
        Random y = new Random();
        a = y.nextInt(2);
        System.out.println("");
        System.out.println(supchic[a]);

    }
}
