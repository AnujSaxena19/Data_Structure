package Array.Searching;
import java.util.*;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int k=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==k){
                System.out.println(i);
                c++;
                break;
            }
        }
        if(c<1){
            System.out.println("Element not found");
        }
    }
}
