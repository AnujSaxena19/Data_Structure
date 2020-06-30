package Array.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Quick_Sort {
    int partition(int [] arr,int start,int end){
        int pivot=arr[end];
        int i=(start-1);
        for(int j=start;j<end;j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            int temp=arr[i+1];
            arr[i+1]=arr[end];
            arr[end]=temp;
        return i+1;
    }

    void sort(int [] arr,int start,int end){
        if(start<end) {
            int mid = partition(arr, start, end);

            sort(arr, start, mid - 1);
            sort(arr, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Quick_Sort sorted=new Quick_Sort();
        sorted.sort(arr,0,n-1);
        System.out.println("Sorted array is " + Arrays.toString(arr));
    }
}
