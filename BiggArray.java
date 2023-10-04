import java.util.Scanner;

public class BiggArray {
    public static void main(String[] args) {
        int max=0,i,num1;
        Scanner S = new Scanner(System.in);
        System.out.println ("Enter a Number");
        num1 = S.nextInt();
        int a [] = new int[num1];
        System.out.println ("Enter a size");
        for (i=0; i < a.length;i++)
        {
            a [i] =S.nextInt ();
        }
        for (i=1;i < a.length; i++)
        {
           if ( a[i]>max ) {
               max = a[i];
           }
        }
        System.out.println("The lagest Number is :"+max);
    }
}