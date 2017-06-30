/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package varianta.six.developerinfomation.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author SLAVA
 */
public class Action {
    static Date dateBegin;
    static Date dateFinish;
    
    public void OutputDeveloper(String developer) {
        //System.out.println("Введите фамилию разработчика");
        //String encoding = System.getProperty("console.encoding", "cp1251");
        //Scanner scan = new Scanner(System.in, encoding);
        //developer = scan.nextLine();
        System.out.println("Фамилия разработчика " + developer);
   }
    public Date getDateBegin(String dateBeg, String timeBegin) throws ParseException {
      SimpleDateFormat dateformat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
      try {
        dateBegin = dateformat.parse(dateBeg+' '+timeBegin);
      } catch (Exception e) {
          System.out.println("Неверный формат даты");
      }
      System.out.println("Дата и время получения задания " + dateformat.format(dateBegin));
      return dateBegin;    
    }
    public Date getDateFinish(String dateBeg, String timeBegin, int timeLead) throws ParseException {
        Date dateF = null;
        Long time = getDateBegin(dateBeg, timeBegin).getTime();
        long anotherDate = +timeLead;
        time = time + (60 * 60 * 24 * 1000 * anotherDate);
        SimpleDateFormat dateformat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
      try {
         
          dateFinish = new Date(time) {};
          
           dateF = dateformat.parse(String.valueOf(dateFinish.getDate())+"."+String.valueOf(dateFinish.getMonth()+1)+"."+
               String.valueOf(dateFinish.getYear()+1900)+' '+String.valueOf(dateFinish.getHours())+":"+
               String.valueOf(dateFinish.getMinutes()));
      } catch (Exception e) {
          System.out.println("Неверный формат даты");
      }
      
        System.out.println("Дата и время сдачи задания " + dateformat.format(dateF));
        return dateF;
              
    }
}
