package syntax_basis.tasks;

public class lastLessonChapter1 {
    public static void main(String[] args) {
        //string - it is linked type
        String[] months = {"France","England","Morocco","Portugal"};
        for (int i = 0 ; i < months.length; i++){
            if (i == months.length - 1){
                System.out.println(months[i] + ".");
            }else {
                System.out.println(months[i] + ",");
            }
        }

        int nomer = 2;
        switch (nomer){
            case 1 :
                System.out.println("Goal");
                break;
            case 2 :
                System.out.println("Siuu");
                break;
            default:
                System.out.println("Whistle");
        }

        String f = "goat";
        String s = "goat";
        if (f.equals(s)){
            System.out.println("from Portugal");
        }

    }

}
