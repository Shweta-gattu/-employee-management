import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while (true) {
            System.out.println("\n--- Employee Management ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Update Employee");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double sal = sc.nextDouble();
                    Employee e = new Employee(id, name, dept, sal);
                    service.addEmployee(e);
                    break;
                case 2:
                    service.viewAllEmployees();
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    service.searchEmployee(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    service.deleteEmployee(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Department: ");
                    String newDept = sc.nextLine();
                    System.out.print("Enter new Salary: ");
                    double newSal = sc.nextDouble();
                    service.updateEmployee(uid, newDept, newSal);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
