import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String s) {
        String answer ="";
        String str = "";
        char[] charArray = s.toCharArray();
        String[] enNum = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        Map<String, String> numMap = new HashMap<>();
        for (int i=0; i<10; i++) {
            numMap.put(enNum[i], String.valueOf(i));
        }
        
        for(char c : charArray){
            String strC = String.valueOf(c);

            try {
                int i = Integer.parseInt(strC);
                answer += strC;
            } catch (NumberFormatException e) {
                str += strC;
                String ans = numMap.get(str);
                if(ans != null){
                    answer += ans;
                    str = "";
                }
                continue;
            }
        }
        
        return Integer.parseInt(answer);
    }
}