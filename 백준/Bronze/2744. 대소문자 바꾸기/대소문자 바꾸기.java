import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String text = reader.readLine();

        for (int i = 0; i < text.length(); i++) {
            char word = text.charAt(i);
            if(word >= 97){
                writer.write(String.valueOf(word).toUpperCase());
            }else{
                writer.write(String.valueOf(word).toLowerCase());
            };
        }
        writer.flush();
    }
}
