//import java.util.Scanner;
public class starmaking {
	public static void main(String[] args) {
		int k,i,j;
		
		System.out.println(" enter the number of rows ");
		//Scanner s=new Scanner(System.in);
		//int n=s.nextInt();

		 for(i=1;i<=4;i++)
		 {
			for(j=1;j<=i;j++)
			 {
				if(j==1 || j==i)
                     {
					    System.out.print(i);
                     } 
			 }

			 {
				        System.out.println("0");
				
                     }   
				System.out.println(" "); 
			 }
			
		 }	
	}
	
	
	/*for(i=1;i<=n;i++)
	{
		for(j=n-1;j>=i;j--)
		{
			//System.out.print();
			System.out.print(" ");
			
		}
		for(k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}*\
		




/*		     for( i=1;i<=n;i++)
				{
				   for(j=1;j<=i;j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
			      
		     for( i=1;i<=n;i++)
				{
				  for(j=n-1;j>=i;j--)
					{
						System.out.print("*");
					}
					System.out.println();
				}
			

		}

} 
*/
/*public class starmaking
{
	public static void main(String args[])
	{
 
		int i, j, t;
		System.out.println("How many row you want ");
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for (j = 0; j < t; j++)
		{
			for (i = t - 1; i >= j; i--)
			{
				System.out.print("*");
 
			}
			System.out.println("");
		}
	}
}
*/