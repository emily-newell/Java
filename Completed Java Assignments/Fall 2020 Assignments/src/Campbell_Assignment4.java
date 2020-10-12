/* Emily Campbell
* 10/07/20
* Campbell Assignment 4
* use loops to ask for input and display output for 
* days highs and lows 
*/

import java.util.Scanner;

public class Campbell_Assignment4
{
	public static void main(String[]args)
	
	{
		String DayOne;
		
		
		double DayOneHigh, DayOneLow;
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter the day of the week: ");
		DayOne = console.nextLine();
		
		
		System.out.println("Enter the high temperature for the day: ");
		DayOneHigh = console.nextDouble();
		
		
		System.out.println("Enter the low temperature for the day: ");
		DayOneLow = console.nextDouble();
		

		System.out.println("Today is " + DayOne + ". The high for today is " + DayOneHigh + ". The low for today is " + DayOneLow + ".\n" );
		
		double totalHigh = 0;
		int dayCount = 1;
		while(dayCount < 8)
		{	
			String dayString;
			System.out.println("Enter a day of the week: ");
			dayString = console.next();
			
			System.out.println("Enter the high temperature for that day.");
			double dayHigh = console.nextDouble();
			
			
			System.out.println("Day: " + dayString);
			System.out.println("High: " + dayHigh);
			System.out.println("Count High: " + dayCount);
			totalHigh = (dayHigh + totalHigh);
			System.out.println("Total High: " + totalHigh);
			System.out.println("Average High: " + (totalHigh / dayCount));			
			
			
			dayCount = dayCount + 1;
		}
		
		double totalLow = 0;
		for(int dayCountForLoop = 1; dayCountForLoop < 8; dayCountForLoop++)
		{	
			String dayStringForLoop;
			System.out.println("Enter a day of the week: ");
			dayStringForLoop = console.next();
			
			System.out.println("Enter the low temperature for that day.");
			double dayLow = console.nextDouble();
			
			
			System.out.println("Day: " + dayStringForLoop);
			System.out.println("Low: " + dayLow);
			System.out.println("Count Low: " + dayCountForLoop);
			totalLow = (dayLow + totalLow);
			System.out.println("Total Low: " + totalLow);
			System.out.println("Average Low: " + (totalLow / dayCountForLoop));			
		}
		
		
		double totalHighDoWhile = 0;
		double totalLowDoWhile = 0;
		int doWhileDayCount = 1;
		int doWhileContinue = 1;
		do {
			String dayString;
			System.out.println("Enter a day of the week: ");
			dayString = console.next();
			
			System.out.println("Enter the high temperature for that day.");
			double dayHigh = console.nextDouble();
			
			System.out.println("Enter the low temperature for that day.");
			double dayLow = console.nextDouble();
			
			
			System.out.println("Day: " + dayString);
			System.out.println("High: " + dayHigh);
			System.out.println("Count High: " + doWhileDayCount);
			totalHighDoWhile = (dayHigh + totalHighDoWhile);
			System.out.println("Total High: " + totalHighDoWhile);
			System.out.println("Average High: " + (totalHighDoWhile / doWhileDayCount));	
			
			System.out.println("Day: " + dayString);
			System.out.println("Low: " + dayLow);
			System.out.println("Count Low: " + doWhileDayCount);
			totalLowDoWhile = (dayLow + totalLowDoWhile);
			System.out.println("Total Low: " + totalLowDoWhile);
			System.out.println("Average Low: " + (totalLowDoWhile / doWhileDayCount));
			
			System.out.println("Do you wish to make another entry? Enter 1 to continue, any other number to stop.");
			doWhileContinue = console.nextInt();
			
			doWhileDayCount = doWhileDayCount + 1;

			
		} while(doWhileContinue == 1);
		
		
		console.close();
	}
}