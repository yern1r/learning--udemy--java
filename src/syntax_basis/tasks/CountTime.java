package syntax_basis.tasks;

public class CountTime {
    public static void main(String[] args) {
        int seconds = 5000;
        int hour , minute , leftSeconds;

        hour = seconds / 3600;
        minute = seconds % 3600 / 60;
        leftSeconds = seconds - hour * 3600 - minute * 60;

        System.out.println("Hour : " + hour + ", minute : " + minute + ", seconds : " + leftSeconds);
    }
}
