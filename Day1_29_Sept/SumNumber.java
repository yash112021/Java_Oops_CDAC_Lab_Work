// reading the value and then finding the the sum of n Numbers by using the for loop
import java.util.Scanner;
class SumNumber{
	public static void main(String args[]){
		int n, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers for addition");
		 n = sc.nextInt();
		
		for(int i = 1; i<=n ; i++){
		    sum = sum + i;
		}
		System.out.println("Sum of the numbers is:" +sum);
sc.close();
	}
}