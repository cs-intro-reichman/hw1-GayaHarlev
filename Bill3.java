public class Bill3 {
    public static void main(String[] args) {
        // קריאה לשמות הסועדים ולקבלת סכום החשבון
        String diner1 = args[2];  // Dan
        String diner2 = args[1];  // Lisa
        String diner3 = args[0];  // Ron
        int totalAmount = Integer.parseInt(args[3]);

        // חישוב הסכום שכל סועד צריך לשלם (מעוגל כלפי מעלה)
        double amountPerDiner = Math.ceil(totalAmount / 3.0);

        // הדפסת הפלט המתואם
        System.out.println("Dear " + diner1 + ", " + diner2 + ", and " + diner3 + ": pay " + amountPerDiner + " Shekels each.");
    }
}
