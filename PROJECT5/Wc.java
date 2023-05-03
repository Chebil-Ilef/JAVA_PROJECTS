import java.io.File;

public class Wc {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: java Wc <filename>");
            System.exit(1);
        }
        else {
            File f = new File(args[0]);
            System.out.println(f.length());
        }
    }
}
