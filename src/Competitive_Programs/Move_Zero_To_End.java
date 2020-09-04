package Competitive_Programs;
import java.util.*;
public class Move_Zero_To_End {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }

        while(count<n){
            arr[count++]=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
