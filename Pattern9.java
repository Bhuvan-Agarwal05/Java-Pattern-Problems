/*   Problem is :-
  
         1
       1 1 1
     1 1 1 1 1
   1 1 1 1 1 1 1 
 1 1 1 1 1 1 1 1 1 

*/

public class Pattern9
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
                if(i==1 && j==5)
                {
                	System.out.print(1+" ");
                }
               else if(i==2 && (j==4 || j==5 || j==6))
                {
                	System.out.print(1+" ");
                }  
                else if(i==3 && (j==3 || j==4 || j==5 || j==6 || j==7))
                {
                	System.out.print(1+" ");
                }
                else if(i==4 && (j==2 || j==3 || j==4 || j==5 || j==6 || j==7 || j==8))
                {
                	System.out.print(1+" ");
                }
                else if (i==5){
                System.out.print(1+" ");
                	
                }
                else
                {
                	System.out.print("  ");
                }
                
			}
			System.out.println();
                
		}
		
	}
}