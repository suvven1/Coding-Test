import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        String star = "*";
        for (int i = 0; i < inputNum; i++) {
            System.out.println(star);
            star += "*";
        }
    }
}