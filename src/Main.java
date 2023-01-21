public class Main {
    public static int countNonNullEmployees() {
        int result = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Князев Князь", 5, 35000),
                new Employee("Сусликов Суслик", 2, 10000),
                new Employee("Петухов Петух", 2, 100_000),
                new Employee("Курочкина Курица", 1, 60000),
                new Employee("Александр Андреевич Котов", 4, 47000),
                new Employee("Карл Карлович", 1, 50000),
                new Employee("Мухоморов Мухомор", 3, 87000),
                new Employee("Владимир Владимирович", 5, 19000),
                new Employee("Иванов Иван Иванович", 2, 85000),
                new Employee("Джон Джонс", 3, 38000)
        };
        employees[0] = new Employee("Князев Князь", 5, 35000);
        printFullNames();
        printEmployees();
        System.out.println("avg = " + calculateTotalSalary());
    }

    private static Employee[] employees = new Employee[10];

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double calculateTotalSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        if (employees[0] == null) {
            throw new RuntimeException();
        }
        double maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static double calculateAverageSalary() {
        return calculateTotalSalary() / countNonNullEmployees();
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}
