package OOPS;
import java.util.Scanner;

public class OOPS_1 {
    public static void main(String[] args) {
        Box myBox  = new Box();
        myBox.DisplayMeasurements();
        myBox.DisplayArea();
        myBox.DisplayPerimeter();

        System.out.println("Another one");

        Scanner in = new Scanner (System.in);
        double length = in.nextDouble ();
        double breadth = in.nextDouble ();

        Box myBox2 = new Box(length, breadth);
        myBox2.DisplayMeasurements();
        myBox2.DisplayArea();
        myBox2.DisplayPerimeter();
    }
}

class Box {
    double length;
    double breadth;
    double area;
    double perimeter;

    Box() {
        this.length = 21;
        this.breadth = 22;
        this.area = length * breadth;
        this.perimeter = 2 * (length + breadth);
    }

    Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        this.area = length * breadth;
        this.perimeter = 2 * (length + breadth);
    }

    void DisplayMeasurements() {
        System.out.println("length: " + length);
        System.out.println("breadth: " + breadth);
    }

    void DisplayArea() {
        System.out.println("area: " + area);
    }

    void DisplayPerimeter() {
        System.out.println("perimeter: " + perimeter);
    }
}
