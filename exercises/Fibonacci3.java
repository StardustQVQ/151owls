/*
  This program computes the first 80 Fibonacci numbers using
  dynamic programming
*/

public class Fibonacci3 {

    static long[] fibsequence = new long[100];

    public static long fib(int n){
	if(n<=1){
	    fibsequence[n] = 1;
	}
	else {
	    if(fibsequence[n-2]==0){
		fibsequence[n-2] = fib(n-2);
	    }
	    if(fibsequence[n-1]==0){
		fibsequence[n-1] = fib(n-1);
	    }
	    fibsequence[n] = fibsequence[n-1]+fibsequence[n-2];
	}
	return fibsequence[n];
    }
    
    public static void main(String[] args){
	System.out.println("The first 80 fibonacci numbers using fib:");
	for(int k=0; k<80; k++){
	    System.out.println(k+": "+fib(k));
	}
    }
}