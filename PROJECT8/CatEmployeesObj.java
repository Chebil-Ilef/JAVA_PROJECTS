import java.io.*;
import java.util.ArrayList;

public class CatEmployeesObj {
    public static void main(String[] args) {

        //retrieve content of the file into an ArrayList

        File f = new File(args[0]);
        ArrayList<Employee> employees = new ArrayList<Employee>();

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            employees = (ArrayList<Employee>) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        for (Employee employee : employees) {
            System.out.println(employee);
        }


    }
}

