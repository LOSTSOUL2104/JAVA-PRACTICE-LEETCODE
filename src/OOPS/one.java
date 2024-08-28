package OOPS;

public class one {
    public static void main(String[] args) {
//        Pen pen_1 = new Pen();
//        pen_1.color ="blue";
//        pen_1.type = "ball";
//        pen_1.write ();
//        Pen pen2 = new Pen ();
//        pen2.color="black";
//        pen2.type ="gel";
//        Student student1 = new Student ("priyansh",19);
//        student1.printinfo (student1.age);
//        Student student2 = new Student ("raj",20);
//        student2.printinfo (student2.name);

//        Triangle2 t1 = new Triangle2 ("red",1);
//        t1.print (t1.id);
//        Circle2 c1 = new Circle2 ("blue",2);
//        c1.print (c1.id);
//        Account a1 = new Account ();
//        a1.name = "priyansh";
//        a1.email = "priyansharora2105@gmail.com";
//        System.out.println (a1.name + " " + a1.email);
    horse h1 = new horse ();
    h1.walk();
    h1.eats ();

    }

}

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println ("writing here");
    }

    public void print() {
        {
            System.out.println (this.color); System.out.println ();
        }
    }
}

class Student {
    String name;
    int age;

    public void print() {
        System.out.println (this.name); System.out.println (this.age);
    }

    //        CONSTRUCTOR
    Student(String name, int age) {
        this.name = name; this.age = age;
    }

    //    polymorphism
    public void printinfo(String name) {
        System.out.println (name);
    }

    public void printinfo(int age) {
        System.out.println (age);
    }

    public void printinfo(String name, int age) {
        System.out.println (name); System.out.println (age);
    }
}

class shape {
    String color;
    int id;

    shape(String color, int id) {
        this.color = color; this.id = id;
    }

    public void print(String color) {
        System.out.println (color);
    }

    public void print(int id) {
        System.out.println (id);
    }

}

//inheritance

class Triangle2 extends shape {

    Triangle2(String color, int id) {
        super (color, id);
    }
}

class Circle2 extends shape {
    Circle2(String color, int id) {
        super (color, id);
    }
}

class Account {
    public String name;
    protected String email;
}

//abstraction
abstract class Animal {
    abstract void walk();
    public void eats(){
        System.out.println ("animal eats");
    }
}

class horse extends Animal {
    public void walk() {
        System.out.println ("Horse on 4 legs");
    }
}

class chicken extends Animal {
    public void walk() {
        System.out.println ("Chicken on 4 legs too");
    }
}


