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
public class Section {
    private final SimpleStringProperty Secid;
    private final SimpleStringProperty Cid;
    private final SimpleStringProperty Rno;
    private final SimpleStringProperty Ct;
    private final SimpleStringProperty Nos;
    
    public Section(String secid,String rno,String cid,String ct,String nos)
            {
                this.Secid=new SimpleStringProperty(secid);
                this.Cid=new SimpleStringProperty(cid);
                this.Rno=new SimpleStringProperty(rno);
                this.Ct=new SimpleStringProperty(ct);
                this.Nos=new SimpleStringProperty(nos);
            }
    public String getSecid()
            {
                return Secid.get();
            }
    public String getCid()
            {
                return Cid.get();
            }
    public String getRno()
            {
                return Rno.get();
            }
    public String getCt()
            {
                return Ct.get();
            }
    public String getNos()
            {
                return Nos.get();
            }
    
    public void setSecid(String secid)
            {
                Secid.set(secid);
            }
    public void setCid(String cid)
            {
                Cid.set(cid);
            }
    public void setRno(String rno)
            {
                Rno.set(rno);
            }
    public void setCt(String ct)
            {
                Ct.set(ct);
            }
    public void setNos(String nos)
            {
                Nos.set(nos);
            }
    
}
