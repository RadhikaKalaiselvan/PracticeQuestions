package cs6301.g23;
/**
* @author Radhika Kalaiselvan
*Version 1.0 - 9/24/17
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import cs6301.g00.*;

public class RearrangeArray {

/*
 * Re-arrange the first half and second half so that the negative number are at the first half and call merge
 */
	public static void rearrangeMinusPlus(int[] array,int l,int r){
		if(l<r){
			int m = l + (r -l)/ 2;
			rearrangeMinusPlus(array,l,m);
			rearrangeMinusPlus(array,m+1,r);
			mergeSubArrays(array,l,m,r);
		}
	}
	
/*
 * Merges two arrays which has first half as negative numbers.
 * 1. Move the i index in the left of array from first index till the first positive number in first half.
 * 2. Similarly move j starting from mid+1 till the first positive number in right half.
 * 3. Reverse the second half of the first array and first half of the second array.
 * 4.Then call reverse from i to j-1.So the positive numbers of first half and negative numbers of second half are swapped.
 */
	public static void mergeSubArrays(int[] array, int left,int mid, int right){
		int i=left;
		int j=mid+1;
		while(i<=mid && array[i]<0){
			i++;
		}
		while(j<=right && array[j]<0){
			j++;
		}
		reverseArray(array, i, mid);
		reverseArray(array, mid+1, j-1);
		reverseArray(array, i, j-1);
	}
/*
 *  prints the given array
 */
	public static void print(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]+" ");
		}
	}

//Takes array to be rearranged as input and call the helper function.
	public static void rearrangeMinusPlus(int[] array){
		rearrangeMinusPlus(array,0,array.length-1);
	}

	
// Reverses the array from index left to right.
// Recursively call reverseArray until left index crosses right index
	public static void reverseArray(int[] arr, int left, int right){
		if(left < right){
			int temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;	
			++left;
			--right;
			reverseArray(arr, left, right);
		}

	}

	public static void main(String[] args) throws FileNotFoundException{
		Scanner in;
		int[] array;
		if (args.length > 0) {
			File inputFile = new File(args[0]);
			in = new Scanner(inputFile);
		} 
		else {
			in = new Scanner(System.in); 
		}
		System.out.println("Enter the number of integers");
		int numbers = in.nextInt();
		array = new int[numbers];
		for(int i=0;i<numbers;i++){
			array[i] = in.nextInt();
		}
		rearrangeMinusPlus(array);
		print(array);
	}
}

/* Sample Output 
5
1
-2
3
-4
-5
-2 
-4 
-5 
1 
3 
 */