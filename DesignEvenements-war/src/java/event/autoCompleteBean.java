/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package event;
  
import java.util.ArrayList;  
import java.util.List;  
import javax.inject.Named;

@Named(value = "autoCompleteBean")  
public class autoCompleteBean {  
  
    private String txt1;  
      
    public List<String> complete(String query) {  
        List<String> results = new ArrayList<String>();  
          
        for (int i = 0; i < 10; i++) {  
            results.add(query + i);  
        }  
          
        return results;  
    }  
  
    public String getTxt1() {  
        return txt1;  
    }  
  
    public void setTxt1(String txt1) {  
        this.txt1 = txt1;  
    }    
}  