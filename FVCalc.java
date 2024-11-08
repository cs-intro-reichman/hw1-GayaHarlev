public class FVCalc {
    public static void main(String[] args) {
        // קריאה לערכים מהקלט (currentValue, rate, n)
        int currentValue = Integer.parseInt(args[0]); // סכום ההשקעה הנוכחי
        double rate = Double.parseDouble(args[1]); // שיעור הריבית
        int n = Integer.parseInt(args[2]); // מספר השנים

        // חישוב ערך עתידי (future value)
        double futureValue = currentValue * Math.pow(1 + rate / 100.0, n);

        // הדפסת התוצאה בפורמט הנדרש
        System.out.printf("After %d years, a $%d saved at %.1f%% will yield $%d%n", n, currentValue, rate, (int) futureValue);
    }
}