/*  Problem is:-
       $ $ $ $
       $     $
       $     $
       $ $ $ $
*/

public class Pattern4
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=4;j++)
			{
				if((i==2 || i==3) && (j==2 || j==3))
                  {
					System.out.print("  ");
		        	}
		        else
		        {
		        	System.out.print("$ ");
		        }

			}
			System.out.println();
		}
	}
}