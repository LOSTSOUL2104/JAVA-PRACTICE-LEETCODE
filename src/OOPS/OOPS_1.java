package OOPS;

import java.util.Arrays;

public class OOPS_1 {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        Student priyansh = new Student ();
        Student ram = new Student ();

//        priyansh.rno = 21;
//        priyansh.name = "Priyansh Arora";
//        priyansh.marks = 99.9f;
//        priyansh.changeName ("raman");
//        priyansh.greeting ();

        System.out.println (priyansh.rno);
        System.out.println (priyansh.name );
        System.out.println (priyansh.marks);

        Student random = new Student (priyansh);
        System.out.println (random.name);
    }
}
class Student {
    int rno;
    String name;
    float marks = 90;
    void greeting()
    {
        System.out.println ("hello my name is :  "+ name);
    }
    void changeName(String newName)
    {
        name = newName;
    }

    Student(Student other)
    {
        this.name= other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    Student(){
        this.rno = 21;
        this.name = "priyansh";
        this.marks = 92.5f;
    }
    Student(int rno,String name , float marks)
    {
        this.rno = rno;
        this.name  = name;
        this.marks = marks;
    }
}
