import java.util.*;

public class EmployeeService {
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    public void addEmployee(Employee e) {
        employeeMap.put(e.getId(), e);
        System.out.println("Employee added.");
    }

    public void viewAllEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        for (Employee e : employeeMap.values()) {
            System.out.println(e);
        }
    }

    public void searchEmployee(int id) {
        Employee e = employeeMap.get(id);
        if (e != null) {
            System.out.println(e);
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void deleteEmployee(int id) {
        if (employeeMap.remove(id) != null) {
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void updateEmployee(int id, String dept, double salary) {
        Employee e = employeeMap.get(id);
        if (e != null) {
            e.setDepartment(dept);
            e.setSalary(salary);
            System.out.println("Employee updated.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}
