import company.models.Worker;
import company.models.Manager;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Worker("Sara", 3000.00, 1, "2022-01-10", "Engineer"));
        employees.add(new Worker("Joe", 3500.00, 2, "2022-02-15", "Specialist"));
        employees.add(new Worker("Josh", 3200.00, 3, "2023-01-20", "Operator"));
        employees.add(new Worker("Josh", 3300.00, 4, "2021-12-01", "Cleaner"));
        employees.add(new Worker("Tom", 3100.00, 1, "2023-02-11", "Engineer"));
        
        employees.add(new Manager("Louise", 5000.00, 5, "2019-07-30", "Manager"));
        employees.add(new Manager("Ivy", 5100.00, 1, "2020-05-25", "Manager"));
        employees.add(new Worker("Peter", 3000.00, 1, "2024-01-01", "Engineer"));
        employees.add(new Manager("Anna", 5200.00, 4, "2024-02-01", "Manager"));

 
        double totalSalary = 0, totalManagerSalary = 0, totalWorkerSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }
        }

        System.out.println("Total salary for all employees: " + totalSalary);
        System.out.println("Total salary for all managers: " + totalManagerSalary);
        System.out.println("Total salary for all workers: " + totalWorkerSalary);

        
        Map<Integer, List<Employee>> idMap = new HashMap<>();
        for (Employee emp : employees) {
            idMap.computeIfAbsent(emp.getId(), k -> new ArrayList<>()).add(emp);
        }

        System.out.println("Duplicate ID found:");
        for (Map.Entry<Integer, List<Employee>> entry : idMap.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.print("Duplicate ID " + entry.getKey() + " found in: ");
                entry.getValue().forEach(e -> System.out.print(e.getName() + " (" + e.getPosition() + "), "));
                System.out.println();
            }
        }
    }
}
