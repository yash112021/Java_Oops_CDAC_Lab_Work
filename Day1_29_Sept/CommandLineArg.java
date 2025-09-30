// by taking the input by command line and displaying them
import java.util.Scanner;
class CommandLineArg{
	public static void main(String args[]){
		System.out.println("Number of the arguments "+args.length);
		if(args.length<=0){
		
			System.out.println("Error:please enter at least 1 parameter");

	}else{

		for(int i=0; i<args.length; i++){
	
			System.out.println("HEllo--->  "+args[i]);
			
			}

	}

   }
	
	
}