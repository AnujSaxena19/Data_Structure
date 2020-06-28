/*Design and Implement Special Stack Data Structure

 */

package Competitive_Programs;

import java.util.*;

public class Special_Stack extends Stack<Integer> {
    Stack<Integer> min=new Stack<>();

   private void push(int x){
        if(isEmpty()){
            super.push(x);
            min.push(x);
        }
        else{
            super.push(x);
            int y=min.pop();
            min.push(y);
            if(x<y){
                min.push(x);
            }
            else{
                min.push(y);
            }
        }
    }
    public Integer pop(){
        int x=super.pop();
        min.pop();
        return x;
    }
    int getMin(){
        int x=min.pop();
        min.push(x);
        return x;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Special_Stack s=new Special_Stack();
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            s.push(t);
        }
        System.out.println(s.getMin());
    }
}
