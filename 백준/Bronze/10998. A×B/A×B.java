import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] intNum = num.split(" ");
        System.out.println(Integer.parseInt(intNum[0]) * Integer.parseInt(intNum[1]));
    }
}