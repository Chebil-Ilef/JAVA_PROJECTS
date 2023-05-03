TP GENERICS & COLLECTIONS
1: Ex2ArrayList slide21
2: Ex3ArrayListCollectionsFramework
   Collections.sort(arrayList);
**Sort employees by salary after comparing them
3: EmployeeComparedBySalary
   public class EmployeeComparedBySalary implements Comparable<EmployeeComparedBySalary> {
    int salary;
    public int compareTo(EmployeeComparedBySalary e) {
        return Integer.compare(this.salary, e.salary);
    }
}
4: Another démarche: using serialisation in Employees.ser
   Employee+ AddEmployee + SortEmployeesObj + CatEmployeesObj
