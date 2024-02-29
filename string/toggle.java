package string;
import java.util.*;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        // toggle 
        // PHysics -> phYSIcs
        for(int i=0;i<str.length(); i++){
            boolean flag = true;
            char ch = str.charAt(i); // A
            if(ch == ' ') continue;
            int asci = (int)ch; // 65
            if(asci >= 97) flag = false;
            if(flag == true){ // capital letter
                asci += 32;
                char dh = (char)asci; // a
                str.setCharAt(i, dh);
            }
            else{ // small letter
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);
    }  
}
