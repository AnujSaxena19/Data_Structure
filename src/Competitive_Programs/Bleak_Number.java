/*Check if a number is Bleak
A number ‘n’ is called Bleak if it cannot be represented as sum of a positive number x and set bit count in x,
i.e., x + countSetBits(x) is not equal to n for any non-negative number x.

Examples :

Input : n = 3
Output : false

 */

package Competitive_Programs;

import java.util.Scanner;

public class Bleak_Number {
    static int countSetBits(int x){
        int count=0;
        while(x!=0){
            x &=(x-1);
            count++;
        }
        return count;
    }

    static boolean isBleak(int n){
        for(int x=0;x<n;x++){
            if(x+countSetBits(x)==n){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isBleak(n)){
            System.out.println("Yes it a is a bleak number");
        }
        else{
            System.out.println("No it is not a bleak number");
        }
    }
}
