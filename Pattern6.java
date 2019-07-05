/*   Problem is :-
  
         1 2 3 4 5 6
           1 2 3 4 5 
             1 2 3 4
               1 2 3
                 1 2
                   1

*/

public class Pattern6
{
	public static void main(String args[])
	{ int i,j,k;
		for(i=6;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
              System.out.print(j+" ");
			}
			System.out.println();
            k=i;
			while(k<7)
			  {
				System.out.print("  ");
				k++;
			     } 
		}
	}
}