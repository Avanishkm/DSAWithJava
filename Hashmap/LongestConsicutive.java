package Hashmap;
import java.util.HashSet;

public class LongestConsicutive {
    public int longestConsicutive(int[] arr){
        HashSet<Integer> st = new HashSet<>();
        for(int num : arr){
            st.add(num);
        }
        int maxStreak = 0;
        for(int num : st){
            if(!st.contains(num-1)){
                int currNum = num;
                int currStreak = 1;
                while(st.contains(currNum+1)){
                    currNum++;
                    currStreak++;
                }
                maxStreak = Math.max(currStreak, maxStreak);
            }
        }
        return maxStreak;
    }
    public static void main(String[] args) {
        
    }
}
