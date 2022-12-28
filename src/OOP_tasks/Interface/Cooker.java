package OOP_tasks.Interface;

public class Cooker extends WorkerInterfacesTask implements Cookable
{
    public Cooker(String name) {
        super(name);
    }

    @Override
    public void work() {
        cook();
    }

    @Override
    public void cook() {
        System.out.println("I am cooking, bro , relax");
    }
}
