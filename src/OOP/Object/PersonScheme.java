package OOP.Object;

public class PersonScheme {
    String name;
    int age;
    int weight;

    public static class Main {
        public static void main(String[] args) {
            OOP newOOP = new OOP(); //type - OOP.Object.OOP variable_name - newOOP ==> linked type variable
            newOOP.classs = "OOP.Object.OOP.Object.Dog"; // operator . to access use properties
            newOOP.methodd = "Gaw";

            String myClass = "class name is: " + newOOP.classs + " and method will show: " + newOOP.methodd;
            System.out.println(myClass);

            //liked type variable does not include object, they have links for real objects

            PersonScheme Make = new PersonScheme();
            PersonScheme Cake = new PersonScheme();
            PersonScheme Take = new PersonScheme();
            PersonScheme Koke = new PersonScheme();
            PersonScheme Jake = new PersonScheme();
            Jake.name = "Jake";
            Jake.age = 23;
            Take.name = "Take" ;
            Take.age = 34;
            Make.name = "Make";
            Make.age = 19;
            Koke.name = "Koke";
            Koke.age = 22;
            Cake.name = "Cake";
            Cake.age = 91;


            PersonScheme [] people = new PersonScheme[5];
            people[0] = Jake;
            people[1] = Take;
            people[2] = Make;
            people[3] = Koke;
            people[4] = Cake;

            int sum = 0;
            String names = "";

            for (int i = 0 ; i < people.length; i++){

                sum = sum + people[i].age;


            }
            for (PersonScheme namebek:
                 people) {
                System.out.println(namebek.name + "`s age is: " + namebek.age);
            }
            System.out.println("This is sum of ages: " + sum);
            int averageAge = sum / people.length;
            System.out.println("This is average age: " + averageAge);
        }
    }
}
