package Solution1;

//import java.util.Scanner;

public class MaximumFind {

	
	public static int Large(int[] arr) {
		int max=arr[0],i;
		for(i=0;i<=2; i++)
		{
			if(arr[i]> arr[i+1])
				max=arr[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,56,46};
		System.out.print("maximun is"+Large(arr));
		
	}

}
