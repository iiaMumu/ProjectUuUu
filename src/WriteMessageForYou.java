import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteMessageForYou {
    public static void INFORMATION3() {
        System.out.println("Привет, напиши сюда всё,о чем думаешь");
        Scanner scyc = new Scanner(System.in);
        String o,u,m,b;
        o = scyc.nextLine();
        try(FileOutputStream fos=new FileOutputStream("message.txt"))
        {
            byte[] buffer = o.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("Дневник обновлён");
    }
}

