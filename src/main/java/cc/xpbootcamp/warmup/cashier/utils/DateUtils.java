package cc.xpbootcamp.warmup.cashier.utils;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateUtils {
    static DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);

    public static String format(Date date) {
        return df.format(date);
    }

    public static boolean isWednesday(Date date) {
        SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");

        return dateFm.format(date).equals("星期三");
    }
}