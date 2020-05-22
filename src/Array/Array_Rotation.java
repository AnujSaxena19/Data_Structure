package Array;
import java.util.*;
public class Array_Rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int temp=a[0];
            int j;
            for(j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[j]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
}
