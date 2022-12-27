package OOP.Object;

public class Constructor {
    //nameClass(list_parameters){body_constructor;}
    //default constructor = empty ()

    String name;
    int salary;
    String job;

    int i ;

    public Constructor(String name, int salary, String job) {
        this.name = name;
        this.salary = salary;
        this.job = job;
    }

    String outputInfo(int i){
        this.i = i;
        return name + " work as "+ job + " and get salary amount of  " +(salary * i) + " in " + i + " months.";
    }
}

class output{
    public static void main(String[] args) {
        Constructor worker = new Constructor("Ivan", 20000,"Analysts");
        String workerInfo = worker.outputInfo(5);
        System.out.println(workerInfo);
    }
}