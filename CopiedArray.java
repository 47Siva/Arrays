public class CopiedArray {
    public static void main(String[]args){
        int a[]={1,2,3,4,5};
        int b[]=a;
        System.out.println("The orgenal Array:");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println("\nThe copied Array");
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]+"\t");
        }
    }
}
