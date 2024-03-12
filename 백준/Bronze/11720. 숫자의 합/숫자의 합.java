import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numLen = Integer.parseInt(reader.readLine());
        String inputNum = reader.readLine();
        int answer = 0;
        for (int i = 0; i < numLen; i++) {
            answer += Integer.parseInt(String.valueOf(inputNum.charAt(i)));
        }
        System.out.println(answer);
    }
}
