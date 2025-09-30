// taking the multipe input by  using the Scanner class and intNext(),next(),nextLine


import java.util.*;
class InputDifferTypes{

	public static void main(String args[]){
	
	Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Integer/Number-->");
		int num=sc.nextInt();
		System.out.print("Enter  a Float value-->");
		float f=sc.nextFloat();
		System.out.println("Enter  a String ");
		String str=sc.next();
		sc.nextLine(); // to clean the string Buffer
		System.out.println("Enter A full line");
		String str1=sc.nextLine();


		// displaying the data
		System.out.println("**********************************\n Display the Data");
		System.out.println("Integer-->"+num+"\n"+"Float -->"+f+"\n"+"String with Single word-->"+str+"\n "+"line-->"+str1);
	}




}