import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int maxNum = 0;
        int maxNumLocation = 0;
        
        for (int i = 1; i <= 9; i++) {
            int inputNum = Integer.parseInt(reader.readLine());
            if (i == 1) {
                maxNum = inputNum;
                maxNumLocation = i;
            } else {
                if (maxNum < inputNum) {
                    maxNum = inputNum;
                    maxNumLocation = i;
                }
            }
        }
        
        System.out.println(maxNum);
        System.out.println(maxNumLocation);
    }
}
