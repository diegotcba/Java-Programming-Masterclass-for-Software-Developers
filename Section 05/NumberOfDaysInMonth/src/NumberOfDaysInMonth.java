/**
 * Created by DiegoT on 29/05/2019.
 */
public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        boolean leapYear = false;

        if (year >= 1 && year <= 9999) {
            if(((year % 4) == 0 && (year % 100 == 0) && (year % 400 == 0)) || ((year % 4) == 0 && (year % 100 != 0))) {
                leapYear = true;
            }
        }

        return leapYear;
    }

    public static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        int daysInMonth;
        switch (month) {
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                daysInMonth = 31;
                break;
            case 2:
                if(isLeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 4:case 6:case 9:case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = -1;
                break;
        }

        return daysInMonth;
    }
}
