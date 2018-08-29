import java.util.Scanner;
import java.math.*;
import java.lang.Math;




public class Marks {
	
	public static void main(String [] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the number of subjects you want to enter?");
		num = sc.nextInt();
		
		String subj[]= new String[num];
		double mark[] = new double[num];
		int indexHigh = 0;
		int indexLow = 0;
		double highest = mark[0];
		double lowest = mark[0];
		
		
		
		
		
		if(num == 0)
		{
			System.out.println("Okay Bye Bye");
		}
		else

			for(int i = 0; i < num; i++)
			{
				System.out.println("Enter the Subject Name " + (i + 1));
				subj[i] = sc.next();
				
				System.out.println("Enter the Subject Mark " + (i + 1));
				mark[i] = sc.nextDouble();
			}
			
			
			
			for(int x = 0; x < num; x++)
			{
				if(mark[x] == 48.5 ||  mark[x] == 49)
				{
					mark[x] = Math.ceil(mark[x]);
					
					if(mark[x] == 49)
					{
						mark[x] = 50;
					}
				}
				
				if(mark[x] == 73.5 || mark[x] == 74)
				{	
						mark[x] = Math.ceil(mark[x]);
					
					if(mark[x] == 74)
					{
						mark[x] = 75;
					}
					
				}
			}
			
			
			
			for(int z = 1; z < num;z++ )
			{
				if(mark[z] > highest)
				{
					highest = mark[z];
					indexHigh = z;
				}
				
				if(mark[z] < lowest)
				{
					lowest = mark[z];
					indexLow = z;
				}
				
				
			}
			
		
		
		System.out.println("The Entered Subjects with their Results:");
		
		
		
		System.out.println("Highest Subject is " + subj[indexHigh].toUpperCase()
				+ " with " + mark[indexHigh] + " Percentage");
		
		System.out.print("\n");
		
		System.out.println("Lowest Subject is " + subj[indexLow].toUpperCase()
				+ " with " + mark[indexLow] + " Percentage");
		
		
		
		sc.close();
			
	}

}
