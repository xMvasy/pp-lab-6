import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Sara", 3000.00, 1, "2022-01-10", "Engineer");
        Worker worker2 = new Worker("Joe", 3500.00, 2, "2022-02-15", "Specialist");
        Worker worker3 = new Worker("Josh", 3200.00, 3, "2023-01-20", "Operator");
        Worker worker4 = new Worker("Louise", 3300.00, 4, "2021-12-01", "Cleaner");

        Manager manager = new Manager("Adam", 5000.00, 5, "2019-07-30", "Manager");
        Manager manager1 = new Manager("Michael", 5000, 201, "2021-11-01", "Project Manager");
        Manager manager2 = new Manager("Anna", 5500, 202, "2021-10-15", "Senior Manager");
        Manager manager3 = new Manager("Peter", 6000, 203, "2022-01-05", "Director");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("Total salary of all employees: " + totalSalary);
        System.out.println("Total salary of all managers: " + totalManagerSalary);
        System.out.println("Total salary of all workers: " + totalWorkerSalary);

        List<Employee> duplicateIdEmployees = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).equals(employees.get(j))) {
                    if (!duplicateIdEmployees.contains(employees.get(i))) {
                        duplicateIdEmployees.add(employees.get(i));
                    }
                    if (!duplicateIdEmployees.contains(employees.get(j))) {
                        duplicateIdEmployees.add(employees.get(j));
                    }
                }
            }
        }

        System.out.println("Employees with duplicate IDs:");
        for (Employee employee : duplicateIdEmployees) {
            System.out.println(employee.getName() + " with ID: " + employee.hashCode());
        }
    }
}