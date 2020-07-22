package Solution1;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		int p=6; //length of array
		int arr[] = {10,20,20,46,10,40};
		for(int i=0;i< p-1;i++)
		{
			for(int j=i+1;j<p;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j] = arr[p-1];
					j--;
					p--;
					
				}
			}
		}
			for(int i=0;i<p;i++)
		{
			System.out.print(arr[i]+" ");
		}
		}

}
