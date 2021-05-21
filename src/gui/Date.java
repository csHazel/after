package gui;
import javax.swing.*;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Date  {
    public static void main(String[] args) {

    GregorianCalendar d = new GregorianCalendar();

//得到当天日期
    int today = d.get(Calendar.DAY_OF_MONTH);

//得到当前月份
    int month = d.get(Calendar.MONTH);

//设置一个月第一天是1号
    d.set(Calendar.DAY_OF_MONTH, 1);

//获取1号是星期几
    int weekday = d.get(Calendar.DAY_OF_WEEK);

//获取每周第一天是星期几
    int firstofweek = d.getFirstDayOfWeek();

//记录本月第一天是星期几
    int indent = 0;
    while (weekday != firstofweek) {
        indent++;
        d.add(Calendar.DAY_OF_MONTH, -1);
        weekday = d.get(Calendar.DAY_OF_WEEK);
    }

//获取星期的名称：星期日 星期一  ...星期六，并格式化输出
    String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
    do {
        System.out.printf("%4s", weekdayNames[weekday]);
        d.add(Calendar.DAY_OF_MONTH, 1);
        weekday = d.get(Calendar.DAY_OF_WEEK);
    } while (weekday != firstofweek);
    System.out.println();

//输出indent个空白，在上面已经得到了，本月第一天是星期几，前面几天是空白
    for (int i = 1; i <= indent; i++)
        System.out.print("    ");

//设置每月第一天为1号
    d.set(Calendar.DAY_OF_MONTH, 1);
    do {
        int day = d.get(Calendar.DAY_OF_MONTH);
        System.out.printf("%3d", day);

//设置今天的日期上面加*，明显标识
        if (day == today)
            System.out.print("*");
        else
            System.out.print(" ");
        d.add(Calendar.DAY_OF_MONTH, 1);
        weekday = d.get(Calendar.DAY_OF_WEEK);
        if (weekday == firstofweek)
            System.out.println();


    } while (d.get(Calendar.MONTH) == month);
    if (weekday != firstofweek)
        System.out.println();


}
}

