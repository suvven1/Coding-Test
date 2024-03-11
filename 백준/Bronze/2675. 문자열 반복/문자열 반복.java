import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(reader.readLine());

        for (int i = 0; i < count; i++) {
            String[] input = reader.readLine().split(" ");
            int num = Integer.parseInt(input[0]);
            char[] text = input[1].toCharArray();
            for (int j = 0; j < text.length; j++) {
                for (int k = 0; k < num; k++) {
                    writer.write(text[j]);
                }
            }
            writer.newLine();
        }
        writer.flush();
    }
}
