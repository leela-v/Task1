public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Reversing the number provided");

        // Logic to reverse 1) First we need to find %10 for the number
        // 2) we need to find the remainder of the modulo
        // 3) after getting remainder , multiply and add the remainder.
        // 4) assign the number to number divided by 10
        // 5) repeat this process until number not equal 0

        int no=876;
        int no2=0; // used in forloop
        System.out.print("Enter input: "+no);

        for (;no !=0;no=no/10)
        {
            System.out.println("The number is (entering loop) " +no);
            int remainder=no%10;
            no2= (no2*10) + remainder;
            System.out.println("The number is (exiting loop )" +no);
        }
        System.out.println("The value of the input after exiting forloop "+ no);

        System.out.println("***the reversed output for given number is*** "+ no2);
    }
}