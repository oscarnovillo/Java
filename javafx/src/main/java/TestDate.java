
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class TestDate {
    public static void main(String[] args) {
        
        
            Date d = new Date();
           
            
          
             
            LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault()).toLocalDate();
        
    }
   
}
