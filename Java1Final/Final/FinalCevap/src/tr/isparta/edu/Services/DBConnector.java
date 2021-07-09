/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.isparta.edu.Services;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author drhal
 */
public class DBConnector {
    public static Connection BaglantiGetir(){
        Connection baglanti=null;
        try{
          
          Class.forName("com.mysql.cj.jdbc.Driver");
          baglanti=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/ogrencitakip", "root", "");
          
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return baglanti;
    }
    
    public void Kapat(Connection baglanti){
         try{
            if(baglanti!=null){
                baglanti.close();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
