import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int count = 1;
            for (int i = 0; i < count; i++) {
                String inputAB = reader.readLine();
                String[] AB = inputAB.split(" ");
                if(AB.length == 1){
                    count = Integer.parseInt(AB[0]) + 1;
                }else{
                    int A = Integer.parseInt(AB[0]);
                    int B = Integer.parseInt(AB[1]);
                    writer.write(Integer.toString(A + B));
                    writer.newLine();
                }
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}