import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(reader.readLine());
        String[] NList = new String[N];
        NList = reader.readLine().split(" ");
        int v = Integer.parseInt(reader.readLine());
        int answer = 0;

        for (String strNum : NList) {
            if (Integer.parseInt(strNum) == v ) {
                answer++;
            }
        }

        writer.write(Integer.toString(answer));
        writer.flush();
    }
}