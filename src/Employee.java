import java.util.Objects;

public class Employee {
    private static int counter = 0;
    private final String name;
    public int id;
    private int department;
    private double salary;

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = validateDepartment(department);
        this.salary = salary;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public static int getCounter() {
        return counter;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String toString() {
        return
                "id: " + id +
                        "; Имя сотрудника: " + name +
                        "; Зарплата: " + salary +
                        "; Отдел: " + department + ";";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && department == employee.department && Objects.equals(name, employee.name);
    }

    private int validateDepartment(int department) {
        return department < 1 || department > 5 ? 1 : department;
    }

}
