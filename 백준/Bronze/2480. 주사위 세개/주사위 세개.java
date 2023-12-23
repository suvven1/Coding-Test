import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] diceList = sc.nextLine().split(" ");
        int reward = 0;
        int maxDice;

        int firstDice = Integer.parseInt(diceList[0]);
        int secondDice = Integer.parseInt(diceList[1]);
        int thirdDice = Integer.parseInt(diceList[2]);

        Stream<Integer> stream = Stream.of(firstDice,secondDice,thirdDice);

        Map<Integer, Integer> diceResult = stream.collect(
                Collectors.toMap(Function.identity(), value -> 1, Integer::sum)
        );

        for(int key : diceResult.keySet()){
            maxDice = key;

            if(diceResult.get(key) == 3){
                reward = 10000 + (key * 1000);
                break;
            }else if(diceResult.get(key) == 2){
                reward = 1000 + (key * 100);
                break;
            }else {
                reward = 100 * maxDice;
            }
        }

        System.out.println(reward);
    }
}