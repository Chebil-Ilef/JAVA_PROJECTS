import java.io.File;

public class Pwd {
    public static void main(String[] args) {
        File f = new File("");
        String path = f.getAbsolutePath();
        System.out.println(path);
    }
}
