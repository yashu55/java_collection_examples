// What is difference between String, StringBuffer and StringBuilder?
// 1. Mutability Difference:

// String is immutable, if you try to alter their values, another object gets created, whereas StringBuffer and StringBuilder are mutable so they can change their values.

// 2. Thread-Safety Difference:

// The difference between StringBuffer and StringBuilder is that StringBuffer is thread-safe. So when the application needs to be run only in a single thread then it is better to use StringBuilder. StringBuilder is more efficient than StringBuffer.


public class Example7 {
    public static void main(String[] args) {


        // String s = new String("Hello");
        // // String s2 = "Hi";
        // int MaxValue = 10000000;
        // for(int i = 0; i<MaxValue; i++){
        //     s += "+Hello";
        // }

        // System.out.println("Done");

        StringBuilder sb = new StringBuilder("Hello");
        int MaxValue = 100000000;

        for(int i = 0; i<MaxValue; i++){
            sb.append("+Hello");
        }

        System.out.println("Done");
    }
}
