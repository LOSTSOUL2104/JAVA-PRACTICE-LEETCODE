package OOPS;
import java.util.Scanner;

public class OOPS_1 {
    public static void main(String[] args) {
        Box myBox  = new Box(10,10,10);
        System.out.println (myBox.toString ());
        System.out.println (myBox.getLength ());
        System.out.println (myBox.getBreadth ());
        System.out.println (myBox.getHeight ());
        System.out.println (myBox.displayPerimeter ());
        System.out.println (myBox.displayArea ());
    }
}

//class Box {
//    double length;
//    double breadth;
//    double area;
//    double perimeter;
//
//    Box() {
//        this.length = 21;
//        this.breadth = 22;
//        this.area = length * breadth;
//        this.perimeter = 2 * (length + breadth);
//    }
//
//    Box(double length, double breadth) {
//        this.length = length;
//        this.breadth = breadth;
//        this.area = length * breadth;
//        this.perimeter = 2 * (length + breadth);
//    }
//
//    void DisplayMeasurements() {
//        System.out.println("length: " + length);
//        System.out.println("breadth: " + breadth);
//    }
//
//    void DisplayArea() {
//        System.out.println("area: " + area);
//    }
//
//    void DisplayPerimeter() {
//        System.out.println("perimeter: " + perimeter);
//    }
//}
class Box{
    private int length;
    private int breadth;
    private int height;
    private int perimeter;
    private int area;

    public Box(int length,int breadth,int height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.perimeter  = length+breadth+height;
        this.area = length*breadth*height;
    }
    public int getLength()
    {
        return length;
    }
    public int getBreadth()
    {
        return breadth;
    }
    public int getHeight()
    {
        return height;
    }
    public int displayPerimeter()
    {
        return perimeter;
    }
    public int displayArea()
    {
        return area;
    }
    public String toString(){
        return "I am a Box and here are my length,breadth,height,perimeter and area respectively =>>" ;
    }
}