import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] hourAndMinute = sc.nextLine().split(" ");
        int hour = Integer.parseInt(hourAndMinute[0]);
        int minute = Integer.parseInt(hourAndMinute[1]);

        if(minute >= 45){
            minute = minute - 45;
        }else{
            if(hour == 0){
                hour = 23;
            }else {
                hour = hour - 1;
            }
            minute = 60 + (minute - 45);
        }

        System.out.println(hour + " " + minute);
    }
}