/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DBConnection;
import Model.Lawyer;
import java.sql.*;

/**
 *
 * @author Amaury
 */
public class LawyerController {
    DBConnection con;
    
    public LawyerController() {
        con = new DBConnection();
    }        
    
    public void Insert(Lawyer lawyer) throws Exception
    {
        try {
            Connection dbAcess = con.ToConnect();
            CallableStatement cs = dbAcess.prepareCall("sp_insert_lawyer ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?");
            cs.setLong(0, lawyer.Id_Company);
            cs.setString(1, lawyer.Name);
            cs.setString(2, lawyer.Registration_Number);
            cs.setString(3, lawyer.Sectional_Council);
            cs.setInt(4, lawyer.Inscription_Type);
            cs.setString(5, lawyer.Address_Code);
            cs.setString(6, lawyer.Address);
            cs.setInt(7, lawyer.Number);
            cs.setString(8, lawyer.District);
            cs.setString(9, lawyer.City);
            cs.setString(10, lawyer.State);
            cs.setString(11, lawyer.Phone);
            cs.setString(12, lawyer.Email);
            cs.setLong(13, lawyer.Id);
            
            cs.executeUpdate();
        }
        /*
        catch (SqlException sqlEx) {
            throw sqlEx;
        }
        */
        catch (Exception ex) {
            throw ex;
        }
    }

    public void Load()
    {

    }

    public void Update(Lawyer lawyer) throws Exception
    {
        try {
            Connection dbAcess = con.ToConnect();
            CallableStatement cs = dbAcess.prepareCall("sp_update_lawyer ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?");
            cs.setLong(0, lawyer.Id_Company);
            cs.setString(1, lawyer.Name);
            cs.setString(2, lawyer.Registration_Number);
            cs.setString(3, lawyer.Sectional_Council);
            cs.setInt(4, lawyer.Inscription_Type);
            cs.setString(5, lawyer.Address_Code);
            cs.setString(6, lawyer.Address);
            cs.setInt(7, lawyer.Number);
            cs.setString(8, lawyer.District);
            cs.setString(9, lawyer.City);
            cs.setString(10, lawyer.State);
            cs.setString(11, lawyer.Phone);
            cs.setString(12, lawyer.Email);
            cs.setLong(13, lawyer.Id);
            
            cs.executeUpdate();
        }
        /*
        catch (SqlException sqlEx) {
            throw sqlEx;
        }
        */
        catch (Exception ex) {
            throw ex;
        }
    }

    public void Delete(long id) throws Exception
    {
        try {
            Connection dbAcess = con.ToConnect();
            CallableStatement cs = dbAcess.prepareCall("sp_delete_lawyer ?");
            cs.setLong(0, id);
            
            cs.executeUpdate();            
        }
        /*
        catch (SqlException sqlEx) {
            throw sqlEx;
        }
        */
        catch (Exception ex) {
            throw ex;
        }
    }

}
