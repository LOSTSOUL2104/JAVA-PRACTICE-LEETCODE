package OOPS;

public class OOPS_4 {
    public static void main(String[] args) {
       /*
        Single
        Two g = new Two ();

        Multi-Level
    Three g = new Three ();
        g.print_first ();
        g.print_for ();
        g.print_last ();

        Hierarchical
        B obj_B = new B();
        obj_B.print_A();
        obj_B.print_B();

        C obj_C = new C();
        obj_C.print_A();
        obj_C.print_C();

        D obj_D = new D();
        obj_D.print_A();
        obj_D.print_D();
*/
//        Multiple
        Child c = new Child (); c.print_geek (); c.print_for (); c.print_geek ();

    }
}

/*
Single level Inheritance
class One{
    public void print(){
        System.out.print ("Hello"+" ");
    }
}
class Two extends One{
    public void print_for(){
        System.out.println ("World");
    }
}
Multi-Level Inheritance
class One{
    public void print_first(){
        System.out.print ("Hello"+" ");
    }
}
class Two extends One{
    public void print_for(){
        System.out.print ("World ");
    }
}
class Three extends Two{
    public void print_last(){
        System.out.println ("Here");
    }
}
Hierarchical Level Inheritance
class AA{
    public void print_A(){
        System.out.print ("AAA AA ");
    }
}
class B extends AA {
    public void print_B(){
        System.out.print ("BBB ");
    }
}
class C extends AA{
    public void print_C(){
        System.out.print ("CC CC ");
    }
}
class D extends AA{
    public void print_D(){
        System.out.print ("DDDD ");
    }
}
*/

//Multiple Level Inheritance
interface mull_A {
    public void print_geek();
}

interface mull_B {
    public void print_for();
}

interface mull_c extends mull_A, mull_B {
    public void print_geek();
}

class Child implements mull_c {
    @Override
    public void print_geek() {
        System.out.println ("Geeks");
    }

    public void print_for() {
        System.out.println ("for");
    }
}
