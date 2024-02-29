import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            for(int i=0; i<100; i++) {
                String S = reader.readLine();
                writer.write(S);
                writer.newLine();
            }
        }catch (NullPointerException e){
            writer.flush();
        }
        
        writer.flush();
    }
}

