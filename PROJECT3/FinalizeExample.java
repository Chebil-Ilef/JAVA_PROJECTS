import java.util.*;

public class FinalizeExample {
    public static void main(String[] args){
        Example e1 = new Example();
        Example e2 = new Example();
        Example e3 = new Example();
        e1 = null;
        e2=null;
        System.gc();
        System.out.println("Waiting...");
    }
}

class Example{

    public void finalize() throws Throwable{
        System.out.println("Example finalize");
    }
}