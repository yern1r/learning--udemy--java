package syntax_basis.tasks;

public class from100to500andReverse {
    public static void main(String[] args) {
        int[] masiv = new int[400];
        for (int i = 0 ; i < masiv.length; i++){
            masiv[i] = i + 100;
        }

        for (int right:
                masiv) {
            System.out.println(right);
        }


        int[] masiv2 = new int[masiv.length];
        for (int i = 0 , j = masiv.length - 1 ; i < masiv.length; i++ , j-- ){
            masiv2[j] = masiv[i];
        }

        for (int reverse:
             masiv2) {
            System.out.println(reverse);
        }
    }
}
