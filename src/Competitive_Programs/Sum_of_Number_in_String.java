/*Given a string containing alphanumeric characters, calculate sum of all numbers present in the string.

Examples:

Input:  1abc23
Output: 24

Input:  geeks4geeks
Output: 4

Input:  1abc2x30yz67
Output: 100

Input:  123abc
Output: 123

 */

package Competitive_Programs;

import java.util.Scanner;

public class Sum_of_Number_in_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String temp="";
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                temp+=ch;
            }
            else{
                sum+=Integer.parseInt(temp);

                temp="0";
            }
        }
        System.out.println(sum+Integer.parseInt(temp));
    }
}
