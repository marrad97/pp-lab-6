import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Alicja", 3500.0, 1, "2023-01-01", "Junior Developer");
        Worker worker2 = new Worker("Michał", 3550.0, 1, "2023-02-15", "Junior Developer");
        Worker worker3 = new Worker("Kuba", 3700.0, 3, "2023-03-20", "Junior Developer");

        Manager manager = new Manager("Aneta", 5000.0, 5,  "2022-12-10", "Manager");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " has code: " + emp.hashCode());
        }

        System.out.println("Comparing worker2 (" + worker2.getName() + ") with other employees:");

        for (Employee emp : employees) {
            if (!emp.getName().equals(worker2.getName())){
                System.out.println("Equals to " + emp.getName() + ": " + worker2.equals(emp));
            }
        }
    }
}