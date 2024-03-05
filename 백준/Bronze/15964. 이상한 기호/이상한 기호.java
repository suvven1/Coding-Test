import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] AB = reader.readLine().split(" ");
        long A = Integer.parseInt(AB[0]);
        long B = Integer.parseInt(AB[1]);

        long answer = calculateAB(A,B);
        System.out.println(answer);
    }
    
    public static long calculateAB (long A, long B){
        return (A+B)*(A-B);
    }
}
