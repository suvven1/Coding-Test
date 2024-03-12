import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        
        if(input.length == 0){
            System.out.println(input.length);
        }else if(input[0].isEmpty()){
            System.out.println(input.length -1);
        }else{
            System.out.println(input.length);
        }
    }
}
