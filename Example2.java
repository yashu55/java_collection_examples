class Int{
    int a;
}

public class Example2 {


    public static void main(String[] args) {
        //What is Auto boxing
        int a = 50;
        Integer a2 = new Integer(a); // Boxing
        Integer a3 = 5; // Boxing

        System.out.println(a2 + " " + a3);

        Integer i = new Integer(50);
        int b = i;

        System.out.println(b);

    }
}
