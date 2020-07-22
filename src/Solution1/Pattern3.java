package Solution1;

public class Pattern3 {
	
	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=6;i++)
		{
			k=1;
			for(j=1;j<=11;j++)
				{
				System.out.print(" ");
				if(j>=i && j<=12-i){
					
					System.out.print(k);
					
					if(j<6) 
						k++;
					else
						k-- ;
				}
				else
					System.out.print(" ");
				
				}
			
			System.out.println("");
		}

	}

}
