import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = reader.readLine();
        int i = Integer.parseInt(reader.readLine());

        writer.write(S.charAt(i-1));
        writer.flush();
    }
}
