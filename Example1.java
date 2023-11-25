// what is a class and an object
abstract class  Animal {
    String name;
    int noOfLegs;

    void printName(){
        System.out.println(name);
    }

    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("bark");
    }

    void printName(){
        System.out.println("Hello " + name);
    }
}

class Cat extends Animal {
    String color;

    void sound() {
        System.out.println("meow");
    }
}

class Parrot extends Animal {

    @Override
    void sound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sound'");
    }

}

public class Example1 {
    public static void main(String[] args) {
        // Animal a = new Animal();
        Dog d = new Dog();
        d.printName();
        
        
        // int i = 10;
        // Stu s1 = new Stu();
        // Stu s2 = new Stu();
        // s2 = s1;
        // Stu s3 = null;
        // s1.print();

        // // Student s2 = s1;
        // // Student s3 = new Student();
        // // s1 = null;
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);

    }
}

// class Stu{
// int rollno;
// String name;
// static int count = 0;
// void print(){
// System.out.println(rollno + " " + name);
// }
// }

// abstract class Shape{
// int length;
// int width;
// }

// class Rect extends Shape{

// }

// class Square extends Shape{

// }
