package OOPS;

public class OBJECT_CLASS {

    int num;
    float gpa;

    public OBJECT_CLASS(int num,float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        return this.num == ((OBJECT_CLASS)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone ();
    }

    @Override
    public String toString() {
        return super.toString ();
    }

    public static void main(String[] args) {
        OBJECT_CLASS obj1 = new OBJECT_CLASS (32,56.8f);
        OBJECT_CLASS obj2 = new OBJECT_CLASS (12,44.55f);
//        System.out.println (obj.hashCode ());
//        System.out.println (obj2.hashCode ());
        if (obj1 == obj2)
        {
            System.out.println ("EQUAL");
        }
    }

}
 