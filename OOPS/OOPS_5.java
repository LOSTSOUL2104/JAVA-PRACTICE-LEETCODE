package OOPS;

public abstract class OOPS_5 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.wheel = 4;
        c1.fuel = "petrol";
        c1.engine = 2000;
    }
}

class Vehicle{
    int wheel;
    String fuel;
    int engine;

    Vehicle(){
        System.out.println("This is constructor");
    }

    void getInfo(){
        System.out.println("Info of vehicles");
    }
}
class Car extends Vehicle{

}
class Bike extends Vehicle{

}