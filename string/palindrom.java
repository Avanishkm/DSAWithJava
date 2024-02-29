package string;

public class palindrom {
    public static boolean isPalindrom(String str){
        int i = 0;
        int j= str.length()-1;
        while (i<j) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--; 
        }
        return true;
        
        
    }
    public static void main(String[] args) {
        // String str =  "abcdcba";
        // for  palindromic string
        // if(isPalindrom(str)){
        //     System.out.println("palindrom");
        // }else{
        //     System.out.println("Not palindrom");
        // }
    
        // StringBuilder gtr = new StringBuilder(str);
        // gtr.reverse();
        // String s =  gtr + "";
        // if(str.equals(s)){
        //     System.out.println("Palindrom");
        // }else{
        //     System.out.println("Not Palindrom");
        // }

        String str = "abbd";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                if(isPalindrom(str.substring(i, j)) == true){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("The number of palindromic string : " + count);
    }
}
