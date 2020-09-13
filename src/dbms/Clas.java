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
public class Clas {
    private final SimpleStringProperty Cid;
    private final SimpleStringProperty Schid;
    private final SimpleStringProperty Nos;
    
    public Clas(String cid,String schid,String nos)
            {
                this.Cid=new SimpleStringProperty(cid);
                this.Schid=new SimpleStringProperty(schid);
                this.Nos=new SimpleStringProperty(nos);
            }
    public String getCid()
            {
                return Cid.get();
            }
    public String getSchid()
            {
                return Schid.get();
            }
    public String getNos()
            {
                return Nos.get();
            }
    
    public void setCid(String cid)
            {
                Cid.set(cid);
            }
    public void setSchid(String schid)
            {
                Schid.set(schid);
            }
    public void setNos(String nos)
            {
                Nos.set(nos);
            }
    
}
