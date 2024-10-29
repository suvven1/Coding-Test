class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long range = t.length() - p.length() + 1;
        long longP = Long.parseLong(p);
        
        for(int i = 0; i < range; i++) {
            String subT = t.substring(i,i+p.length());
            long longSubT = Long.parseLong(subT);
            if(longSubT <= longP) answer++;
        }
        
        return answer;
    }
}