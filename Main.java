import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Sara", 3000.00, 1, "2022-01-10", "Technik");
        Worker worker2 = new Worker("Joe", 3500.00, 2, "2022-02-15", "Specjalista");
        Worker worker3 = new Worker("Josh", 3200.00, 3, "2023-01-20", "Operator");
        Worker worker4 = new Worker("Louise", 3300.00, 4, "2021-12-01", "Inżynier");
        Manager manager = new Manager("Adam", 5000.00, 5, "2019-07-30", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee emp : employees) {
            emp.work();
            System.out.println("- " + emp.getName() + 
                               " (ID: " + emp.hashCode() + 
                               ", Position: " + emp.getPosition() + 
                               ", Hire date: " + emp.getHireDate() + 
                               ", Salary: " + emp.getSalary() + ".");
        }
    }
}
