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
public class Routine {
    private final SimpleStringProperty Rouid;
    private final SimpleStringProperty Secid;
    private final SimpleStringProperty Tid;
    private final SimpleStringProperty Sub;
    private final SimpleStringProperty Time;
    private final SimpleStringProperty Rdate;
    
    public Routine(String rouid,String secid,String tid,String sub,String time,String rdate)
            {
                this.Rouid=new SimpleStringProperty(rouid);
                this.Secid=new SimpleStringProperty(secid);
                this.Tid=new SimpleStringProperty(tid);
                this.Sub=new SimpleStringProperty(sub);
                this.Time=new SimpleStringProperty(time);
                this.Rdate=new SimpleStringProperty(rdate);
            }
    public String getRouid()
            {
                return Rouid.get();
            }
    public String getSecid()
            {
                return Secid.get();
            }
    public String getTid()
            {
                return Tid.get();
            }
    public String getSub()
            {
                return Sub.get();
            }
    public String getTime()
            {
                return Time.get();
            }
    public String getRdate()
            {
                return Rdate.get();
            }
    
    public void setRouid(String rouid)
            {
                Rouid.set(rouid);
            }
    public void setSecid(String secid)
            {
                Secid.set(secid);
            }
    public void setTid(String tid)
            {
                Tid.set(tid);
            }
    public void setSub(String sub)
            {
                Sub.set(sub);
            }
    public void setTime(String time)
            {
                Time.set(time);
            }
    public void setRdate(String rdate)
            {
                Rdate.set(rdate);
            }
    
}
