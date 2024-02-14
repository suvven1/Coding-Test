
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> answers = new ArrayList<>();
        while(true){
            String inputAB = scanner.nextLine();
            String[] AB = inputAB.split(" ");
            int A = Integer.parseInt(AB[0]);
            int B = Integer.parseInt(AB[1]);

            if(A + B == 0) break;

            answers.add(A + B);
        }
        for (int i = 0; i < answers.size(); i++) {
            System.out.println(answers.get(i));
        }
    }
}