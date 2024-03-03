public class Pattern {
    public static void main(String[] args) {
        System.out.println("Printing the pattern ");
        for (int i=0;i<5;i++)
        {
            for (int j=5;j>=1;j--)
            {
                System.out.println("printing j " +j);
                if((i+j)>5) {
                    System.out.println(j);
                }
                else

                {
                    System.out.println("printing i in else " +i);
                    System.out.println(5-i);
                }
            }
            System.out.println();
            System.out.println("printing i " +i);
        }


    }
}