/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package varianta.six.developerinfomation;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import varianta.six.developerinfomation.action.OutputData;
import varianta.six.developerinfomation.action.WorkWithDate;

/**
 *
 * @author SLAVA
 */
public class DeveloperInfomation {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        String developer="Сухочева";
        OutputData.println("Фамилия разработчика "+developer);
        WorkWithDate actionDate = new WorkWithDate();
        Date dateBegin = actionDate.getDateBegin("20.06.2017", "12:00");
        OutputData.println("Дата и время получения задания " + WorkWithDate.DATE_FORMAT.format(dateBegin));
        Date dateFinish = actionDate.getDateFinish("20.06.2017", "12:00",14);
        OutputData.println("Дата и время сдачи задания " + WorkWithDate.DATE_FORMAT.format(dateFinish));
        
    }
}
