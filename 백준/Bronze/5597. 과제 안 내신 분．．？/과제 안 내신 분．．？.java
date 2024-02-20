import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> numList = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            numList.add(String.valueOf(i));
        }

        for (int i = 0; i < 28; i++) {
            String num = reader.readLine();
            numList.remove(num);
        }

        writer.write(numList.get(0));
        writer.newLine();
        writer.write(numList.get(1));
        writer.flush();
        reader.close();
        writer.close();
    }
}