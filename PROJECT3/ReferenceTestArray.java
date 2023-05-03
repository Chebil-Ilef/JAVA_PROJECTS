class ReferenceTestArray {

    void modify(int[] number) {
        number[0] = number[0] + 1;
        System.out.println("number = " + number[0]);
    }

    public static void main (String [] args) {
        int[] a = {1}; // Create an array with a single element
        ReferenceTestArray rt = new ReferenceTestArray();
        System.out.println("Before modify() a = " + a[0]);
        rt.modify(a);
        System.out.println("After modify() a = " + a[0]);
    }
}
