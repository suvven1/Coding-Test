import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String ABC = Integer.toString(A * B * C);
        char[] ABCArray = ABC.toCharArray();

        for (int i = '0'; i <= '9'; i++) {
            int count = 0;
            for (int j = 0; j < ABCArray.length; j++) {
                if(i == ABCArray[j]) count++;
            }
            bw.write(Integer.toString(count));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
