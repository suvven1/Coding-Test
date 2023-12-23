import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strNum = scanner.nextLine();
        String[] intNum = strNum.split(" ");
        int A = Integer.parseInt(intNum[0]);
        int B = Integer.parseInt(intNum[1]);
        int C = Integer.parseInt(intNum[2]);
        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}