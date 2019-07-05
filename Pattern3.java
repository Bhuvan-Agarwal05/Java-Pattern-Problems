/*  Problem is:- 

          A
          A B
          A B C

*/


public class Pattern3
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=65;i<=67;i++)
		{
			for(j=65;j<=i;j++)
			{
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
}