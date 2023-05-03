
import java.io.*;
import java.util.ArrayList;

public class ModifierEmployee {
    public static void main(String[] args) {
        File f = new File(args[0]);
        try{
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Employee> employees = new ArrayList<>();
            while (true) {
                try {
                    Employee employee = (Employee) ois.readObject();
                    employees.add(employee);
                } catch (EOFException ex) {
                    break;
                }
            }

            int k=-1;
            for (int i=0;i<employees.size();i++){
                if (employees.get(i).matricule.equals(args[1])){
                    k=i;
                    break;
                }
            }
            System.out.println(k);
            if (k==-1){
                System.out.println("l employe n existe pas");
            }else{
                employees.remove(k);
                employees.add(new Employee(args[1], args[2], args[3],Integer.parseInt(args[4])));

                FileOutputStream of = new FileOutputStream(f);
                ObjectOutputStream obj2 = new ObjectOutputStream(of);
                for (Employee emp : employees) {
                    obj2.writeObject(emp);
                }
                obj2.close();
            }


        }catch(Exception ex){}
    }
}
