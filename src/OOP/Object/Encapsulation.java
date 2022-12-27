package OOP.Object;

public class Encapsulation {
    //when details are not need , only main function
    //all things - should be private
    //methods which use other classes - public , others - private
    //
    private String name;
    private int age;

    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void setAge (int age){//to set
        // in set we can check
        if (age > 0) {
            this.age = age;
        }else {
            System.out.println("Age should be greater than 0");
        }
    }

    public int getAge (){//to read
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class RunEncap {

            public static void main(String[] args) {
                Encapsulation man = new Encapsulation("Yernar", 20);
                //man.setAge(22);
                //man.showInfo();
                System.out.println(man.getAge());
            }

    }
}
