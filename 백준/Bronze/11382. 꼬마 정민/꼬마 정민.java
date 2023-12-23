import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strNum = scanner.nextLine();
        String[] numList = strNum.split(" ");
        Long answer = 0L;

        for (String num : numList) {
            answer = answer + Long.parseLong(num);
        }

        System.out.println(answer);
    }
}
