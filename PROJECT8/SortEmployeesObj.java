import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeesObj {
    public static void main(String[] args) {

        try {
            ArrayList<Employee> employees = new ArrayList<Employee>();
            File f = new File(args[0]);
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                employees = (ArrayList<Employee>) ois.readObject();
                ois.close();
            } catch (EOFException | FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
             catch (Exception e) {
                 e.printStackTrace();
             }

        //sorting the elements
        Collections.sort(employees);

        //save the updated list of employees to the file
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employees);
        oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}