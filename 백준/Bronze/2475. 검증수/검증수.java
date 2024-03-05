import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = reader.readLine().split(" ");

        int answer = calculateNum(inputNum);

        System.out.println(answer);
    }

    public static int calculateNum (String[] inputNum){
        int answer = 0;
        for(String str : inputNum){
            int num = Integer.parseInt(str);
            answer += (num*num);
        }
        return answer%10;
    }
}
