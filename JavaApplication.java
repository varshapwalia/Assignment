import java.util.Scanner;
import java.math.BigInteger;

public class JavaApplication {
  private static long naive_calc_fib(int n) {
    if (n <= 1)
      return n;

    return naive_calc_fib(n - 1) + naive_calc_fib(n - 2);
  }
  
  private static BigInteger fib_fast(int n){
	  BigInteger r1, r2, res;
          
	  res = new BigInteger("0");
	  r1=new BigInteger("0");
	  r2=new BigInteger("1");
	   for(int i=2;i<=n+2;i++){
		   res= r1.add(r2);
		   r1 = r2;
		   r2 = res;
	   }
	   return res;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter Number of test Cases");
    int m = in.nextInt();
               System.out.println("Please Put the test case numbers");
    
       for(int j=1;j<=m;j++){
         int n = in.nextInt();
	System.out.println("Bit string cases of number:"+fib_fast(n));
  }}
}
