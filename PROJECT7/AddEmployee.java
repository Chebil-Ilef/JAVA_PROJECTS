
import java.io.*;
import java.util.ArrayList;

public class AddEmployee {
    public static void main(String[] args) {

        try {
            ArrayList<Employee> employees = new ArrayList<Employee>();
            File f = new File(args[0]);
            try {
                FileInputStream is = new FileInputStream(f);
                ObjectInputStream objis = new ObjectInputStream(is);
                employees = (ArrayList<Employee>) objis.readObject();
                objis.close();
            } catch (EOFException | FileNotFoundException e) {
                e.printStackTrace();
            }
            Employee e = new Employee(
                    args[1],
                    args[2],
                    args[3],
                    Integer.parseInt(args[4])
            );
            employees.add(e);

            FileOutputStream os = new FileOutputStream(f);
            ObjectOutputStream objos = new ObjectOutputStream(os) ;
            objos.writeObject(employees);
            objos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}