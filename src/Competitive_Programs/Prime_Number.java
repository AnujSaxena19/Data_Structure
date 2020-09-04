package Competitive_Programs;
import java.util.*;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n/2;
        int c=0;
        for(int i=2;i<=m;i++){
            if(n%i==0){
                c=1;
                break;
            }
        }
        if(c==0){
            System.out.println("Number is a prime number");
        }
        else{
            System.out.println("Number is not a prime number");
        }
    }
}
