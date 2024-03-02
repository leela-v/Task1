import java.util.Scanner;

public class SmallestAmong3 {
    public static void main(String[] args) {
        System.out.println("Finding a given number is positive or negative");

        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter input 1: ");
        int no1=num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter input 2: ");
        int no2=num2.nextInt();

        Scanner num3 = new Scanner(System.in);
        System.out.print("Enter input 3: ");
        int no3=num3.nextInt();


        if(no1<no2 && no1<no3) //(if(no1<=no2 && no1<=no3) also worked. The difference is , if there are two same numbers <=prints the first number. Only< is printing the last one
        {
            System.out.println("The smallest nuumber is input 1 : " + no1);
        } else if (no1<no2 && no1<no3) {
            System.out.println("The smallest nuumber is input 2 : " + no2);

        }
        else  System.out.println("The smallest nuumber is input 3 : " + no3);

    }
}