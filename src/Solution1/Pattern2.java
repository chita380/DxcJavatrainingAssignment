package Solution1;

public class Pattern2 {


	public static void main(String[] args) {
		int i,j,k=5;
		for(i=1;i<=5;i++)
		{
			
			for(j=1;j<=9;j++)
				{
				System.out.print(" ");
				if(j>=6-i && j<=4+i){
					
					System.out.print(k);
					
					if(j<5) 
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
