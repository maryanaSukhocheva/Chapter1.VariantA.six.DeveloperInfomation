/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package varianta.six.developerinfomation;

import java.text.ParseException;
import varianta.six.developerinfomation.action.Action;

/**
 *
 * @author SLAVA
 */
public class DeveloperInfomation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Action action= new Action();
        action.OutputDeveloper("Сухочева");
        action.getDateBegin("20.06.2017", "12:00");
        action.getDateFinish("20.06.2017", "12:00",14);
    }
}
