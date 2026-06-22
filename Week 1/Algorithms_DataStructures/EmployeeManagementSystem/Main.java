public class Main {

    public static void main(String[] args) {

        EmployeeManagement management = new EmployeeManagement(10);

        management.addEmployee(new Employee(101, "Alice", "Manager", 70000));
        management.addEmployee(new Employee(102, "Bob", "Developer", 55000));
        management.addEmployee(new Employee(103, "Charlie", "Tester", 45000));

        System.out.println("\nEmployee Records:");
        management.displayEmployees();

        System.out.println("\nSearching Employee 102:");
        Employee emp = management.searchEmployee(102);

        if (emp != null)
            System.out.println(emp);
        else
            System.out.println("Employee not found.");

        System.out.println("\nDeleting Employee 102");
        management.deleteEmployee(102);

        System.out.println("\nUpdated Employee Records:");
        management.displayEmployees();
    }
}