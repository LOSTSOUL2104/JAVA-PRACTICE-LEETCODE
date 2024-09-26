public class Generics_1 {
    public static void main(String[] args) {
//        GenericClass <Integer> q1 =  new GenericClass<> ();
//        q1.setId(12);
        for (int i = 0; i <26 ; i++) {
            int s = 2;
        }
    }
}
class GenericClass<T>
{
    T id;

    int setId(int i) {

        return 0;
    }
}
class GenericMethod
{
    <T extends Number> void print(T s)
    {
        System.out.println (s);
    }
}
