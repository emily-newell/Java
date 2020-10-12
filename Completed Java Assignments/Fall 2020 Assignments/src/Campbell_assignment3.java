
/* Emily Campbell
* 8/27/20
* Campbell Assignment 3
* This program will use Switch and If Else to determine average 
* temp and feel of the temp.
*
*/

import java.util.Scanner;

public class Campbell_assignment3
{
	public static void main(String[]args)
	
	{
		int dayInt;
		String dayString;
		String tempFeel = "Cold";
		
		double dayOneHigh, dayOneLow, dayOneAverage;
	
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 and 7: ");
		dayInt = console.nextInt();
		
		switch(dayInt)
		{
		case 1:
			dayString = "Sunday";
			break;
			
		case 2:
			dayString = "Monday";
			break;
			
		case 3:
			dayString = "Tuesday";
			break;
			
		case 4:
			dayString = "Wednesday";
			break;
			
		case 5:
			dayString = "Thursday";
			break;
			
		case 6:
			dayString = "Friday";
			break;
			
		case 7:
			dayString = "Saturday";
			break;
			
		default:
			dayString = "Sunday";
			
			
		}
		
		System.out.println("Enter the high temerature for the day: ");
		dayOneHigh = console.nextDouble();
		
		
		System.out.println("Enter the low temerature for the day: ");
		dayOneLow = console.nextDouble();
	

		
		dayOneAverage = (dayOneHigh + dayOneLow) / 2;
		
		if(dayOneAverage < 30)
			tempFeel = "cold";
		else
			if(dayOneAverage > 30 && dayOneAverage < 60 )
				tempFeel = "cool";
			else
				if(dayOneAverage > 60 && dayOneAverage < 80)
					tempFeel = "warm";
				else
					if(dayOneAverage > 80 && dayOneAverage < 100)
						tempFeel = "hot";
					else
						if(dayOneAverage > 100)
							tempFeel = "very hot";
		
			
		

		
		System.out.println("Today is " + dayString);	
		System.out.println("The high was " + dayOneHigh);
		System.out.println("The low was " + dayOneLow);
		System.out.println("The average was " + dayOneAverage);
		System.out.println("It was " + tempFeel + " today.");
		
		console.close();

	}
}