public class Employee implements Comparable<Employee>, java.io.Serializable{ //important implementations!!
    public int salary;
    public String name;
    public int age;

    public Employee(String name,int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return "Employee " + name + " has " + salary + " salary and " + age + " years old";
    }

    //compare by salary
    public int compareTo(Employee e) {
        return Integer.compare(this.salary, e.salary);
    }
}
