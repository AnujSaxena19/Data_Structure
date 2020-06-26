/*Given an array of integers, our task is to write a program that efficiently finds the second largest element present in the array.

Example:

Input: arr[] = {12, 35, 1, 10, 34, 1}
Output: The second largest element is 34.
Explanation: The largest element of the
array is 35 and the second
largest element is 34

 */

package Competitive_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int c=0;
        for(int i=n-2;i>=0;i--){
            if(a[i]!=a[n-1]){
                System.out.println("The Second Largest number is " + a[i]);
                c=1;
                break;
            }
        }
        if(c!=1) {
            System.out.println("No largest element found");
        }
    }
}
