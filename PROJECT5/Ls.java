import java.io.File;

public class Ls {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a directory name");
        } else {
            String folderName = args[0];
            File folder = new File(folderName);
            if (!folder.exists() || !folder.isDirectory()) {
                System.out.println("Directory doesn't exist or is not a directory");
            } else {
                File[] fileTab = folder.listFiles();
                if (fileTab == null) {
                    System.out.println("An error occurred while listing files");
                } else {
                    for (File file : fileTab) {
                        System.out.println(file.getName());
                    }
                }
            }
        }
    }
}
