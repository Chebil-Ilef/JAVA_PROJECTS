import java.io.File;

public class Chmod {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java ls <filepath> <permissions>");
            return;
        }

        String filePath = args[0];
        String permissions = args[1];

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File does not exist");
            return;
        }

        if (permissions.contains("+r"))
        {
            System.out.println("readable");
            file.setReadable(true);


        }
        else if(permissions.contains("-r")){
            System.out.println("not readable");
            file.setReadable(false);

        }else if(permissions.contains("r")){
            System.out.println("readable");
            file.setReadable(true);
        }
        else {
            System.out.println("not readable");
            file.setReadable(false);

        }

        if (permissions.contains("+w"))
        {
            System.out.println("writable");
            file.setWritable(true);

        }
        else if(permissions.contains("-w")){
            System.out.println("not writable");
            file.setWritable(false);

        }else if(permissions.contains("w")){
            System.out.println("writable");
            file.setWritable(true);
        }
        else {
            System.out.println("not writable");
            file.setWritable(false);

        }

        if (permissions.contains("+x"))
        {
            System.out.println("executable");
            file.setExecutable(true);

        }
        else if(permissions.contains("-x")){
            System.out.println("not executable");
            file.setExecutable(false);

        }else if(permissions.contains("x")){
            System.out.println("executable");
            file.setExecutable(true);
        }
        else {
            System.out.println("not executable");
            file.setExecutable(false);
        }


    }
}
