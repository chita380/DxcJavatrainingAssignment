package Solution1;

public class ArraySort {
	
	public static void main(String[] args) {
		
		int arr [] ={15,17,12,9,89,67,8,65,45,7};
		for(int round=0;round<=9;round++){
			for(int i=0;i<=8;i++){
				if (arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		
		for(int i=0; i<arr.length;i++)
		
			System.out.print(arr[i]+" ");
		
	}

}
