public class Ex5 {
    public static void main(String[] args) {

        //Example 1
        String x = "Java";
        x = x.concat(" Rules!");
        System.out.println("x = " + x); // the output is: Java Rules!
        x.toLowerCase(); // no assignment, create a new, abandoned String
        System.out.println("x = " + x); // no assignment, the output is still: x = Java Rules!
        x = x.toLowerCase(); // create a new String, assigned to x
        System.out.println("x = " + x); // the assignment causes the output: x = java rules!

        //Example 2 : Let's Lake this example a little further:
        String s1 = "spring ";
        String s2 = s1 + "summer ";
        s1.concat("fall ") ;
        s2.concat(s1);
        s1 += "winter ";
        System.out.println(s1 + " " + s2);
        //The result of this code fragment is "spring winter spring summer".


    }
}
