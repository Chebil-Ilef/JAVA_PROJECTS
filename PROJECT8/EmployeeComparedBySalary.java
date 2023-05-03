public class EmployeeComparedBySalary implements Comparable<EmployeeComparedBySalary> {

    String name;
    int age;
    int salary;
    public int compareTo(EmployeeComparedBySalary e) {
        return Integer.compare(this.salary, e.salary);
    }
}
