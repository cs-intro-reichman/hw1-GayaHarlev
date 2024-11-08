// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		
        // טיפול בפורמט AM/PM
        if (hours < 12) { // אם הזמן בבוקר (AM)
            if (minutes < 10) {
                System.out.println(hours + ":0" + minutes + " AM"); // אם הדקות קטנות מ-10, נוסיף 0 לפני הדקות
            } else {
                System.out.println(hours + ":" + minutes + " AM"); // אם הדקות גדולות מ-9, נציג את הדקות כמו שהן
            }
        } else { // אם הזמן אחר הצהריים (PM)
            int displayHour = hours; // ניצור משתנה שיעזור לנו להמיר את השעה לפורמט 12 שעות
            if (hours > 12) { // אם השעה גדולה מ-12, נמיר אותה לפורמט 12 שעות
                displayHour = hours - 12; // נוריד 12 מהשעה כדי להמיר לפורמט 12 שעות
            }
            if (hours == 12) { // אם השעה היא בדיוק 12 (צהריים), נציג אותה כ-12 PM
                displayHour = 12;
            }
            if (hours == 0) { // אם השעה היא חצות (00:00), נציג אותה כ-12 AM
                displayHour = 12; 
            }

            // הדפסת השעה והדקות עם AM/PM
            if (minutes < 10) {
                System.out.println(displayHour + ":0" + minutes + " PM"); // אם הדקות קטנות מ-10, נוסיף 0 לפני הדקות
            } else {
                System.out.println(displayHour + ":" + minutes + " PM"); // אם הדקות גדולות מ-9, נציג את הדקות כמו שהן
            }
        }
    }
}
