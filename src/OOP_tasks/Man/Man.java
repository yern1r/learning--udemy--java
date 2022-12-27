package OOP_tasks.Man;

public class Man {
    private String name;
    private String job;
    private int age;
    private double height;

    public Man(String name, String job, int age, double height) {
        this.name = name;
        this.job = job;
        this.age = age;
        this.height = height;
    }

    public void showMan(){
        System.out.println(name + " " + job + " " + age + " " + height);
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
}

class OOP_main{
    public static void main(String[] args) {//we are parsing = divide string into information/data/value
        String stringInfo = "He is Alex, 34 years old , his height 183.5 , he works as Team Lead";
        String name = stringInfo.substring(5,10);
        String job = stringInfo.substring(58);
        int age = Integer.parseInt(stringInfo.substring(12,14));
        double height = Double.parseDouble(stringInfo.substring(38,43));

        Man person = new Man(name,job,age,height);
        person.showMan();
        System.out.println( "Name: " +person.getName() + " Age: " + person.getAge() + " Job: " + person.getJob() + " Height: " + person.getHeight() );
    }
}