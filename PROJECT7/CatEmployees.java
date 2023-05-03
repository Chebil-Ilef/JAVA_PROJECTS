import java.io.*;
import java.util.ArrayList;

public class CatEmployees {
    public static void main(String[] args) {
        try {
            ArrayList<Employee> employees = new ArrayList<>();
            try {
                File f = new File(args[0]);
                FileInputStream is = new FileInputStream(f);
                ObjectInputStream objis = new ObjectInputStream(is);

                while (true) {
                    try {
                        Employee employee = (Employee) objis.readObject();
                        employees.add(employee);
                    } catch (EOFException e) {
                        break;
                    }
                }

                objis.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            for (Employee employee : employees) {
                System.out.println(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
