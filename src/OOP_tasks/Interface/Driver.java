package OOP_tasks.Interface;

public class Driver extends WorkerInterfacesTask implements Drivable{
    public Driver(String name) {
        super(name);
    }

    @Override
    public void work() {
        drive();
    }

    @Override
    public void drive() {
        System.out.println("I am driving , bro , relax");
    }
}
