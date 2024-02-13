import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] stringScores = input.split(" ");
        long answer = Long.parseLong(stringScores[0]) - Long.parseLong(stringScores[1]);
        if (answer < 0){
            answer *= -1;
        }
        System.out.println(answer);
    }
}