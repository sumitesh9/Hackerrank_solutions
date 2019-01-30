
import java.time.LocalDate;

class Result {
    public static String findDay(int month, int day, int year)
    {
        Calendar c = Calendar.getInstance();
        c.set(Integer.valueOf(year), Integer.valueOf(month) - 1, Integer.valueOf(day));
        String dayOfWeek = "";
        switch (c.get(Calendar.DAY_OF_WEEK))
        {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
        }
        return dayOfWeek.toUpperCase();
    }
}
