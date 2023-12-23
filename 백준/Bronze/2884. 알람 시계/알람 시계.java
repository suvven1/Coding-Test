import java.util.Scanner;

public class Main {

    public static int hour;
    public static int minute;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] hourAndMinute = sc.nextLine().split(" ");
        hour = Integer.parseInt(hourAndMinute[0]);
        minute = Integer.parseInt(hourAndMinute[1]);
        getMinute();
        getHour();
        System.out.println(hour + " " + minute);
    }

    public static void getHour(){
        if(hour == -1){
            hour = 23;
        }
    }

    public static void getMinute(){
        if(minute >= 45){
            minute = minute - 45;
            return;
        }
        hour = hour - 1;
        minute = 60 + (minute - 45);
    }
}