public class OperationCmd {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Usage: java OperationCmd <num1> <op+ -> <num2>");
            return;
        } else if (args[1].equals("+")) {
            System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
        } else if (args[1].equals("-")) {
            System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[2]));
        } else {
            System.out.println("Bad operation! Please use + or -");
        }

    }
}
