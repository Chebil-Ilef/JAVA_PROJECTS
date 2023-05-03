import java.io.*;
import java.util.ArrayList;

public class AddEmployee {
    public static void main(String[] args) {

        try {
            ArrayList<Employee> als = new ArrayList<Employee>();
            File f = new File(args[0]);
            //retrive the existing list of employees from the file
            try {
                FileInputStream is = new FileInputStream(f);
                ObjectInputStream objis = new ObjectInputStream(is);
                ArrayList<?> al = (ArrayList<?>) objis.readObject();
                for (Object object : al) {
                    als.add((Employee) object);
                }
                objis.close();
            } catch (EOFException | FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            //add the new employee to the list
            Employee e = new Employee(
                    args[1],
                    Integer.parseInt(args[2]),
                    Integer.parseInt(args[3])
            );
            als.add(e);

            //save the updated list of employees to the file
            FileOutputStream os = new FileOutputStream(f);
            ObjectOutputStream objos = new ObjectOutputStream(os) ;
            objos.writeObject(als);
            objos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}