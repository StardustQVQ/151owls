public class Fibonacci1 {

   public static long fib1(int n){
      if(n<=1){
         return 1;
      }
      else {
         return fib1(n-1) + fib1(n-2);
      }
   }

   public static void main(String[] args){
      System.out.println("The first 80 fibonacci numbers using fib1:");
      for(int k=0; k<80; k++){
         System.out.println(k+": "+fib1(k));
      }
   }
}
