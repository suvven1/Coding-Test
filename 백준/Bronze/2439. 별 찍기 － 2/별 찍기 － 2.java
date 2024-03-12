import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int starCount = Integer.parseInt(br.readLine());
        for (int i = starCount-1; i >= 0; i--) {
            for (int j = 0; j < starCount; j++) {
                if(i <= j){
                    bw.write("*");
                }else{
                    bw.write(" ");
                }
            }
            bw.newLine();
        }
        bw.flush();
    }
}
