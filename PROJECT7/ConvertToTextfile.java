import java.io.*;

public class ConvertToTextfile {
    public static void main(String args[]){

        File f=new File(args[0]);
        try{
            FileInputStream fis=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
            FileWriter writer=new FileWriter("resultat.txt");
            while(true){
                try {
                    Employee obj =(Employee) ois.readObject();
                    writer.write(obj.toString());
                    writer.write("\n");
                }catch(EOFException eof){

                    break;
                }

            }
            ois.close();
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}