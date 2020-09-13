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
public class Event {
    
    private final SimpleStringProperty Evid;
    private final SimpleStringProperty Tmid;
    private final SimpleStringProperty Type;
    private final SimpleStringProperty Name;
    
    public Event(String evid,String tmid,String type,String name)
            {
                this.Evid=new SimpleStringProperty(evid);
                this.Tmid=new SimpleStringProperty(tmid);
                this.Type=new SimpleStringProperty(type);
                this.Name=new SimpleStringProperty(name);
            }
    public String getEvid()
            {
                return Evid.get();
            }
    public String getTmid()
            {
                return Tmid.get();
            }
    public String getType()
            {
                return Type.get();
            }
    public String getName()
            {
                return Name.get();
            }
    
    public void setEvid(String evid)
            {
                Evid.set(evid);
            }
    public void setTmid(String tmid)
            {
                Tmid.set(tmid);
            }
    public void setType(String type)
            {
                Type.set(type);
            }
    public void setName(String name)
            {
                Name.set(name);
            }
}
