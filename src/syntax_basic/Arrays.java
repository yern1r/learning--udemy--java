package syntax_basic;

public class Arrays {
    //variable - it is a box of data/memory which has name
    //arrays- it is a collection-container with a lot of boxes which has indexes
    //type[] name_Array = new type[size]
    public static void main(String[] args) {
        //---months--//
        /*int[] daysInMonth = new int[12];
        daysInMonth[0] = 30 ;
        daysInMonth[1] = 31 ;
        daysInMonth[2] = 30 ;
        daysInMonth[3] = 31 ;
        daysInMonth[4] = 30 ;
        daysInMonth[5] = 31 ;
        daysInMonth[6] = 30 ;
        daysInMonth[7] = 31 ;
        daysInMonth[8] = 30 ;
        daysInMonth[9] = 31 ;
        daysInMonth[10] = 30 ;
        daysInMonth[11] = 31 ;

        for (int i = 0 ; i < daysInMonth.length ; i++){
            System.out.println(daysInMonth[i]);

        }*/

        //---change zeros to numbers ---//
        /*
        int[] numbers = new int[15];
        for (int i = 0; i < numbers.length ; i++){
            if (numbers[i] == 0){
                numbers[i] = i;
                System.out.println(numbers[i]);
            }
        }
        */

        //---change from zeros to 10..20..<100---//


        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++ ){
            nums[i] = i * 10;
            //System.out.println(nums[i]);
        }

        /*
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        */

        //---for each---//
        // for (data_type variable : array){...}
        for (int i : nums) {
            System.out.println(i);
            //System.out.println(nums[i]);
        }
        //sout(nums[i]) = sout(i)

        /*
        boolean [] falsebek = new boolean[5];
        for (boolean f: falsebek) {
            System.out.println(f);
        }

         */
    }
}
