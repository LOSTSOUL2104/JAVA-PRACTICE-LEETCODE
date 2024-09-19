package OOPS;

public class WRAPPER_CLASS {
    public static void main(String[] args) {
//        int a = 10;
//        int  b = 11;
//        Integer num = 45;

        Integer a = 10; Integer b = 20;

        swap (a, b); System.out.println (a + " " + b);
        final int bonus = 3;
    }

    static void swap(Integer a, Integer b) {
        int temp = a; a = b; b = temp;
    }
    final A priyansh = new A("Priyanshh Arora");
}
class A{
    final int num = 10;
    String name;
    public A(String name)
    {
        this.name = name;
    }
}
