package Hashmap;
import java.util.*;

public class MaxFreq {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,1, 4, 4,6,6,4,4,4};
        Map<Integer, Integer> freq = new HashMap<>();
        for(int key : arr){
            if(!freq.containsKey(key)){
                freq.put(key, 1);
            }else{
                freq.put(key, freq.get(key) + 1);
            }
        }
        System.out.println(freq.entrySet());
        int mxfreq =  0, ansKey = 0;
        for(var e : freq.entrySet()){
            if(e.getValue() > mxfreq){
                mxfreq = e.getValue();
                ansKey = e.getKey();
            }
        }

        System.out.printf("%d has max frequency and it occures %d times", ansKey, mxfreq);
    }
}
