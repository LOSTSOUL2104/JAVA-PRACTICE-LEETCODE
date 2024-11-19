package COLLECTIONS;
import java.util.*;
public class set {
    public static void main(String[] args) {
        Book book1 = new Book (1,"Hello");
        Book book2 = new Book (2,"world");
        Book book3 = new Book(3,"Goated");
        Book book4 = new Book(4,"FR");
        Book book5 = new Book (5,"No Cap");
//        Set<Book> set1 = new HashSet<Book> ();
//        set1.add (book1);
//        set1.add (book2);
//        set1.add (book3);
//        set1.add (book4);
//        set1.add (book5);
//        set1.add (null);
//        set1.add (null);
//        System.out.println ("set1 = " + set1);
//        set1.remove (book1);
//        set1.remove (book5);
//        System.out.println ("set after removal " + set1);
//        Set<Book> set2 = new HashSet<Book> ();
//        set2.add (book3);
//        set2.addAll (set1);
//        set2.remove (null);
//        System.out.println (set2);

//        Linked Hash Set

        Set<Book> set3 = new LinkedHashSet<Book> ();
        set3.add (book2);
        set3.add (book3);
        set3.add (null);
        System.out.println ("Set3  = " + set3);
    }
}


class Book{
    private int id;
    private String title;

    public Book(int id, String title) {
        this.id = id;      this.title = title;
    }

    public String toString() {
        return id + ": " + title;
    }

    // Two book are equal if they have the same id
    public boolean equals(Object o) {
        if (!(o instanceof Book)) {
            return false;
        }
        return this.id == ((Book)o).id;
    }
    // Consistent with equals(). Two objects which are equal have the same hash code.
    @Override
    public int hashCode() {
        return id;
    }
}
