import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Finding a given number is positive or negative");

        //int i=10;
        Scanner num = new Scanner(System.in);
        System.out.print("Enter input: ");
        int i=num.nextInt();


        if(i>0)
        {
            System.out.println("The number is positive number: " + i);
        } else if (i<0) {
            System.out.println("The number is negative number: " + i);

        }
    }
}