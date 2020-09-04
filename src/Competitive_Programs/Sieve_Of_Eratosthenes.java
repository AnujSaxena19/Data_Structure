/*Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number.

Example:

Input : n =10
Output : 2 3 5 7

Input : n = 20
Output: 2 3 5 7 11 13 17 19

 */
package Competitive_Programs;
import java.util.*;
public class Sieve_Of_Eratosthenes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean [] bool=new boolean[n];
        for(int i=0;i<n;i++){
            bool[i]=true;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(bool[i]==true){
                for(int j=i*i;j<n;j=j+i){
                    bool[j]=false;
                }
            }
        }
        for(int i=2;i<bool.length;i++){
            if(bool[i]==true){
                System.out.print(i+" ");
            }
        }
    }
}
