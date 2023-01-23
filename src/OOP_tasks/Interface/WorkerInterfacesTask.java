package OOP_tasks.Interface;

import java.util.ArrayList;

public abstract class  WorkerInterfacesTask {
    private String name;

    public WorkerInterfacesTask(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voice(){
        System.out.println("Worker's name is :" + name);
    }

    public abstract void work();


}
class RunMainInterface{
    public static void main(String[] args) {
        WorkerInterfacesTask worker1 = new Programmer("Serikbol");
        WorkerInterfacesTask worker2 = new Cooker("Qairow");
        WorkerInterfacesTask worker3 = new Driver("Torew");
        ArrayList<WorkerInterfacesTask> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);

        for (WorkerInterfacesTask pereklichka:
             employees) {
            System.out.println(pereklichka.getName());
        }

        for (WorkerInterfacesTask showvoice:
                employees) {
           showvoice.voice();
            showvoice.work();
        }

        /*for (WorkerInterfacesTask dojob:
             employees) {
            dojob.work();
        }*/
//another variant
        Programmer IT2 = new Programmer("golang");
        Programmer IT3 = new Programmer("java");
        ArrayList<Codable> programmers = new ArrayList<>();
        //massive of whose who can code
        programmers.add(IT2);
        programmers.add(IT3);
        for (Codable codesomething:
             programmers) {
            codesomething.code();
        }

        Cooker biscuit = new Cooker("biscuit");
        Cooker cake = new Cooker("cake");
        ArrayList<Cookable> cookers = new ArrayList<>();
        cookers.add(cake);
        cookers.add(biscuit);
        for (Cookable cooksomething:
                cookers) {
            cooksomething.cook();
        }

        Driver mercedes = new Driver("mercedes");
        Driver bwm = new Driver("bwm");
        ArrayList<Drivable> drivers = new ArrayList<>();
        drivers.add(bwm);
        drivers.add(mercedes);
        for (Drivable drivesomething:
                drivers) {
            drivesomething.drive();
        }



        }

    }
