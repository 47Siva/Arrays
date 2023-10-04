import java.util.Scanner;

public class AvetageArray
{
    public static void main(String[]args)
    {
        float sum=0;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter a Numbert:");
        int N1 = S.nextInt();
        int a [] = new int[N1];
        System.out.println("Enter a Size:" );
        for (int i = 0; i < a.length; i++)
            a [i] = S.nextInt();
        for (int i =0; i< a.length; i++)
            sum +=a[i];
            sum = sum /a.length;
        System.out.println("The Average value:"+sum);
    }
}
