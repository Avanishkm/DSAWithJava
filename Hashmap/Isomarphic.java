package Hashmap;
import java.util.*;
public class Isomarphic {
    public static boolean isIsomarphic(String s, String t){
        HashMap<Character, Character> mp = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);
            if(mp.containsKey(tCh)){
                if(mp.get(tCh) != tCh) return false;
            }else if(mp.containsKey(tCh)){
                return false;
            }else {
                mp.put(sCh, tCh);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String t = "egg";
        String s = "add";
        boolean ans  = isIsomarphic(t, s);
        if(ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
