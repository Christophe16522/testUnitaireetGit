/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import Controle.ControleDate;
import java.text.ParseException;

/**
 *
 * @author Lai.C
 */
public class Test {

    public static void main(String[] args) throws ParseException {
        //System.out.println(FonctionDate.isValidDate("2017-01-01"));
        //System.out.println(FonctionDate.isValidTime(FonctionDate.minToHour(120).toString()));
        //System.out.println(FonctionDate.retToHentre(1,60,"08:00"));
        //System.out.println(Retard.getRetard("08:02:00","08:20:00"));
//        Scanner input = new Scanner(System.in);
//        int minute;
//        System.out.print("Enter the minutes to convert:");
//        minute =input.nextInt();
//        int h = minute/60;
//        int m = minute%60;
//        System.out.println(h+"heure"+" "+m+"minute");
        //System.out.println(FonctionDate.minToHour(175));
//        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
//        Date newTime = df.parse("02:02");
//        Calendar calendar = Calendar.getInstance();   
//        calendar.setTime(newTime);
//        calendar.add(Calendar.HOUR, 23);
//        calendar.add(Calendar.MINUTE, 30);
//        newTime = calendar.getTime();
//        
//        System.out.println(newTime.getHours()+":"+newTime.getMinutes());
        //Date heure1 = ;
        // Date h2 = heure + heure1;
        ControleDate cd = new ControleDate();
        cd.transformDate("2016/12*14");
        //test COme
    };
}
