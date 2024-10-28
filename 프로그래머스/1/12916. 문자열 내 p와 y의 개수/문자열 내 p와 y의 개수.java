class Solution {
    boolean solution(String s) {
        String lowStr = s.toLowerCase();
        
        long pCnt = getCharCount(lowStr, 'p');
        long yCnt = getCharCount(lowStr, 'y');

        if (pCnt == yCnt) return true;
        return false;
    }
    
    long getCharCount(String s, char py) {
        return s.chars().filter(c -> c == py).count();
    }
}