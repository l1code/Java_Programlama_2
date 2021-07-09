/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.isparta.edu.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author drhal
 */
public class BolumService {
    public void BolumEkleme(Connection con){
       String query="insert into bolum(Adi, Aciklama, Eposta) ";
       query +="values('İnşaat. Müh.','İnşaat Mühendisliği','insaatmuh@isparta.edu.tr');";
       
       try{
       Statement stm=(Statement)con.createStatement();
       int executeUpdate=stm.executeUpdate(query);
       }catch(Exception ex){
           ex.printStackTrace();
       }
       System.out.println("Ekleme işlemi başarıyla tamamlandı.");
    }
    
    public void BolumEkleme(String adi, String aciklama, String eposta){
        String query="insert into bolum(Adi,Aciklama,Eposta) values(?,?,?) ";
        
        try{
            Connection con=new DBConnector().BaglantiGetir();
            Statement stm=(Statement)con.createStatement();
            PreparedStatement preparedStmt=con.prepareStatement(query);
            preparedStmt.setString(1, adi);
            preparedStmt.setString(2, aciklama);
            preparedStmt.setString(3, eposta);
            
            preparedStmt.execute();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    
    public DefaultTableModel BolumGetir(DefaultTableModel model) {
        model.getDataVector().removeAllElements();
        Statement stmt=null;
        
        String sorgu="select ID,Adi,Aciklama,Eposta from bolum";
        Connection con=new DBConnector().BaglantiGetir();
        try{
        
                    stmt=con.createStatement(); 
                    ResultSet rs=stmt.executeQuery(sorgu);
        
                    while(rs.next()){
                        int ID=rs.getInt(1);
                        String adi=rs.getString(2);
                        String aciklama=rs.getString(3);
                        String eposta=rs.getString(4);
                        
                        
                        model.addRow(new Object[]{ID,adi,aciklama,eposta});                        
                    }
        
         }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                if(stmt!=null){
                    stmt.close();
                }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
        return model;
    }
    
    public void BolumSilme(int ID){        
        String query="delete from bolum Where ID=?";       
        
        try{
            Connection con=new DBConnector().BaglantiGetir();
            
            Statement stm = (Statement) con.createStatement();
            PreparedStatement preparedStmt=con.prepareStatement(query);
            preparedStmt.setInt(1,ID);
            
            preparedStmt.execute();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void BolumGuncelleme(int ID, String adi, String aciklama, String eposta){
        //UPDATE `bolum` SET `ID`=[value-1],`Adi`=[value-2],`Aciklama`=[value-3],`Eposta`=[value-4] WHERE 1
        String query = "update bolum set Adi=?, Aciklama=?, Eposta=? WHERE ID=?";
        
        try{
            Connection con=new DBConnector().BaglantiGetir();
            Statement stm = (Statement) con.createStatement();
            PreparedStatement preparedStmt=con.prepareStatement(query);
            preparedStmt.setString(1, adi);
            preparedStmt.setString(2, aciklama);
            preparedStmt.setString(3, eposta);  
            preparedStmt.setInt(4, ID);
            
            preparedStmt.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }        
    }    
}
