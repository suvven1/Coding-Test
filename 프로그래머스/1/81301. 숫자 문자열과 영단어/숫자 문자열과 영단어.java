import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String s) {
        String[] enNum = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0; i<enNum.length; i++){
            s = s.replaceAll(enNum[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}