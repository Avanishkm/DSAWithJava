package oops;

public class oops1 {
    String name;
    int roll_no;

    public void printdata(){
        System.out.println(name);
        System.out.println(roll_no);
    }


    public static void main(String[] args) {
        oops1 op = new oops1();
        op.name = "Avanish";
        op.roll_no = 11;
        op.printdata();

        oops1 op1 = new oops1();
        op1.name=  "raj";
        op1.roll_no = 15;
        op1.printdata();
    }
    
}
