package OOP_tasks.anonymousTask;

public class MyCounter implements Counter{
    @Override
    public String report(int months) {
        return "We agreed with 3 companies in " + months + " months" ;
    }
}
