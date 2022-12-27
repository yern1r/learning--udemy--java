package syntax_basis.tasks;

public class CountDays {
    public static void main(String[] args) {
        int year, month , day ;
        int number = 5000;

        year = number / 365; //  whole number = whole years
        month = number % 365 / 31; // whole number = whole months
        day =  number - year * 365 - month * 31; // 5000 - {days for forming years} - {days for forming months} = left days

        System.out.println("year : " + year + " month : " + month + " day :" + day);
        // sout + TAB
        System.out.println("sout + tab");
    }
}
