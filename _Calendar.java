import java.util.Calendar;
import java.util.Scanner;

public class _Calendar  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfMonth = getFirstDayOfMonth(month, year);
        
        System.out.println("  Su  Mo  Tu  We  Th  Fr  Sa");
        
        switch (month) {
            case 1:
                printCalendar(31, firstDayOfMonth);
                break;
            case 2:
                printCalendar(daysInMonth, firstDayOfMonth);
                break;
            case 3:
                printCalendar(31, firstDayOfMonth);
                break;
            case 4:
                printCalendar(30, firstDayOfMonth);
                break;
            case 5:
                printCalendar(31, firstDayOfMonth);
                break;
            case 6:
                printCalendar(30, firstDayOfMonth);
                break;
            case 7:
                printCalendar(31, firstDayOfMonth);
                break;
            case 8:
                printCalendar(31, firstDayOfMonth);
                break;
            case 9:
                printCalendar(30, firstDayOfMonth);
                break;
            case 10:
                printCalendar(31, firstDayOfMonth);
                break;
            case 11:
                printCalendar(30, firstDayOfMonth);
                break;
            case 12:
                printCalendar(31, firstDayOfMonth);
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }

        scanner.close();
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static int getFirstDayOfMonth(int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public static void printCalendar(int daysInMonth, int firstDayOfMonth) {
        int dayOfWeek = 0;
        int day = 1;
        for (int i = 1; i < firstDayOfMonth; i++) {
            System.out.print("    ");
            dayOfWeek++;
        }
        while (day <= daysInMonth) {
            if (day < 10) {
                System.out.print("   " + day);
            } else {
                System.out.print("  " + day);
            }
            day++;
            dayOfWeek++;
            if (dayOfWeek == 7) {
                System.out.println();
                dayOfWeek = 0;
            }
        }
        if (dayOfWeek != 0) {
            System.out.println();
        }
    }
}
