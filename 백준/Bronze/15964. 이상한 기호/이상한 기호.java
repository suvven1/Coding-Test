import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] AB = reader.readLine().split(" ");
        int A = Integer.parseInt(AB[0]);
        int B = Integer.parseInt(AB[1]);

        int answer = calculateAB(A,B);
        System.out.println(answer);
    }
    
    public static int calculateAB (int A, int B){
        return (A+B)*(A-B);
    }
}
