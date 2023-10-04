import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args){
       int sum=0,i,num;
       Scanner S = new Scanner (System.in);
       System.out.println("Eter a Number:");
       num = S.nextInt ();
       int a[] = new int[num];
       //System.out.println("Enter a Elament :");
       for (i=0; i < a.length; i++)
       {
           System.out.println("Enter the "+(i+1)+" Elament:");
           a[i] = S.nextInt();
       }
       for (i = 0; i < a.length;i++)
       {
           sum=sum+a[i];
       }
       System.out.println("Sum of All Elament:\n"+sum);
    }
}
