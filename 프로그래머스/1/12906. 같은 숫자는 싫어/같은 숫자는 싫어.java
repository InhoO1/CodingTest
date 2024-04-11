import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> sta = new Stack();
        
        for(int i = 0; i < arr.length; i++){
            if(sta.empty() || sta.peek() != arr[i]){
                sta.push(arr[i]);
            }
        }
        
        int[] answer = new int[sta.size()];
        
        for(int i = sta.size() - 1; i >= 0; i--){
            answer[i] = sta.pop();
        }

        return answer;
    }
}