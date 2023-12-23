import java.util.Scanner;

public class Main {

    public static int hour;
    public static int minute;
    public static int cookTime;
    public static int cookHour;
    public static int cookMinute;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] hourAndMinute = sc.nextLine().split(" ");

        hour = Integer.parseInt(hourAndMinute[0]);
        minute = Integer.parseInt(hourAndMinute[1]);
        cookTime = sc.nextInt();
        cookHour = cookTime/60;
        cookMinute = cookTime%60;

        getMinute();
        getHour();
        System.out.println(hour + " " + minute);
    }

    public static void getHour(){
        hour = hour + cookHour;
        if(hour >= 24){
            hour = hour - 24;
        }
    }

    public static void getMinute(){
        if(minute + cookMinute >= 60){
            hour = hour + 1;
            minute = minute + cookMinute - 60;
            return;
        }
        minute = minute + cookMinute;
    }
}