import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputCount = scanner.nextLine();
        int count = Integer.parseInt(inputCount);
        int[] answers = new int[count];
        for (int i = 0; i < count; i++) {
            String inputAB = scanner.nextLine();
            String[] AB = inputAB.split(" ");
            int A = Integer.parseInt(AB[0]);
            int B = Integer.parseInt(AB[1]);
            answers[i] = A + B;
        }
        for (int i = 0; i < answers.length; i++) {
            System.out.println(answers[i]);
        }
    }
}