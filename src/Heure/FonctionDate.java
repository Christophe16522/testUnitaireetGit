/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heure;

import java.sql.Date;
//import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author ITU
 */
public class FonctionDate {

    public static Date[] getSemJour(Date date) {
        Date[] dates = new Date[7];
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int dayOfWeek = 2;
        for (int i = 0; i < 7; i++, dayOfWeek++) {
            if (dayOfWeek > 6) {
                dayOfWeek = 0;
            }
            cal.set(Calendar.DAY_OF_WEEK, dayOfWeek);
            dates[i] = new Date(cal.getTimeInMillis());
            System.out.println(sdf.format(dates[i].getTime()));
        }
        return dates;
    }

    public static boolean isValidDate(String dateString) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            df.parse(dateString);
            return true;
        } catch (Exception e) {

            throw new UnsupportedOperationException("Not a date");

        }

        // return false;
    }

    public static boolean isValidTime(String timeString) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
        try {
            df.parse(timeString);
            return true;
        } catch (Exception e) {

            throw new UnsupportedOperationException("Not a time");

        }

        // return false;
    }

    public static String minToHour(int minute) {
        int h = minute / 60;
        int m = minute % 60;
        String heure = h + ":" + m;
        return heure;
    }

    public static String retToHentre(int nbrRet, int totalRet, String heureDebut) throws ParseException {
        int minparRet = totalRet / nbrRet;
        String retparJour = minToHour(minparRet);
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
        java.util.Date heure = df.parse(retparJour);
        java.util.Date newTime = df.parse(heureDebut);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(newTime);
        calendar.add(Calendar.HOUR, heure.getHours());
        calendar.add(Calendar.MINUTE, heure.getMinutes());
        newTime = calendar.getTime();
        //String res = newTime.getHours() + ":" + newTime.getMinutes();
        return df.format(newTime).toString();
    }
}
