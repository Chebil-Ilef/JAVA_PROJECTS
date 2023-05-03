import java.io.*;
import java.util.ArrayList;

public class SupprimerEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        try {
            File f = new File("employees.ser") ;
            //retrive the existing list of employees from the file
            try {
                FileInputStream is = new FileInputStream(f);
                ObjectInputStream objis = new ObjectInputStream(is);
                employees = (ArrayList<Employee>) objis.readObject();
                objis.close();
            } catch (EOFException | FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            int k=-1;
            for (int i=0;i<employees.size();i++){
                if (employees.get(i).matricule.equals(args[1])) {
                    k = i;
                    break;
                }
            }
            if (k!=-1) {
                employees.remove(k);
                try (FileOutputStream of = new FileOutputStream(f);
                     ObjectOutputStream objectOutputStream = new ObjectOutputStream(of)) {
                    for (Employee emp : employees) {
                        objectOutputStream.writeObject(emp);
                    }
                }
            } else {
                System.out.println("Employee does not exist");
            }

        } catch (IOException ex) {
            System.out.println("Error occurred: " + ex.getMessage());
        }
    }
}
