package Solution1;

public class Pattern1 {
	public static void main(String[] args) {
	int i,j,k;
	for(i=1;i<=5;i++)
	{
		k=1;
		for(j=1;j<=5;j++)
			{
			System.out.print(" ");
			if(j<=6-i){
				System.out.print(k);
				k++;
			}
			else
				System.out.print(" ");
			
			}
		
		System.out.println("");
	}

}
}
