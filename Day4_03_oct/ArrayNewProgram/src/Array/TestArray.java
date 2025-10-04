package Array;
import java.util.*;
public class TestArray {

	public static int maxArray(int[][] arr) {
		int max=arr[0][0];  // setting the value as max
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			if(max<arr[i][j]) {
				max=arr[i][j];
			}
			}
		}return max;
		
	}
	// now writing all the function here
	
	// finding the max row wsise
	public static int[] maxRowwise(int[][] arr) {
		int temp[]=new int[arr.length];
		  // setting the value as max
		for(int i=0;i<arr.length;i++) {
			int max=arr[i][0];
			for(int j=0;j<arr[i].length;j++) {
			if(max<arr[i][j]) {
				max=arr[i][j];
			}
			}temp[i]=max;
		}return temp;
		
	}
	
	
	// finding the max Column wsise
		public static int[] maxColwise(int[][] arr) {
			// first we need to find the size of the maxiumn column]
			int lengcal=0;
			for(int i=0;i<arr.length;i++) {
				if(lengcal<arr[i].length) {
					lengcal=arr[i].length;
				}
			}
			
			// now sucessfully find the length
			
			int temp[]=new int[lengcal];
			  // setting the value as max

			for(int i=0;i<arr.length;i++) {
			
				for(int j=0;j<arr[i].length;j++) {
				if(temp[j]<arr[i][j]) {
					temp[j]=arr[i][j];
				}
				}
			}return temp;
			
		}
	
}
