class Solution {
    public static int solution(String s) {
        int answer = 0;
        String str = s;
        int xCnt = 0;
        int noXCnt = 0;
        
        for(int i = 0; i < s.length(); i++){
            String x = str.substring(0,1);
            if(x.equals(s.substring(i,i+1))){
                xCnt++;
            } else {
                noXCnt++;
            }
            
            if(xCnt == noXCnt){
                answer++;
                str = s.substring(i+1,s.length());
                xCnt = 0;
                noXCnt = 0;
            } else if(i == s.length()-1){
                answer++;
            }

            if(str.length() == 0) break;
            
        }
        
        return answer;
    }
}