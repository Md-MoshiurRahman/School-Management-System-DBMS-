/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author USER
 */
public class User2 {
    private final SimpleStringProperty Id;
    private final SimpleStringProperty Name;
    private final SimpleStringProperty Bdate;
    private final SimpleStringProperty Secid;
    private final SimpleStringProperty Roll;
    private final SimpleStringProperty Gender;
    private final SimpleStringProperty Nmbr;
    
    public User2(String id,String name,String bdate,String secid,String roll,String gender,String nmbr)
            {
                this.Id=new SimpleStringProperty(id);
                this.Name=new SimpleStringProperty(name);
                this.Bdate=new SimpleStringProperty(bdate);
                this.Secid=new SimpleStringProperty(secid);
                this.Roll=new SimpleStringProperty(roll);
                this.Gender=new SimpleStringProperty(gender);
                this.Nmbr=new SimpleStringProperty(nmbr);
                
            }
    
    public String getId()
            {
                return Id.get();
            }
    public String getName()
            {
                return Name.get();
            }
    public String getBdate()
            {
                return Bdate.get();
            }
    public String getSecid()
            {
                return Secid.get();
            }
    public String getRoll()
            {
                return Roll.get();
            }
    public String getGender()
            {
                return Gender.get();
            }
    public String getNmbr()
            {
                return Nmbr.get();
            }
    
    
    
    public void setId(String id)
            {
                Id.set(id);
            }
    public void setName(String name)
            {
                Name.set(name);
            }
    public void setBdate(String bdate)
            {
                Bdate.set(bdate);
            }
    public void setSecid(String secid)
            {
                Secid.set(secid);
            }
    public void setRoll(String roll)
            {
                Roll.set(roll);
            }
    public void setGender(String gender)
            {
                Gender.set(gender);
            }
    public void setNmbr(String nmbr)
            {
                Nmbr.set(nmbr);
            }
}
