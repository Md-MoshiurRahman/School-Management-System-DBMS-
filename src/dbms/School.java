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
public class School {
    private final SimpleStringProperty Schid;
    private final SimpleStringProperty Name;
    
    public School(String schid,String name)
            {
                this.Schid=new SimpleStringProperty(schid);
                this.Name=new SimpleStringProperty(name);
            }
    
    public String getSchid()
            {
                return Schid.get();
            }
    public String getName()
            {
                return Name.get();
            }
    
    public void setSchid(String schid)
            {
                Schid.set(schid);
            }
    public void setName(String name)
            {
                Name.set(name);
            }
}
