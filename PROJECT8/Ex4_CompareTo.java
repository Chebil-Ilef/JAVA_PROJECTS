import java.util.*;

public class Ex4_CompareTo
{
    public static void main(String [] args)
    {
        System.out.println("Using compareTo implementation to compare employee criteria\n");
        ArrayList<EmployeeComparedBySalary > a = new ArrayList<EmployeeComparedBySalary >();
        EmployeeComparedBySalary e1= new EmployeeComparedBySalary();
        e1.name="Sami"; e1.salary=2000; e1.age=30;

        EmployeeComparedBySalary e2= new EmployeeComparedBySalary();
        e2.name="Mohamed"; e2.salary=800; e2.age=32;

        EmployeeComparedBySalary e3= new EmployeeComparedBySalary();
        e3.name="Youssef"; e3.salary=1400; e3.age=20;

        a.add(e1); a.add(e2); a.add(e3);

        for (EmployeeComparedBySalary x : a)
        {
            System.out.println(x.name + " has " + x.salary + " salary and " + x.age +
                    " years olds");
        }
        System.out.println("\n\nSorting a elements...");
        Collections.sort(a);
        for (EmployeeComparedBySalary x : a)
        {
            System.out.println(x.name + " has " + x.salary + " salary and " + x.age +
                    " years olds");
        }
    }
} 