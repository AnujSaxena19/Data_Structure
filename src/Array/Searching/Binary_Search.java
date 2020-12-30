package Array.Searching;
import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int beg=0;
        int end=n-1;
        int mid=(beg+end)/2;
        while(beg<=end){
            if(arr[mid]==k){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<k){
                beg=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=(beg+end)/2;
        }

    }
}
