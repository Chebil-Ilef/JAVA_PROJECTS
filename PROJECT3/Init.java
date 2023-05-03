class Init {
    Init(int x) { System.out.println("1-arg const"); }
    Init() {
        System.out.println("no-arg const"); }

    static { System.out.println("1st static init"); }

    { System.out.println("1st instance init"); }
    { System.out.println("2nd instance init"); }

    static { System.out.println("2nd static init"); }


    public static void main(String [] args) {
        new Init();
        new Init(7);
    }

    //code explanation
    //1. static block is executed first and only once
    //2. instance block are executed before each constructor
    //3. constructor is executed last and is executed every time an object is created


} 