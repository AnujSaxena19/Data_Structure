/*Given two positive numbers x and y, check if y is a power of x or not.

Examples :

Input:  x = 10, y = 1
Output: True
x^0 = 1

Input:  x = 10, y = 1000
Output: True
x^3 = 1

Input:  x = 10, y = 1001
Output: False

 */
package Competitive_Programs;
import java.util.*;
public class Number_isPower_Of_Another_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int pow=1;

        while(pow<y){
            pow=pow*x;
            if(x==1){
                break;
            }
        }
        if(pow==y||x==1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }


}
