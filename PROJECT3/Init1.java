public class Init1 extends Init {
    Init1(int x) {
        System.out.println("Init1 :1-arg const");
    }

    Init1() {
        System.out.println("Init1: no-arg const");
    }

    static {
        System.out.println("Init1: 1st static init");
    }

    {
        System.out.println("Init1: 1st instance init");
    }

    {
        System.out.println("Init1: 2nd instance init");
    }

    static {
        System.out.println("Init1: 2nd static init");
    }


    public static void main(String[] args) {
        new Init1();
        new Init1(7);
    }
}
