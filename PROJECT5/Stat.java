import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Stat {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Stat <filepath>");
            return;
        }

        String filePath = args[0];
        Path path = Paths.get(filePath);

        try {
            BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);

            System.out.println("File size: " + attributes.size() + " bytes");
            System.out.println("File creation time: " + attributes.creationTime());
            System.out.println("Last modified time: " + attributes.lastModifiedTime());
            System.out.println("Last access time: " + attributes.lastAccessTime());
            System.out.println("Is directory: " + attributes.isDirectory());
            System.out.println("Is regular file: " + attributes.isRegularFile());
            System.out.println("Is symbolic link: " + attributes.isSymbolicLink());
            System.out.println("Is other: " + attributes.isOther());
            // ... access other attributes

        } catch (Exception e) {
            System.out.println("Failed to retrieve file information: " + e.getMessage());
        }
    }
}
