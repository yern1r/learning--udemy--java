package OOP_tasks.Interface;

public class Programmer extends WorkerInterfacesTask implements Codable{
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void work() {
        code();
    }

    @Override
    public void code() {
        System.out.println("I am coding , bro , relax");
    }
}


