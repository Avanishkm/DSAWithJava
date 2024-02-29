package stack;
import java.util.Stack;

public class basicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(56);
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.size());

        while (st.size()>2) {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }

    
}