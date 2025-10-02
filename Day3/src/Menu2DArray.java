import java.util.*;
public class Menu2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// declaring the array
		int r,c;
		// using the user to enter the  Number of rows and columns
		System.out.println("Enter the row and column");
		r=sc.nextInt();
		c=sc.nextInt();
		int [][] arr1=new int [r][c];
		 acceptData(arr1,r,c);
		 displayData(arr1);
//		 display2DArray(arr1);
		int choice;
		// making the Menu
		do {
		
			
		System.out.println("\n*******************************\nOptions Available  \n1.Add all Number   \n2.Add rowwise   ");
				System.out.println("\n3.Add Columnwise   \n4.find a MinofAllNUmber \n5.find a MaxofAllNUmber  \n6. Maximum Rowwise \n7. Minimum Rowwise ");
				System.out.println("\n8.Add two Array   \n9.Multiply a Array   \n10. Transpoe of Matrix");
				System.out.println("\n11.Check identity matrix\n12.rotate Matrix Row   \n13. Rotate Matrix Column \n12.exit\n");
	
				System.out.print("Enter the choice--> ");
				choice =sc.nextInt();
				
				
				
		switch(choice) {
		case 1:
			//add all numbers
			System.out.println("Addition of all numbers are "+ addAllNumber(arr1));
			break;
		case 2:
			//add all numbers
			System.out.println("Addition of all numbers rowwise are \n" );
			int ab[] = addRowWise(arr1);
			 //displayData(ab);
			// using the for of loop for display
			//ab.foreach(el){System.out.println(el);}]
			for(int i=0;i<ab.length;i++) {
				System.out.println("Additon of row "+i+" --> "+ab[i]);
			}
			break;
			
		case 3:
			//add all numbers
			System.out.println("Addition of all numbers columnwise are \n" );
			int abc[] =addColWsie(arr1);
			 //displayData(abc);
			// using the for of loop for display
			//ab.foreach(el){System.out.println(el);}]
			System.out.println("Addion of column --->");
			for(int i=0;i<abc.length;i++) {	
				System.out.print(abc[i]+" ");
			}
			break;
		case 4:
			// finding the minimum of alll numbers
			int min = findMin(arr1);
			System.out.println("minimun af all numbvers is-->"+min);
			break;
		case 5:
			// finding the maximum of alll numbers
			int max = findMax(arr1);
			System.out.println("maximum af all numbvers is-->"+max);
			break;
	
		case 6:
			// finding the maximum of Rowwise
			int[] maxR = findMaxROwWise(arr1);
			display2DArray(arr1);
			System.out.println("Maximum of rowwise --->\n");
			for(int i=0;i<maxR.length;i++) {	
				System.out.print(maxR[i]+" ");
			}
			break;
		case 7:
			// finding the maximum of Rowwise
			/*int[] minR = findMinROwWise(arr1);
			display2DArray(arr1);
			System.out.println("Minimum of rowwise --->\n");
			for(int i=0;i<minR.length;i++) {	
				System.out.print(minR[i]+" ");
			}*/
			break;
		case 8:
			//Addition of two arrays as we are already one array so we required only one array for addition purpose
			int arr2 [][]= new int [r][c];
			System.out.println("Enter the elemnets for 2nd array"); 
			//calling the acceptdata function for taking the data
			acceptData( arr2,  r,  c );
			 display2DArray(arr1);
			 display2DArray(arr2);
			 int temp [][]= add2Darray(arr1, arr2); 
			 displayData(temp);
			 System.out.println();
			 display2DArray(temp);
		
			break;
		case 9:
			//multiplication of 2D matrix 
			System.out.println("Enter the rows and columns");
			int ra,ca;
			ra= sc.nextInt();
			ca= sc.nextInt();
			int arrmul [][]= new int [ra][ca];
			System.out.println("Enter the elemnets for 2nd array"); 
			//calling the acceptdata function for taking the data
			acceptData( arrmul,  r,  c );
			 display2DArray(arr1);
			 display2DArray(arrmul);
			 int temp1 [][]= multiply2Darray(arr1, arrmul); 
			// displayData(temp1);
			 System.out.println("Multiplication of two maatrix is --> ");
			 display2DArray(temp1);
			break;
			
		case 10:
			//Transpose of a matrix
			int trans[][] = transpose(arr1);
			 display2DArray(arr1);
			 System.out.println("Transpose of a matrix -->");
			 display2DArray(trans);


			
			break;
		case 11:
			boolean status = identityMatrix(arr1);
			if(status == true) {
				System.out.println("It is an identity matrix");
			}else {
				System.out.println("It is not an indentity matrix");
			}
		
		case 12:
//			System.exit();
		}
				
		
		}while(choice!=12);
		
		
		}// main close
	// function for  accepting the elements
	public static void acceptData(int [] [] arr, int r, int c ) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter "+r*c+" elements for ");
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j< arr[i].length; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
	}
	// function for displaying the data
	public static void displayData(int [] [] arr ) {
		System.out.print("the array elemnts are--> ");
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j< arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
		}
	}
	
	// function for displaying the data in like the 2d array
		public static void display2DArray(int [] [] arr ) {
			System.out.print("the array elemnts are--> \n");
			for(int i =0; i<arr.length; i++) {
				System.out.print(" [ ");
				for(int j=0; j< arr[i].length; j++) {
					System.out.print(arr[i][j]+ " ,");
				}
				System.out.print(" ] \n");
			}
		}
	
	
	//for adding all the numbers
	public static int addAllNumber(int [] [] arr) {
//		int [] [] temp = new int [arr.length][arr[0].length];
		int sum=0;
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j< arr[i].length; j++) {
				sum += arr[i][j];
			}
		}return sum;
	}
	
	//for adding the rowwise 
	public static int[] addRowWise(int [] [] arr) {
		int temp[] = new int [arr.length];  // making of the Temp array
	int sum;
		for(int i =0; i<arr.length; i++) {
			//temp[i]=0 ;
			sum=0;
			for(int j=0; j< arr[i].length; j++) {
				//temp[i] = temp[i] + arr[i][j];
				sum += arr[i][j];
			}
			temp[i] = sum;
		}return temp;
	}
	
	// now performing the addition column  wise 
	public static int[] addColWsie(int [] [] arr) {
		int temp[] = new int [arr.length];  // making of the Temp array
	int sum;
		for(int i =0; i<arr.length; i++) {
			//temp[i]=0 ;
			sum=0;
			for(int j=0; j< arr[i].length; j++) {
				//temp[i] = temp[i] + arr[i][j];
				sum += arr[j][i];
			}
			temp[i] = sum;
		}return temp;
	}
	
	
	
	// function for finding the  minimum of all array elements
	public static int findMin(int arr1 [] []) {
		
//		int temp [] = new int [arr1.length];
		
		//int[] min = arr1[0];
		int min = arr1[0][0];
		for(int i=0; i<arr1.length;i++) {
			for(int j=0; j<arr1[i].length;j++) {
				if(min>arr1[i][j]) {
					min=arr1[i][j];
				}
			}
		
		}
		return min;
	}
	
	
	// function for finding the maximum of all array elements
	public static int findMax(int arr1 [] []) {
		
//		int temp [] = new int [arr1.length];
		
		//int[] min = arr1[0];
		int max = arr1[0][0];
		for(int i=0; i<arr1.length;i++) {
			for(int j=0; j<arr1[i].length;j++) {
				if(max<arr1[i][j]) {
					max=arr1[i][j];
				}
			}
		
		}
		return max;
	}
	
	// function for finding the maximum rowwise
		public static int[] findMaxROwWise(int arr1 [] []) {
			
			int temp [] = new int [arr1.length];
			
			//int[] min = arr1[0];
			int max = arr1[0][0];
			for(int i=0; i<arr1.length;i++) {
				for(int j=0; j<arr1[i].length;j++) {
					if(max<arr1[i][j]) {
						max=arr1[i][j];
					}
				}
				temp[i]=max;
			
			}
			return temp;
		}
	
	
	
	
		// funtion for finding the minimum rowwise
			/*	public static int[] findMinROwWise(int arr1 [] []) {
					
					int temp [] = new int [arr1.length];
					
					//int[] min = arr1[0];
					int min1 = arr1[0][0];
					for(int i=0; i<arr1.length;i++) {
						for(int j=0; j<arr1[i].length;j++) {
							if(min1>arr1[i][j]) {
								min1=arr1[i][j];
								
							}
						}
						
						temp[i]=min1;
					}
					return temp;
				}*/
	
		// function for finding the Addition of two arrays
				public static int[][] add2Darray(int arr1 [] [],int arr2 [] []) {
					
					int temp [] []= new int [arr1.length][arr2[0].length];
					
					for(int i=0; i<arr1.length;i++) {
						for(int j=0; j<arr1[i].length;j++) {
							temp[i][j] = arr1[i][j] + arr2[i][j];
						}
						
					
					}
					return temp;
				}
			
			
				// function for finding Transpose of a matrix
				public static int[][] transpose(int arr1 [] []) {
					
					int temp [] []= new int [arr1.length][arr1[0].length];
					
					for(int i=0; i<arr1.length;i++) {
						for(int j=0; j<arr1[i].length;j++) {
							temp[i][j] = arr1[j][i] ;
						}
						
					}
					return temp;
				}
			
	 
				// function for finding the Multiplication of two arrays
				public static int[][] multiply2Darray(int arr1 [] [],int arr2 [] []) {
					
					int temp [] []= new int [arr1.length][arr2.length];
					if(arr1[0].length == arr2.length) {
					for(int i = 0; i < arr1.length; i++) {
						for(int j = 0; j < arr2[0].length; j++) {
							for(int k = 0; k < arr1[0].length; k++) {
								temp[i][j] += arr1[i][k] * arr2[k][j];
							}
							
						}
						
					
					}
					return temp;
					}
					else {
						return null;
					}
					
				}
		
	
	
				// function for finding Identity of a matrix
				public static  boolean identityMatrix(int arr1 [] []) {
					
					int [] temp = new int [arr1.length];
					
					for(int i=0; i<arr1.length;i++) {
						for(int j=0; j<arr1[i].length;j++) {
							if((i==j) && (arr1[i][j]!=1)) {
								return false;
							}
							else if((i!=j) && (arr1[i][j]!=0)){
								return false;
							}
						}
						
					}
					return true;
				}
			
	
	

}// class close
