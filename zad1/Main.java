import company.models.Manager;
import company.models.Worker;


public class Main 
{
    public static void main(String[] args) 
    {
        Worker worker1 = new Worker("Michal", 3500, 1);
        Worker worker2 = new Worker("Adam", 3600, 2);
        Worker worker3 = new Worker("Gosia", 4500, 3);
        Worker worker4 = new Worker("Basia", 6000, 4);


        Manager manager = new Manager("Janusz", 7000, 5);


        System.out.println("Wynagrodzenie 1 pracownika " + worker1.getSalary());
        worker1.work();

        System.out.println("Wynagrodzenie 2 pracownika " + worker2.getSalary());
        worker2.work();

        System.out.println("Wynagrodzenie 3 pracownika " + worker3.getSalary());
        worker3.work();

        System.out.println("Wynagrodzenie 5 pracownika " + worker4.getSalary());
        worker4.work();

        System.out.println("Wynagrodzenie menadzera " + manager.getSalary());
        manager.work();
    }
}
