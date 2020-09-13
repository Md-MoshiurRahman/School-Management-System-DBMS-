/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import oracle.net.aso.i;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TableView table;
    
    
    private void initializeColumns()
    {
        String sql = "SELECT * FROM STUDENT";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            TableColumn C1 = new TableColumn("Last Name") ;
                TableColumn C2 = new TableColumn("Floor");
                TableColumn C3 = new TableColumn("Numbers");
            int y=70;
            while (rs.next())
            {
                
                
                //table.getColumns().addAll(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5
                //table.TableColumn C1 = new TableColumn("Last Name") ;
                
                
                //C1.setCellValueFactory(new PropertyValueFactory<PieChart.Data,String>("a"));
                C1.setText("a");
                C2.setText("b");
                C3.setText("c");
                //C2.setCellValueFactory(new PropertyValueFactory<PieChart.Data,String>("b"));
                //C3.setCellValueFactory(new PropertyValueFactory<PieChart.Data,String>("c"));
                //final ObservableList<PieChart.Data> data = FXCollections.observableArrayList(oracleJBDC.getResults("ALL PHONE NUMBER",order)) ;
                //stat_tab.setItems(data);
                table.getColumns().addAll(C1,C2,C3);
                /*table.getColumns().add(1, "a");
                table.getColumns().add(2, "b");
                table.getColumns().add(3, "c");
                table.getColumns().add(4, "d");
                table.getColumns().add(5, "e");*/
                //grpinfS.getChildren().addAll(studentinfo11,studentinfo22,studentinfo33,studentinfo44,studentinfo55,studentinfo66,studentinfo77);
                //y=y+20;
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        
    }    
    
}
