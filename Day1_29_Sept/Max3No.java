// To find the maximum  no from the Number by taking the input 
import java.util.*;
class Max3No{
	public static void main(String args[]){
	// declaring the 3 variables
	int a,b,c;	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 3 Numbers");
	 a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();

	if(a<b){
		if(b<c){
			System.out.println(c+" is Maximum Number");
		}
		else{
			System.out.println(b+" is Maximum Number");	
		}
		
	}else if(a>b){
			if(a<c){
			System.out.println(c+" is Maximum Number");
			}
			else{
				System.out.println(a+" is Maximum Number");	
			}
	}
	else{
	System.out.println(a +" is the Maximum Number");


	}



}



}

