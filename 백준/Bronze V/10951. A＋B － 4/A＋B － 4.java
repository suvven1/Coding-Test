
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> answers = new ArrayList<>();
        try{
            while(true){
                String inputAB = scanner.nextLine();
//                if (inputAB.isEmpty()) break;
                String[] AB = inputAB.split(" ");
                int A = Integer.parseInt(AB[0]);
                int B = Integer.parseInt(AB[1]);
                answers.add(A + B);
            }
        }catch (Exception e){
            for (Integer answer : answers) {
                System.out.println(answer);
            }
        }
    }
}