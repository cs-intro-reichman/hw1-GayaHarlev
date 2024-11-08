// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]); // סכום להשקעה
        double rate = Double.parseDouble(args[1]) / 100; // ריבית
        int n = Integer.parseInt(args[2]); // מספר השנים

		double futurevalue = currentValue * Math.pow(1 + rate, n); //לפי הנוסחה הנתונה
		System.out.println("After " + n + " years, $" + currentValue + " saved at " + (rate * 100) + "% will yield " + (int) futurevalue);

	}
}