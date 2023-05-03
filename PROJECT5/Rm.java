import java.io.File;

public class Rm {
    public static void main(String[] args) {
if (args.length == 0) {
            System.out.println("give a file name");
        } else {
            String fileName = args[0];
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("file doesn't exist");
            } else {
                file.delete();
                System.out.println("file deleted");
            }
        }

    }
}
