//write a program to accept n values from user and display it 1> all prime Numbers 2>addiion of all digits of odd No
//3> Factoraal of no less than 7 4>>find the Nthe max Prime Number 5>> find the Nth Minimnum prime Number

import java.util.Scanner;
class TestArray{

	public static void main(String[] args){

	Scanner sc = new Scanner (System.in);
	// taking the array as input form the user
	System.out.println("Enter the array size");
	int size = sc.nextInt();
	// declaring the array
	int[] arr = new int[size];
	int choice;
	// creating a Menu type using do while loop so that it will display continously
	do{
	System.out.println("\n Enter your choice......\n1.Accept Array Elements\n 2.display Data \n3.All prime Numbers in the array  \n4. Addition of odd numbers \n5.factorial of number which is less than 7 \n6.Nthe max Prime Number \n7. find the Nth Minimnum prime Number \n8.Exit");
	choice=sc.nextInt();
	switch(choice){

	case 1:
	acceptData(arr,size);
	break;
	case 2:
	
	displayData(arr);
	break;
	case 3:
	isPrime(arr);
	break;
	case 4:
	int a = addOdd(arr);
	System.out.println("Addition of odd number is:--> "+a);
	break;
	case 5:
	//factorial();
	break;
	case 6:
	//maxNthPrime();
		break;
	case 7:
	//minNthPrime();
	break;
	default :
	System.out.println("you have entered the wrong input");
	break;
		

	}

	

	} while(choice!=8);
}

	public static void acceptData(int[] arr,int size){
		Scanner sc = new Scanner(System.in);
	System.out.print("Enter the "+size+" elements-->");
		for(int i =0; i<arr.length;i++){
		
			arr[i] = sc.nextInt();

		}	
	}

	public static void displayData(int[] arr){
	System.out.print("Array Elements are --> [ ");
		for(int i =0; i<arr.length;i++){
			System.out.print(+arr[i] +" ");
		}
			System.out.print(" ]");	System.out.println("");	
	}



	// here in these function we are going to return an array will contain the prime Numbers
  	public static int[] isPrime(int []arr){
		int cnt=0; 
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			for(int j=2; j<arr[i]; j++){
				if(arr[i]%j==0){
				// return
				}
				else{
					temp[cnt]=arr[i];
					cnt++;
				}
			}

		}
	return temp;
	

	}

	// function to all odd number in the array
	public static int addOdd(int[] arr){
		int sum =0;
		for(int i=0; i<arr.length;i++){
			if(arr[i]%2!=0){
			sum= sum + arr[i];
			}
			
		}
		return sum;
	}

	// function to 
	public static int addOdd(int[] arr){
		int sum =0;
		for(int i=0; i<arr.length;i++){
			if(arr[i]%2!=0){
			sum= sum + arr[i];
			}
			
		}
		return sum;
	}



}//class close