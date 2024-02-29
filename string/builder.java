package string;

public class builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);
        str.setCharAt(0,'m' );
        System.out.println(str);
        str.append(" world");
        System.out.println(str);
        str.append(10);
        System.out.println(str);
        str.insert(2,'y');
        System.out.println(str);
        str.deleteCharAt(0);
        System.out.println(str);

    }
}
