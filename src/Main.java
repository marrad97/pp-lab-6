import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Alicja", 3500.0, 1, "2023-01-01", "Junior Developer");
        Worker worker2 = new Worker("Michał", 3550.0, 1, "2023-02-15", "Junior Developer");
        Worker worker3 = new Worker("Kuba", 3700.0, 3, "2023-03-20", "Junior Developer");

        Manager manager = new Manager("Aneta", 5000.0, 5, "2022-12-10", "Manager");

        Worker worker5 = new Worker("Jan", 7000.0, 1, "2023-05-10", "Mid-Level Developer");
        Manager manager2 = new Manager("Oliwia", 6000.0, 6, "2023-05-10", "Team Leader");


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker5);
        employees.add(manager);
        employees.add(manager2);

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " has code: " + emp.hashCode());
        }

        System.out.println("Comparing worker2 (" + worker2.getName() + ") with other employees:");
        for (Employee emp : employees) {
            if (!emp.getName().equals(worker2.getName()))
            System.out.println("Equals to " + emp.getName() + ": " + worker2.equals(emp));
        }

        double totalSalary = 0.0;
        double totalManagerSalary = 0.0;
        double totalWorkerSalary = 0.0;

        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }
        }

        System.out.println("Total salary of all employees: " + totalSalary);
        System.out.println("Total salary of all Managers: " + totalManagerSalary);
        System.out.println("Total salary of all Workers: " + totalWorkerSalary);

        System.out.println("Employees with duplicate IDs:");
        for (int i = 0; i < employees.size(); i++) {
            Employee current = employees.get(i);
            boolean isDuplicate = false;
            for (int j = 0; j < employees.size(); j++) {
                if (i != j && current.equals(employees.get(j))) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                System.out.println("- " + current.getName() + " (ID: " + current.hashCode() + ", Position: " + current.getPosition() +
                        ", Hire date: " + current.getHireDate() + ", Salary: " + current.getSalary() + ").");
            }
        }
    }
}