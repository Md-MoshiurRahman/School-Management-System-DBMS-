/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import javafx.beans.property.SimpleStringProperty;


public class HdM {
    
    private final SimpleStringProperty Id;
    private final SimpleStringProperty Schid;
    private final SimpleStringProperty Name;
    private final SimpleStringProperty Age;
    private final SimpleStringProperty Subject;
    private final SimpleStringProperty Stdate;
    private final SimpleStringProperty Enddate;
    private final SimpleStringProperty Nmbr;
    
    public HdM(String id,String schid,String name,String age,String subject,String stdate,String enddate,String nmbr)
            {
                this.Id=new SimpleStringProperty(id);
                this.Schid=new SimpleStringProperty(schid);
                this.Name=new SimpleStringProperty(name);
                this.Age=new SimpleStringProperty(age);
                this.Subject=new SimpleStringProperty(subject);
                this.Stdate=new SimpleStringProperty(stdate);
                this.Enddate=new SimpleStringProperty(enddate);
                this.Nmbr=new SimpleStringProperty(nmbr);
                
            }
    
    public String getId()
            {
                return Id.get();
            }
    public String getSchid()
            {
                return Schid.get();
            }
    public String getName()
            {
                return Name.get();
            }
    public String getAge()
            {
                return Age.get();
            }
    public String getSubject()
            {
                return Subject.get();
            }
    public String getStdate()
            {
                return Stdate.get();
            }
    public String getEnddate()
            {
                return Enddate.get();
            }
    public String getNmbr()
            {
                return Nmbr.get();
            }
    
    
    
    public void setId(String id)
            {
                Id.set(id);
            }
    public void setSchid(String schid)
            {
                Schid.set(schid);
            }
    public void setName(String name)
            {
                Name.set(name);
            }
    public void setAge(String age)
            {
                Age.set(age);
            }
    public void setSubject(String subject)
            {
                Subject.set(subject);
            }
    public void setStdate(String stdate)
            {
                Stdate.set(stdate);
            }
    public void setEnddate(String enddate)
            {
                Enddate.set(enddate);
            }
    public void setNmbr(String nmbr)
            {
                Nmbr.set(nmbr);
            }
    
}
