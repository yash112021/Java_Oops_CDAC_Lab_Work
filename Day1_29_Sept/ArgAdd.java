// reading the arguemnt and performing their addition
import java.util.*;
class ArgAdd{
	public static void main(String args[]){
		if(args.length<=0){
		System.out.println("Enter at least Two Integes for performing the additon");
	}
		else{
			System.out.println("Addtion of two paseed in the arguments-->"+(Integer.parseInt(args[0])+Integer.parseInt(args[1])));
		}
	}


}