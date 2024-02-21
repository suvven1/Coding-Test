import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NM = reader.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        String[][] first = new  String[N][M];
        String[][] second = new  String[N][M];

        for (int i = 0; i < N; i++) {
            first[i] = reader.readLine().split(" ");
        }

        for (int i = 0; i < N; i++) {
            second[i] = reader.readLine().split(" ");
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int add = Integer.parseInt(first[i][j]) + Integer.parseInt(second[i][j]);
                writer.write(add + " ");
            }
            writer.newLine();
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}