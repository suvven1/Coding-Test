import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            String[] NX = reader.readLine().split(" ");
            int N = Integer.parseInt(NX[0]);
            int X = Integer.parseInt(NX[1]);

            String[] A = new String[N];

            A = reader.readLine().split(" ");
            for(String strNum : A){
                if(Integer.parseInt(strNum) < X){
                    writer.write(strNum + " ");
                }
            }

            writer.flush();
        }catch (IOException e){

        }
    }
}