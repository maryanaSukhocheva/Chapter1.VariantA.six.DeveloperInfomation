/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package varianta.six.developerinfomation.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author SLAVA
 */
public class WorkWithDate {
    private Date dateBegin;
    private Date dateFinish;
    public final static SimpleDateFormat DATE_FORMAT=new SimpleDateFormat("dd.MM.yyyy hh:mm");
    public final static long NUMBER_OF_HOURS = 60 * 60 * 24 * 1000;
    
   public Date getDateBegin(String dateBeg, String timeBegin) throws IOException {
    try {
        dateBegin = DATE_FORMAT.parse(dateBeg+' '+timeBegin);
      } catch (ParseException e) {
          OutputData.println("Неверный формат даты");
       }
   
      return dateBegin;    
    }
    
    public Date getDateFinish(String dateBeg, String timeBegin, int timeLead) throws IOException {
        Date dateFinishFormat = null;
        long time = getDateBegin(dateBeg, timeBegin).getTime();
        long anotherDate =+ timeLead;
        time = time + (NUMBER_OF_HOURS * anotherDate);
     try {
         
         dateFinish = new Date(time);
         dateFinishFormat = DATE_FORMAT.parse(String.valueOf(dateFinish.getDate())+"."+String.valueOf(dateFinish.getMonth()+1)+"."+
               String.valueOf(dateFinish.getYear()+1900)+' '+String.valueOf(dateFinish.getHours())+":"+
               String.valueOf(dateFinish.getMinutes()));
      } catch (ParseException e) {
          OutputData.println("Неверный формат даты");
      }
      return dateFinishFormat;
              
    }
}
