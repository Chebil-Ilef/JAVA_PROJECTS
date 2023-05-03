import java.io.File;

public class Mkdir {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Mkdir + <repositery name>");
        } else {
            String folderName = args[0];
            File folder = new File(folderName);
            if (!folder.exists()) {

                boolean success = folder.mkdir();
                if (success) {
                    System.out.println(folderName + " created successfully");
                } else {
                    System.out.println("failed to create repositery");
                }
            } else {
                System.out.println("folder already exists");
            }
        }
    }
}


