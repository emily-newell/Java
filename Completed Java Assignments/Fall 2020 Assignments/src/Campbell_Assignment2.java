
/* Emily Campbell
* 8/27/20
* Campbell Assignment 2
* Accept input from the user using the Scanner class
*
*/

import java.util.Scanner;

public class Campbell_Assignment2
{
	public static void main(String[]args)
	
	{
		String DayOne;
		final String DayTwo = "Tuesday";
		
		double DayOneHigh, DayOneLow, DayOneAverage;
		final double DayTwoHigh = 88.6;
		final double DayTwoLow = 66.5;
		double DayTwoAverage = (DayTwoHigh + DayTwoLow) / 2;
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter the day of the week: ");
		DayOne = console.nextLine();
		
		
		System.out.println("Enter the high temerature for the day: ");
		DayOneHigh = console.nextDouble();
		console.nextLine();
		
		System.out.println("Enter the low temerature for the day: ");
		DayOneLow = console.nextDouble();
		console.nextLine();

		
		
		DayOneAverage = (DayOneHigh + DayOneLow) / 2;

		
		System.out.println("Today's Average Temperature: " + DayOneAverage);		
		
		System.out.println("Day of the Week: " + DayTwo);
		System.out.println("Today's High Temperature: " + DayTwoHigh);
		System.out.println("Today's High Temperature: " + DayTwoLow);
		System.out.println("Today's High Temperature: " + DayTwoAverage);

		console.close();
	}
}