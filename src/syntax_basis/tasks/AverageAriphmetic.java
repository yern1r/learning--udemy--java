package syntax_basis.tasks;

public class AverageAriphmetic {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        while (count <= 10){
            sum += count;//sum = 0 ; count = 1 sum = (0) + (1) // sum = 1 , count = 2 , sum = (1) + (2)
            count++;//count = 1 + 1 // count = 2 + 1
        }
        float average = (float)sum / count;
        System.out.println(average);
    }
}
