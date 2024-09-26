public class Interface_1 {
    public static void main(String[] args) {
//        Testclass t = new Testclass ();
//        t.display ();
//        System.out.println (t.a);

        Bicycle2 bicycle = new Bicycle2 ();
        bicycle.changeGear (2);
        bicycle.speedUp (3);
        bicycle.applyBrakes (1);

        System.out.println ("Bicycle present state ");
        bicycle.print ();

        Bike bike = new Bike ();
        bike.changeGear (1);
        bike.speedUp (4);
        bike.applyBrakes (2);
        System.out.println ("Bike present state : ");
        bike.print ();
    }
}
interface In1 {
    final int a = 10;

    void display();
}
class Testclass implements In1{
    public void display(){
        System.out.println ("Hello");
    }
}
interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bicycle2 implements Vehicle{
    int speed;
    int gear;
    @Override
    public void changeGear(int newGear)
    {
        gear = newGear;
    }
    @Override
    public void speedUp(int increment)
    {
        speed = speed + increment;
    }
    @Override
    public void applyBrakes(int decrement)
    {
        speed = speed - decrement;
    }
    public void print()
    {
        System.out.println ("speed " + speed + " gear:" + gear);
    }
}
class Bike implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment){
        speed += increment;
    }
    @Override
    public void applyBrakes(int decrement){
        speed -= decrement;
    }
    public void print()
    {
        System.out.println ("speed :" + speed + " gear:" + gear);
    }
}