class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long range = t.length() - p.length() + 1;
        long intP = Long.parseLong(p);
        
        for(int i = 0; i < range; i++) {
            String subT = t.substring(i,i+p.length());
            long intSubT = Long.parseLong(subT);
            if(intSubT <= intP) answer++;
        }
        
        return answer;
    }
}