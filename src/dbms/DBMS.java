/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */

public class DBMS extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}



/*
public class DBMS extends Application {

    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        showLoginPage();
    }

    public void showLoginPage() throws Exception {
        // XML Loading using FXMLLoader
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("login.fxml"));
        Parent root = loader.load();

        // Loading the controller
        dbms.LoginController controller = loader.getController();
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Hello World");
        stage.setScene(new Scene(root, 400, 250));
        stage.show();
    }
    
    public void showTable() throws IOException
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("tableview.fxml"));
        Parent root = loader.load();
        
        // Loading the controller
        dbms.TableViewController controller = loader.getController();
        controller.load();
        controller.setMain(this);
        
        // Set the primary stage
        stage.setTitle("Dashboard");
        stage.setScene(new Scene(root));
        stage.show();
    }

    

    public static void main(String[] args) {
        launch(args);
    }
}
*/