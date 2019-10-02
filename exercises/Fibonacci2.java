public class Fibonacci2 {

   public static long fib2(int n, long f0, long f1){
      if(n==0){
         return f0;
      }
      else if(n==1){
         return f1;
      }
      else {
         return fib2(n-1, f1, f0+f1);
      }
   }
   
   public static long fib2(int n){
      return fib2(n,1,1);
   }
   
   public static void main(String[] args){
      System.out.println("The first 80 fibonacci numbers using fib2:");
      for(int k=0; k<80; k++){
         System.out.println(k+": "+fib2(k));
      }
   }
}