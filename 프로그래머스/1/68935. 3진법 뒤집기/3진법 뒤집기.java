class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String thr = Integer.toString(n, 3);
        String rev = "";
        
        for(int i = thr.length() - 1; i >= 0; i--){
            rev += thr.charAt(i);
        }
        
        answer = Integer.parseInt(rev, 3);
        
        return answer;
    }
}