/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Amaury
 */
public class Lawyer extends Addresses {
    
    public long Id;

    public long Id_Company; 

    public String Name;

    public String Registration_Number; 

    public String Sectional_Council;

    public int Inscription_Type;

    public String Email;

    public String Phone;

    public Lawyer()
    {
        Id = 0;
        Id_Company = 0;
        Name = "";
        Registration_Number = "";
        Sectional_Council = "";
        Inscription_Type = 0;
        Email = "";
        Phone = "";
        
        Address_Code = "";
        Address = "";
        Number = 0;
        District = "";
        City = "";
        State = "";
    }    
}
