import java.util.Scanner;
public class ConvertionProgram{
	
	public static void main(String[] args){
	
	//open a new scanner
	Scanner cuteScanner = new Scanner(System.in);
	
	//covertion factor: gallon is approximately equal to 3.78541 liters
	final double GALLON_TO_LITER = 3.78541;
	
	//prompt the user to enter value
	System.out.print("Enter the number of gallons: ");
	double gallons = cuteScanner.nextDouble();
	
	//convert gallon to liters
	double liters = gallons * GALLON_TO_LITER;
	
	//result
	System.out.println(gallons + " gallons is  equal to " + liters + " liters.");
	
	}//end of main method
	
}//end of class
