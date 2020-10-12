/* Emily Campbell
* 10/11/20
* Campbell Midterm Assignment
* This program will use switch and loops to determine
* where the Franks family will go on vacation
*
*/

import java.util.Scanner;

public class Campbell_Vacation
{
	public static void main(String[]args)	
	{
		int vacationInt = 0;
		String vacationString;
		String vacationDepartureMonth;
		int vacationDepartureDay,vacationDepartureYear;		
		String frankFirstName = "", frankLastName= "", wifeFirstName= "", wifeLastName= "", sonFirstName= "", sonLastName= "", daughterFirstName= "", daughterLastName= "";
		int frankAge = 0, wifeAge = 0, sonAge = 0, daughterAge = 0;
		
	
		Scanner console = new Scanner(System.in);
		
		do {
			System.out.println("Enter a number between 1 and 6: ");
			vacationInt = console.nextInt();
			
		} while(vacationInt < 1 || vacationInt > 6);
		
		
		
		switch(vacationInt)
		{
		case 1:
			vacationString = "Hawaii - 7 days / 6 nights";
			break;
			
		case 2:
			vacationString = "New York - 3 days / 2 nights";
			break;
			
		case 3:
			vacationString = "London - 7 days / 6 nights";
			break;
			
		case 4:
			vacationString = "Bahamas - 7 days / 6 nights";
			break;
			
		case 5:
			vacationString = "Miami - 3 days / 2 nights";
			break;
			
		case 6:
			vacationString = "Los Angeles - 3 days / 2 nights";
			break;
			
		default:
			vacationString = "Stay Home - 7 days / 6 nights";
			
			
		}
		
		System.out.println("You chose the vacation: " + vacationString + "!\n");
		
		for (int familyNum = 1; familyNum < 5; familyNum++)
		{			
				if (familyNum == 1)
				{
					System.out.println("Enter your first name: ");
					frankFirstName = console.next();
					System.out.println("Enter your last name: ");
					frankLastName = console.next();
					System.out.println("Enter your age: ");
					frankAge = console.nextInt();

				}
				else if(familyNum == 2)
				{
					System.out.println("Enter your wife's first name: ");
					wifeFirstName = console.next();
					System.out.println("Enter your wife's last name: ");
					wifeLastName = console.next();
					System.out.println("Enter your wife's age: ");
					wifeAge = console.nextInt();
				}
				else if(familyNum == 3)
				{
					System.out.println("Enter your son's first name: ");
					sonFirstName = console.next();
					System.out.println("Enter your son's last name: ");
					sonLastName = console.next();
					System.out.println("Enter your son's age: ");
					sonAge = console.nextInt();
				}
				else 
				{
					System.out.println("Enter your daughter's first name: ");
					daughterFirstName = console.next();
					System.out.println("Enter your daughter's last name: ");
					daughterLastName = console.next();
					System.out.println("Enter your daughter's age: ");
					daughterAge = console.nextInt();
				}			
		}

		
		System.out.println("Enter your departure month of your vacation: ");
		vacationDepartureMonth = console.next();		
		System.out.println("Enter your departure day of your vacation: ");
		vacationDepartureDay = console.nextInt();		
		System.out.println("Enter your departure year of your vacation: ");
		vacationDepartureYear = console.nextInt();		

		
		System.out.println("Congratulations! You and your family are going to " + vacationString + ".\n" +
				frankFirstName + "\t" + frankLastName + "\t" + frankAge + "\n" +
				wifeFirstName + "\t" + wifeLastName + "\t" + wifeAge + "\n" +
				sonFirstName + "\t" + sonLastName + "\t" + sonAge + "\n" +
				daughterFirstName + "\t" + daughterLastName + "\t" + daughterAge + "\n" +
				"Your departure date is: " + vacationDepartureMonth + " " + vacationDepartureDay + ", " + vacationDepartureYear + ".\n");
		
		console.close();

	}
}