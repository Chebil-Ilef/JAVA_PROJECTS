import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Mv {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Mv <source> <destination>");
            return;
        }

        String sourcePathString = args[0];
        String destinationPathString = args[1];

        Path sourcePath = Paths.get(sourcePathString);
        Path destinationPath = Paths.get(destinationPathString);

        try {
            if (Files.isDirectory(destinationPath)) {
                // Destination is a directory, move the source into the directory
                Path targetPath = destinationPath.resolve(sourcePath.getFileName());
                Files.move(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("File or directory moved successfully.");
            } else {
                // Destination is not a directory, rename the source file or directory
                Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("File or directory renamed successfully.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while moving or renaming the file or directory: " + e.getMessage());
        }
    }
}
