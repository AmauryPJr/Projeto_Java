/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DBConnection;
import java.util.List;
import javax.swing.JComboBox;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Amaury
 */
public class Module {
    public void LoadCombo(JComboBox<String> cbo, String procedure) throws Exception {
        try {
            DBConnection dbcon = new DBConnection();
            
            Connection dbAcess = dbcon.ToConnect();
            
            CallableStatement cs = dbAcess.prepareCall("EXECUTE " + procedure);
            
            ResultSet rs = cs.executeQuery();
            
            List<Object> listCombo = new ArrayList<>();
            
            while (rs.next()) {
                listCombo.add(rs.getInt(1), rs.getString(2));
            }
            
            cbo.addItem(listCombo.toString());
            
        }
        catch(Exception ex) {
            throw ex;
        }
    }
}
