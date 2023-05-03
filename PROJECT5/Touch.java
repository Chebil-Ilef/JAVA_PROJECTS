import java.io.File;
import java.io.IOException;

public class Touch {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Touch + <folder name>");
        } else {
            String fileName = args[0];
            File file = new File(fileName);
            if (file.exists()) {
                System.out.println("File already exists");
            } else {
                try {
                    boolean success = file.createNewFile();
                    if (success) {
                        System.out.println("File created successfully");
                    }
                } catch (IOException e) {
                    System.out.println("Failed to create file: " + e.getMessage());
                }
            }
        }
    }
}
