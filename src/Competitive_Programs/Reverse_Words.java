/*Let’s see an approach to reverse words of a given String in Java without using any of the String library function

Examples:

Input : "Welcome to geeksforgeeks"
Output : "geeksforgeeks to Welcome"

 */

package Competitive_Programs;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Reverse_Words {
    static String reverseWords(String str){
        Pattern pattern = Pattern.compile("\\s");

        String [] temp=pattern.split(str);
        String result="";
        for(int i=0;i<temp.length;i++) {
            if (i == temp.length - 1) {
                result = temp[i] + result;
            } else {
                result = " " + temp[i] + result;
            }
        }
            return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reverseWords(str));
    }
}
