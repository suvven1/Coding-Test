import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x_point = sc.nextInt();
        int y_point = sc.nextInt();
        int quadrant;

        if(x_point >0){
            if(y_point >0){
                quadrant = 1;
            }else{
                quadrant = 4;
            }
        }else{
            if(y_point >0){
                quadrant = 2;
            }else{
                quadrant = 3;
            }
        }

        System.out.println(quadrant);
    }
}