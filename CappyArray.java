import java.util.Scanner;

public class CappyArray {
    public static void main(String [] args){
        int i,num1,num2;
        System.out.println("Enter a Number");
        Scanner input=new Scanner(System.in);
        num1=input.nextInt();
        int a[]=new int[num1];
        System.out.println("Enter a Size");
        for (i=0;i< a.length;i++){
            a[i]= input.nextInt();
        }
        System.out.println("The orgenal Array:");
        for (int j=0;j<a.length;j++) {
            System.out.print(a[j]);
        }
        int b[]=a;
        System.out.println("\nThe copied Array");
        for (i=0;i<b.length;i++){
            System.out.print(b[i]);
        }

    }
}
