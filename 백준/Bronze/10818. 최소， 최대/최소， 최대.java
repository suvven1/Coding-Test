import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numLen = Integer.parseInt(reader.readLine());
        String[] input = new String[numLen];
        input = reader.readLine().split(" ");
        int maxNum=0;
        int minNum=0;

        for (int i = 0; i < numLen; i++) {
            int num = Integer.parseInt(input[i]);
            if(i == 0){
                maxNum = num;
                minNum = num;
            }else{
                if(maxNum < num) maxNum = num;
                if(minNum > num) minNum = num;
            }
        }
        System.out.println(minNum + " " + maxNum);
    }
}
