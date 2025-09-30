// printing the table and taking the commandl line arguments
import java.util.*;
class ArgTable{
	public static void main(String args[]){
		// calling the function
	if(args.length<=0){
		System.out.println("please Enter only one value");
	}		
	table(Integer.parseInt(args[0]));
			
	}
	// fuction for print the table
	public static void table(int n){
		for(int i=1;i<=10;i++){
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}


}