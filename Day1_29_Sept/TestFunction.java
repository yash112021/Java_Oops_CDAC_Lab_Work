// find the factorial by using the function
import java.util.Scanner;
class TestFunction{

		public static int factorial(int n){
 			if(n<=1){
			   return 1;
			}
			else{
				int f=1;
				for(int i=1;i<=n;i++){
				   f=f*i;
				}
				return f;
			}
		}

		public static void main(String args[]){
        	Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number");
		int n = sc.nextInt();
		int result = factorial(n);
		System.out.println("Factorial of number is: "+result);
  }
	
}