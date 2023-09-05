package cracklepop;

public class CracklePopper 
{
	public static void main (String[] args)
	{
		/*
		 * Write a program that prints out the numbers 1 to 100 (inclusive). 
		 * If the number is divisible by 3, print Crackle instead of the number. 
		 * If it's divisible by 5, print Pop. 
		 * If it's divisible by both 3 and 5, print CracklePop. 
		 */
		
		int crackleCount = 0;
		int popCount = 0;
		
		for(int i = 1; i <= 100; i++)
		{ 
			crackleCount++;
			popCount++;
			boolean cracklePopped = false;
			
			if(crackleCount == 3)
			{
				System.out.print("Crackle");
				crackleCount = 0;
				cracklePopped = true;
			}
			
			if(popCount == 5)
			{
				System.out.print("Pop");
				popCount = 0;
				cracklePopped = true;
			}
			
			if(cracklePopped) 
			{
				System.out.println();
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
