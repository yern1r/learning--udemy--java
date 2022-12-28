package OOP_tasks.anonymousTask;

public class Boss {
    public void force(Counter counter, int i){
        String report = counter.report(i);
        //giving value to variable report => instance of Counter interface, counter
        //then calling method report with parameter int month
        // which will initialized with i , it is possible because they are same data type
        System.out.println(report);
    }



}
