import java.util.*;
class Ex2ArrayList
{
    public static void main(String [] args)
    {
        System.out.println("ArrayList methods are not synchronized");
        System.out.println(" whereas Vector methods are synchronized for thread safety");
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(8);
        System.out.println("a has " + a.size() + " elements");
        System.out.println("a=" + a);
        System.out.println("Deleeting element at order 1...");
        a.remove(1);
        System.out.println("a has now " + a.size() + " elements");
        System.out.println("a=" + a);

        System.out.println("Deleeting element Integer 6...");
        a.remove(new Integer(6));
        System.out.println("a has now " + a.size() + " elements");
        System.out.println("a=" + a);
    }
} 