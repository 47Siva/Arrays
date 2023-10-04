import java.util.Scanner;

public class PrintScrren
{
    public static void main(String[] args)
    {
        int num,i,Elament=0;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a Number:");
        num = S.nextInt();
        int a[]=new int[num];
        for (i = 0;i < a.length; i++)
        {
            System.out.println("Enter  Elament"+" "+(i+1)+":");
            a[i]=S.nextInt();
        }
        System.out.println("All Elament");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
