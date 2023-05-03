
class ReferenceTest {
    void modify(int number) {
        number = number + 1;
        System.out.println("number = " + number);
    }

    public static void main (String [] args) {
        int a = 1;
        ReferenceTest rt = new ReferenceTest();
        System.out.println("Before modify() a = " + a);
        rt.modify(a);
        System.out.println("After modify() a = " + a) ; //pass by value so a is not changed
        //to pass by reference, we use an array
    }

}