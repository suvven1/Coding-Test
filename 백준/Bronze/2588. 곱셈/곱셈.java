import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        String secondNum = scanner.nextLine();
        int answer = 0;
        int num = 0;
        for (int i = secondNum.length()-1; i >= 0; i--){
            int result = firstNum * Integer.parseInt(String.valueOf(secondNum.charAt(i)));
            System.out.println(result);
            answer = (int) (answer + result * (Math.pow(10, num)));
            num++;
        }
        System.out.println(answer);
    }
}
