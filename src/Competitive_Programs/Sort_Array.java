/*Given an array A[] consisting 0s, 1s and 2s. The task is to write a function that sorts the given array. The functions should put all 0s first, then all 1s and all 2s in last.

Examples:

Input: {0, 1, 2, 0, 1, 2}
Output: {0, 0, 1, 1, 2, 2}

Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}

 */


package Competitive_Programs;

import java.util.Scanner;

public class Sort_Array {
    static void sort012(int [] a,int arr_size){
        int low=0;
        int high=arr_size-1;
        int mid=0,temp;
        while(mid<=high){
            switch(a[mid]){
                case 0:{
                    temp=a[low];
                    a[low]=a[mid];
                    a[mid]=temp;
                    low++;
                    mid++;
                    break;
                }

                case 1:
                    mid++;
                    break;
                case 2:{
                    temp=a[mid];
                    a[mid]=a[high];
                    a[high]=temp;
                    high--;
                    break;
                }
            }
        }
    }

    static void printArray(int [] a,int arr_size){
        for(int i=0;i<arr_size;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sort012(a,n);
        System.out.println("Array after Seggregation");
        printArray(a,n);
    }
}
