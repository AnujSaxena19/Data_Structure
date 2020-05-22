package Array;

import java.util.Scanner;

public class Right_Rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        for(int i=0;i<d;i++){
            int temp =a[a.length-1];
            int j;
            for(j=n-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[j]=temp;
        }
        System.out.println("Right Rotation of Array is");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
