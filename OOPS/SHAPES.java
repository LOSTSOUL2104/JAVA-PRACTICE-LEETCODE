package OOPS;

public class SHAPES {
    public static void main(String[] args) {
//    SHAPES shape = new SHAPES ();
//    Circle circle = new Circle ();
//    Square square = new Square ();
//    circle.area();
//    square.perimeter ();
//
//        System.out.println (helper.Multiply (2,4));
//        System.out.println (helper.Multiply(5.5,6.3));

    }
}

class Triangle extends SHAPES {
    void area() {
        System.out.println ("Area is triangle");
    }
}

class Square extends SHAPES {
    void area() {
        System.out.println ("Area is Square");
    }

    void perimeter() {
        System.out.println ("Perimeter is square");
    }
}

class Circle extends SHAPES {
    void area() {
        System.out.println ("Area is circle");
    }
}

// METHOD OVERLOADING
class helper {
    static int Multiply(int a, int b) {
        return a * b;
    }

    static double Multiply(double a, double b) {
        return a * b;
    }
}




//METHOD OVERRIDING
