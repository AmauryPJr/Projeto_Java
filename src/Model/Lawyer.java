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
    
    long Id;

    long Id_Company; 

    String Name;

    String Registration_Number; 

    String Sectional_Council;

    int Inscription_Type;

    String Email;

    String Phone;

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

    public void Insert()
    {

    }

    public void Load()
    {

    }

    public void Update()
    {

    }

    public void Delete()
    {

    }
    
}
