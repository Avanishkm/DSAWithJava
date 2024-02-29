package Hashmap;
import java.util.*;

public class Anagram {
     static HashMap<Character, Integer>  makeFreqMap(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            Character ch =  str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                int currfreq = mp.get(ch);
                mp.put(ch, currfreq+1);
            }
        }
        return mp;
     }

    //  public static boolean isAnagram(String s, String t){
    //     if(s.length() != t.length()) return false;
    //     HashMap<Character, Integer> mp1 =  makeFreqMap(s);
    //     HashMap<Character, Integer> mp2 =  makeFreqMap(t);
    //     return mp1.equals(mp2);
    //  }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> mp1 =  makeFreqMap(s);
        for(int i=0; i<t.length(); i++){
            Character ch = t.charAt(i);
            if(mp1.containsKey(ch)){
                int currfr = mp1.get(ch);
                mp1.put(ch, currfr - 1);
            }else {
                return false;
            }
        }
        // All values in mp should be 0 for s and t to be anagrams
        for(Integer i : mp1.values()){
            if(i != 0) return false;
        }
        return true;
     }
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";

        boolean ans  = isAnagram(str1, str2);
        if(ans){
            System.out.println("anagram string");
        }else{
            System.out.println("not anagram string");
        }

    }
}
