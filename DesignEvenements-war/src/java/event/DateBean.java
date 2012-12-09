package event;  
  
import java.util.Date;  
  
import org.primefaces.event.DateSelectEvent;  
  
public class DateBean {  
  
    private Date date1;
    private Date date2;
    
    Date getDate1() {
        return date1;
    }
    Date getDate2() {
        return date2;
    }
    void setDate1(Date date) {
        date1=date;
    }
    void setDate2(Date date) {
        date2=date;
    }
}