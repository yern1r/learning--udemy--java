package syntax_basis.tasks;

public class GoWalkSleep {
    public static void main(String[] args) {
        //if(condition){}
        int time = 13;
        boolean late = time >= 22 || time <=5;
        boolean isWeatherGood = true;
        if(isWeatherGood && !late){
            System.out.println("walk");
        }else if (!isWeatherGood && late){
            System.out.println("read");
        }else if (late){
            System.out.println("sleep");
        }
    }
}
