import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int factorial = 1;
        for (int i = 0; i < inputNum; i++) {
            factorial *= i+1;
        }
        System.out.println(factorial);
    }
}