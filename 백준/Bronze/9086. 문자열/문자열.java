import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            String inputText = reader.readLine();
            char firstChar = inputText.charAt(0);
            char lastChar = inputText.charAt(inputText.length()-1);

            writer.write(firstChar);
            writer.write(lastChar);
            writer.newLine();
        }

        writer.flush();

        reader.close();
        writer.close();
    }
}
