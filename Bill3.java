// Splits a restaurant bill evenly among three diners.
public class Bill3 {
    public static void main(String[] args) {
        // לקרוא את שמות הסועדים
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        
        // לקרוא את סכום החשבון ולחלק ב-3
        double a = Double.parseDouble(args[3]);
        double amountPerPerson = Math.ceil(a / 3); // עיגול כלפי מעלה
        
        // הדפסת התוצאה בסדר הנכון של השמות
        System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": Pay " + amountPerPerson + " Shekels each.");
    }
}
