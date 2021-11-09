import java.io.*;

public class NoteBook {
    public static void INFORMATION4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("message.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String name;
        String line;
        System.out.println("Вывести последнюю запись на экран? да/нет");
        name = br.readLine();
        if(name.equals("да"))
            while ((line = fin.readLine()) != null) System.out.println(line);

    }
}

