import java.io.*;
import java.util.Arrays;

public class Main {
    // 용액의 특성을 나타내는 하나의 정수
    // 산성 1 ~ 1000000000
    // 알칼리성 -1 ~ -1000000000
    // 혼합한 용액의 특성 값 = 두 특성 값의 합
    // 두 용액을 혼합하여 0에 가까운 용액을 만들려고 한다
    static int N; // 전체 용액의 수
    static long[] liquids; // 용액 배열
    static long[] idealLiquids; // 이상적인 용액
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        liquids = getLiquids(br.readLine().split(" "));
        idealLiquids = getIdealLiquids();

        bw.write(idealLiquids[0] + " " + idealLiquids[1]);
        bw.flush();
        br.close();
        bw.close();
    }

    static long[] getLiquids(String[] input){
        long[] convertedInput = new long[input.length];
        for(int i=0; i< input.length; i++){
            convertedInput[i] = Long.parseLong(input[i]);
        }
        return convertedInput;
    }

    static long[] getIdealLiquids(){
        Arrays.sort(liquids);
        long[] _idealLiquids = new long[2];
        long absLiquidNumber = Long.MAX_VALUE;

        int left = 0;
        int right = N - 1;

        while(left < right){
            long sum = liquids[left] + liquids[right];
            long absSum = Math.abs(sum);

            if(absLiquidNumber > absSum){
                absLiquidNumber = absSum;
                _idealLiquids[0] = liquids[left];
                _idealLiquids[1] = liquids[right];
            }

            if(sum == 0){
                return _idealLiquids;
            } else if(sum < 0){
                left++;
            } else {
                right--;
            }
        }
        return _idealLiquids;
    }
}
