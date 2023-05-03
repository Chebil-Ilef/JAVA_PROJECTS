public class Ex3 {
    public static void main(String[] args) {

        //ArithmeticException
        try{
            int x = 5/0;
        }catch(ArithmeticException e){
            System.out.println("Error:" + e.getMessage());
        }
        //NullPointerException
        try{
            String s = null;
            int x = s.length();
        }catch(NullPointerException e){
            System.out.println("Error:" + e.getMessage());
        }

        //ArrayIndexOutOfBoundsException
        try{
            int[] a = {1,2,3,4};
            int x = a[5];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error:" + e.getMessage());
        }
    }
}
