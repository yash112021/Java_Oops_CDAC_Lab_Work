import java.util.Scanner;

import Array.TestArray;

public class DynamicNewArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// creating the dynamic array
		 
		// declaring the array
		// declaring the dynamic array 
		
		int [] []arr=new int [3][];
		acceptElements(arr);
		displayData(arr);
		int choice;
		do {
			System.out.println("Menu for the 2D array");
			System.out.println("\n1. Maximum of All \n2.Find Max Rowise \n3.find Max column Wise \n4 find the addition Rowwise \n5. find the addttion column wise \n6.exit ");
			
			System.out.println();
			System.out.print("Enter your choice --> ");
			choice=sc.nextInt();
			
			// now making the switch case
			switch(choice) {
			case 1:
				int a = TestArray.maxArray(arr);
				System.out.println(a);
				break;
			case 2:
				int [] abc=TestArray.maxRowwise(arr);
				System.out.println("maximum  rowise is");
				for(int x:abc) {
					System.out.println(x);
				}
				break;
			case 3:
				System.out.println("maximum  colwise is");

				int [] ab=TestArray.maxColwise(arr);
				for(int x:ab) {
					System.out.print(x+"\t");
				}
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			
			
			}
			
			
		}while(choice!=6);
		
		// 
		
	} // main close
	

	// accept the data
	public static void acceptElements(int [][] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			// now accept the the columns for the each row
			System.out.print("Enter the No of columns for row NO "+i); 
			int col=sc.nextInt();

			arr[i]=new int[col];  // creating the columns for each row
			System.out.println("\nEnter the "+col+" elements now");
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
	
	// display the data
	public static void displayData(int [][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	
}
