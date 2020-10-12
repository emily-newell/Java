/* Emily Campbell
* 8/27/20
* Campbell Assignment 2A
* Accept input from the user using the JOptionPane
*
*/

import javax.swing.JOptionPane;

public class Campbell_Assignment2A
{
	public static void main(String[]args)
	
	{
		String DayOne, DayOneHighString, DayOneLowString;
		
		double DayOneHigh, DayOneLow, DayOneAverage;
		
		DayOne = JOptionPane.showInputDialog(null, "What is the day today?", "Day Dialog 1", JOptionPane.INFORMATION_MESSAGE);

		DayOneHighString = JOptionPane.showInputDialog(null, "What is the high today?", "Day High Dialog", JOptionPane.INFORMATION_MESSAGE);
		DayOneHigh = Double.parseDouble(DayOneHighString);
		
		DayOneLowString = JOptionPane.showInputDialog(null, "What is the low today?", "Day Low Dialog", JOptionPane.INFORMATION_MESSAGE);
		DayOneLow = Double.parseDouble(DayOneLowString);
		
		DayOneAverage = (DayOneHigh + DayOneLow) / 2;
		
		JOptionPane.showMessageDialog(null,  "Today's day is " + DayOne + "." + "\nThe high is " + DayOneHigh + " and the low is " + DayOneLow + "." + "\nThe average tempeature for the day is " + DayOneAverage + "." );
	}
}