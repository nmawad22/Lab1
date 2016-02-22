import java.util.Scanner;
/* this lab indicate the Present value and PMT for people.
 *  This is compiled by Noah Awad, Linghan Kong, Shijie Kuang, Thang Dao.
 *  It consumes 8 variables and Produces 2 variables which are the present value and PMT
 */
public class RetirementCalculator {
	public static void main(String[] args) {
		double yearsToWork; // How many years people need to work
		double annualReturnBR;// the interest of annual return
		double yearsRetired;// how many years people retired
		double annualReturnAR;// the interest of annual return after retire
		double requiredIncome;// the required income of people	
		double monthlySSI;// the monthly SSI
		double totalSaving;// the total saving
		double saveMonthly;// how much money need to save monthly
	//Read in values
		
		Scanner reader = new Scanner(System.in); //
		System.out.print(" Enter the amount of years you want to work:");
		yearsToWork = reader.nextDouble(); // next input read as Number of Years to work
		
		System.out.print(" Enter your annual return rate before retirement:");
		annualReturnBR = reader.nextDouble();
		
		System.out.print(" Enter the amount of years retired:");
		yearsRetired = reader.nextDouble();
		
		System.out.print(" Enter the annual return after retirement");
		annualReturnAR = reader.nextDouble();
		
		System.out.print(" Enter your required income:");
		requiredIncome = reader.nextDouble();
		
		System.out.print(" Enter your monthly SSI:");
		monthlySSI = reader.nextDouble();
		// Prompts User Input
		
		
		totalSaving = (requiredIncome - monthlySSI) * ((1-(1/(Math.pow(1+(annualReturnAR/100)/12, yearsRetired * 12 )))))/((annualReturnAR/100)/12); //Total amount saves
		//Present Value Formula
		
		saveMonthly = totalSaving * (((annualReturnBR/100)/12)/((Math.pow(1+(annualReturnBR/100)/12, yearsToWork*12))-1)); //Required Monthly Savings
		//PMT Formula

		
		System.out.printf(" In order to save %.2f , you must save   %.2f   every month.",totalSaving , saveMonthly) ;
		
 
	}
}
