import java.util.*;
public class Average {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the five numbers");
		int [] arr=new int[5];
		int sum=0;
		for(int i=0;i<5;i++) {
			arr[i]=in.nextInt();
			sum=sum+arr[i];
		}
		int avg=sum/5;
		System.out.println("Sum of 5 given number is " + sum );
		System.out.println("Average of that 5 numbers is "+avg);
	}
}
