import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Alicja", 3500.0, 1);
        Worker worker2 = new Worker("Michał", 3550.0, 2);
        Worker worker3 = new Worker("Kuba", 3700.0, 3);
        Worker worker4 = new Worker("Jakub", 3700.0, 4);

        Manager manager = new Manager("Aneta", 5000.0, 5);

        Employee[] employees = {worker1, worker2, worker3, worker4, manager};

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " zarabia " + emp.getSalary());
            emp.work();
        }
    }
}