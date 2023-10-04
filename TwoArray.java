public class TwoArray {
    public static void main(String[] args){
        int a[]=new int[]{7,2,3,8,6,1};
        int max,i;
        max=a[0];
        for (i=1; i<=5;i++){
            if (a[i]>max){
                max=a[i];
            }
        }System.out.println(max);

    }
}
