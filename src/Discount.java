import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        System.out.println("Purchase amount and corresponding discount ");

        Scanner input=new Scanner(System.in);
        float purchaseamount=input.nextFloat();
        System.out.println("The amount entered is " + purchaseamount);
        float amounttobepaid=0;
        float discount=0;

        if(purchaseamount<500)
        {
            System.out.println("The amount to be paid is " + amounttobepaid);

        } else if (purchaseamount>500 && purchaseamount<=1000) {

            discount=(purchaseamount*10)/100;
            amounttobepaid=purchaseamount-discount;
            System.out.println("The amount to be paid after 10% discount is " + amounttobepaid);
        } else if (purchaseamount>2000) {
            discount=(purchaseamount*10)/100;
            amounttobepaid=purchaseamount-discount;
            System.out.println("The amount to be paid after 20% discount is " + amounttobepaid);
        }


    }
}