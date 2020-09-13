package dbms;

import java.awt.Color;
import static java.awt.Color.red;
import java.awt.Insets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.*;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;



 

public class insert extends Application
{
    String kp=new String();
    int x=0;
    int xx=0;
    int findT;
    Stage stage;
    Pane startroot,tableroot,updatetable;
    ComboBox addupdel;
    Button student1,teacher1,section1,school1,result1,head1,assis1,clas1,cr1,event1,routine1,staff1,team1,back1;
    Button upS,upSch,upHd,upAssis,upT,upC,upSec,upR,upCr,upRou,upSf,upTm,upEv;
    Button backupS1,backupHd1,backupAssis1,backupT1,backupC1,backupSec1,backupSch1,backupR1,backupCr1,backupRou1,backupSf1,backupTm1,backupEv1;
    Button checkS,checkSch,checkHd,checkAssis,checkT,checkC,checkSec,checkR,checkCr,checkRou,checkSf,checkTm,checkEv;
    Button enter,update,info,student,teacher,section,school,result,head,assis,clas,cr,event,routine,staff,team,back;
    Button addS,addSch,addHd,addAssis,addT,addC,addSec,addR,addCr,addRou,addSf,addTm,addEv;
    Button infoHd,infoAssis,infoT,infoC,infoSec,infoR,infoS,infoSch,infoCr,infoRou,infoSf,infoTm,infoEv;
    Scene scene,tablescene,infoscene,uptablesceneS,uptablesceneT,uptablesceneSec,uptablesceneSch,uptablesceneRes,uptablesceneH,uptablesceneA,uptablesceneC;
    Scene tablescene1,uptablesceneS1,uptablesceneT1,uptablesceneSec1,uptablesceneSch1,uptablesceneRes1,uptablesceneH1,uptablesceneA1,uptablesceneC1,uptablesceneCr1,uptablesceneEv1,uptablesceneRou1,uptablesceneSf1,uptablesceneTm1;
    Group grouptable1,groupstudent1,groupteacher1,groupsection1,groupschool1,groupresult1,grouphead1,groupassis1,groupclas1,groupcr1,groupevent1,grouproutine1,groupstaff1,groupteam1;
    Scene SinfoHd,SinfoAssis,SinfoT,SinfoC,SinfoSec,SinfoR,SinfoS,SinfoSch;
    Scene uptablesceneCr,uptablesceneEv,uptablesceneRou,uptablesceneSf,uptablesceneTm;
    Scene SinfoCr,SinfoEv,SinfoRou,SinfoSf,SinfoTm;
    Label crinfo,lcr1,lcr2,lcr3;
    TextField tcr1,tcr2,tcr3;
    Label evinfo,lev1,lev2,lev3,lev4;
    TextField tev1,tev2,tev3,tev4;
    Label rouinfo,lrou1,lrou2,lrou3,lrou4,lrou5,lrou6;
    TextField trou1,trou2,trou3,trou4,trou5,trou6;
    Label sfinfo,lsf1,lsf2,lsf3,lsf4,lsf5;
    TextField tsf1,tsf2,tsf3,tsf4,tsf5;
    Label tminfo,ltm1,ltm2,ltm3;
    TextField ttm1,ttm2,ttm3;
    Label rinfo,lr1,lr2,lr3,lr4,lr5;
    TextField tr1,tr2,tr3,tr4,tr5;
    Label secinfo,lsec1,lsec2,lsec3,lsec4,lsec5;
    TextField tsec1,tsec2,tsec3,tsec4,tsec5;
    Label cinfo,lc1,lc2,lc3;
    TextField tc1,tc2,tc3;
    TextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    TextField thd1,thd2,thd3,thd4,thd5,thd6,thd7,thd8;
    Label hdinfo,lhd1,lhd2,lhd3,lhd4,lhd5,lhd6,lhd7,lhd8;
    TextField tas1,tas2,tas3,tas4,tas5,tas6,tas7,tas8;
    Label tinfo,lt1,lt2,lt3,lt4,lt5,lt6,lt7,lt8;
    TextField tt1,tt2,tt3,tt4,tt5,tt6,tt7,tt8;
    Label assisinfo,las1,las2,las3,las4,las5,las6,las7,las8;
    Label studentinfo,schoolinfo,l1,l2,l3,l4,l5,l6,l7,l8,l9;
    Label studentinfo1,studentinfo2,studentinfo3,studentinfo4,studentinfo5,studentinfo6,studentinfo7;
    Text studentinfo11,studentinfo22,studentinfo33,studentinfo44,studentinfo55,studentinfo66,studentinfo77;
    Group group1,group2,groupinfo,groupstudent,groupteacher,groupsection,groupschool,groupresult,grouphead,groupassis,groupclas;
    Group grpinfHd,grpinfAssis,grpinfT,grpinfC,grpinfSec,grpinfR,grpinfS,grpinfSch;
    Group groupcr,groupevent,grouproutine,groupstaff,groupteam;
    Group grpinfCr,grpinfEv,grpinfRou,grpinfSf,grpinfTm;
    ImageView iv1,imview1st,imviewlogin,imviewinfoadd,imviewstudentinfo,imviewupdate;
    Image image1,im1st,imlogin,iminfoadd,imstudentinfo,imupdate;
    Button backupdate,backupS,backupHd,backupAssis,backupT,backupC,backupSec,backupSch,backupR;
    Button backinfo,backinfoS,backinfoHd,backinfoAssis,backinfoT,backinfoC,backinfoSec,backinfoSch,backinfoR;
    Label schoolinfo1,schoolinfo2;
    Text schoolinfo11,schoolinfo22;
    Label hdinfo1,hdinfo2,hdinfo3,hdinfo4,hdinfo5,hdinfo6,hdinfo7,hdinfo8;
    Text hdinfo11,hdinfo22,hdinfo33,hdinfo44,hdinfo55,hdinfo66,hdinfo77,hdinfo88;
    //Button admin,guest;
    Button startenter;
    ComboBox start;
    Group login,root,groupguest;
    Scene startscene,sLogin,guestscene;
    TextField username;
    PasswordField password;
    Label Lusername,Lpassword;
    Button bLogin,backuserlogin,backlogin,backguest,backtoinfo;
    //Button userStudent,userTeacher,userStaff;
    Button bloginS,bloginT,bloginSf,backSTSflogin;
    Group grpuserS,grpuserT,grpuserSf;
    Scene suserS,suserT,suserSf;
    TextField tuserS,tuserT,tuserSf;
    PasswordField tpassS,tpassT,tpassSf;
    Label luserS,lpassS,luserT,lpassT,luserSf,lpassSf;
    Group loginS,loginT,loginSf;
    Scene sloginS,sloginT,sloginSf;
    Button profileS,saveS,probackS;
    TextField tproS2,tproS3,tproS6,tproS7;
    Label lproS1,lproS11,lproS2,lproS3,lproS4,lproS44,lproS5,lproS55,lproS6,lproS7;
    Group gproS,gpasschngeS;
    Scene SproS,spasschngeS;
    Button showS,bcomS2,passS,savepassS,backproS;
    PasswordField oldpassS,newpassS,conpassS;
    Label loldpassS,lnewpassS,lconpassS;
    ComboBox comS1,comS2;
    Label lcomS1,lcomS2;
    TableView<Section> tableshowS=new TableView<>();
    ObservableList<Section> datashowS = FXCollections.observableArrayList();
    TableView<Routine> tableshowS2=new TableView<>();
    ObservableList<Routine> datashowS2 = FXCollections.observableArrayList();
    TableView<User2> tableshowS3=new TableView<>();
    ObservableList<User2> datashowS3 = FXCollections.observableArrayList();
    TableView<Routine> tableshowT=new TableView<>();
    ObservableList<Routine> datashowT = FXCollections.observableArrayList();
    TableView<Clas> tableSRes=new TableView<>();
    ObservableList<Clas> dataSRes = FXCollections.observableArrayList();
    TableView<School> tableSGrade=new TableView<>();
    ObservableList<School> dataSGrade = FXCollections.observableArrayList();
    
    Button profileT,saveT,probackT;
    Group gproT,gpasschngeT,gmarksT;
    Scene SproT,spasschngeT,smarksT;
    Button showT,bcomT2,passT,savepassT,backproT,marksT,savemarksT,backmarksT;
    PasswordField oldpassT,newpassT,conpassT;
    Label loldpassT,lnewpassT,lconpassT;
    TextField marksSID,marksST;
    Label lmarksSID,lmarksST;
    ComboBox comT1,comT2;
    Label lcomT1,lcomT2;
    TextField tproT3,tproT4,tproT5,tproT8;
    Label lproT1,lproT11,lproT2,lproT22,lproT3,lproT4,lproT5,lproT6,lproT66,lproT7,lproT77,lproT8;
    TableView<Event> tableTRou=new TableView<>();
    ObservableList<Event> dataTRou = FXCollections.observableArrayList();
    
    Button profileSf,saveSf,probackSf;
    Group gproSf,gpasschngeSf;
    Scene SproSf,spasschngeSf;
    Button showSf,bcomSf2,passSf,savepassSf,backproSf;
    PasswordField oldpassSf,newpassSf,conpassSf;
    Label loldpassSf,lnewpassSf,lconpassSf;
    ComboBox comSf1,comSf2;
    Label lcomSf1,lcomSf2;
    TextField tproSf3,tproSf4,tproSf5;
    Label lproSf1,lproSf11,lproSf2,lproSf22,lproSf3,lproSf4,lproSf5;
    TableView<School> tableshowSf=new TableView<>();
    ObservableList<School> datashowSf = FXCollections.observableArrayList();
    
    
    Button showguest;
    ComboBox comguest1,comguest2;
    Label lcomguest1,lcomguest2;
    TableView<Clas> tableguest1=new TableView<>();
    ObservableList<Clas> dataguest1 = FXCollections.observableArrayList();
    TableView<Event> tableguest2=new TableView<>();
    ObservableList<Event> dataguest2 = FXCollections.observableArrayList();
    
    TableView<User2> table=new TableView<>();
    ObservableList<User2> data = FXCollections.observableArrayList();
    
    TableView<HdM> tableHdM=new TableView<>();
    ObservableList<HdM> dataHdM = FXCollections.observableArrayList();
    
    TableView<HdM> tableAssisHdM=new TableView<>();
    ObservableList<HdM> dataAssisHdM = FXCollections.observableArrayList();
    
    TableView<HdM> tableT=new TableView<>();
    ObservableList<HdM> dataT = FXCollections.observableArrayList();
    
    TableView<School> tableSch=new TableView<>();
    ObservableList<School> dataSch = FXCollections.observableArrayList();
    
    TableView<Clas> tableC=new TableView<>();
    ObservableList<Clas> dataC = FXCollections.observableArrayList();
    
    TableView<Section> tableSec=new TableView<>();
    ObservableList<Section> dataSec = FXCollections.observableArrayList();
    
    TableView<Section> tableR=new TableView<>();
    ObservableList<Section> dataR = FXCollections.observableArrayList();
    
    TableView<Clas> tableCr=new TableView<>();
    ObservableList<Clas> dataCr = FXCollections.observableArrayList();
    
    TableView<Event> tableEv=new TableView<>();
    ObservableList<Event> dataEv = FXCollections.observableArrayList();
    
    TableView<Routine> tableRou=new TableView<>();
    ObservableList<Routine> dataRou = FXCollections.observableArrayList();
    
    TableView<Section> tableSf=new TableView<>();
    ObservableList<Section> dataSf = FXCollections.observableArrayList();
    
    TableView<Clas> tableTm=new TableView<>();
    ObservableList<Clas> dataTm = FXCollections.observableArrayList();
    
   public void start(Stage primaryStage) throws IOException
   {
        stage=primaryStage;
        startroot=new Pane();
        
        start=new ComboBox();
        start.setTranslateX(680);
        start.setTranslateY(50);
        start.setMinHeight(20);
        start.setMinWidth(220);
        start.getItems().addAll("Enter as Admin","Enter as Student","Enter as Teacher","Enter as Staff","Enter as Guest");
        
        startenter=new Button("Enter");
        startenter.setTranslateX(920);
        startenter.setTranslateY(50);
        startenter.setMinHeight(20);
        startenter.setMinWidth(60);
        
        startenter.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        /*guest=new Button("Enter As GUEST");
        guest.setTranslateX(150);
        guest.setTranslateY(500);
        guest.setMinHeight(40);
        guest.setMinWidth(100);
        
        admin=new Button("Enter As ADMIN");
        admin.setTranslateX(750);
        admin.setTranslateY(500);
        admin.setMinHeight(40);
        admin.setMinWidth(100);
        
        userStudent=new Button("Enter As Student");
        userStudent.setTranslateX(750);
        userStudent.setTranslateY(200);
        userStudent.setMinHeight(40);
        userStudent.setMinWidth(100);
        
        userTeacher=new Button("Enter As Teacher");
        userTeacher.setTranslateX(750);
        userTeacher.setTranslateY(320);
        userTeacher.setMinHeight(40);
        userTeacher.setMinWidth(100);
        
        userStaff=new Button("Enter As Staff");
        userStaff.setTranslateX(750);
        userStaff.setTranslateY(440);
        userStaff.setMinHeight(40);
        userStaff.setMinWidth(100);*/

        im1st = new Image("1st.jpg");
        imview1st = new ImageView();
        imview1st.setImage(im1st);
        imview1st.setTranslateX(0);
        imview1st.setTranslateY(0);
        imview1st.setFitHeight(650);
        imview1st.setFitWidth(1000);
        
        /*guest.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        userStudent.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        userTeacher.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        userStaff.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        admin.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });*/
        
        //startroot.getChildren().addAll(imview1st,guest,admin,userStudent,userTeacher,userStaff);
        startroot.getChildren().addAll(imview1st,start,startenter);
        
        
        
        login=new Group();
        
        username =new TextField();
        username.setLayoutX(220);
        username.setLayoutY(90);
        
        password=new PasswordField();
        password.setLayoutX(220);
        password.setLayoutY(130);
        
        Lusername=new Label("User Name");
        Lusername.setLayoutX(140);
        Lusername.setLayoutY(92);
       
        Lpassword=new Label("Password");
        Lpassword.setLayoutX(140);
        Lpassword.setLayoutY(134);
        
        bLogin=new Button("Log in");
        bLogin.setTranslateX(220);
        bLogin.setTranslateY(200);
        bLogin.setMinHeight(20);
        bLogin.setMinWidth(65);
        
        backlogin=new Button("Back");
        backlogin.setLayoutX(100);
        backlogin.setLayoutY(550);
        backlogin.setMinHeight(18);
        backlogin.setMinWidth(40);
        
        imlogin = new Image("login.jpg");
        imviewlogin = new ImageView();
        imviewlogin.setImage(imlogin);
        imviewlogin.setTranslateX(0);
        imviewlogin.setTranslateY(0);
        imviewlogin.setFitHeight(650);
        imviewlogin.setFitWidth(1000);
        
        bLogin.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        backlogin.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        login.getChildren().addAll(Lusername,Lpassword,imviewlogin,username,password,bLogin,backlogin);
        
        
        
        root=new Group();

        addupdel=new ComboBox();
        addupdel.setTranslateX(150);
        addupdel.setTranslateY(520);
        addupdel.setMinHeight(30);
        addupdel.setMinWidth(85);
        addupdel.getItems().addAll("Add","Update","Information");
        
        update=new Button("Enter");
        update.setTranslateX(270);
        update.setTranslateY(520);
        update.setMinHeight(30);
        update.setMinWidth(70);
        info=new Button("Information");
        info.setTranslateX(80);
        info.setTranslateY(520);
        info.setMinHeight(30);
        info.setMinWidth(70);
        backuserlogin=new Button("Log out");
        backuserlogin.setLayoutX(910);
        backuserlogin.setLayoutY(20);
        backuserlogin.setMinHeight(20);
        backuserlogin.setMinWidth(60);
        
        image1 = new Image("back.jpg");
        iv1 = new ImageView();
        iv1.setImage(image1);
        iv1.setTranslateX(0);
        iv1.setTranslateY(0);
        iv1.setFitHeight(650);
        iv1.setFitWidth(1000);
        
        update.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        info.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        backuserlogin.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        root.getChildren().addAll(iv1,addupdel,update,backuserlogin);
        
        tableroot=new Pane();
        tablescene=new Scene(tableroot,1000,650);
        
        group1=new Group();
        school=new Button("SCHOOL");
        school.setLayoutX(280);
        school.setLayoutY(50);
        school.setMinHeight(30);
        school.setMinWidth(70);
        
        school.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        head=new Button("HEAD MASTER");
        head.setLayoutX(270);
        head.setLayoutY(100);
        head.setMinHeight(30);
        head.setMinWidth(70);
        
        head.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        assis=new Button("ASSIS. HEAD MASTER");
        assis.setLayoutX(250);
        assis.setLayoutY(150);
        assis.setMinHeight(30);
        assis.setMinWidth(70);
        
        assis.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        student=new Button("STUDENT");
        student.setLayoutX(180);
        student.setLayoutY(200);
        student.setMinHeight(30);
        student.setMinWidth(70);
        
        student.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        teacher=new Button("TEACHER");
        teacher.setLayoutX(180);
        teacher.setLayoutY(250);
        teacher.setMinHeight(30);
        teacher.setMinWidth(70);
        
        teacher.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        clas=new Button("CLASS");
        clas.setLayoutX(180);
        clas.setLayoutY(300);
        clas.setMinHeight(30);
        clas.setMinWidth(70);
        
        clas.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        section=new Button("SECTION");
        section.setLayoutX(180);
        section.setLayoutY(350);
        section.setMinHeight(30);
        section.setMinWidth(70);
        
        section.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        result=new Button("RESULT");
        result.setLayoutX(180);
        result.setLayoutY(400);
        result.setMinHeight(30);
        result.setMinWidth(70);
        
        result.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        cr=new Button("CR");
        cr.setLayoutX(380);
        cr.setLayoutY(200);
        cr.setMinHeight(30);
        cr.setMinWidth(70);
        
        cr.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        event=new Button("EVENT");
        event.setLayoutX(380);
        event.setLayoutY(250);
        event.setMinHeight(30);
        event.setMinWidth(70);
        
        event.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        routine=new Button("ROUTINE");
        routine.setLayoutX(380);
        routine.setLayoutY(300);
        routine.setMinHeight(30);
        routine.setMinWidth(70);
        
        routine.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        staff=new Button("STAFF");
        staff.setLayoutX(380);
        staff.setLayoutY(350);
        staff.setMinHeight(30);
        staff.setMinWidth(70);
        
        staff.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        team=new Button("TEAM");
        team.setLayoutX(380);
        team.setLayoutY(400);
        team.setMinHeight(30);
        team.setMinWidth(70);
        
        team.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        
        
        backupdate=new Button("Back");
        backupdate.setLayoutX(100);
        backupdate.setLayoutY(550);
        backupdate.setMinHeight(30);
        backupdate.setMinWidth(70);
        
        backupdate.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        imupdate = new Image("update.jpg");
        imviewupdate = new ImageView();
        imviewupdate.setImage(imupdate);
        imviewupdate.setTranslateX(0);
        imviewupdate.setTranslateY(0);
        imviewupdate.setFitHeight(650);
        imviewupdate.setFitWidth(1000);
        
        
       group1.getChildren().addAll(imviewupdate,backuserlogin,backupdate,school,head,assis,student,teacher,clas,section,result,cr,event,routine,staff,team);
       
       
       grouptable1=new Group();
        school1=new Button("SCHOOL");
        school1.setLayoutX(280);
        school1.setLayoutY(50);
        school1.setMinHeight(30);
        school1.setMinWidth(70);
        
        school1.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        head1=new Button("HEAD MASTER");
        head1.setLayoutX(270);
        head1.setLayoutY(100);
        head1.setMinHeight(30);
        head1.setMinWidth(70);
        
        head1.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        assis1=new Button("ASSIS. HEAD MASTER");
        assis1.setLayoutX(250);
        assis1.setLayoutY(150);
        assis1.setMinHeight(30);
        assis1.setMinWidth(70);
        
        assis1.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        student1=new Button("STUDENT");
        student1.setLayoutX(180);
        student1.setLayoutY(200);
        student1.setMinHeight(30);
        student1.setMinWidth(70);
        
        student1.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        teacher1=new Button("TEACHER");
        teacher1.setLayoutX(180);
        teacher1.setLayoutY(250);
        teacher1.setMinHeight(30);
        teacher1.setMinWidth(70);
        
        teacher1.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        clas1=new Button("CLASS");
        clas1.setLayoutX(180);
        clas1.setLayoutY(300);
        clas1.setMinHeight(30);
        clas1.setMinWidth(70);
        
        clas1.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        section1=new Button("SECTION");
        section1.setLayoutX(180);
        section1.setLayoutY(350);
        section1.setMinHeight(30);
        section1.setMinWidth(70);
        
        section1.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        result1=new Button("RESULT");
        result1.setLayoutX(180);
        result1.setLayoutY(400);
        result1.setMinHeight(30);
        result1.setMinWidth(70);
        
        result1.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        cr1=new Button("CR");
        cr1.setLayoutX(380);
        cr1.setLayoutY(200);
        cr1.setMinHeight(30);
        cr1.setMinWidth(70);
        
        cr1.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        event1=new Button("EVENT");
        event1.setLayoutX(380);
        event1.setLayoutY(250);
        event1.setMinHeight(30);
        event1.setMinWidth(70);
        
        event1.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        routine1=new Button("ROUTINE");
        routine1.setLayoutX(380);
        routine1.setLayoutY(300);
        routine1.setMinHeight(30);
        routine1.setMinWidth(70);
        
        routine1.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        staff1=new Button("STAFF");
        staff1.setLayoutX(380);
        staff1.setLayoutY(350);
        staff1.setMinHeight(30);
        staff1.setMinWidth(70);
        
        staff1.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        team1=new Button("TEAM");
        team1.setLayoutX(380);
        team1.setLayoutY(400);
        team1.setMinHeight(30);
        team1.setMinWidth(70);
        
        team1.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
       grouptable1.getChildren().addAll(imviewupdate,backuserlogin,backupdate,school1,head1,assis1,student1,teacher1,clas1,section1,result1,cr1,event1,routine1,staff1,team1);
       checkS=new Button("Check");
       checkS.setLayoutX(400);
       checkS.setLayoutY(94);
       checkS.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        backupS1=new Button("Back");
        backupS1.setLayoutX(100);
        backupS1.setLayoutY(550);
        backupS1.setMinHeight(30);
        backupS1.setMinWidth(70);
        
        backupS1.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       upS=new Button("Update");
       upS.setLayoutX(220);
       upS.setLayoutY(370);
       upS.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       checkSch=new Button("Check");
       checkSch.setLayoutX(400);
       checkSch.setLayoutY(94);
       checkSch.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       upSch=new Button("Update");
       upSch.setLayoutX(220);
       upSch.setLayoutY(370);
       upSch.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       checkHd=new Button("Check");
       checkHd.setLayoutX(400);
       checkHd.setLayoutY(94);
       checkHd.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       upHd=new Button("Update");
       upHd.setLayoutX(220);
       upHd.setLayoutY(410);
       upHd.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       checkAssis=new Button("Check");
       checkAssis.setLayoutX(400);
       checkAssis.setLayoutY(94);
       checkAssis.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       upAssis=new Button("Update");
       upAssis.setLayoutX(220);
       upAssis.setLayoutY(410);
       upAssis.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });

       checkT=new Button("Check");
       checkT.setLayoutX(400);
       checkT.setLayoutY(94);
       checkT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       upT=new Button("Update");
       upT.setLayoutX(220);
       upT.setLayoutY(410);
       upT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       checkC=new Button("Check");
       checkC.setLayoutX(400);
       checkC.setLayoutY(94);
       checkC.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       upC=new Button("Update");
       upC.setLayoutX(220);
       upC.setLayoutY(370);
       upC.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       checkSec=new Button("Check");
       checkSec.setLayoutX(400);
       checkSec.setLayoutY(94);
       checkSec.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       upSec=new Button("Update");
       upSec.setLayoutX(220);
       upSec.setLayoutY(370);
       upSec.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       checkR=new Button("Check");
       checkR.setLayoutX(400);
       checkR.setLayoutY(94);
       checkR.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       upR=new Button("Update");
       upR.setLayoutX(220);
       upR.setLayoutY(370);
       upR.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       checkCr=new Button("Check");
       checkCr.setLayoutX(400);
       checkCr.setLayoutY(94);
       checkCr.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       upCr=new Button("Update");
       upCr.setLayoutX(220);
       upCr.setLayoutY(370);
       upCr.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       checkEv=new Button("Check");
       checkEv.setLayoutX(400);
       checkEv.setLayoutY(94);
       checkEv.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       upEv=new Button("Update");
       upEv.setLayoutX(220);
       upEv.setLayoutY(370);
       upEv.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       checkRou=new Button("Check");
       checkRou.setLayoutX(400);
       checkRou.setLayoutY(94);
       checkRou.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       upRou=new Button("Update");
       upRou.setLayoutX(220);
       upRou.setLayoutY(370);
       upRou.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       checkSf=new Button("Check");
       checkSf.setLayoutX(400);
       checkSf.setLayoutY(94);
       checkSf.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       upSf=new Button("Update");
       upSf.setLayoutX(220);
       upSf.setLayoutY(370);
       upSf.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       checkTm=new Button("Check");
       checkTm.setLayoutX(400);
       checkTm.setLayoutY(94);
       checkTm.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       upTm=new Button("Update");
       upTm.setLayoutX(220);
       upTm.setLayoutY(370);
       upTm.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
       loginS=new Group();
        
        tuserS =new TextField();
        tuserS.setLayoutX(220);
        tuserS.setLayoutY(90);
        
        tpassS=new PasswordField();
        tpassS.setLayoutX(220);
        tpassS.setLayoutY(130);
        
        luserS=new Label("User Name");
        luserS.setLayoutX(140);
        luserS.setLayoutY(92);
       
        lpassS=new Label("Password");
        lpassS.setLayoutX(140);
        lpassS.setLayoutY(134);
        
        bloginS=new Button("Log in");
        bloginS.setTranslateX(220);
        bloginS.setTranslateY(200);
        bloginS.setMinHeight(20);
        bloginS.setMinWidth(65);
        
        bloginS.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        loginS.getChildren().addAll(imviewlogin,tuserS,tpassS,luserS,lpassS,bloginS,backlogin);
        
        
        loginT=new Group();
        
        tuserT =new TextField();
        tuserT.setLayoutX(220);
        tuserT.setLayoutY(90);
        
        tpassT=new PasswordField();
        tpassT.setLayoutX(220);
        tpassT.setLayoutY(130);
        
        luserT=new Label("User Name");
        luserT.setLayoutX(140);
        luserT.setLayoutY(92);
       
        lpassT=new Label("Password");
        lpassT.setLayoutX(140);
        lpassT.setLayoutY(134);
        
        bloginT=new Button("Log in");
        bloginT.setTranslateX(220);
        bloginT.setTranslateY(200);
        bloginT.setMinHeight(20);
        bloginT.setMinWidth(65);
        
        bloginT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        loginT.getChildren().addAll(imviewlogin,tuserT,tpassT,luserT,lpassT,bloginT,backlogin);
        
        
        loginSf=new Group();
        
        tuserSf=new TextField();
        tuserSf.setLayoutX(220);
        tuserSf.setLayoutY(90);
        
        tpassSf=new PasswordField();
        tpassSf.setLayoutX(220);
        tpassSf.setLayoutY(130);
        
        luserSf=new Label("User Name");
        luserSf.setLayoutX(140);
        luserSf.setLayoutY(92);
       
        lpassSf=new Label("Password");
        lpassSf.setLayoutX(140);
        lpassSf.setLayoutY(134);
        
        bloginSf=new Button("Log in");
        bloginSf.setTranslateX(220);
        bloginSf.setTranslateY(200);
        bloginSf.setMinHeight(20);
        bloginSf.setMinWidth(65);
        
        bloginSf.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        loginSf.getChildren().addAll(imviewlogin,tuserSf,tpassSf,luserSf,lpassSf,bloginSf,backlogin);
        
        backSTSflogin=new Button("Log out");
        backSTSflogin.setLayoutX(910);
        backSTSflogin.setLayoutY(20);
        backSTSflogin.setMinHeight(20);
        backSTSflogin.setMinWidth(60);
        
        backSTSflogin.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
        
        
        
        
        
        group2=new Group();
        infoSch=new Button("SCHOOL");
        infoSch.setLayoutX(280);
        infoSch.setLayoutY(50);
        infoSch.setMinHeight(30);
        infoSch.setMinWidth(70);
        
        infoSch.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        infoHd=new Button("HEAD MASTER");
        infoHd.setLayoutX(270);
        infoHd.setLayoutY(100);
        infoHd.setMinHeight(30);
        infoHd.setMinWidth(70);
        
        infoHd.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        infoAssis=new Button("ASSIS. HEAD MASTER");
        infoAssis.setLayoutX(250);
        infoAssis.setLayoutY(150);
        infoAssis.setMinHeight(30);
        infoAssis.setMinWidth(70);
        
        infoAssis.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        infoS=new Button("STUDENT");
        infoS.setLayoutX(180);
        infoS.setLayoutY(200);
        infoS.setMinHeight(30);
        infoS.setMinWidth(70);
        
        infoS.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        infoT=new Button("TEACHER");
        infoT.setLayoutX(180);
        infoT.setLayoutY(250);
        infoT.setMinHeight(30);
        infoT.setMinWidth(70);
        
        infoT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        infoC=new Button("CLASS");
        infoC.setLayoutX(180);
        infoC.setLayoutY(300);
        infoC.setMinHeight(30);
        infoC.setMinWidth(70);
        
        infoC.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        infoSec=new Button("SECTION");
        infoSec.setLayoutX(180);
        infoSec.setLayoutY(350);
        infoSec.setMinHeight(30);
        infoSec.setMinWidth(70);
        
        infoSec.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        infoR=new Button("RESULT");
        infoR.setLayoutX(180);
        infoR.setLayoutY(400);
        infoR.setMinHeight(30);
        infoR.setMinWidth(70);
        
        infoR.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        infoCr=new Button("CR");
        infoCr.setLayoutX(380);
        infoCr.setLayoutY(200);
        infoCr.setMinHeight(30);
        infoCr.setMinWidth(70);
        
        infoCr.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        infoEv=new Button("EVENT");
        infoEv.setLayoutX(380);
        infoEv.setLayoutY(250);
        infoEv.setMinHeight(30);
        infoEv.setMinWidth(70);
        
        infoEv.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        infoRou=new Button("ROUTINE");
        infoRou.setLayoutX(380);
        infoRou.setLayoutY(300);
        infoRou.setMinHeight(30);
        infoRou.setMinWidth(70);
        
        infoRou.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        infoSf=new Button("STAFF");
        infoSf.setLayoutX(380);
        infoSf.setLayoutY(350);
        infoSf.setMinHeight(30);
        infoSf.setMinWidth(70);
        
        infoSf.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        infoTm=new Button("TEAM");
        infoTm.setLayoutX(380);
        infoTm.setLayoutY(400);
        infoTm.setMinHeight(30);
        infoTm.setMinWidth(70);
        
        infoTm.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        backinfo=new Button("Back");
        backinfo.setLayoutX(100);
        backinfo.setLayoutY(550);
        backinfo.setMinHeight(30);
        backinfo.setMinWidth(70);
        
        backinfo.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        
       group2.getChildren().addAll(imviewupdate,infoHd,infoAssis,infoT,infoC,infoSec,infoR,infoS,infoSch,infoCr,infoEv,infoRou,infoSf,infoTm,backinfo,backuserlogin);
        
        
       gproS =new Group();
       lproS1=new Label("STUDENT_ID");
       lproS1.setLayoutX(140);
       lproS1.setLayoutY(94);
       
       lproS2=new Label("NAME");
       lproS2.setLayoutX(140);
       lproS2.setLayoutY(134);
       
       lproS3=new Label("BDATE");
       lproS3.setLayoutX(140);
       lproS3.setLayoutY(174);
       
       lproS4=new Label("SECTION_ID");
       lproS4.setLayoutX(140);
       lproS4.setLayoutY(214);
       
       lproS5=new Label("ROLL");
       lproS5.setLayoutX(140);
       lproS5.setLayoutY(254);
       
       lproS6=new Label("GENDER");
       lproS6.setLayoutX(140);
       lproS6.setLayoutY(294);
       
       lproS7=new Label("CONTACT_NO");
       lproS7.setLayoutX(140);
       lproS7.setLayoutY(334);
       
       
       lproS11 =new Label();
       lproS11.setLayoutX(230);
       lproS11.setLayoutY(94);
       
       tproS2 =new TextField();
       tproS2.setLayoutX(220);
       tproS2.setLayoutY(130);
       
       tproS3 =new TextField();
       tproS3.setLayoutX(220);
       tproS3.setLayoutY(170);
       
       lproS44 =new Label();
       lproS44.setLayoutX(230);
       lproS44.setLayoutY(214);
       
       lproS55 =new Label();
       lproS55.setLayoutX(230);
       lproS55.setLayoutY(254);
       
       tproS6 =new TextField();
       tproS6.setLayoutX(220);
       tproS6.setLayoutY(290);
       
       tproS7 =new TextField();
       tproS7.setLayoutX(220);
       tproS7.setLayoutY(330);
       
        probackS=new Button("Back");
        probackS.setLayoutX(100);
        probackS.setLayoutY(550);
        probackS.setMinHeight(30);
        probackS.setMinWidth(70);
        
        probackS.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       saveS=new Button("Save");
       saveS.setLayoutX(220);
       saveS.setLayoutY(370);
       saveS.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       passS=new Button("Change password");
       passS.setLayoutX(750);
       passS.setLayoutY(550);
       passS.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       
       tableSRes.setTranslateX(550);
       tableSRes.setTranslateY(250);
       tableSRes.setTableMenuButtonVisible(true);
       tableSRes.setPrefHeight(100);
       
       TableColumn colSRes1= new TableColumn("FIRST TERM");
       colSRes1.setMinWidth(100);
       colSRes1.setCellValueFactory(new PropertyValueFactory<>("cid"));
       
       TableColumn colSRes2= new TableColumn("SECOND TERM");
       colSRes2.setMinWidth(100);
       colSRes2.setCellValueFactory(new PropertyValueFactory<>("schid"));
       
       TableColumn colSRes3= new TableColumn("ANNUAL");
       colSRes3.setMinWidth(100);
       colSRes3.setCellValueFactory(new PropertyValueFactory<>("nos"));
       
       tableSRes.getColumns().addAll(colSRes1,colSRes2,colSRes3);
       
       tableSGrade.setTranslateX(580);
       tableSGrade.setTranslateY(160);
       tableSGrade.setTableMenuButtonVisible(true);
       tableSGrade.setPrefHeight(60);
       
       TableColumn colSGrade1= new TableColumn("GRADE");
       colSGrade1.setMinWidth(100);
       colSGrade1.setCellValueFactory(new PropertyValueFactory<>("schid"));
       
       TableColumn colSGrade2= new TableColumn("STATUS");
       colSGrade2.setMinWidth(100);
       colSGrade2.setCellValueFactory(new PropertyValueFactory<>("name"));

       tableSGrade.getColumns().addAll(colSGrade1,colSGrade2);
       

       gproS.getChildren().addAll(lproS1,lproS11,lproS2,lproS3,lproS4,lproS44,lproS5,lproS55,lproS6,lproS7,saveS,tproS2,tproS3,tproS6,tproS7,probackS,tableSRes,tableSGrade,passS);
       
       
       gpasschngeS=new Group();
        
        oldpassS =new PasswordField();
        oldpassS.setLayoutX(240);
        oldpassS.setLayoutY(90);
        
        newpassS=new PasswordField();
        newpassS.setLayoutX(240);
        newpassS.setLayoutY(130);
        
        conpassS=new PasswordField();
        conpassS.setLayoutX(240);
        conpassS.setLayoutY(170);
        
        loldpassS=new Label("Old Password");
        loldpassS.setLayoutX(140);
        loldpassS.setLayoutY(92);
       
        lnewpassS=new Label("New Password");
        lnewpassS.setLayoutX(140);
        lnewpassS.setLayoutY(134);
        
        lconpassS=new Label("Confirm Password");
        lconpassS.setLayoutX(140);
        lconpassS.setLayoutY(174);
        
        savepassS=new Button("Save");
        savepassS.setTranslateX(240);
        savepassS.setTranslateY(240);
        savepassS.setMinHeight(20);
        savepassS.setMinWidth(65);
        
        savepassS.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        backproS=new Button("Back");
        backproS.setLayoutX(100);
        backproS.setLayoutY(550);
        backproS.setMinHeight(20);
        backproS.setMinWidth(60);
        
        backproS.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        gpasschngeS.getChildren().addAll(imviewlogin,oldpassS,newpassS,conpassS,loldpassS,lnewpassS,lconpassS,savepassS,backproS);
       
       
       imstudentinfo = new Image("studentinfo.jpg");
       imviewstudentinfo = new ImageView();
       imviewstudentinfo.setImage(imstudentinfo);
       imviewstudentinfo.setTranslateX(0);
       imviewstudentinfo.setTranslateY(0);
       imviewstudentinfo.setFitHeight(650);
       imviewstudentinfo.setFitWidth(1000);
       
        grpuserS=new Group();
        
        lcomS1=new Label("INFORMATION->");
        lcomS1.setLayoutX(760);
        lcomS1.setLayoutY(204);
       
        lcomS2=new Label("CATEGORY->");
        lcomS2.setLayoutX(760);
        lcomS2.setLayoutY(254);
        
        comS1=new ComboBox();
        comS1.setTranslateX(870);
        comS1.setTranslateY(200);
        comS1.setMinHeight(20);
        comS1.setMinWidth(85);
        comS1.getItems().addAll("Student","Teacher","Staff");
        
        comS2=new ComboBox();
        comS2.setTranslateX(870);
        comS2.setTranslateY(250);
        comS2.setMinHeight(20);
        comS2.setMinWidth(85);
        
        //comS2.getItems().addAll("Section","Class","School");
        bcomS2=new Button();
        bcomS2.setTranslateX(960);
        bcomS2.setTranslateY(200);
        bcomS2.setMinHeight(20);
        bcomS2.setMinWidth(20);
        bcomS2.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        showS=new Button("Show");
        showS.setTranslateX(890);
        showS.setTranslateY(300);
        showS.setMinHeight(20);
        showS.setMinWidth(65);
        
        showS.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       profileS=new Button("Profile");
       profileS.setLayoutX(800);
       profileS.setLayoutY(550);
       profileS.setMinHeight(30);
       profileS.setMinWidth(70);
        
       profileS.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                }); 
       
       tableshowS.setTranslateX(10);
       tableshowS.setTranslateY(80);
       tableshowS.setTableMenuButtonVisible(true);
       tableshowS.setPrefHeight(560);
       
       TableColumn colshowS1= new TableColumn("ROLL");
       colshowS1.setMinWidth(100);
       colshowS1.setCellValueFactory(new PropertyValueFactory<>("secid"));
       
       TableColumn colshowS2= new TableColumn("NAME");
       colshowS2.setMinWidth(100);
       colshowS2.setCellValueFactory(new PropertyValueFactory<>("cid"));
       
       TableColumn colshowS3= new TableColumn("BDATE");
       colshowS3.setMinWidth(100);
       colshowS3.setCellValueFactory(new PropertyValueFactory<>("rno"));
       
       TableColumn colshowS4= new TableColumn("GENDER");
       colshowS4.setMinWidth(100);
       colshowS4.setCellValueFactory(new PropertyValueFactory<>("ct"));
       
       TableColumn colshowS5= new TableColumn("CONTACT NO");
       colshowS5.setMinWidth(100);
       colshowS5.setCellValueFactory(new PropertyValueFactory<>("nos"));
       
       tableshowS.getColumns().addAll(colshowS1,colshowS2,colshowS3,colshowS4,colshowS5);
       
       tableshowS2.setTranslateX(10);
       tableshowS2.setTranslateY(80);
       tableshowS2.setTableMenuButtonVisible(true);
       tableshowS2.setPrefHeight(560);
       
       TableColumn colshowS11= new TableColumn("ROLL");
       colshowS11.setMinWidth(100);
       colshowS11.setCellValueFactory(new PropertyValueFactory<>("rouid"));
       
       TableColumn colshowS22= new TableColumn("NAME");
       colshowS22.setMinWidth(100);
       colshowS22.setCellValueFactory(new PropertyValueFactory<>("secid"));
       
       TableColumn colshowS33= new TableColumn("BDATE");
       colshowS33.setMinWidth(100);
       colshowS33.setCellValueFactory(new PropertyValueFactory<>("tid"));
       
       TableColumn colshowS44= new TableColumn("GENDER");
       colshowS44.setMinWidth(100);
       colshowS44.setCellValueFactory(new PropertyValueFactory<>("sub"));
       
       TableColumn colshowS55= new TableColumn("CONTACT NO");
       colshowS55.setMinWidth(100);
       colshowS55.setCellValueFactory(new PropertyValueFactory<>("time"));
       
       TableColumn colshowS66= new TableColumn("SECTION ID");
       colshowS66.setMinWidth(100);
       colshowS66.setCellValueFactory(new PropertyValueFactory<>("rdate"));
       
       tableshowS2.getColumns().addAll(colshowS11,colshowS22,colshowS33,colshowS44,colshowS55,colshowS66);
             
       tableshowS3.setTranslateX(10);
       tableshowS3.setTranslateY(80);
       tableshowS3.setTableMenuButtonVisible(true);
       tableshowS3.setPrefHeight(560);
       
       TableColumn colshowS111= new TableColumn("ROLL");
       colshowS111.setMinWidth(100);
       colshowS111.setCellValueFactory(new PropertyValueFactory<>("id"));
       
       TableColumn colshowS222= new TableColumn("NAME");
       colshowS222.setMinWidth(100);
       colshowS222.setCellValueFactory(new PropertyValueFactory<>("name"));
       
       TableColumn colshowS333= new TableColumn("BDATE");
       colshowS333.setMinWidth(100);
       colshowS333.setCellValueFactory(new PropertyValueFactory<>("bdate"));
       
       TableColumn colshowS444= new TableColumn("GENDER");
       colshowS444.setMinWidth(100);
       colshowS444.setCellValueFactory(new PropertyValueFactory<>("secid"));
       
       TableColumn colshowS555= new TableColumn("CONTACT NO");
       colshowS555.setMinWidth(100);
       colshowS555.setCellValueFactory(new PropertyValueFactory<>("roll"));
       
       TableColumn colshowS666= new TableColumn("SECTION ID");
       colshowS666.setMinWidth(100);
       colshowS666.setCellValueFactory(new PropertyValueFactory<>("gender"));
       
       TableColumn colshowS777= new TableColumn("CLASS ID");
       colshowS777.setMinWidth(100);
       colshowS777.setCellValueFactory(new PropertyValueFactory<>("nmbr"));
       
       tableshowS3.getColumns().addAll(colshowS111,colshowS222,colshowS333,colshowS444,colshowS555,colshowS666,colshowS777);
       
       tableshowT.setTranslateX(10);
       tableshowT.setTranslateY(80);
       tableshowT.setTableMenuButtonVisible(true);
       tableshowT.setPrefHeight(560);
       
       TableColumn colshowT1= new TableColumn("NAME");
       colshowT1.setMinWidth(100);
       colshowT1.setCellValueFactory(new PropertyValueFactory<>("rouid"));
       
       TableColumn colshowT2= new TableColumn("AGE");
       colshowT2.setMinWidth(100);
       colshowT2.setCellValueFactory(new PropertyValueFactory<>("secid"));
       
       TableColumn colshowT3= new TableColumn("SUBJECT");
       colshowT3.setMinWidth(100);
       colshowT3.setCellValueFactory(new PropertyValueFactory<>("tid"));
       
       TableColumn colshowT4= new TableColumn("START DATE");
       colshowT4.setMinWidth(100);
       colshowT4.setCellValueFactory(new PropertyValueFactory<>("sub"));
       
       TableColumn colshowT5= new TableColumn("END DATE");
       colshowT5.setMinWidth(100);
       colshowT5.setCellValueFactory(new PropertyValueFactory<>("time"));
       
       TableColumn colshowT6= new TableColumn("CONTACT NO");
       colshowT6.setMinWidth(100);
       colshowT6.setCellValueFactory(new PropertyValueFactory<>("rdate"));
       
       tableshowT.getColumns().addAll(colshowT1,colshowT2,colshowT3,colshowT4,colshowT5,colshowT6);
       
       grpuserS.getChildren().addAll(imviewstudentinfo,bcomS2,lcomS1,lcomS2,comS1,comS2,showS,profileS,tableshowS);
       
       
       
       gproT =new Group();
       
       lproT1=new Label("TEACHER ID");
       lproT1.setLayoutX(140);
       lproT1.setLayoutY(94);
       
       lproT2=new Label("SCHOOL ID");
       lproT2.setLayoutX(140);
       lproT2.setLayoutY(134);
       
       lproT3=new Label("NAME");
       lproT3.setLayoutX(140);
       lproT3.setLayoutY(174);
       
       lproT4=new Label("AGE");
       lproT4.setLayoutX(140);
       lproT4.setLayoutY(214);
       
       lproT5=new Label("SUBJECT");
       lproT5.setLayoutX(140);
       lproT5.setLayoutY(254);
       
       lproT6=new Label("START DATE");
       lproT6.setLayoutX(140);
       lproT6.setLayoutY(294);
       
       lproT7=new Label("END DATE");
       lproT7.setLayoutX(140);
       lproT7.setLayoutY(334);
       
       lproT8=new Label("CONTACT NO");
       lproT8.setLayoutX(140);
       lproT8.setLayoutY(374);
       
       
       lproT11 =new Label();
       lproT11.setLayoutX(230);
       lproT11.setLayoutY(94);
       
       lproT22 =new Label();
       lproT22.setLayoutX(230);
       lproT22.setLayoutY(134);
       
       tproT3 =new TextField();
       tproT3.setLayoutX(220);
       tproT3.setLayoutY(170);
       
       tproT4 =new TextField();
       tproT4.setLayoutX(220);
       tproT4.setLayoutY(210);
       
       tproT5 =new TextField();
       tproT5.setLayoutX(220);
       tproT5.setLayoutY(250);
       
       lproT66 =new Label();
       lproT66.setLayoutX(230);
       lproT66.setLayoutY(294);
       
       lproT77 =new Label();
       lproT77.setLayoutX(230);
       lproT77.setLayoutY(334);
       
       tproT8 =new TextField();
       tproT8.setLayoutX(220);
       tproT8.setLayoutY(370);
       
       probackT=new Button("Back");
        probackT.setLayoutX(100);
        probackT.setLayoutY(550);
        probackT.setMinHeight(30);
        probackT.setMinWidth(70);
        
        probackT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       saveT=new Button("Save");
       saveT.setLayoutX(220);
       saveT.setLayoutY(410);
       saveT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       passT=new Button("Change password");
       passT.setLayoutX(750);
       passT.setLayoutY(550);
       passT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       marksT=new Button("Update Attendance");
       marksT.setLayoutX(600);
       marksT.setLayoutY(550);
       marksT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       tableTRou.setTranslateX(500);
       tableTRou.setTranslateY(170);
       tableTRou.setTableMenuButtonVisible(true);
       tableTRou.setPrefHeight(250);
       
       TableColumn colTrou1= new TableColumn("DATE");
       colTrou1.setMinWidth(100);
       colTrou1.setCellValueFactory(new PropertyValueFactory<>("evid"));
       
       TableColumn colTrou2= new TableColumn("SECTION ID");
       colTrou2.setMinWidth(100);
       colTrou2.setCellValueFactory(new PropertyValueFactory<>("tmid"));
       
       TableColumn colTrou3= new TableColumn("TIME");
       colTrou3.setMinWidth(100);
       colTrou3.setCellValueFactory(new PropertyValueFactory<>("type"));
       
       TableColumn colTrou4= new TableColumn("SUBJECT");
       colTrou4.setMinWidth(100);
       colTrou4.setCellValueFactory(new PropertyValueFactory<>("name"));
       
       tableTRou.getColumns().addAll(colTrou1,colTrou2,colTrou3,colTrou4);
       
       gproT.getChildren().addAll(lproT1,lproT11,lproT2,lproT22,lproT3,lproT4,lproT5,lproS6,lproT66,lproT7,lproT77,lproT8,saveT,tproT3,tproT4,tproT5,tproT8,backSTSflogin,probackT,passT,marksT);
       
       
       gpasschngeT=new Group();
        
        oldpassT =new PasswordField();
        oldpassT.setLayoutX(240);
        oldpassT.setLayoutY(90);
        
        newpassT=new PasswordField();
        newpassT.setLayoutX(240);
        newpassT.setLayoutY(130);
        
        conpassT=new PasswordField();
        conpassT.setLayoutX(240);
        conpassT.setLayoutY(170);
        
        loldpassT=new Label("Old Password");
        loldpassT.setLayoutX(140);
        loldpassT.setLayoutY(92);
       
        lnewpassT=new Label("New Password");
        lnewpassT.setLayoutX(140);
        lnewpassT.setLayoutY(134);
        
        lconpassT=new Label("Confirm Password");
        lconpassT.setLayoutX(140);
        lconpassT.setLayoutY(174);
        
        savepassT=new Button("Save");
        savepassT.setTranslateX(240);
        savepassT.setTranslateY(240);
        savepassT.setMinHeight(20);
        savepassT.setMinWidth(65);
        
        savepassT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        backproT=new Button("Back");
        backproT.setLayoutX(100);
        backproT.setLayoutY(550);
        backproT.setMinHeight(20);
        backproT.setMinWidth(60);
        
        backproT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        gpasschngeT.getChildren().addAll(imviewlogin,oldpassS,newpassS,conpassS,loldpassS,lnewpassS,lconpassS,savepassS,backproS);
       
        
        gmarksT=new Group();
        
        marksSID =new TextField();
        marksSID.setLayoutX(240);
        marksSID.setLayoutY(90);
        
        marksST=new TextField();
        marksST.setLayoutX(240);
        marksST.setLayoutY(130);
        
        lmarksSID=new Label("STUDENT ID");
        lmarksSID.setLayoutX(140);
        lmarksSID.setLayoutY(92);
       
        lmarksST=new Label("ATTENDANCE");
        lmarksST.setLayoutX(140);
        lmarksST.setLayoutY(134);
        
        savemarksT=new Button("Save");
        savemarksT.setTranslateX(240);
        savemarksT.setTranslateY(240);
        savemarksT.setMinHeight(20);
        savemarksT.setMinWidth(65);
        
        savemarksT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        backmarksT=new Button("Back");
        backmarksT.setLayoutX(100);
        backmarksT.setLayoutY(550);
        backmarksT.setMinHeight(20);
        backmarksT.setMinWidth(60);
        
        backmarksT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        gmarksT.getChildren().addAll(marksSID,marksST,lmarksSID,lmarksST,savemarksT,backmarksT);
        
       
       grpuserT=new Group();
       
        lcomT1=new Label("INFORMATION->");
        lcomT1.setLayoutX(760);
        lcomT1.setLayoutY(204);
       
        lcomT2=new Label("CATEGORY->");
        lcomT2.setLayoutX(760);
        lcomT2.setLayoutY(254);
        
        comT1=new ComboBox();
        comT1.setTranslateX(870);
        comT1.setTranslateY(200);
        comT1.setMinHeight(20);
        comT1.setMinWidth(85);
        comT1.getItems().addAll("Student","Teacher","Staff");
        
        comT2=new ComboBox();
        comT2.setTranslateX(870);
        comT2.setTranslateY(250);
        comT2.setMinHeight(20);
        comT2.setMinWidth(85);
        
        //comS2.getItems().addAll("Section","Class","School");
        bcomT2=new Button();
        bcomT2.setTranslateX(960);
        bcomT2.setTranslateY(200);
        bcomT2.setMinHeight(20);
        bcomT2.setMinWidth(20);
        bcomT2.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        showT=new Button("Show");
        showT.setTranslateX(890);
        showT.setTranslateY(300);
        showT.setMinHeight(20);
        showT.setMinWidth(65);
        
        showT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       profileT=new Button("Profile");
       profileT.setLayoutX(800);
       profileT.setLayoutY(550);
       profileT.setMinHeight(30);
       profileT.setMinWidth(70);
        
       profileT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       grpuserT.getChildren().addAll(imviewstudentinfo,bcomT2,lcomT1,lcomT2,comT1,comT2,showT,profileT);
       
       
       gproSf =new Group();
       lproSf1=new Label("STAFF ID");
       lproSf1.setLayoutX(140);
       lproSf1.setLayoutY(94);
       
       lproSf2=new Label("SCHOOL ID");
       lproSf2.setLayoutX(140);
       lproSf2.setLayoutY(134);
       
       lproSf3=new Label("NAME");
       lproSf3.setLayoutX(140);
       lproSf3.setLayoutY(174);
       
       lproSf4=new Label("AGE");
       lproSf4.setLayoutX(140);
       lproSf4.setLayoutY(214);
       
       lproSf5=new Label("TYPE");
       lproSf5.setLayoutX(140);
       lproSf5.setLayoutY(254);
       

       lproSf11 =new Label();
       lproSf11.setLayoutX(230);
       lproSf11.setLayoutY(94);
       
       lproSf22 =new Label();
       lproSf22.setLayoutX(220);
       lproSf22.setLayoutY(134);
       
       tproSf3 =new TextField();
       tproSf3.setLayoutX(220);
       tproSf3.setLayoutY(170);
       
       tproSf4 =new TextField();
       tproSf4.setLayoutX(220);
       tproSf4.setLayoutY(210);
       
       tproSf5 =new TextField();
       tproSf5.setLayoutX(220);
       tproSf5.setLayoutY(250);
       
        probackSf=new Button("Back");
        probackSf.setLayoutX(100);
        probackSf.setLayoutY(550);
        probackSf.setMinHeight(30);
        probackSf.setMinWidth(70);
        
        probackSf.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       saveSf=new Button("Save");
       saveSf.setLayoutX(220);
       saveSf.setLayoutY(370);
       saveSf.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       passSf=new Button("Change password");
       passSf.setLayoutX(750);
       passSf.setLayoutY(550);
       passSf.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       

       gproSf.getChildren().addAll(lproSf1,lproSf11,lproSf2,lproSf22,lproSf3,lproSf4,lproSf5,saveSf,tproSf3,tproSf4,tproSf5,probackSf,passSf);
       
       gpasschngeSf=new Group();
        
        oldpassSf =new PasswordField();
        oldpassSf.setLayoutX(240);
        oldpassSf.setLayoutY(90);
        
        newpassSf=new PasswordField();
        newpassSf.setLayoutX(240);
        newpassSf.setLayoutY(130);
        
        conpassSf=new PasswordField();
        conpassSf.setLayoutX(240);
        conpassSf.setLayoutY(170);
        
        loldpassSf=new Label("Old Password");
        loldpassSf.setLayoutX(140);
        loldpassSf.setLayoutY(92);
       
        lnewpassSf=new Label("New Password");
        lnewpassSf.setLayoutX(140);
        lnewpassSf.setLayoutY(134);
        
        lconpassSf=new Label("Confirm Password");
        lconpassSf.setLayoutX(140);
        lconpassSf.setLayoutY(174);
        
        savepassSf=new Button("Save");
        savepassSf.setTranslateX(240);
        savepassSf.setTranslateY(240);
        savepassSf.setMinHeight(20);
        savepassSf.setMinWidth(65);
        
        savepassSf.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        backproSf=new Button("Back");
        backproSf.setLayoutX(100);
        backproSf.setLayoutY(550);
        backproSf.setMinHeight(20);
        backproSf.setMinWidth(60);
        
        backproSf.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        gpasschngeSf.getChildren().addAll(imviewlogin,oldpassSf,newpassSf,conpassSf,loldpassSf,lnewpassSf,lconpassSf,savepassSf,backproSf);
        
        
       grpuserSf=new Group();
        
        lcomSf1=new Label("INFORMATION->");
        lcomSf1.setLayoutX(760);
        lcomSf1.setLayoutY(204);
       
        lcomSf2=new Label("CATEGORY->");
        lcomSf2.setLayoutX(760);
        lcomSf2.setLayoutY(254);
        
        comSf1=new ComboBox();
        comSf1.setTranslateX(870);
        comSf1.setTranslateY(200);
        comSf1.setMinHeight(20);
        comSf1.setMinWidth(85);
        comSf1.getItems().addAll("Student","Teacher","Staff");
        
        comSf2=new ComboBox();
        comSf2.setTranslateX(870);
        comSf2.setTranslateY(250);
        comSf2.setMinHeight(20);
        comSf2.setMinWidth(85);
        
        //comS2.getItems().addAll("Section","Class","School");
        bcomSf2=new Button();
        bcomSf2.setTranslateX(960);
        bcomSf2.setTranslateY(200);
        bcomSf2.setMinHeight(20);
        bcomSf2.setMinWidth(20);
        bcomSf2.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
        showSf=new Button("Show");
        showSf.setTranslateX(890);
        showSf.setTranslateY(300);
        showSf.setMinHeight(20);
        showSf.setMinWidth(65);
        
        showSf.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       profileSf=new Button("Profile");
       profileSf.setLayoutX(800);
       profileSf.setLayoutY(550);
       profileSf.setMinHeight(30);
       profileSf.setMinWidth(70);
        
       profileSf.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       tableshowSf.setTranslateX(10);
       tableshowSf.setTranslateY(80);
       tableshowSf.setTableMenuButtonVisible(true);
       tableshowSf.setPrefHeight(560);
       
       TableColumn colshowSf1= new TableColumn("NAME");
       colshowSf1.setMinWidth(100);
       colshowSf1.setCellValueFactory(new PropertyValueFactory<>("schid"));
       
       TableColumn colshowSf2= new TableColumn("AGE");
       colshowSf2.setMinWidth(100);
       colshowSf2.setCellValueFactory(new PropertyValueFactory<>("name"));
       
       tableshowSf.getColumns().addAll(colshowSf1,colshowSf2);
       
       grpuserSf.getChildren().addAll(imviewstudentinfo,bcomSf2,lcomSf1,lcomSf2,comSf1,comSf2,showSf,profileSf);
       
       
       groupguest=new Group();

        lcomguest1=new Label("SCHOOL->");
        lcomguest1.setLayoutX(650);
        lcomguest1.setLayoutY(204);
       
        lcomguest2=new Label("CATEGORY->");
        lcomguest2.setLayoutX(650);
        lcomguest2.setLayoutY(254);
        
        comguest1=new ComboBox();
        comguest1.setTranslateX(750);
        comguest1.setTranslateY(200);
        comguest1.setMinHeight(20);
        comguest1.setMinWidth(85);
        
        String sql = "SELECT NAME FROM SCHOOL";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                
                        comguest1.getItems().addAll(rs.getString(1));
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        comguest2=new ComboBox();
        comguest2.setTranslateX(750);
        comguest2.setTranslateY(250);
        comguest2.setMinHeight(20);
        comguest2.setMinWidth(85);
        comguest2.getItems().addAll("Student","Head Master","Assis Head","Assis Teacher");

        showguest=new Button("Show");
        showguest.setTranslateX(890);
        showguest.setTranslateY(300);
        showguest.setMinHeight(20);
        showguest.setMinWidth(65);
        
        showguest.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        
       backguest=new Button("Back");
       backguest.setLayoutX(20);
       backguest.setLayoutY(30);
       backguest.setMinHeight(20);
       backguest.setMinWidth(60);
        
       backguest.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       tableguest1.setTranslateX(10);
       tableguest1.setTranslateY(80);
       tableguest1.setTableMenuButtonVisible(true);
       tableguest1.setPrefHeight(560);
       
       TableColumn colguest1= new TableColumn("NAME");
       colguest1.setMinWidth(100);
       colguest1.setCellValueFactory(new PropertyValueFactory<>("cid"));
       
       TableColumn colguest2= new TableColumn("ROLL");
       colguest2.setMinWidth(100);
       colguest2.setCellValueFactory(new PropertyValueFactory<>("schid"));
       
       TableColumn colguest3= new TableColumn("CLASS");
       colguest3.setMinWidth(100);
       colguest3.setCellValueFactory(new PropertyValueFactory<>("nos"));
       
       tableguest1.getColumns().addAll(colguest1,colguest2,colguest3);
       
       
       tableguest2.setTranslateX(10);
       tableguest2.setTranslateY(80);
       tableguest2.setTableMenuButtonVisible(true);
       tableguest2.setPrefHeight(560);
       
       TableColumn colguest11= new TableColumn("NAME");
       colguest11.setMinWidth(100);
       colguest11.setCellValueFactory(new PropertyValueFactory<>("evid"));
       
       TableColumn colguest22= new TableColumn("AGE");
       colguest22.setMinWidth(100);
       colguest22.setCellValueFactory(new PropertyValueFactory<>("tmid"));
       
       TableColumn colguest33= new TableColumn("SUBJECT");
       colguest33.setMinWidth(100);
       colguest33.setCellValueFactory(new PropertyValueFactory<>("type"));
       
       TableColumn colguest44= new TableColumn("CONTACT NO");
       colguest44.setMinWidth(100);
       colguest44.setCellValueFactory(new PropertyValueFactory<>("name"));
       
       tableguest2.getColumns().addAll(colguest11,colguest22,colguest33,colguest44);
       
       groupguest.getChildren().addAll(imviewstudentinfo,lcomguest1,lcomguest2,comguest1,comguest2,showguest,backguest,tableguest1);
       
       
       

       groupstudent=new Group();
       
        iminfoadd = new Image("infoadd.jpg");
        imviewinfoadd = new ImageView();
        imviewinfoadd.setImage(iminfoadd);
        imviewinfoadd.setTranslateX(0);
        imviewinfoadd.setTranslateY(0);
        imviewinfoadd.setFitHeight(650);
        imviewinfoadd.setFitWidth(1000);
        
       studentinfo=new Label("STUDENT INFO.");
       studentinfo.setLayoutX(240);
       studentinfo.setLayoutY(30);
       
       l1=new Label("STUDENT_ID");
       l1.setLayoutX(140);
       l1.setLayoutY(94);
       
       l2=new Label("NAME");
       l2.setLayoutX(140);
       l2.setLayoutY(134);
       
       l3=new Label("BDATE");
       l3.setLayoutX(140);
       l3.setLayoutY(174);
       
       l4=new Label("SECTION_ID");
       l4.setLayoutX(140);
       l4.setLayoutY(214);
       
       l5=new Label("ROLL");
       l5.setLayoutX(140);
       l5.setLayoutY(254);
       
       l6=new Label("GENDER");
       l6.setLayoutX(140);
       l6.setLayoutY(294);
       
       l7=new Label("CONTACT_NO");
       l7.setLayoutX(140);
       l7.setLayoutY(334);
       
       
       t1 =new TextField();
       t1.setLayoutX(220);
       t1.setLayoutY(90);
       
       t2 =new TextField();
       t2.setLayoutX(220);
       t2.setLayoutY(130);
       
       t3 =new TextField();
       t3.setLayoutX(220);
       t3.setLayoutY(170);
       
       t4 =new TextField();
       t4.setLayoutX(220);
       t4.setLayoutY(210);
       
       t5 =new TextField();
       t5.setLayoutX(220);
       t5.setLayoutY(250);
       
       t6 =new TextField();
       t6.setLayoutX(220);
       t6.setLayoutY(290);
       
       t7 =new TextField();
       t7.setLayoutX(220);
       t7.setLayoutY(330);
       
        backupS=new Button("Back");
        backupS.setLayoutX(100);
        backupS.setLayoutY(550);
        backupS.setMinHeight(30);
        backupS.setMinWidth(70);
        
        backupS.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       addS=new Button("Add");
       addS.setLayoutX(220);
       addS.setLayoutY(370);
       addS.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       

       groupstudent.getChildren().addAll(imviewinfoadd,studentinfo,l1,l2,l3,l4,l5,l6,l7,addS,t1,t2,t3,t4,t5,t6,t7,backupS);
       
       
       
       
       
       
       
       grouphead=new Group();
        
       hdinfo=new Label("HEAD MASTER INFO.");
       hdinfo.setLayoutX(240);
       hdinfo.setLayoutY(30);
       
       lhd1=new Label("HDM_ID");
       lhd1.setLayoutX(140);
       lhd1.setLayoutY(94);
       
       lhd2=new Label("SCHOOL_ID");
       lhd2.setLayoutX(140);
       lhd2.setLayoutY(134);
       
       lhd3=new Label("NAME");
       lhd3.setLayoutX(140);
       lhd3.setLayoutY(174);
       
       lhd4=new Label("AGE");
       lhd4.setLayoutX(140);
       lhd4.setLayoutY(214);
       
       lhd5=new Label("SUBJECT");
       lhd5.setLayoutX(140);
       lhd5.setLayoutY(254);
       
       lhd6=new Label("START_DATE");
       lhd6.setLayoutX(140);
       lhd6.setLayoutY(294);
       
       lhd7=new Label("END_DATE");
       lhd7.setLayoutX(140);
       lhd7.setLayoutY(334);
       
       lhd8=new Label("CONTACT_NO");
       lhd8.setLayoutX(140);
       lhd8.setLayoutY(374);
       
       
       thd1 =new TextField();
       thd1.setLayoutX(220);
       thd1.setLayoutY(90);
       
       thd2 =new TextField();
       thd2.setLayoutX(220);
       thd2.setLayoutY(130);
       
       thd3 =new TextField();
       thd3.setLayoutX(220);
       thd3.setLayoutY(170);
       
       thd4 =new TextField();
       thd4.setLayoutX(220);
       thd4.setLayoutY(210);
       
       thd5 =new TextField();
       thd5.setLayoutX(220);
       thd5.setLayoutY(250);
       
       thd6 =new TextField();
       thd6.setLayoutX(220);
       thd6.setLayoutY(290);
       
       thd7 =new TextField();
       thd7.setLayoutX(220);
       thd7.setLayoutY(330);
       
       thd8 =new TextField();
       thd8.setLayoutX(220);
       thd8.setLayoutY(370);
       
       backupHd=new Button("Back");
        backupHd.setLayoutX(100);
        backupHd.setLayoutY(550);
        backupHd.setMinHeight(30);
        backupHd.setMinWidth(70);
        
        backupHd.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       addHd=new Button("Add");
       addHd.setLayoutX(220);
       addHd.setLayoutY(410);
       
       addHd.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });

       grouphead.getChildren().addAll(imviewinfoadd,hdinfo,lhd1,lhd2,lhd3,lhd4,lhd5,lhd6,lhd7,lhd8,addHd,thd1,thd2,thd3,thd4,thd5,thd6,thd7,thd8,backupHd);
       
       
       
       
       
       groupassis=new Group();
        
       assisinfo=new Label("ASSISTANT HEAD MASTER INFO.");
       assisinfo.setLayoutX(240);
       assisinfo.setLayoutY(30);
       
       las1=new Label("ASHDM_ID");
       las1.setLayoutX(140);
       las1.setLayoutY(94);
       
       las2=new Label("SCHOOL_ID");
       las2.setLayoutX(140);
       las2.setLayoutY(134);
       
       las3=new Label("NAME");
       las3.setLayoutX(140);
       las3.setLayoutY(174);
       
       las4=new Label("AGE");
       las4.setLayoutX(140);
       las4.setLayoutY(214);
       
       las5=new Label("SUBJECT");
       las5.setLayoutX(140);
       las5.setLayoutY(254);
       
       las6=new Label("START_DATE");
       las6.setLayoutX(140);
       las6.setLayoutY(294);
       
       las7=new Label("END_DATE");
       las7.setLayoutX(140);
       las7.setLayoutY(334);
       
       las8=new Label("CONTACT_NO");
       las8.setLayoutX(140);
       las8.setLayoutY(374);
       
       
       tas1 =new TextField();
       tas1.setLayoutX(220);
       tas1.setLayoutY(90);
       
       tas2 =new TextField();
       tas2.setLayoutX(220);
       tas2.setLayoutY(130);
       
       tas3 =new TextField();
       tas3.setLayoutX(220);
       tas3.setLayoutY(170);
       
       tas4 =new TextField();
       tas4.setLayoutX(220);
       tas4.setLayoutY(210);
       
       tas5 =new TextField();
       tas5.setLayoutX(220);
       tas5.setLayoutY(250);
       
       tas6 =new TextField();
       tas6.setLayoutX(220);
       tas6.setLayoutY(290);
       
       tas7 =new TextField();
       tas7.setLayoutX(220);
       tas7.setLayoutY(330);
       
       tas8 =new TextField();
       tas8.setLayoutX(220);
       tas8.setLayoutY(370);
       
       backupAssis=new Button("Back");
        backupAssis.setLayoutX(100);
        backupAssis.setLayoutY(550);
        backupAssis.setMinHeight(30);
        backupAssis.setMinWidth(70);
        
        backupAssis.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       addAssis=new Button("Add");
       addAssis.setLayoutX(220);
       addAssis.setLayoutY(410);
       
       addAssis.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       groupassis.getChildren().addAll(imviewinfoadd,assisinfo,las1,las2,las3,las4,las5,las6,las7,las8,addAssis,tas1,tas2,tas3,tas4,tas5,tas6,tas7,tas8,backupAssis);
       
       
       
       
       
       
       groupteacher=new Group();
        
       tinfo=new Label("TEACHER INFO.");
       tinfo.setLayoutX(240);
       tinfo.setLayoutY(30);
       
       lt1=new Label("TEACHER_ID");
       lt1.setLayoutX(140);
       lt1.setLayoutY(94);
       
       lt2=new Label("SCHOOL_ID");
       lt2.setLayoutX(140);
       lt2.setLayoutY(134);
       
       lt3=new Label("NAME");
       lt3.setLayoutX(140);
       lt3.setLayoutY(174);
       
       lt4=new Label("AGE");
       lt4.setLayoutX(140);
       lt4.setLayoutY(214);
       
       lt5=new Label("SUBJECT");
       lt5.setLayoutX(140);
       lt5.setLayoutY(254);
       
       lt6=new Label("START_DATE");
       lt6.setLayoutX(140);
       lt6.setLayoutY(294);
       
       lt7=new Label("END_DATE");
       lt7.setLayoutX(140);
       lt7.setLayoutY(334);
       
       lt8=new Label("CONTACT_NO");
       lt8.setLayoutX(140);
       lt8.setLayoutY(374);
       
       
       tt1 =new TextField();
       tt1.setLayoutX(220);
       tt1.setLayoutY(90);
       
       tt2 =new TextField();
       tt2.setLayoutX(220);
       tt2.setLayoutY(130);
       
       tt3 =new TextField();
       tt3.setLayoutX(220);
       tt3.setLayoutY(170);
       
       tt4 =new TextField();
       tt4.setLayoutX(220);
       tt4.setLayoutY(210);
       
       tt5 =new TextField();
       tt5.setLayoutX(220);
       tt5.setLayoutY(250);
       
       tt6 =new TextField();
       tt6.setLayoutX(220);
       tt6.setLayoutY(290);
       
       tt7 =new TextField();
       tt7.setLayoutX(220);
       tt7.setLayoutY(330);
       
       tt8 =new TextField();
       tt8.setLayoutX(220);
       tt8.setLayoutY(370);
       
       backupT=new Button("Back");
        backupT.setLayoutX(100);
        backupT.setLayoutY(550);
        backupT.setMinHeight(30);
        backupT.setMinWidth(70);
        
        backupT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       addT=new Button("Add");
       addT.setLayoutX(220);
       addT.setLayoutY(410);
       
       addT.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       groupteacher.getChildren().addAll(imviewinfoadd,tinfo,lt1,lt2,lt3,lt4,lt5,lt6,lt7,lt8,addT,tt1,tt2,tt3,tt4,tt5,tt6,tt7,tt8,backupT);
       
       
       
       
       groupschool=new Group();
        
       schoolinfo=new Label("SCHOOL INFO.");
       schoolinfo.setLayoutX(240);
       schoolinfo.setLayoutY(30);
       
       l8=new Label("SCHOOL_ID");
       l8.setLayoutX(140);
       l8.setLayoutY(150);
       
       l9=new Label("NAME");
       l9.setLayoutX(140);
       l9.setLayoutY(190);
       
       
       t8 =new TextField();
       t8.setLayoutX(220);
       t8.setLayoutY(150);
       
       t9 =new TextField();
       t9.setLayoutX(220);
       t9.setLayoutY(190);
       
       backupSch=new Button("Back");
        backupSch.setLayoutX(100);
        backupSch.setLayoutY(550);
        backupSch.setMinHeight(30);
        backupSch.setMinWidth(70);
        
        backupSch.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       addSch=new Button("Add");
       addSch.setLayoutX(220);
       addSch.setLayoutY(370);
       
       addSch.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       groupschool.getChildren().addAll(imviewinfoadd,schoolinfo,l8,l9,addSch,t8,t9,backupSch);
       
       
       groupclas=new Group();
       
       cinfo=new Label("CLASS INFO.");
       cinfo.setLayoutX(240);
       cinfo.setLayoutY(30);
       
       lc1=new Label("CLASS_ID");
       lc1.setLayoutX(140);
       lc1.setLayoutY(150);
       
       lc2=new Label("SCHOOL_ID");
       lc2.setLayoutX(140);
       lc2.setLayoutY(190);
       
       lc3=new Label("NO_OF_STUDENTS");
       lc3.setLayoutX(140);
       lc3.setLayoutY(230);
       
       
       tc1 =new TextField();
       tc1.setLayoutX(260);
       tc1.setLayoutY(150);
       
       tc2 =new TextField();
       tc2.setLayoutX(260);
       tc2.setLayoutY(190);
       
       tc3 =new TextField();
       tc3.setLayoutX(260);
       tc3.setLayoutY(230);
       
       backupC=new Button("Back");
        backupC.setLayoutX(100);
        backupC.setLayoutY(550);
        backupC.setMinHeight(30);
        backupC.setMinWidth(70);
        
        backupC.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       addC=new Button("Add");
       addC.setLayoutX(220);
       addC.setLayoutY(370);
       
       addC.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
        
       
       groupclas.getChildren().addAll(imviewinfoadd,cinfo,lc1,lc2,lc3,addC,tc1,tc2,tc3,backupC);
       
       
       
       
       groupsection=new Group();
       
       secinfo=new Label("SECTION INFO.");
       secinfo.setLayoutX(240);
       secinfo.setLayoutY(30);
       
       lsec1=new Label("SECTION_ID");
       lsec1.setLayoutX(140);
       lsec1.setLayoutY(150);
       
       lsec2=new Label("CLASS_ID");
       lsec2.setLayoutX(140);
       lsec2.setLayoutY(190);
       
       lsec3=new Label("ROOM_NO");
       lsec3.setLayoutX(140);
       lsec3.setLayoutY(230);
       
       lsec4=new Label("CLASS_TEACHER");
       lsec4.setLayoutX(140);
       lsec4.setLayoutY(270);
       
       lsec5=new Label("NO_OF_STUDENTS");
       lsec5.setLayoutX(140);
       lsec5.setLayoutY(310);
       
       
       tsec1 =new TextField();
       tsec1.setLayoutX(260);
       tsec1.setLayoutY(150);
       
       tsec2 =new TextField();
       tsec2.setLayoutX(260);
       tsec2.setLayoutY(190);
       
       tsec3 =new TextField();
       tsec3.setLayoutX(260);
       tsec3.setLayoutY(230);
       
       tsec4 =new TextField();
       tsec4.setLayoutX(260);
       tsec4.setLayoutY(270);
       
       tsec5 =new TextField();
       tsec5.setLayoutX(260);
       tsec5.setLayoutY(310);
       
       backupSec=new Button("Back");
        backupSec.setLayoutX(100);
        backupSec.setLayoutY(550);
        backupSec.setMinHeight(30);
        backupSec.setMinWidth(70);
        
        backupSec.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       addSec=new Button("Add");
       addSec.setLayoutX(220);
       addSec.setLayoutY(370);
       
       addSec.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
        
       
       groupsection.getChildren().addAll(imviewinfoadd,secinfo,lsec1,lsec2,lsec3,lsec4,lsec5,addSec,tsec1,tsec2,tsec3,tsec4,tsec5,backupSec);
       
       
       
       groupresult=new Group();
       
       rinfo=new Label("RESULT INFO.");
       rinfo.setLayoutX(240);
       rinfo.setLayoutY(30);
       
       lr1=new Label("RESULT_ID");
       lr1.setLayoutX(140);
       lr1.setLayoutY(150);
       
       lr2=new Label("STUDENT_ID");
       lr2.setLayoutX(140);
       lr2.setLayoutY(190);
       
       lr3=new Label("FIRST_TERM");
       lr3.setLayoutX(140);
       lr3.setLayoutY(230);
       
       lr4=new Label("SECOND_TERM");
       lr4.setLayoutX(140);
       lr4.setLayoutY(270);
       
       lr5=new Label("ANNUAL");
       lr5.setLayoutX(140);
       lr5.setLayoutY(310);
       
       
       tr1 =new TextField();
       tr1.setLayoutX(260);
       tr1.setLayoutY(150);
       
       tr2 =new TextField();
       tr2.setLayoutX(260);
       tr2.setLayoutY(190);
       
       tr3 =new TextField();
       tr3.setLayoutX(260);
       tr3.setLayoutY(230);
       
       tr4 =new TextField();
       tr4.setLayoutX(260);
       tr4.setLayoutY(270);
       
       tr5 =new TextField();
       tr5.setLayoutX(260);
       tr5.setLayoutY(310);
       
       backupR=new Button("Back");
        backupR.setLayoutX(100);
        backupR.setLayoutY(550);
        backupR.setMinHeight(30);
        backupR.setMinWidth(70);
        
        backupR.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       addR=new Button("Add");
       addR.setLayoutX(220);
       addR.setLayoutY(370);
       
       addR.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
        
       
       groupresult.getChildren().addAll(imviewinfoadd,rinfo,lr1,lr2,lr3,lr4,lr5,addR,tr1,tr2,tr3,tr4,tr5,backupR);
       
       
       
       groupcr=new Group();
       
       crinfo=new Label("CR INFO.");
       crinfo.setLayoutX(240);
       crinfo.setLayoutY(30);
       
       lcr1=new Label("CR_ID");
       lcr1.setLayoutX(140);
       lcr1.setLayoutY(150);
       
       lcr2=new Label("SECTION_ID");
       lcr2.setLayoutX(140);
       lcr2.setLayoutY(190);
       
       lcr3=new Label("NAME");
       lcr3.setLayoutX(140);
       lcr3.setLayoutY(230);
       
       
       tcr1 =new TextField();
       tcr1.setLayoutX(260);
       tcr1.setLayoutY(150);
       
       tcr2 =new TextField();
       tcr2.setLayoutX(260);
       tcr2.setLayoutY(190);
       
       tcr3 =new TextField();
       tcr3.setLayoutX(260);
       tcr3.setLayoutY(230);
       
       backupR=new Button("Back");
        backupR.setLayoutX(100);
        backupR.setLayoutY(550);
        backupR.setMinHeight(30);
        backupR.setMinWidth(70);
        
        backupR.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       addCr=new Button("Add");
       addCr.setLayoutX(220);
       addCr.setLayoutY(370);
       
       addCr.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
        
       
       groupcr.getChildren().addAll(imviewinfoadd,crinfo,lcr1,lcr2,lcr3,addCr,tcr1,tcr2,tcr3,backupR);
       
       
       groupevent=new Group();
       
       evinfo=new Label("EVENT INFO.");
       evinfo.setLayoutX(240);
       evinfo.setLayoutY(30);
       
       lev1=new Label("EVENT_ID");
       lev1.setLayoutX(140);
       lev1.setLayoutY(150);
       
       lev2=new Label("TEAM_ID");
       lev2.setLayoutX(140);
       lev2.setLayoutY(190);
       
       lev3=new Label("TYPE");
       lev3.setLayoutX(140);
       lev3.setLayoutY(230);
       
       lev4=new Label("NAME");
       lev4.setLayoutX(140);
       lev4.setLayoutY(270);
       
       tev1 =new TextField();
       tev1.setLayoutX(260);
       tev1.setLayoutY(150);
       
       tev2 =new TextField();
       tev2.setLayoutX(260);
       tev2.setLayoutY(190);
       
       tev3 =new TextField();
       tev3.setLayoutX(260);
       tev3.setLayoutY(230);
       
       tev4 =new TextField();
       tev4.setLayoutX(260);
       tev4.setLayoutY(270);

       backupR=new Button("Back");
        backupR.setLayoutX(100);
        backupR.setLayoutY(550);
        backupR.setMinHeight(30);
        backupR.setMinWidth(70);
        
        backupR.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       addEv=new Button("Add");
       addEv.setLayoutX(220);
       addEv.setLayoutY(370);
       
       addEv.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
        
       
       groupevent.getChildren().addAll(imviewinfoadd,evinfo,lev1,lev2,lev3,lev4,addEv,tev1,tev2,tev3,tev4,backupR);
       
       
       grouproutine=new Group();
       
       rouinfo=new Label("ROUTINE INFO.");
       rouinfo.setLayoutX(240);
       rouinfo.setLayoutY(30);
       
       lrou1=new Label("ROUTINE_ID");
       lrou1.setLayoutX(140);
       lrou1.setLayoutY(150);
       
       lrou2=new Label("SECTION_ID");
       lrou2.setLayoutX(140);
       lrou2.setLayoutY(190);
       
       lrou3=new Label("TEACHER_ID");
       lrou3.setLayoutX(140);
       lrou3.setLayoutY(230);
       
       lrou4=new Label("SUBJECT");
       lrou4.setLayoutX(140);
       lrou4.setLayoutY(270);
       
       lrou5=new Label("TIME");
       lrou5.setLayoutX(140);
       lrou5.setLayoutY(310);
       
       lrou6=new Label("RDATE");
       lrou6.setLayoutX(140);
       lrou6.setLayoutY(350);
       
       
       trou1 =new TextField();
       trou1.setLayoutX(260);
       trou1.setLayoutY(150);
       
       trou2 =new TextField();
       trou2.setLayoutX(260);
       trou2.setLayoutY(190);
       
       trou3 =new TextField();
       trou3.setLayoutX(260);
       trou3.setLayoutY(230);
       
       trou4 =new TextField();
       trou4.setLayoutX(260);
       trou4.setLayoutY(270);
       
       trou5 =new TextField();
       trou5.setLayoutX(260);
       trou5.setLayoutY(310);
       
       trou6 =new TextField();
       trou6.setLayoutX(260);
       trou6.setLayoutY(350);
       
       backupR=new Button("Back");
        backupR.setLayoutX(100);
        backupR.setLayoutY(550);
        backupR.setMinHeight(30);
        backupR.setMinWidth(70);
        
        backupR.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       addRou=new Button("Add");
       addRou.setLayoutX(220);
       addRou.setLayoutY(410);
       
       addRou.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
        
       
       grouproutine.getChildren().addAll(imviewinfoadd,rouinfo,lrou1,lrou2,lrou3,lrou4,lrou5,lrou6,addRou,trou1,trou2,trou3,trou4,trou5,trou6,backupR);
       
       
       groupstaff=new Group();
       
       sfinfo=new Label("STAFF INFO.");
       sfinfo.setLayoutX(240);
       sfinfo.setLayoutY(30);
       
       lsf1=new Label("STAFF_ID");
       lsf1.setLayoutX(140);
       lsf1.setLayoutY(150);
       
       lsf2=new Label("SCHOOL_ID");
       lsf2.setLayoutX(140);
       lsf2.setLayoutY(190);
       
       lsf3=new Label("NAME");
       lsf3.setLayoutX(140);
       lsf3.setLayoutY(230);
       
       lsf4=new Label("AGE");
       lsf4.setLayoutX(140);
       lsf4.setLayoutY(270);
       
       lsf5=new Label("TYPE");
       lsf5.setLayoutX(140);
       lsf5.setLayoutY(310);
       
       
       tsf1 =new TextField();
       tsf1.setLayoutX(260);
       tsf1.setLayoutY(150);
       
       tsf2 =new TextField();
       tsf2.setLayoutX(260);
       tsf2.setLayoutY(190);
       
       tsf3 =new TextField();
       tsf3.setLayoutX(260);
       tsf3.setLayoutY(230);
       
       tsf4 =new TextField();
       tsf4.setLayoutX(260);
       tsf4.setLayoutY(270);
       
       tsf5 =new TextField();
       tsf5.setLayoutX(260);
       tsf5.setLayoutY(310);
       
       backupR=new Button("Back");
        backupR.setLayoutX(100);
        backupR.setLayoutY(550);
        backupR.setMinHeight(30);
        backupR.setMinWidth(70);
        
        backupR.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       addSf=new Button("Add");
       addSf.setLayoutX(220);
       addSf.setLayoutY(370);
       
       addSf.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
        
       
       groupstaff.getChildren().addAll(imviewinfoadd,sfinfo,lsf1,lsf2,lsf3,lsf4,lsf5,addSf,tsf1,tsf2,tsf3,tsf4,tsf5,backupR);
       
       groupteam=new Group();
       
       tminfo=new Label("TEAM INFO.");
       tminfo.setLayoutX(240);
       tminfo.setLayoutY(30);
       
       ltm1=new Label("TEAM_ID");
       ltm1.setLayoutX(140);
       ltm1.setLayoutY(150);
       
       ltm2=new Label("SCHOOL_ID");
       ltm2.setLayoutX(140);
       ltm2.setLayoutY(190);
       
       ltm3=new Label("NO_OF_MEMBERS");
       ltm3.setLayoutX(140);
       ltm3.setLayoutY(230);
       
       ttm1 =new TextField();
       ttm1.setLayoutX(260);
       ttm1.setLayoutY(150);
       
       ttm2 =new TextField();
       ttm2.setLayoutX(260);
       ttm2.setLayoutY(190);
       
       ttm3 =new TextField();
       ttm3.setLayoutX(260);
       ttm3.setLayoutY(230);
       
       backupR=new Button("Back");
        backupR.setLayoutX(100);
        backupR.setLayoutY(550);
        backupR.setMinHeight(30);
        backupR.setMinWidth(70);
        
        backupR.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       addTm=new Button("Add");
       addTm.setLayoutX(220);
       addTm.setLayoutY(370);
       
       addTm.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
        
       
       groupteam.getChildren().addAll(imviewinfoadd,tminfo,ltm1,ltm2,ltm3,addTm,ttm1,ttm2,ttm3,backupR);
       
       
        backtoinfo=new Button("Back");
        backtoinfo.setLayoutX(10);
        backtoinfo.setLayoutY(10);
        backtoinfo.setMinHeight(18);
        backtoinfo.setMinWidth(30);
        
        backtoinfo.setOnAction((ActionEvent e)->
                {
            try {
                ButtonClicked(e);
            } catch (SQLException ex) {
                Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
       
       grpinfS=new Group();

       table.setTranslateX(10);
       table.setTranslateY(80);
       table.setTableMenuButtonVisible(true);
       table.setPrefHeight(560);
       
       TableColumn column1= new TableColumn("Student Id");
       column1.setMinWidth(100);
       column1.setCellValueFactory(new PropertyValueFactory<>("id"));
       
       TableColumn column2= new TableColumn("Name");
       column2.setMinWidth(100);
       column2.setCellValueFactory(new PropertyValueFactory<>("name"));
       
       TableColumn column3= new TableColumn("BDATE");
       column3.setMinWidth(100);
       column3.setCellValueFactory(new PropertyValueFactory<>("bdate"));
       
       TableColumn column4= new TableColumn("SECTION ID");
       column4.setMinWidth(100);
       column4.setCellValueFactory(new PropertyValueFactory<>("secid"));
       
       TableColumn column5= new TableColumn("ROLL");
       column5.setMinWidth(100);
       column5.setCellValueFactory(new PropertyValueFactory<>("roll"));
       
       TableColumn column6= new TableColumn("GENDER");
       column6.setMinWidth(100);
       column6.setCellValueFactory(new PropertyValueFactory<>("gender"));
       
       TableColumn column7= new TableColumn("CONTACT NO");
       column7.setMinWidth(100);
       column7.setCellValueFactory(new PropertyValueFactory<>("nmbr"));
       
       table.getColumns().addAll(column1,column2,column3,column4,column5,column6,column7);
       
       grpinfS.getChildren().addAll(imviewstudentinfo,backtoinfo,table);
       
       
       
       grpinfHd=new Group();
       
       tableHdM.setTranslateX(10);
       tableHdM.setTranslateY(80);
       tableHdM.setTableMenuButtonVisible(true);
       tableHdM.setPrefHeight(560);
       
       TableColumn colHdM1= new TableColumn("HDM ID");
       colHdM1.setMinWidth(100);
       colHdM1.setCellValueFactory(new PropertyValueFactory<>("id"));
       
       TableColumn colHdM2= new TableColumn("SCHOOL ID");
       colHdM2.setMinWidth(100);
       colHdM2.setCellValueFactory(new PropertyValueFactory<>("schid"));
       
       TableColumn colHdM3= new TableColumn("NAME");
       colHdM3.setMinWidth(100);
       colHdM3.setCellValueFactory(new PropertyValueFactory<>("name"));
       
       TableColumn colHdM4= new TableColumn("AGE");
       colHdM4.setMinWidth(100);
       colHdM4.setCellValueFactory(new PropertyValueFactory<>("age"));
       
       TableColumn colHdM5= new TableColumn("SUBJECT");
       colHdM5.setMinWidth(100);
       colHdM5.setCellValueFactory(new PropertyValueFactory<>("subject"));
       
       TableColumn colHdM6= new TableColumn("START DATE");
       colHdM6.setMinWidth(100);
       colHdM6.setCellValueFactory(new PropertyValueFactory<>("stdate"));
       
       TableColumn colHdM7= new TableColumn("END DATE");
       colHdM7.setMinWidth(100);
       colHdM7.setCellValueFactory(new PropertyValueFactory<>("enddate"));
       
       TableColumn colHdM8= new TableColumn("CONTACT NO");
       colHdM8.setMinWidth(100);
       colHdM8.setCellValueFactory(new PropertyValueFactory<>("nmbr"));
       
       tableHdM.getColumns().addAll(colHdM1,colHdM2,colHdM3,colHdM4,colHdM5,colHdM6,colHdM7,colHdM8);
       grpinfHd.getChildren().addAll(imviewstudentinfo,backtoinfo,tableHdM);
       
       
       grpinfAssis=new Group();
       tableAssisHdM.setTranslateX(10);
       tableAssisHdM.setTranslateY(80);
       tableAssisHdM.setTableMenuButtonVisible(true);
       tableAssisHdM.setPrefHeight(560);
       
       TableColumn colAssisHdM1= new TableColumn("ASHDM ID");
       colAssisHdM1.setMinWidth(100);
       colAssisHdM1.setCellValueFactory(new PropertyValueFactory<>("id"));
       
       TableColumn colAssisHdM2= new TableColumn("SCHOOL ID");
       colAssisHdM2.setMinWidth(100);
       colAssisHdM2.setCellValueFactory(new PropertyValueFactory<>("schid"));
       
       TableColumn colAssisHdM3= new TableColumn("NAME");
       colAssisHdM3.setMinWidth(100);
       colAssisHdM3.setCellValueFactory(new PropertyValueFactory<>("name"));
       
       TableColumn colAssisHdM4= new TableColumn("AGE");
       colAssisHdM4.setMinWidth(100);
       colAssisHdM4.setCellValueFactory(new PropertyValueFactory<>("age"));
       
       TableColumn colAssisHdM5= new TableColumn("SUBJECT");
       colAssisHdM5.setMinWidth(100);
       colAssisHdM5.setCellValueFactory(new PropertyValueFactory<>("subject"));
       
       TableColumn colAssisHdM6= new TableColumn("START DATE");
       colAssisHdM6.setMinWidth(100);
       colAssisHdM6.setCellValueFactory(new PropertyValueFactory<>("stdate"));
       
       TableColumn colAssisHdM7= new TableColumn("END DATE");
       colAssisHdM7.setMinWidth(100);
       colAssisHdM7.setCellValueFactory(new PropertyValueFactory<>("enddate"));
       
       TableColumn colAssisHdM8= new TableColumn("CONTACT NO");
       colAssisHdM8.setMinWidth(100);
       colAssisHdM8.setCellValueFactory(new PropertyValueFactory<>("nmbr"));
       
       tableAssisHdM.getColumns().addAll(colAssisHdM1,colAssisHdM2,colAssisHdM3,colAssisHdM4,colAssisHdM5,colAssisHdM6,colAssisHdM7,colAssisHdM8);
       grpinfAssis.getChildren().addAll(imviewstudentinfo,backtoinfo,tableAssisHdM);
       
       
       
       grpinfT=new Group();
       tableT.setTranslateX(10);
       tableT.setTranslateY(80);
       tableT.setTableMenuButtonVisible(true);
       tableT.setPrefHeight(560);
       
       TableColumn colT1= new TableColumn("TEACHER ID");
       colT1.setMinWidth(100);
       colT1.setCellValueFactory(new PropertyValueFactory<>("id"));
       
       TableColumn colT2= new TableColumn("SCHOOL ID");
       colT2.setMinWidth(100);
       colT2.setCellValueFactory(new PropertyValueFactory<>("schid"));
       
       TableColumn colT3= new TableColumn("NAME");
       colT3.setMinWidth(100);
       colT3.setCellValueFactory(new PropertyValueFactory<>("name"));
       
       TableColumn colT4= new TableColumn("AGE");
       colT4.setMinWidth(100);
       colT4.setCellValueFactory(new PropertyValueFactory<>("age"));
       
       TableColumn colT5= new TableColumn("SUBJECT");
       colT5.setMinWidth(100);
       colT5.setCellValueFactory(new PropertyValueFactory<>("subject"));
       
       TableColumn colT6= new TableColumn("START DATE");
       colT6.setMinWidth(100);
       colT6.setCellValueFactory(new PropertyValueFactory<>("stdate"));
       
       TableColumn colT7= new TableColumn("END DATE");
       colT7.setMinWidth(100);
       colT7.setCellValueFactory(new PropertyValueFactory<>("enddate"));
       
       TableColumn colT8= new TableColumn("CONTACT NO");
       colT8.setMinWidth(100);
       colT8.setCellValueFactory(new PropertyValueFactory<>("nmbr"));
       
       tableT.getColumns().addAll(colT1,colT2,colT3,colT4,colT5,colT6,colT7,colT8);
       grpinfT.getChildren().addAll(imviewstudentinfo,backtoinfo,tableT);
       
       
       grpinfSch=new Group();
       tableSch.setTranslateX(10);
       tableSch.setTranslateY(80);
       tableSch.setTableMenuButtonVisible(true);
       tableSch.setPrefHeight(560);
       
       TableColumn colSch1= new TableColumn("SCHOOL ID");
       colSch1.setMinWidth(100);
       colSch1.setCellValueFactory(new PropertyValueFactory<>("schid"));
       
       TableColumn colSch2= new TableColumn("NAME");
       colSch2.setMinWidth(100);
       colSch2.setCellValueFactory(new PropertyValueFactory<>("name"));
       
       tableSch.getColumns().addAll(colSch1,colSch2);
       grpinfSch.getChildren().addAll(imviewstudentinfo,backtoinfo,tableSch);
       
       
       grpinfC=new Group();
       tableC.setTranslateX(10);
       tableC.setTranslateY(80);
       tableC.setTableMenuButtonVisible(true);
       tableC.setPrefHeight(560);
       
       TableColumn colC1= new TableColumn("CLASS ID");
       colC1.setMinWidth(100);
       colC1.setCellValueFactory(new PropertyValueFactory<>("cid"));
       
       TableColumn colC2= new TableColumn("SCHOOL ID");
       colC2.setMinWidth(100);
       colC2.setCellValueFactory(new PropertyValueFactory<>("schid"));
       
       TableColumn colC3= new TableColumn("NO. OF STUDENTS");
       colC3.setMinWidth(100);
       colC3.setCellValueFactory(new PropertyValueFactory<>("nos"));
       
       tableC.getColumns().addAll(colC1,colC2,colC3);
       grpinfC.getChildren().addAll(imviewstudentinfo,backtoinfo,tableC);
       
       grpinfSec=new Group();
       tableSec.setTranslateX(10);
       tableSec.setTranslateY(80);
       tableSec.setTableMenuButtonVisible(true);
       tableSec.setPrefHeight(560);
       
       TableColumn colSec1= new TableColumn("SECTION ID");
       colSec1.setMinWidth(100);
       colSec1.setCellValueFactory(new PropertyValueFactory<>("secid"));
       
       TableColumn colSec2= new TableColumn("CLASS ID");
       colSec2.setMinWidth(100);
       colSec2.setCellValueFactory(new PropertyValueFactory<>("cid"));
       
       TableColumn colSec3= new TableColumn("ROOM NO.");
       colSec3.setMinWidth(100);
       colSec3.setCellValueFactory(new PropertyValueFactory<>("rno"));
       
       TableColumn colSec4= new TableColumn("CLASS TEACHER");
       colSec4.setMinWidth(100);
       colSec4.setCellValueFactory(new PropertyValueFactory<>("ct"));
       
       TableColumn colSec5= new TableColumn("NO. OF STUDENTS");
       colSec5.setMinWidth(100);
       colSec5.setCellValueFactory(new PropertyValueFactory<>("nos"));
       
       tableSec.getColumns().addAll(colSec1,colSec2,colSec3,colSec4,colSec5);
       grpinfSec.getChildren().addAll(imviewstudentinfo,backtoinfo,tableSec);
       
       
       grpinfR=new Group();
       tableR.setTranslateX(10);
       tableR.setTranslateY(80);
       tableR.setTableMenuButtonVisible(true);
       tableR.setPrefHeight(560);
       
       TableColumn colR1= new TableColumn("RESULT ID");
       colR1.setMinWidth(100);
       colR1.setCellValueFactory(new PropertyValueFactory<>("secid"));
       
       TableColumn colR2= new TableColumn("STUDENT ID");
       colR2.setMinWidth(100);
       colR2.setCellValueFactory(new PropertyValueFactory<>("cid"));
       
       TableColumn colR3= new TableColumn("FIRST TERM");
       colR3.setMinWidth(100);
       colR3.setCellValueFactory(new PropertyValueFactory<>("rno"));
       
       TableColumn colR4= new TableColumn("SECOND TERM");
       colR4.setMinWidth(100);
       colR4.setCellValueFactory(new PropertyValueFactory<>("ct"));
       
       TableColumn colR5= new TableColumn("ANNUAL");
       colR5.setMinWidth(100);
       colR5.setCellValueFactory(new PropertyValueFactory<>("nos"));
       
       tableR.getColumns().addAll(colR1,colR2,colR3,colR4,colR5);
       grpinfR.getChildren().addAll(imviewstudentinfo,backtoinfo,tableR);
       
       
       grpinfCr=new Group();
       tableCr.setTranslateX(10);
       tableCr.setTranslateY(80);
       tableCr.setTableMenuButtonVisible(true);
       tableCr.setPrefHeight(560);
       
       TableColumn colCr1= new TableColumn("CR ID");
       colCr1.setMinWidth(100);
       colCr1.setCellValueFactory(new PropertyValueFactory<>("cid"));
       
       TableColumn colCr2= new TableColumn("SECTION ID");
       colCr2.setMinWidth(100);
       colCr2.setCellValueFactory(new PropertyValueFactory<>("schid"));
       
       TableColumn colCr3= new TableColumn("NAME");
       colCr3.setMinWidth(100);
       colCr3.setCellValueFactory(new PropertyValueFactory<>("nos"));
       
       tableCr.getColumns().addAll(colCr1,colCr2,colCr3);
       grpinfCr.getChildren().addAll(imviewstudentinfo,backtoinfo,tableCr);
       
       
       grpinfEv=new Group();
       tableEv.setTranslateX(10);
       tableEv.setTranslateY(80);
       tableEv.setTableMenuButtonVisible(true);
       tableEv.setPrefHeight(560);
       
       TableColumn colEv1= new TableColumn("EVENT ID");
       colEv1.setMinWidth(100);
       colEv1.setCellValueFactory(new PropertyValueFactory<>("evid"));
       
       TableColumn colEv2= new TableColumn("TEAM ID");
       colEv2.setMinWidth(100);
       colEv2.setCellValueFactory(new PropertyValueFactory<>("tmid"));
       
       TableColumn colEv3= new TableColumn("TYPE");
       colEv3.setMinWidth(100);
       colEv3.setCellValueFactory(new PropertyValueFactory<>("type"));
       
       TableColumn colEv4= new TableColumn("NAME");
       colEv4.setMinWidth(100);
       colEv4.setCellValueFactory(new PropertyValueFactory<>("name"));
       
       tableEv.getColumns().addAll(colEv1,colEv2,colEv3,colEv4);
       grpinfEv.getChildren().addAll(imviewstudentinfo,backtoinfo,tableEv);
       
       
       
       grpinfRou=new Group();
       tableRou.setTranslateX(10);
       tableRou.setTranslateY(80);
       tableRou.setTableMenuButtonVisible(true);
       tableRou.setPrefHeight(560);
       
       TableColumn colRou1= new TableColumn("ROUTINE ID");
       colRou1.setMinWidth(100);
       colRou1.setCellValueFactory(new PropertyValueFactory<>("rouid"));
       
       TableColumn colRou2= new TableColumn("SECTION ID");
       colRou2.setMinWidth(100);
       colRou2.setCellValueFactory(new PropertyValueFactory<>("secid"));
       
       TableColumn colRou3= new TableColumn("TEACHER ID");
       colRou3.setMinWidth(100);
       colRou3.setCellValueFactory(new PropertyValueFactory<>("tid"));
       
       TableColumn colRou4= new TableColumn("SUBJECT");
       colRou4.setMinWidth(100);
       colRou4.setCellValueFactory(new PropertyValueFactory<>("sub"));
       
       TableColumn colRou5= new TableColumn("TIME");
       colRou5.setMinWidth(100);
       colRou5.setCellValueFactory(new PropertyValueFactory<>("time"));
       
       TableColumn colRou6= new TableColumn("RDATE");
       colRou6.setMinWidth(100);
       colRou6.setCellValueFactory(new PropertyValueFactory<>("rdate"));
       
       tableRou.getColumns().addAll(colRou1,colRou2,colRou3,colRou4,colRou5,colRou6);
       grpinfRou.getChildren().addAll(imviewstudentinfo,backtoinfo,tableRou);
       
       
       
       grpinfSf=new Group();
       tableSf.setTranslateX(10);
       tableSf.setTranslateY(80);
       tableSf.setTableMenuButtonVisible(true);
       tableSf.setPrefHeight(560);
       
       TableColumn colSf1= new TableColumn("STAFF ID");
       colSf1.setMinWidth(100);
       colSf1.setCellValueFactory(new PropertyValueFactory<>("secid"));
       
       TableColumn colSf2= new TableColumn("SCHOOL ID");
       colSf2.setMinWidth(100);
       colSf2.setCellValueFactory(new PropertyValueFactory<>("cid"));
       
       TableColumn colSf3= new TableColumn("NAME");
       colSf3.setMinWidth(100);
       colSf3.setCellValueFactory(new PropertyValueFactory<>("rno"));
       
       TableColumn colSf4= new TableColumn("AGE");
       colSf4.setMinWidth(100);
       colSf4.setCellValueFactory(new PropertyValueFactory<>("ct"));
       
       TableColumn colSf5= new TableColumn("TYPE");
       colSf5.setMinWidth(100);
       colSf5.setCellValueFactory(new PropertyValueFactory<>("nos"));
       
       tableSf.getColumns().addAll(colSf1,colSf2,colSf3,colSf4,colSf5);
       grpinfSf.getChildren().addAll(imviewstudentinfo,backtoinfo,tableSf);
       
       
       grpinfTm=new Group();
       tableTm.setTranslateX(10);
       tableTm.setTranslateY(80);
       tableTm.setTableMenuButtonVisible(true);
       tableTm.setPrefHeight(560);
       
       TableColumn colTm1= new TableColumn("TEAM ID");
       colTm1.setMinWidth(100);
       colTm1.setCellValueFactory(new PropertyValueFactory<>("cid"));
       
       TableColumn colTm2= new TableColumn("SCHOOL ID");
       colTm2.setMinWidth(100);
       colTm2.setCellValueFactory(new PropertyValueFactory<>("schid"));
       
       TableColumn colTm3= new TableColumn("NO. OF MEMBERS");
       colTm3.setMinWidth(100);
       colTm3.setCellValueFactory(new PropertyValueFactory<>("nos"));
       
       tableTm.getColumns().addAll(colTm1,colTm2,colTm3);
       grpinfTm.getChildren().addAll(imviewstudentinfo,backtoinfo,tableTm);
       
       
       

       tablescene1=new Scene(grouptable1,1000,650);
       tablescene=new Scene(group1,1000,650);
       SinfoS=new Scene(grpinfS,1000,650);
       SinfoHd=new Scene(grpinfHd,1000,650);
       SinfoAssis=new Scene(grpinfAssis,1000,650);
       SinfoT=new Scene(grpinfT,1000,650);
       SinfoC=new Scene(grpinfC,1000,650);
       SinfoSec=new Scene(grpinfSec,1000,650);
       SinfoSch=new Scene(grpinfSch,1000,650);
       SinfoR=new Scene(grpinfR,1000,650);
       SinfoCr=new Scene(grpinfCr,1000,650);
       SinfoEv=new Scene(grpinfEv,1000,650);
       SinfoRou=new Scene(grpinfRou,1000,650);
       SinfoSf=new Scene(grpinfSf,1000,650);
       SinfoTm=new Scene(grpinfTm,1000,650);
       
       guestscene=new Scene(groupguest,1000,650);
       sloginS=new Scene(loginS,1000,650);
       SproS=new Scene(gproS,1000,650);
       spasschngeS=new Scene(gpasschngeS,1000,650);
       suserS=new Scene(grpuserS,1000,650);
       sloginT=new Scene(loginT,1000,650);
       SproT=new Scene(gproT,1000,650);
       smarksT=new Scene(gmarksT,1000,650);
       spasschngeT=new Scene(gpasschngeT,1000,650);
       suserT=new Scene(grpuserT,1000,650);
       sloginSf=new Scene(loginSf,1000,650);
       SproSf=new Scene(gproSf,1000,650);
       spasschngeSf=new Scene(gpasschngeSf,1000,650);
       suserSf=new Scene(grpuserSf,1000,650);
       
       sLogin=new Scene(login,1000,650);
       startscene =new Scene(root,1000,650);
       infoscene=new Scene(group2,1000,650);
       uptablesceneS=new Scene(groupstudent,1000,650);
       uptablesceneSec=new Scene(groupsection,1000,650);
       uptablesceneSch=new Scene(groupschool,1000,650);
       uptablesceneRes=new Scene(groupresult,1000,650);
       uptablesceneH=new Scene(grouphead,1000,650);
       uptablesceneA=new Scene(groupassis,1000,650);
       uptablesceneC=new Scene(groupclas,1000,650);
       uptablesceneT=new Scene(groupteacher,1000,650);
       uptablesceneCr=new Scene(groupcr,1000,650);
       uptablesceneEv=new Scene(groupevent,1000,650);
       uptablesceneRou=new Scene(grouproutine,1000,650);
       uptablesceneSf=new Scene(groupstaff,1000,650);
       uptablesceneTm=new Scene(groupteam,1000,650);
       
       
       Scene scene=new Scene(startroot,1000,650);
       stage.setScene(scene);
       stage.show();
           
   }
    
    
    public static void main(String[] args)
    {
        // TODO code application logic here
         launch(args);
        
     
    }

    private void ButtonClicked(ActionEvent e) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
        if(e.getSource()==startenter)
        {
            if(start.getValue()=="Enter as Student")
            {
                loginS=new Group();
                loginS.getChildren().addAll(imviewlogin,tuserS,tpassS,luserS,lpassS,bloginS,backlogin);
                sloginS=new Scene(loginS,1000,650);
                stage.setScene(sloginS);
            }
            else if(start.getValue()=="Enter as Teacher")
            {
                findT=0;
                loginT=new Group();
                loginT.getChildren().addAll(imviewlogin,tuserT,tpassT,luserT,lpassT,bloginT,backlogin);
                sloginT=new Scene(loginT,1000,650);
                stage.setScene(sloginT);
            }
            else if(start.getValue()=="Enter as Staff")
            {
                loginSf=new Group();
                loginSf.getChildren().addAll(imviewlogin,tuserSf,tpassSf,luserSf,lpassSf,bloginSf,backlogin);
                sloginSf=new Scene(loginSf,1000,650);
                stage.setScene(sloginSf);
            }
            else if(start.getValue()=="Enter as Admin")
            {
                login=new Group();
                login.getChildren().addAll(imviewlogin,Lusername,Lpassword,username,password,bLogin,backlogin);
                sLogin=new Scene(login,1000,650);
                stage.setScene(sLogin);
            }
            else if(start.getValue()=="Enter as Guest")
            {
                x=1;
            for ( int i = 0; i<tableguest1.getItems().size(); i++)
            {
               tableguest1.getItems().clear();
            }
            for ( int i = 0; i<tableguest2.getItems().size(); i++)
            {
               tableguest2.getItems().clear();
            }
                groupguest=new Group();
                groupguest.getChildren().addAll(imviewstudentinfo,lcomguest1,lcomguest2,comguest1,comguest2,showguest,backguest,tableguest1);
                guestscene=new Scene(groupguest,1000,650);
                stage.setScene(guestscene);
            }
            else
            {
                
            }
        }
        
        /*if(e.getSource()==userStudent)
        {
            loginS=new Group();
            loginS.getChildren().addAll(imviewlogin,tuserS,tpassS,luserS,lpassS,bloginS,backlogin);
            sloginS=new Scene(loginS,1000,650);
            stage.setScene(sloginS);
        }*/
        
        if(e.getSource()==bloginS)
        {
            for ( int i = 0; i<tableshowS.getItems().size(); i++)
            {
               tableshowS.getItems().clear();
            }
            for ( int i = 0; i<tableshowS2.getItems().size(); i++)
            {
               tableshowS2.getItems().clear();
            }
            for ( int i = 0; i<tableshowS3.getItems().size(); i++)
            {
               tableshowS3.getItems().clear();
            }
            xx=1;
            String s=new String();
            String spass=new String();
            int n=0;
            //String kp=new String();
            kp=tuserS.getText();
            String kp1=new String();
            kp1=tpassS.getText();
            String sql = "SELECT * FROM STUDENT";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                spass=rs.getString(8);
                if(kp.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

            if(n==1 && kp1.equals(spass))
            {
                tuserS.clear();
                tpassS.clear();
                //x=1;
                grpuserS=new Group();
                grpuserS.getChildren().addAll(imviewstudentinfo,bcomS2,lcomS1,lcomS2,comS1,comS2,showS,profileS,backSTSflogin,tableshowS);
                suserS=new Scene(grpuserS,1000,650);
                stage.setScene(suserS);
            }
            
            else
            {
                Text t=new Text();
                t.setText("INVALID USER_NAME OR PASSWORD!!!");
                //t.setFont(Font.font ("Verdana", 20));
                //t.setFill(Paint.valueOf(Color.blue));
                t.setLayoutX(200);
                t.setLayoutY(400);
                tuserS.clear();
                tpassS.clear();
                loginS.getChildren().addAll(t);
            }
            
        }
        
        if(e.getSource()==bcomS2)
        {
            comS2.getItems().clear();
            if(comS1.getValue()=="Student")
        {
            comS2.getItems().addAll("Section","Class","School");
        }
            if(comS1.getValue()=="Teacher")
        {
            comS2.getItems().addAll("Head Master","Assis Head","Assis Teacher");
        }
            if(comS1.getValue()=="Staff")
        {
            comS2.getItems().addAll("Cleaner","Gate Man","Care Taker","Office Staff");
        }
        }
        
        if(e.getSource()==showS)
        {
            if(comS1.getValue()=="Student" && comS2.getValue()=="Section")
            {
                for ( int i = 0; i<tableshowS.getItems().size(); i++)
            {
               tableshowS.getItems().clear();
            }
                
                /*String sql = "SELECT ROLL,NAME,BDATE,GENDER,CONTACT_NO FROM STUDENT\n" +
"WHERE SECTION_ID =\n" +
"(\n" +
"SELECT SECTION_ID\n" +
"FROM STUDENT\n" +
"WHERE STUDENT_ID="+kp +
")";*/
                String sql="SELECT * FROM TABLE(SHOW_FromS_S_Sec("+kp+"))";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                datashowS.add(new Section(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                ));
                tableshowS.setItems(datashowS);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
            grpuserS=new Group();
            grpuserS.getChildren().addAll(imviewstudentinfo,bcomS2,lcomS1,lcomS2,comS1,comS2,showS,profileS,backSTSflogin,tableshowS);
            suserS=new Scene(grpuserS,1000,650);
            stage.setScene(suserS);
            }
            
            
            
            else if(comS1.getValue()=="Student" && comS2.getValue()=="Class")
            {
                for ( int i = 0; i<tableshowS2.getItems().size(); i++)
            {
               tableshowS2.getItems().clear();
            }
                
                /*String sql = "SELECT S.ROLL,S.NAME,S.BDATE,S.GENDER,S.CONTACT_NO,SEC.SECTION_ID\n" +
"FROM STUDENT S JOIN SECTION SEC\n" +
"ON(S.SECTION_ID=SEC.SECTION_ID)\n" +
"WHERE SEC.CLASS_ID =\n" +
"(\n" +
"SELECT CLASS_ID\n" +
"FROM SECTION\n" +
"WHERE SECTION_ID=\n" +
"(\n" +
"SELECT SECTION_ID\n" +
"FROM STUDENT\n" +
"WHERE STUDENT_ID="+kp +
")\n" +
")";*/
                String sql="SELECT * FROM TABLE(SHOW_FromS_S_Cls("+kp+"))";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                datashowS2.add(new Routine(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
                tableshowS2.setItems(datashowS2);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
            grpuserS=new Group();
            grpuserS.getChildren().addAll(imviewstudentinfo,bcomS2,lcomS1,lcomS2,comS1,comS2,showS,profileS,backSTSflogin,tableshowS2);
            suserS=new Scene(grpuserS,1000,650);
            stage.setScene(suserS);
            }
            
            
            else if(comS1.getValue()=="Student" && comS2.getValue()=="School")
            {
                for ( int i = 0; i<tableshowS3.getItems().size(); i++)
            {
               tableshowS3.getItems().clear();
            }
                
                /*String sql = "SELECT S.ROLL,S.NAME,S.BDATE,S.GENDER,S.CONTACT_NO,SEC.SECTION_ID,C.CLASS_ID\n" +
"FROM STUDENT S JOIN SECTION SEC\n" +
"ON(S.SECTION_ID=SEC.SECTION_ID)\n" +
"JOIN CLASS C\n" +
"ON(SEC.CLASS_ID=C.CLASS_ID)\n" +
"WHERE C.SCHOOL_ID =\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM CLASS\n" +
"WHERE CLASS_ID=\n" +
"(\n" +
"SELECT CLASS_ID\n" +
"FROM SECTION\n" +
"WHERE SECTION_ID=\n" +
"(\n" +
"SELECT SECTION_ID\n" +
"FROM STUDENT\n" +
"WHERE STUDENT_ID= "+kp+
")\n" +
")\n" +
")";*/
                String sql="SELECT * FROM TABLE(SHOW_FromS_S_Sch("+kp+"))";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                datashowS3.add(new User2(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                ));
                tableshowS3.setItems(datashowS3);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
            grpuserS=new Group();
            grpuserS.getChildren().addAll(imviewstudentinfo,bcomS2,lcomS1,lcomS2,comS1,comS2,showS,profileS,backSTSflogin,tableshowS3);
            suserS=new Scene(grpuserS,1000,650);
            stage.setScene(suserS);
            }
            
            else if(comS1.getValue()=="Teacher" &&(comS2.getValue()=="Assis Teacher"|| comS2.getValue()=="Assis Head" ||comS2.getValue()=="Head Master"))
            {
                for ( int i = 0; i<tableshowT.getItems().size(); i++)
            {
               tableshowT.getItems().clear();
            }
                String sql=new String();
                
                if(comS2.getValue().equals("Assis Teacher"))
                {
                    /*sql = "SELECT T.NAME,T.AGE,T.SUBJECT,T.START_DATE,T.END_DATE,T.CONTACT_NO\n" +
"FROM TEACHER T JOIN CLASS C\n" +
"ON(T.SCHOOL_ID=C.SCHOOL_ID)\n" +
"JOIN SECTION SEC\n" +
"ON(SEC.CLASS_ID=C.CLASS_ID)\n" +
"JOIN STUDENT S\n" +
"ON(S.SECTION_ID=SEC.SECTION_ID)\n" +
"WHERE S.STUDENT_ID="+kp;*/
                    sql="SELECT * FROM TABLE(SHOW_FromS_T("+kp+"))";
                }
                if(comS2.getValue().equals("Assis Head"))
                {
                    /*sql = "SELECT T.NAME,T.AGE,T.SUBJECT,T.START_DATE,T.END_DATE,T.CONTACT_NO\n" +
"FROM ASSIS_HEAD_MASTER T JOIN CLASS C\n" +
"ON(T.SCHOOL_ID=C.SCHOOL_ID)\n" +
"JOIN SECTION SEC\n" +
"ON(SEC.CLASS_ID=C.CLASS_ID)\n" +
"JOIN STUDENT S\n" +
"ON(S.SECTION_ID=SEC.SECTION_ID)\n" +
"WHERE S.STUDENT_ID="+kp;*/
                    sql="SELECT * FROM TABLE(SHOW_FromS_AsHd("+kp+"))";
                }
                if(comS2.getValue().equals("Head Master"))
                {
                    /*sql = "SELECT T.NAME,T.AGE,T.SUBJECT,T.START_DATE,T.END_DATE,T.CONTACT_NO\n" +
"FROM HEAD_MASTER T JOIN CLASS C\n" +
"ON(T.SCHOOL_ID=C.SCHOOL_ID)\n" +
"JOIN SECTION SEC\n" +
"ON(SEC.CLASS_ID=C.CLASS_ID)\n" +
"JOIN STUDENT S\n" +
"ON(S.SECTION_ID=SEC.SECTION_ID)\n" +
"WHERE S.STUDENT_ID="+kp;*/
                    sql="SELECT * FROM TABLE(SHOW_FromS_Hd("+kp+"))";
                }
    

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                datashowT.add(new Routine(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
                tableshowT.setItems(datashowT);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
            grpuserS=new Group();
            grpuserS.getChildren().addAll(imviewstudentinfo,bcomS2,lcomS1,lcomS2,comS1,comS2,showS,profileS,backSTSflogin,tableshowT);
            suserS=new Scene(grpuserS,1000,650);
            stage.setScene(suserS);
            }
            else if(comS1.getValue()=="Staff" &&(comS2.getValue()=="Cleaner"|| comS2.getValue()=="Gate Man" || comS2.getValue()=="Care Taker" || comS2.getValue()=="Office Staff"))
            {
                for ( int i = 0; i<tableshowSf.getItems().size(); i++)
            {
               tableshowSf.getItems().clear();
            }
                String sql=new String();
                
                if(comS2.getValue()=="Cleaner")
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN CLASS C\n" +
"ON(SF.SCHOOL_ID=C.SCHOOL_ID)\n" +
"JOIN SECTION SEC\n" +
"ON(SEC.CLASS_ID=C.CLASS_ID)\n" +
"JOIN STUDENT S\n" +
"ON(S.SECTION_ID=SEC.SECTION_ID)\n" +
"WHERE S.STUDENT_ID="+kp +
"AND SF.TYPE='CLEANER'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromS_Sf("+kp+",'CLEANER'))";
   
                }
                else if(comS2.getValue()=="Gate Man")
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN CLASS C\n" +
"ON(SF.SCHOOL_ID=C.SCHOOL_ID)\n" +
"JOIN SECTION SEC\n" +
"ON(SEC.CLASS_ID=C.CLASS_ID)\n" +
"JOIN STUDENT S\n" +
"ON(S.SECTION_ID=SEC.SECTION_ID)\n" +
"WHERE S.STUDENT_ID="+kp +
"AND SF.TYPE='GATE MAN'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromS_Sf("+kp+",'GATE MAN'))";
   
                }
                else if(comS2.getValue()=="Care Taker")
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN CLASS C\n" +
"ON(SF.SCHOOL_ID=C.SCHOOL_ID)\n" +
"JOIN SECTION SEC\n" +
"ON(SEC.CLASS_ID=C.CLASS_ID)\n" +
"JOIN STUDENT S\n" +
"ON(S.SECTION_ID=SEC.SECTION_ID)\n" +
"WHERE S.STUDENT_ID="+kp +
"AND SF.TYPE='CARE TAKER'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromS_Sf("+kp+",'CARE TAKER'))";
                    
                }
                
                else if(comS2.getValue()=="Office Staff")
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN CLASS C\n" +
"ON(SF.SCHOOL_ID=C.SCHOOL_ID)\n" +
"JOIN SECTION SEC\n" +
"ON(SEC.CLASS_ID=C.CLASS_ID)\n" +
"JOIN STUDENT S\n" +
"ON(S.SECTION_ID=SEC.SECTION_ID)\n" +
"WHERE S.STUDENT_ID="+kp +
"AND SF.TYPE='OFFICE STAFF'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromS_Sf("+kp+",'OFFICE STAFF'))";
                    
                }
                else
                {
                    
                }
    

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                datashowSf.add(new School(
                        rs.getString(1),
                        rs.getString(2)
                ));
                tableshowSf.setItems(datashowSf);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
            grpuserS=new Group();
            grpuserS.getChildren().addAll(imviewstudentinfo,bcomS2,lcomS1,lcomS2,comS1,comS2,showS,profileS,backSTSflogin,tableshowSf);
            suserS=new Scene(grpuserS,1000,650);
            stage.setScene(suserS);
            }
            else
            {
                
            }
       
        }
 
        if(e.getSource()==profileS)
        {
            for ( int i = 0; i<tableSRes.getItems().size(); i++)
            {
               tableSRes.getItems().clear();
            }
            for ( int i = 0; i<tableSGrade.getItems().size(); i++)
            {
               tableSGrade.getItems().clear();
            }

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            String sql1 = "SELECT * FROM STUDENT \n" +
"WHERE STUDENT_ID ="+kp;        
            PreparedStatement pst1 = con.prepareStatement(sql1);
            
            ResultSet rs1 = pst1.executeQuery();
            while (rs1.next())
            {
                lproS11 =new Label(rs1.getString(1));
                lproS11.setLayoutX(230);
                lproS11.setLayoutY(94);
       
                lproS44 =new Label(rs1.getString(4));
                lproS44.setLayoutX(230);
                lproS44.setLayoutY(214);
       
                lproS55 =new Label(rs1.getString(5));
                lproS55.setLayoutX(230);
                lproS55.setLayoutY(254);
                
                tproS2.setPromptText(rs1.getString(2));
                tproS3.setPromptText(rs1.getString(3));
                tproS6.setPromptText(rs1.getString(6));
                tproS7.setPromptText(rs1.getString(7));
            }
            
            pst1.close();
            
            
            
            String sql="SELECT FIRST_TERM, SECOND_TERM,ANNUAL\n" +
"FROM RESULT WHERE STUDENT_ID="+kp;

        
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con1.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                dataSRes.add(new Clas(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)
                ));
                tableSRes.setItems(dataSRes);
            }
            
            pst.close();
            con1.close();
            
            
            String sql2="SELECT GRADE,STATUS\n" +
"FROM SHOWGRADE WHERE SID="+kp;

        
            Connection con2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst2 = con2.prepareStatement(sql2);
            ResultSet rs2 = pst2.executeQuery();
            while (rs2.next())
            {
                dataSGrade.add(new School(
                        rs2.getString(1),
                        rs2.getString(2)
                ));
                tableSGrade.setItems(dataSGrade);
            }
            
            pst2.close();
            con2.close();

        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
            gproS=new Group();
            //gproS.getChildren().addAll(imviewinfoadd,lproS1,lproS11,lproS2,lproS3,lproS4,lproS44,lproS5,lproS55,lproS6,lproS7,saveS,tproS2,tproS3,tproS6,tproS7,backSTSflogin,probackS,tableSRes);
            gproS.getChildren().addAll(imviewinfoadd,lproS1,lproS11,lproS2,lproS3,lproS4,lproS44,lproS5,lproS55,lproS6,lproS7,saveS,tproS2,tproS3,tproS6,tproS7,backSTSflogin,probackS,tableSRes,tableSGrade,passS);
            SproS=new Scene(gproS,1000,650);
            stage.setScene(SproS);
        }
        
        if(e.getSource()==saveS)
        {
            
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql = "UPDATE STUDENT SET NAME=?,BDATE=?,GENDER=?,CONTACT_NO=? WHERE STUDENT_ID="+kp ;
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, tproS2.getText());
            pst.setString(2, tproS3.getText());
            pst.setString(3, tproS6.getText());
            pst.setString(4, tproS7.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            tproS2.clear();
            tproS3.clear();
            tproS6.clear();
            tproS7.clear();  
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
            
            
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            String sql1 = "SELECT * FROM STUDENT \n" +
"WHERE STUDENT_ID ="+kp;        
            PreparedStatement pst1 = con.prepareStatement(sql1);
            
            ResultSet rs1 = pst1.executeQuery();
            while (rs1.next())
            {
                lproS11 =new Label(rs1.getString(1));
                lproS11.setLayoutX(230);
                lproS11.setLayoutY(94);
       
                lproS44 =new Label(rs1.getString(4));
                lproS44.setLayoutX(230);
                lproS44.setLayoutY(214);
       
                lproS55 =new Label(rs1.getString(5));
                lproS55.setLayoutX(230);
                lproS55.setLayoutY(254);
                
                tproS2.setPromptText(rs1.getString(2));
                tproS3.setPromptText(rs1.getString(3));
                tproS6.setPromptText(rs1.getString(6));
                tproS7.setPromptText(rs1.getString(7));
            }
            
            pst1.close();
 
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }    
            
            gproS=new Group();
            //gproS.getChildren().addAll(imviewinfoadd,lproS1,lproS11,lproS2,lproS3,lproS4,lproS44,lproS5,lproS55,lproS6,lproS7,saveS,tproS2,tproS3,tproS6,tproS7,backSTSflogin,probackS,tableSRes);
            gproS.getChildren().addAll(imviewinfoadd,lproS1,lproS11,lproS2,lproS3,lproS4,lproS44,lproS5,lproS55,lproS6,lproS7,saveS,tproS2,tproS3,tproS6,tproS7,backSTSflogin,probackS,tableSRes,tableSGrade,passS);
            SproS=new Scene(gproS,1000,650);
            stage.setScene(SproS);
        }
        if(e.getSource()==passS)
        {
            oldpassS.clear();
            newpassS.clear();
            conpassS.clear();
            gpasschngeS=new Group();
            gpasschngeS.getChildren().addAll(imviewlogin,oldpassS,newpassS,conpassS,loldpassS,lnewpassS,lconpassS,savepassS,backproS,backSTSflogin);
            spasschngeS=new Scene(gpasschngeS,1000,650);
            stage.setScene(spasschngeS);
        }
        
        if(e.getSource()==savepassS)
        {
            String s=new String();
            String ss=new String();
            int n=0;
            String pass=new String();
            String npass=new String();
            String conpass=new String();
            pass=oldpassS.getText();
            npass=newpassS.getText();
            conpass=conpassS.getText();
            String sql = "SELECT * FROM STUDENT";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                ss=rs.getString(8);
                if(kp.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

            if(ss.equals(pass))
            {
                if(npass.equals(conpass))
                {
                    try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql1 = "UPDATE STUDENT SET PASSWORD=? WHERE STUDENT_ID="+kp ;
            PreparedStatement pst = con.prepareStatement(sql1);
            
            try {
            pst.setString(1, npass);
            pst.executeUpdate();
            pst.close();
            con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                } 
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
                    oldpassS.clear();
                    newpassS.clear();
                    conpassS.clear();
                    gpasschngeS=new Group();
                    gpasschngeS.getChildren().addAll(imviewlogin,oldpassS,newpassS,conpassS,loldpassS,lnewpassS,lconpassS,savepassS,backproS,backSTSflogin);
                    spasschngeS=new Scene(gpasschngeS,1000,650);
                    stage.setScene(spasschngeS);
                }
                else
                {
                    Text t=new Text();
                    t.setText("SOMETHING WENT WRONG!!!");
                    t.setLayoutX(200);
                    t.setLayoutY(400);
                    oldpassS.clear();
                    newpassS.clear();
                    conpassS.clear();
                    gpasschngeS.getChildren().addAll(t);
                } 
            }
            
            else
            {
                Text t=new Text();
                t.setText("SOMETHING WENT WRONG!!!");
                t.setLayoutX(200);
                t.setLayoutY(400);
                oldpassS.clear();
                newpassS.clear();
                conpassS.clear();
                gpasschngeS.getChildren().addAll(t);
            }
        }
        if(e.getSource()==backproS)
        {
            gproS=new Group();
            //gproS.getChildren().addAll(imviewinfoadd,lproS1,lproS11,lproS2,lproS3,lproS4,lproS44,lproS5,lproS55,lproS6,lproS7,saveS,tproS2,tproS3,tproS6,tproS7,backSTSflogin,probackS,tableSRes);
            gproS.getChildren().addAll(imviewinfoadd,lproS1,lproS11,lproS2,lproS3,lproS4,lproS44,lproS5,lproS55,lproS6,lproS7,saveS,tproS2,tproS3,tproS6,tproS7,backSTSflogin,probackS,tableSRes,tableSGrade,passS);
            SproS=new Scene(gproS,1000,650);
            stage.setScene(SproS);
        }
        if(e.getSource()==probackS)
        {
            for ( int i = 0; i<tableshowS.getItems().size(); i++)
            {
               tableshowS.getItems().clear();
            }
            for ( int i = 0; i<tableshowS2.getItems().size(); i++)
            {
               tableshowS2.getItems().clear();
            }
            for ( int i = 0; i<tableshowS3.getItems().size(); i++)
            {
               tableshowS3.getItems().clear();
            }
            grpuserS=new Group();
            grpuserS.getChildren().addAll(imviewstudentinfo,bcomS2,lcomS1,lcomS2,comS1,comS2,showS,profileS,backSTSflogin,tableshowS);
            suserS=new Scene(grpuserS,1000,650);
            stage.setScene(suserS);
        }
        
        /*if(e.getSource()==userTeacher)
        {
            findT=0;
            loginT=new Group();
            loginT.getChildren().addAll(imviewlogin,tuserT,tpassT,luserT,lpassT,bloginT,backlogin);
            sloginT=new Scene(loginT,1000,650);
            stage.setScene(sloginT);
        }*/
        
        if(e.getSource()==bloginT)
        {
            for ( int i = 0; i<tableshowS2.getItems().size(); i++)
            {
               tableshowS2.getItems().clear();
            }
            xx=2;
            String s=new String();
            String spass=new String();
            int n=0;
            int n1=0;
            //String kp=new String();
            kp=tuserT.getText();
            String kp1=new String();
            kp1=tpassT.getText();
            String sql=new String();
            if(kp.startsWith("1"))
            {
                sql = "SELECT * FROM HEAD_MASTER";
                n1=1;
                findT=1;
            }
            else if(kp.startsWith("2"))
            {
                sql = "SELECT * FROM ASSIS_HEAD_MASTER";
                n1=1;
                findT=2;
            }
            else if(kp.startsWith("3"))
            {
                sql = "SELECT * FROM TEACHER";
                n1=1;
                findT=3;
            }
            else
            {
                Text t=new Text();
                t.setText("INVALID USER_NAME OR PASSWORD!!!");
                //t.setFont(Font.font ("Verdana", 20));
                //t.setFill(Paint.valueOf(Color.blue));
                t.setLayoutX(200);
                t.setLayoutY(400);
                tuserT.clear();
                tpassT.clear();
                loginT.getChildren().addAll(t);
            }

        if(n1==1)
        {
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                spass=rs.getString(9);
                if(kp.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

            if(n==1 && kp1.equals(spass))
            {
                tuserT.clear();
                tpassT.clear();
                //x=1;
                if(findT==3 || findT==2 || findT==1)
                {
                    grpuserT=new Group();
                    grpuserT.getChildren().addAll(imviewstudentinfo,bcomT2,lcomT1,lcomT2,comT1,comT2,showT,profileT,backSTSflogin,tableshowS2);
                    suserT=new Scene(grpuserT,1000,650);
                    stage.setScene(suserT);
                }
                else
                {
                    
                }
                
            }
            
            else
            {
                Text t=new Text();
                t.setText("INVALID USER_NAME OR PASSWORD!!!");
                //t.setFont(Font.font ("Verdana", 20));
                //t.setFill(Paint.valueOf(Color.blue));
                t.setLayoutX(200);
                t.setLayoutY(400);
                tuserT.clear();
                tpassT.clear();
                loginT.getChildren().addAll(t);
            }
        }
            
        }
        if(e.getSource()==bcomT2)
        {
            comT2.getItems().clear();
            if(comT1.getValue()=="Student")
        {
            comT2.getItems().addAll("Class 1","Class 2","Class 3","Class 4","Class 5","Class 6","Class 7","Class 8","Class 8","Class 10");
        }
            if(comT1.getValue()=="Teacher")
        {
            comT2.getItems().addAll("Head Master","Assis Head","Assis Teacher");
        }
            if(comT1.getValue()=="Staff")
        {
            comT2.getItems().addAll("Cleaner","Gate Man","Care Taker","Office Staff");
        }
        }
        
        if(e.getSource()==showT)
        {
            if(comT1.getValue()=="Student")
            {
                for ( int i = 0; i<tableshowS2.getItems().size(); i++)
            {
               tableshowS2.getItems().clear();
            }
                String s=new String();
                if(findT==1)
                {
                    s="SELECT SCHOOL_ID \n" +
"FROM HEAD_MASTER\n" +
"WHERE HDM_ID="+kp;
                }
                if(findT==2)
                {
                    s="SELECT SCHOOL_ID \n" +
"FROM ASSIS_HEAD_MASTER\n" +
"WHERE ASHDM_ID="+kp;
                }
                if(findT==3)
                {
                    s="SELECT SCHOOL_ID \n" +
"FROM TEACHER\n" +
"WHERE TEACHER_ID="+kp;
                }
                
                try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(s);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                
                        s=rs.getString(1);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                String s1=new String();
                if(comT2.getValue()=="Class 1")
                {
                    s1="01";
                }
                if(comT2.getValue()=="Class 2")
                {
                    s1="02";
                }
                if(comT2.getValue()=="Class 3")
                {
                    s1="03";
                }
                if(comT2.getValue()=="Class 4")
                {
                    s1="04";
                }
                if(comT2.getValue()=="Class 5")
                {
                    s1="05";
                }
                if(comT2.getValue()=="Class 6")
                {
                    s1="06";
                }
                if(comT2.getValue()=="Class 7")
                {
                    s1="07";
                }
                if(comT2.getValue()=="Class 8")
                {
                    s1="08";
                }
                if(comT2.getValue()=="Class 9")
                {
                    s1="09";
                }
                if(comT2.getValue()=="Class 10")
                {
                    s1="10";
                }
                
                String sql=new String();
                if(findT==1)
                {
                    sql = "SELECT S.ROLL,S.NAME,S.BDATE,S.GENDER,S.CONTACT_NO,SEC.SECTION_ID\n" +
"FROM STUDENT S JOIN SECTION SEC\n" +
"ON(S.SECTION_ID=SEC.SECTION_ID)\n" +
"JOIN CLASS C\n" +
"ON(SEC.CLASS_ID=C.CLASS_ID)\n" +
"JOIN SCHOOL SC\n" +
"ON(C.SCHOOL_ID=SC.SCHOOL_ID)\n" +
"JOIN HEAD_MASTER T\n" +
"ON(SC.SCHOOL_ID=T.SCHOOL_ID)\n" +
"WHERE T.HDM_ID="+kp+" AND C.CLASS_ID=7"+s+s1+"\n" +
"ORDER BY SEC.SECTION_ID ASC, S.ROLL ASC";
                }
                if(findT==2)
                {
                    sql = "SELECT S.ROLL,S.NAME,S.BDATE,S.GENDER,S.CONTACT_NO,SEC.SECTION_ID\n" +
"FROM STUDENT S JOIN SECTION SEC\n" +
"ON(S.SECTION_ID=SEC.SECTION_ID)\n" +
"JOIN CLASS C\n" +
"ON(SEC.CLASS_ID=C.CLASS_ID)\n" +
"JOIN SCHOOL SC\n" +
"ON(C.SCHOOL_ID=SC.SCHOOL_ID)\n" +
"JOIN ASSIS_HEAD_MASTER T\n" +
"ON(SC.SCHOOL_ID=T.SCHOOL_ID)\n" +
"WHERE T.ASHDM_ID="+kp+" AND C.CLASS_ID=7"+s+s1+"\n" +
"ORDER BY SEC.SECTION_ID ASC, S.ROLL ASC";
                }
                if(findT==3)
                {
                    sql = "SELECT S.ROLL,S.NAME,S.BDATE,S.GENDER,S.CONTACT_NO,SEC.SECTION_ID\n" +
"FROM STUDENT S JOIN SECTION SEC\n" +
"ON(S.SECTION_ID=SEC.SECTION_ID)\n" +
"JOIN CLASS C\n" +
"ON(SEC.CLASS_ID=C.CLASS_ID)\n" +
"JOIN SCHOOL SC\n" +
"ON(C.SCHOOL_ID=SC.SCHOOL_ID)\n" +
"JOIN TEACHER T\n" +
"ON(SC.SCHOOL_ID=T.SCHOOL_ID)\n" +
"WHERE T.TEACHER_ID="+kp+" AND C.CLASS_ID=7"+s+s1+"\n" +
"ORDER BY SEC.SECTION_ID ASC, S.ROLL ASC";
                }
                

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                datashowS2.add(new Routine(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
                tableshowS2.setItems(datashowS2);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                    grpuserT=new Group();
                    grpuserT.getChildren().addAll(imviewstudentinfo,bcomT2,lcomT1,lcomT2,comT1,comT2,showT,profileT,backSTSflogin,tableshowS2);
                    suserT=new Scene(grpuserT,1000,650);
                    stage.setScene(suserT);
            }

            
            else if(comT1.getValue()=="Teacher" &&(comT2.getValue()=="Assis Teacher"|| comT2.getValue()=="Assis Head" ||comT2.getValue()=="Head Master"))
            {
                for ( int i = 0; i<tableshowT.getItems().size(); i++)
            {
               tableshowT.getItems().clear();
            }
                String sql=new String();
                
                if(comT2.getValue().equals("Assis Teacher"))
                {
                    if(findT==1)
                    {
                        sql = "SELECT T.NAME,T.AGE,T.SUBJECT,T.START_DATE,T.END_DATE,T.CONTACT_NO\n" +
"FROM TEACHER T JOIN SCHOOL S\n" +
"ON(T.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE S.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM HEAD_MASTER\n" +
"WHERE HDM_ID=" +kp+
")";
                    }
                    if(findT==2)
                    {
                        sql = "SELECT T.NAME,T.AGE,T.SUBJECT,T.START_DATE,T.END_DATE,T.CONTACT_NO\n" +
"FROM TEACHER T JOIN SCHOOL S\n" +
"ON(T.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE S.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM ASSIS_HEAD_MASTER\n" +
"WHERE ASHDM_ID=" +kp+
")";
                    }
                    if(findT==3)
                    {
                        sql = "SELECT T.NAME,T.AGE,T.SUBJECT,T.START_DATE,T.END_DATE,T.CONTACT_NO\n" +
"FROM TEACHER T JOIN SCHOOL S\n" +
"ON(T.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE S.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM TEACHER\n" +
"WHERE TEACHER_ID=" +kp+
")";
                    }
                    
                }
                if(comT2.getValue().equals("Assis Head"))
                {
                    if(findT==1)
                    {
                        sql = "SELECT T.NAME,T.AGE,T.SUBJECT,T.START_DATE,T.END_DATE,T.CONTACT_NO\n" +
"FROM ASSIS_HEAD_MASTER T JOIN SCHOOL S\n" +
"ON(T.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE S.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM HEAD_MASTER\n" +
"WHERE HDM_ID=" +kp+
")";
                    }
                    if(findT==2)
                    {
                        sql = "SELECT T.NAME,T.AGE,T.SUBJECT,T.START_DATE,T.END_DATE,T.CONTACT_NO\n" +
"FROM ASSIS_HEAD_MASTER T JOIN SCHOOL S\n" +
"ON(T.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE S.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM ASSIS_HEAD_MASTER\n" +
"WHERE ASHDM_ID=" +kp+
")";
                    }
                    if(findT==3)
                    {
                        sql = "SELECT T.NAME,T.AGE,T.SUBJECT,T.START_DATE,T.END_DATE,T.CONTACT_NO\n" +
"FROM ASSIS_HEAD_MASTER T JOIN SCHOOL S\n" +
"ON(T.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE S.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM TEACHER\n" +
"WHERE TEACHER_ID=" +kp+
")";
                    }
                    
                }
                if(comT2.getValue().equals("Head Master"))
                {
                    if(findT==1)
                    {
                       sql = "SELECT T.NAME,T.AGE,T.SUBJECT,T.START_DATE,T.END_DATE,T.CONTACT_NO\n" +
"FROM HEAD_MASTER T JOIN SCHOOL S\n" +
"ON(T.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE S.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM HEAD_MASTER\n" +
"WHERE HDM_ID=" +kp+
")"; 
                    }
                    if(findT==2)
                    {
                        sql = "SELECT T.NAME,T.AGE,T.SUBJECT,T.START_DATE,T.END_DATE,T.CONTACT_NO\n" +
"FROM HEAD_MASTER T JOIN SCHOOL S\n" +
"ON(T.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE S.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM ASSIS_HEAD_MASTER\n" +
"WHERE ASHDM_ID=" +kp+
")";
                    }
                    if(findT==3)
                    {
                        sql = "SELECT T.NAME,T.AGE,T.SUBJECT,T.START_DATE,T.END_DATE,T.CONTACT_NO\n" +
"FROM HEAD_MASTER T JOIN SCHOOL S\n" +
"ON(T.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE S.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM TEACHER\n" +
"WHERE TEACHER_ID=" +kp+
")";
                    }
                    
                }
    

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                datashowT.add(new Routine(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
                tableshowT.setItems(datashowT);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
                    grpuserT=new Group();
                    grpuserT.getChildren().addAll(imviewstudentinfo,bcomT2,lcomT1,lcomT2,comT1,comT2,showT,profileT,backSTSflogin,tableshowT);
                    suserT=new Scene(grpuserT,1000,650);
                    stage.setScene(suserT);
            }
            else if(comT1.getValue()=="Staff" &&(comT2.getValue()=="Cleaner"|| comT2.getValue()=="Gate Man" || comT2.getValue()=="Care Taker" || comT2.getValue()=="Office Staff"))
            {
                for ( int i = 0; i<tableshowSf.getItems().size(); i++)
            {
               tableshowSf.getItems().clear();
            }
                String sql=new String();
                
                if(comT2.getValue()=="Cleaner")
                {
                    if(findT==1)
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM HEAD_MASTER\n" +
"WHERE HDM_ID="+kp +
")\n" +
"AND SF.TYPE='CLEANER'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromHd_Sf("+kp+",'CLEANER'))";
                }
                if(findT==2)
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM ASSIS_HEAD_MASTER\n" +
"WHERE ASHDM_ID="+kp +
")\n" +
"AND SF.TYPE='CLEANER'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromAsHd_Sf("+kp+",'CLEANER'))";
                }
                if(findT==3)
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM TEACHER\n" +
"WHERE TEACHER_ID="+kp +
")\n" +
"AND SF.TYPE='CLEANER'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromT_Sf("+kp+",'CLEANER'))";
                }
                    
                }
                else if(comT2.getValue()=="Gate Man")
                {
                    if(findT==1)
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM HEAD_MASTER\n" +
"WHERE HDM_ID="+kp +
")\n" +
"AND SF.TYPE='GATE MAN'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromHd_Sf("+kp+",'GATE MAN'))";
                }
                if(findT==2)
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM ASSIS_HEAD_MASTER\n" +
"WHERE ASHDM_ID="+kp +
")\n" +
"AND SF.TYPE='GATE MAN'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromAsHd_Sf("+kp+",'GATE MAN'))";
                }
                if(findT==3)
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM TEACHER\n" +
"WHERE TEACHER_ID="+kp +
")\n" +
"AND SF.TYPE='GATE MAN'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromT_Sf("+kp+",'GATE MAN'))";
                }
   
                }
                else if(comT2.getValue()=="Care Taker")
                {
                    if(findT==1)
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM HEAD_MASTER\n" +
"WHERE HDM_ID="+kp +
")\n" +
"AND SF.TYPE='CARE TAKER'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromHd_Sf("+kp+",'CARE TAKER'))";
                }
                if(findT==2)
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM ASSIS_HEAD_MASTER\n" +
"WHERE ASHDM_ID="+kp +
")\n" +
"AND SF.TYPE='CARE TAKER'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromAsHd_Sf("+kp+",'CARE TAKER'))";
                }
                if(findT==3)
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM TEACHER\n" +
"WHERE TEACHER_ID="+kp +
")\n" +
"AND SF.TYPE='CARE TAKER'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromT_Sf("+kp+",'CARE TAKER'))";
                }
                    
                }
                
                else if(comT2.getValue()=="Office Staff")
                {
                    if(findT==1)
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM HEAD_MASTER\n" +
"WHERE HDM_ID="+kp +
")\n" +
"AND SF.TYPE='OFFICE STAFF'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromHd_Sf("+kp+",'OFFICE STAFF'))";
                }
                if(findT==2)
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM ASSIS_HEAD_MASTER\n" +
"WHERE ASHDM_ID="+kp +
")\n" +
"AND SF.TYPE='OFFICE STAFF'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromAsHd_Sf("+kp+",'OFFICE STAFF'))";
                }
                if(findT==3)
                {
                    /*sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM TEACHER\n" +
"WHERE TEACHER_ID="+kp +
")\n" +
"AND SF.TYPE='OFFICE STAFF'";*/
                    sql="SELECT * FROM TABLE(SHOW_FromT_Sf("+kp+",'OFFICE STAFF'))";
                }
                    
                }
                else
                {
                    
                }
    

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                datashowSf.add(new School(
                        rs.getString(1),
                        rs.getString(2)
                ));
                tableshowSf.setItems(datashowSf);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
                    grpuserT=new Group();
                    grpuserT.getChildren().addAll(imviewstudentinfo,bcomT2,lcomT1,lcomT2,comT1,comT2,showT,profileT,backSTSflogin,tableshowSf);
                    suserT=new Scene(grpuserT,1000,650);
                    stage.setScene(suserT);
            }
            else
            {
                
            }
       
        }
        
        if(e.getSource()==profileT)
        {
            for ( int i = 0; i<tableTRou.getItems().size(); i++)
            {
               tableTRou.getItems().clear();
            }

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql1=new String();
            if(findT==1)
                {
                    sql1 = "SELECT * FROM HEAD_MASTER \n" +
"WHERE HDM_ID ="+kp;
                }
                if(findT==2)
                {
                    sql1 = "SELECT * FROM ASSIS_HEAD_MASTER \n" +
"WHERE ASHDM_ID ="+kp;
                }
                if(findT==3)
                {
                    sql1 = "SELECT * FROM TEACHER \n" +
"WHERE TEACHER_ID ="+kp;
                }
                   
            PreparedStatement pst1 = con.prepareStatement(sql1);
            
            ResultSet rs1 = pst1.executeQuery();
            while (rs1.next())
            {
                lproT11 =new Label(rs1.getString(1));
                lproT11.setLayoutX(230);
                lproT11.setLayoutY(94);
       
                lproT22 =new Label(rs1.getString(2));
                lproT22.setLayoutX(230);
                lproT22.setLayoutY(134);
       
                lproT66 =new Label(rs1.getString(6));
                lproT66.setLayoutX(230);
                lproT66.setLayoutY(294);
                
                lproT77 =new Label(rs1.getString(7));
                lproT77.setLayoutX(230);
                lproT77.setLayoutY(334);
                
                tproT3.setPromptText(rs1.getString(3));
                tproT4.setPromptText(rs1.getString(4));
                tproT5.setPromptText(rs1.getString(5));
                tproT8.setPromptText(rs1.getString(8));
            }
            
            pst1.close();
            
            
            if(findT==3)
                {
                    String sql="SELECT RDATE,SECTION_ID,TIME,SUBJECT\n" +
"FROM ROUTINE \n" +
"WHERE TEACHER_ID="+kp +
"AND RDATE>=SYSDATE";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con1.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                dataTRou.add(new Event(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                ));
                tableTRou.setItems(dataTRou);
            }
            
            pst.close();
            con1.close();
                }
            
 
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
            gproT=new Group();
            gproT.getChildren().addAll(imviewinfoadd,lproT1,lproT11,lproT2,lproT22,lproT3,lproT4,lproT5,lproS6,lproT66,lproT7,lproT77,lproT8,saveT,tproT3,tproT4,tproT5,tproT8,backSTSflogin,probackT,passT);
            if(findT==3)
                {
                    gproT.getChildren().addAll(tableTRou,marksT);
                }
            SproT=new Scene(gproT,1000,650);
            stage.setScene(SproT);
        }
        
        if(e.getSource()==saveT)
        {
            
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql=new String();
            if(findT==1)
            {
                sql = "UPDATE HEAD_MASTER SET NAME=?,AGE=?,SUBJECT=?,CONTACT_NO=? WHERE HDM_ID="+kp ;
            }
            if(findT==2)
            {
                sql = "UPDATE ASSIS_HEAD_MASTER SET NAME=?,AGE=?,SUBJECT=?,CONTACT_NO=? WHERE ASHDM_ID="+kp ;
            }
            if(findT==3)
            {
                sql = "UPDATE TEACHER SET NAME=?,AGE=?,SUBJECT=?,CONTACT_NO=? WHERE TEACHER_ID="+kp ;
            }
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, tproT3.getText());
            pst.setString(2, tproT4.getText());
            pst.setString(3, tproT5.getText());
            pst.setString(4, tproT8.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            tproT3.clear();
            tproT4.clear();
            tproT5.clear();
            tproT8.clear();  
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
            
            
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            String sql1=new String();
            if(findT==1)
            {
                sql1 = "SELECT * FROM HEAD_MASTER \n" +
"WHERE HDM_ID ="+kp;
            }
            if(findT==2)
            {
                sql1 = "SELECT * FROM ASSIS_HEAD_MASTER \n" +
"WHERE ASHDM_ID ="+kp;
            }
            if(findT==3)
            {
                sql1 = "SELECT * FROM TEACHER \n" +
"WHERE TEACHER_ID ="+kp;
            }       
            PreparedStatement pst1 = con.prepareStatement(sql1);
            
            ResultSet rs1 = pst1.executeQuery();
            while (rs1.next())
            {
                lproT11 =new Label(rs1.getString(1));
                lproT11.setLayoutX(230);
                lproT11.setLayoutY(94);
       
                lproT22 =new Label(rs1.getString(2));
                lproT22.setLayoutX(230);
                lproT22.setLayoutY(134);
       
                lproT66 =new Label(rs1.getString(6));
                lproT66.setLayoutX(230);
                lproT66.setLayoutY(294);
                
                lproT77 =new Label(rs1.getString(7));
                lproT77.setLayoutX(230);
                lproT77.setLayoutY(334);
                
                tproT3.setPromptText(rs1.getString(3));
                tproT4.setPromptText(rs1.getString(4));
                tproT5.setPromptText(rs1.getString(5));
                tproT8.setPromptText(rs1.getString(8));
            }
            
            pst1.close();
 
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }    
            
            gproT=new Group();
            gproT.getChildren().addAll(imviewinfoadd,lproT1,lproT11,lproT2,lproT22,lproT3,lproT4,lproT5,lproS6,lproT66,lproT7,lproT77,lproT8,saveT,tproT3,tproT4,tproT5,tproT8,backSTSflogin,probackT,passT);
            if(findT==3)
                {
                    gproT.getChildren().addAll(tableTRou,marksT);
                }
            SproT=new Scene(gproT,1000,650);
            stage.setScene(SproT);
        }
        
        if(e.getSource()==passT)
        {
            oldpassT.clear();
            newpassT.clear();
            conpassT.clear();
            gpasschngeT=new Group();
            gpasschngeT.getChildren().addAll(imviewlogin,oldpassT,newpassT,conpassT,loldpassT,lnewpassT,lconpassT,savepassT,backproT,backSTSflogin);
            spasschngeT=new Scene(gpasschngeT,1000,650);
            stage.setScene(spasschngeT);
        }
        
        if(e.getSource()==savepassT)
        {
            String s=new String();
            String ss=new String();
            int n=0;
            String pass=new String();
            String npass=new String();
            String conpass=new String();
            pass=oldpassT.getText();
            npass=newpassT.getText();
            conpass=conpassT.getText();
            String sql=new String();
            if(findT==1)
            {
                sql = "SELECT * FROM HEAD_MASTER";
            }
            if(findT==2)
            {
                sql = "SELECT * FROM ASSIS_HEAD_MASTER";
            }
            if(findT==3)
            {
                sql = "SELECT * FROM TEACHER";
            }

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                ss=rs.getString(9);
                if(kp.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

            if(ss.equals(pass))
            {
                if(npass.equals(conpass))
                {
                    try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql1=new String();
            if(findT==1)
            {
                sql1 = "UPDATE HEAD_MASTER SET PASSWORD=? WHERE HDM_ID="+kp ;
            }
            if(findT==2)
            {
                sql1 = "UPDATE ASSIS_HEAD_MASTER SET PASSWORD=? WHERE ASHDM_ID="+kp ;
            }
            if(findT==3)
            {
                sql1 = "UPDATE TEACHER SET PASSWORD=? WHERE TEACHER_ID="+kp ;
            }
            
            PreparedStatement pst = con.prepareStatement(sql1);
            
            try {
            pst.setString(1, npass);
            pst.executeUpdate();
            pst.close();
            con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                } 
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
                    oldpassT.clear();
                    newpassT.clear();
                    conpassT.clear();
                    gpasschngeT=new Group();
                    gpasschngeT.getChildren().addAll(imviewlogin,oldpassT,newpassT,conpassT,loldpassT,lnewpassT,lconpassT,savepassT,backproT,backSTSflogin);
                    spasschngeT=new Scene(gpasschngeT,1000,650);
                    stage.setScene(spasschngeT);
                }
                else
                {
                    Text t=new Text();
                    t.setText("SOMETHING WENT WRONG!!!");
                    t.setLayoutX(200);
                    t.setLayoutY(400);
                    oldpassT.clear();
                    newpassT.clear();
                    conpassT.clear();
                    gpasschngeT.getChildren().addAll(t);
                } 
            }
            
            else
            {
                Text t=new Text();
                t.setText("SOMETHING WENT WRONG!!!");
                t.setLayoutX(200);
                t.setLayoutY(400);
                oldpassT.clear();
                newpassT.clear();
                conpassT.clear();
                gpasschngeT.getChildren().addAll(t);
            }
        }
        if(e.getSource()==backproT)
        {
            gproT=new Group();
            gproT.getChildren().addAll(imviewinfoadd,lproT1,lproT11,lproT2,lproT22,lproT3,lproT4,lproT5,lproS6,lproT66,lproT7,lproT77,lproT8,saveT,tproT3,tproT4,tproT5,tproT8,backSTSflogin,probackT,passT);
            if(findT==3)
                {
                    gproT.getChildren().addAll(tableTRou,marksT);
                }
            SproT=new Scene(gproT,1000,650);
            stage.setScene(SproT);
        }
        
        if(e.getSource()==probackT)
        {
            for ( int i = 0; i<tableshowS2.getItems().size(); i++)
            {
               tableshowS2.getItems().clear();
            }
                    grpuserT=new Group();
                    grpuserT.getChildren().addAll(imviewstudentinfo,bcomT2,lcomT1,lcomT2,comT1,comT2,showT,profileT,backSTSflogin,tableshowS2);
                    suserT=new Scene(grpuserT,1000,650);
                    stage.setScene(suserT);
        }
        
        if(e.getSource()==marksT)
        {
            marksSID.clear();
            marksST.clear();
            gmarksT=new Group();
            gmarksT.getChildren().addAll(imviewinfoadd,marksSID,marksST,lmarksSID,lmarksST,savemarksT,backmarksT,backSTSflogin);
            smarksT=new Scene(gmarksT,1000,650);
            stage.setScene(smarksT);
        }
        
        if(e.getSource()==savemarksT)
        {
            String sid=new String();
            String marks=new String();

            sid=marksSID.getText();
            marks=marksST.getText();
            
            
            String schoolT=new String();
            String schoolS=new String();
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql="SELECT SCHOOL_ID FROM TEACHER\n" +
"WHERE TEACHER_ID="+kp;
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                schoolT=rs.getString(1);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
            
            
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql="SELECT SCHOOL_ID FROM CLASS\n" +
"WHERE CLASS_ID=\n" +
"(\n" +
"SELECT CLASS_ID FROM SECTION\n" +
"WHERE SECTION_ID=\n" +
"(\n" +
"SELECT SECTION_ID FROM STUDENT\n" +
"WHERE STUDENT_ID="+sid +
")\n" +
")";
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                schoolS=rs.getString(1);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
            
            if(schoolS.equals(schoolT))
            {
                try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql1=new String();
            
                sql1 = "UPDATE RESULT SET ATTENDANCE=? WHERE STUDENT_ID="+sid ;
            
            PreparedStatement pst = con.prepareStatement(sql1);
            
            try {
            pst.setString(1, marks);
            pst.executeUpdate();
            pst.close();
            con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                } 
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
                marksSID.clear();
            marksST.clear();
            gmarksT=new Group();
            gmarksT.getChildren().addAll(imviewinfoadd,marksSID,marksST,lmarksSID,lmarksST,savemarksT,backmarksT,backSTSflogin);
            smarksT=new Scene(gmarksT,1000,650);
            stage.setScene(smarksT);
            }
            
            else
            {
                Text t=new Text();
                t.setText("UNKNOWN STUDENT ID!!!");
                t.setLayoutX(405);
                t.setLayoutY(108);
                
                marksSID.clear();
            marksST.clear();
            gmarksT=new Group();
            gmarksT.getChildren().addAll(imviewinfoadd,marksSID,marksST,lmarksSID,lmarksST,savemarksT,backmarksT,backSTSflogin);
            gmarksT.getChildren().addAll(t);
            smarksT=new Scene(gmarksT,1000,650);
            stage.setScene(smarksT);
                
            }
            
            
            
        }
        if(e.getSource()==backmarksT)
        {
            gproT=new Group();
            gproT.getChildren().addAll(imviewinfoadd,lproT1,lproT11,lproT2,lproT22,lproT3,lproT4,lproT5,lproS6,lproT66,lproT7,lproT77,lproT8,saveT,tproT3,tproT4,tproT5,tproT8,backSTSflogin,probackT,passT);
            if(findT==3)
                {
                    gproT.getChildren().addAll(tableTRou,marksT);
                }
            SproT=new Scene(gproT,1000,650);
            stage.setScene(SproT);
        }
        
        /*if(e.getSource()==userStaff)
        {
            loginSf=new Group();
            loginSf.getChildren().addAll(imviewlogin,tuserSf,tpassSf,luserSf,lpassSf,bloginSf,backlogin);
            sloginSf=new Scene(loginSf,1000,650);
            stage.setScene(sloginSf);
        }*/
        
        if(e.getSource()==bloginSf)
        {
            xx=3;
            String s=new String();
            String spass=new String();
            int n=0;
            //String kp=new String();
            kp=tuserSf.getText();
            String kp1=new String();
            kp1=tpassSf.getText();
            String sql = "SELECT * FROM STAFF";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                spass=rs.getString(6);
                if(kp.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

            if(n==1 && kp1.equals(spass))
            {
                tuserSf.clear();
                tpassSf.clear();
                //x=1;
                grpuserSf=new Group();
                grpuserSf.getChildren().addAll(imviewstudentinfo,bcomSf2,lcomSf1,lcomSf2,comSf1,comSf2,showSf,profileSf,backSTSflogin,tableshowS2);
                suserSf=new Scene(grpuserSf,1000,650);
                stage.setScene(suserSf);
            }
            
            else
            {
                Text t=new Text();
                t.setText("INVALID USER_NAME OR PASSWORD!!!");
                //t.setFont(Font.font ("Verdana", 20));
                //t.setFill(Paint.valueOf(Color.blue));
                t.setLayoutX(200);
                t.setLayoutY(400);
                tuserSf.clear();
                tpassSf.clear();
                loginSf.getChildren().addAll(t);
            }
            
        }
        

        if(e.getSource()==bcomSf2)
        {
            comSf2.getItems().clear();
            if(comSf1.getValue()=="Student")
        {
            comSf2.getItems().addAll("Class 1","Class 2","Class 3","Class 4","Class 5","Class 6","Class 7","Class 8","Class 8","Class 10");
        }
            if(comSf1.getValue()=="Teacher")
        {
            comSf2.getItems().addAll("Head Master","Assis Head","Assis Teacher");
        }
            if(comSf1.getValue()=="Staff")
        {
            comSf2.getItems().addAll("Cleaner","Gate Man","Care Taker","Office Staff");
        }
        }
        
        if(e.getSource()==showSf)
        {
            if(comSf1.getValue()=="Student")
            {
                for ( int i = 0; i<tableshowS2.getItems().size(); i++)
            {
               tableshowS2.getItems().clear();
            }
                String s=new String();
                s="SELECT SCHOOL_ID \n" +
"FROM STAFF\n" +
"WHERE STAFF_ID="+kp;
                
                
                try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(s);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                
                        s=rs.getString(1);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                String s1=new String();
                if(comSf2.getValue()=="Class 1")
                {
                    s1="01";
                }
                if(comSf2.getValue()=="Class 2")
                {
                    s1="02";
                }
                if(comSf2.getValue()=="Class 3")
                {
                    s1="03";
                }
                if(comSf2.getValue()=="Class 4")
                {
                    s1="04";
                }
                if(comSf2.getValue()=="Class 5")
                {
                    s1="05";
                }
                if(comSf2.getValue()=="Class 6")
                {
                    s1="06";
                }
                if(comSf2.getValue()=="Class 7")
                {
                    s1="07";
                }
                if(comSf2.getValue()=="Class 8")
                {
                    s1="08";
                }
                if(comSf2.getValue()=="Class 9")
                {
                    s1="09";
                }
                if(comSf2.getValue()=="Class 10")
                {
                    s1="10";
                }
                
                String sql=new String();
                
                    sql = "SELECT S.ROLL,S.NAME,S.BDATE,S.GENDER,S.CONTACT_NO,SEC.SECTION_ID\n" +
"FROM STUDENT S JOIN SECTION SEC\n" +
"ON(S.SECTION_ID=SEC.SECTION_ID)\n" +
"JOIN CLASS C\n" +
"ON(SEC.CLASS_ID=C.CLASS_ID)\n" +
"JOIN SCHOOL SC\n" +
"ON(C.SCHOOL_ID=SC.SCHOOL_ID)\n" +
"JOIN STAFF Sf\n" +
"ON(SC.SCHOOL_ID=Sf.SCHOOL_ID)\n" +
"WHERE Sf.STAFF_ID="+kp+" AND C.CLASS_ID=7"+s+s1+"\n" +
"ORDER BY SEC.SECTION_ID ASC, S.ROLL ASC";
                
   

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                datashowS2.add(new Routine(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
                tableshowS2.setItems(datashowS2);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                    grpuserSf=new Group();
                    grpuserSf.getChildren().addAll(imviewstudentinfo,bcomSf2,lcomSf1,lcomSf2,comSf1,comSf2,showSf,profileSf,backSTSflogin,tableshowS2);
                    suserSf=new Scene(grpuserSf,1000,650);
                    stage.setScene(suserSf);
            }

            
            else if(comSf1.getValue()=="Teacher" &&(comSf2.getValue()=="Assis Teacher"|| comSf2.getValue()=="Assis Head" ||comSf2.getValue()=="Head Master"))
            {
                for ( int i = 0; i<tableshowT.getItems().size(); i++)
            {
               tableshowT.getItems().clear();
            }
                String sql=new String();
                
                if(comSf2.getValue().equals("Assis Teacher"))
                {
                    sql = "SELECT T.NAME,T.AGE,T.SUBJECT,T.START_DATE,T.END_DATE,T.CONTACT_NO\n" +
"FROM TEACHER T JOIN SCHOOL SCH\n" +
"ON(T.SCHOOL_ID=SCH.SCHOOL_ID)\n" +
"WHERE SCH.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID \n" +
"FROM STAFF\n" +
"WHERE STAFF_ID="+kp +
")";
   
                }
                if(comSf2.getValue().equals("Assis Head"))
                {
                    sql = "SELECT T.NAME,T.AGE,T.SUBJECT,T.START_DATE,T.END_DATE,T.CONTACT_NO\n" +
"FROM ASSIS_HEAD_MASTER T JOIN SCHOOL SCH\n" +
"ON(T.SCHOOL_ID=SCH.SCHOOL_ID)\n" +
"WHERE SCH.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID \n" +
"FROM STAFF\n" +
"WHERE STAFF_ID="+kp +
")";
   
                }
                if(comSf2.getValue().equals("Head Master"))
                {
                    sql = "SELECT T.NAME,T.AGE,T.SUBJECT,T.START_DATE,T.END_DATE,T.CONTACT_NO\n" +
"FROM HEAD_MASTER T JOIN SCHOOL SCH\n" +
"ON(T.SCHOOL_ID=SCH.SCHOOL_ID)\n" +
"WHERE SCH.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID \n" +
"FROM STAFF\n" +
"WHERE STAFF_ID="+kp +
")";
                    
                }
    

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                datashowT.add(new Routine(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
                tableshowT.setItems(datashowT);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
                    grpuserSf=new Group();
                    grpuserSf.getChildren().addAll(imviewstudentinfo,bcomSf2,lcomSf1,lcomSf2,comSf1,comSf2,showSf,profileSf,backSTSflogin,tableshowT);
                    suserSf=new Scene(grpuserSf,1000,650);
                    stage.setScene(suserSf);
            }
            else if(comSf1.getValue()=="Staff" &&(comSf2.getValue()=="Cleaner"|| comSf2.getValue()=="Gate Man" || comSf2.getValue()=="Care Taker" || comSf2.getValue()=="Office Staff"))
            {
                for ( int i = 0; i<tableshowSf.getItems().size(); i++)
            {
               tableshowSf.getItems().clear();
            }
                String sql=new String();
                
                if(comSf2.getValue()=="Cleaner")
                {
                    sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM STAFF\n" +
"WHERE STAFF_ID="+kp +
")\n" +
"AND SF.TYPE='CLEANER'";
   
                }
                else if(comSf2.getValue()=="Gate Man")
                {
                    sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM STAFF\n" +
"WHERE STAFF_ID="+kp +
")\n" +
"AND SF.TYPE='GATE MAN'";
   
                }
                else if(comSf2.getValue()=="Care Taker")
                {
                    sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM STAFF\n" +
"WHERE STAFF_ID="+kp +
")\n" +
"AND SF.TYPE='CARE TAKER'";
                    
                }
                
                else if(comSf2.getValue()=="Office Staff")
                {
                    sql = "SELECT SF.NAME, SF.AGE\n" +
"FROM STAFF SF JOIN SCHOOL S\n" +
"ON(SF.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE SF.SCHOOL_ID=\n" +
"(\n" +
"SELECT SCHOOL_ID\n" +
"FROM STAFF\n" +
"WHERE STAFF_ID="+kp +
")\n" +
"AND SF.TYPE='OFFICE STAFF'";
                    
                }
                else
                {
                    
                }
    

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                datashowSf.add(new School(
                        rs.getString(1),
                        rs.getString(2)
                ));
                tableshowSf.setItems(datashowSf);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
                    grpuserSf=new Group();
                    grpuserSf.getChildren().addAll(imviewstudentinfo,bcomSf2,lcomSf1,lcomSf2,comSf1,comSf2,showSf,profileSf,backSTSflogin,tableshowSf);
                    suserSf=new Scene(grpuserSf,1000,650);
                    stage.setScene(suserSf);
            }
            else
            {
                
            }
       
        }
        
        if(e.getSource()==profileSf)
        { 

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql1=new String();
            sql1 = "SELECT * FROM STAFF \n" +
"WHERE STAFF_ID ="+kp;
      
            PreparedStatement pst1 = con.prepareStatement(sql1);
            
            ResultSet rs1 = pst1.executeQuery();
            while (rs1.next())
            {
                lproSf11 =new Label(rs1.getString(1));
                lproSf11.setLayoutX(230);
                lproSf11.setLayoutY(94);
       
                lproSf22 =new Label(rs1.getString(2));
                lproSf22.setLayoutX(230);
                lproSf22.setLayoutY(134);
       
                tproSf3.setPromptText(rs1.getString(3));
                tproSf4.setPromptText(rs1.getString(4));
                tproSf5.setPromptText(rs1.getString(5));
            }
            
            pst1.close();
 
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
            gproSf=new Group();
            gproSf.getChildren().addAll(imviewinfoadd,lproSf1,lproSf11,lproSf2,lproSf22,lproSf3,lproSf4,lproSf5,saveSf,tproSf3,tproSf4,tproSf5,backSTSflogin,probackSf,passSf);
            SproSf=new Scene(gproSf,1000,650);
            stage.setScene(SproSf);
        }
        
        if(e.getSource()==saveSf)
        {
            
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql=new String();
            sql = "UPDATE STAFF SET NAME=?,AGE=?,TYPE=? WHERE STAFF_ID="+kp ;
            
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, tproSf3.getText());
            pst.setString(2, tproSf4.getText());
            pst.setString(3, tproSf5.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            tproSf3.clear();
            tproSf4.clear();
            tproSf5.clear();  
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
            
            
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            String sql1=new String();
            sql1 = "SELECT * FROM STAFF \n" +
"WHERE STAFF_ID ="+kp;
                   
            PreparedStatement pst1 = con.prepareStatement(sql1);
            
            ResultSet rs1 = pst1.executeQuery();
            while (rs1.next())
            {
                lproSf11 =new Label(rs1.getString(1));
                lproSf11.setLayoutX(230);
                lproSf11.setLayoutY(94);
       
                lproSf22 =new Label(rs1.getString(2));
                lproSf22.setLayoutX(230);
                lproSf22.setLayoutY(134);
                
                tproSf3.setPromptText(rs1.getString(3));
                tproSf4.setPromptText(rs1.getString(4));
                tproSf5.setPromptText(rs1.getString(5));
            }
            
            pst1.close();
 
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }    
            
            gproSf=new Group();
            gproSf.getChildren().addAll(imviewinfoadd,lproSf1,lproSf11,lproSf2,lproSf22,lproSf3,lproSf4,lproSf5,saveSf,tproSf3,tproSf4,tproSf5,backSTSflogin,probackSf,passSf);
            SproSf=new Scene(gproSf,1000,650);
            stage.setScene(SproSf);
        }
        
        if(e.getSource()==passSf)
        {
            oldpassSf.clear();
            newpassSf.clear();
            conpassSf.clear();
            gpasschngeSf=new Group();
            gpasschngeSf.getChildren().addAll(imviewlogin,oldpassSf,newpassSf,conpassSf,loldpassSf,lnewpassSf,lconpassSf,savepassSf,backproSf,backSTSflogin);
            spasschngeSf=new Scene(gpasschngeSf,1000,650);
            stage.setScene(spasschngeSf);
        }
        
        if(e.getSource()==savepassSf)
        {
            String s=new String();
            String ss=new String();
            int n=0;
            String pass=new String();
            String npass=new String();
            String conpass=new String();
            pass=oldpassSf.getText();
            npass=newpassSf.getText();
            conpass=conpassSf.getText();
            String sql = "SELECT * FROM STAFF";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                ss=rs.getString(6);
                if(kp.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

            if(ss.equals(pass))
            {
                if(npass.equals(conpass))
                {
                    try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql1 = "UPDATE STAFF SET PASSWORD=? WHERE STAFF_ID="+kp ;
            PreparedStatement pst = con.prepareStatement(sql1);
            
            try {
            pst.setString(1, npass);
            pst.executeUpdate();
            pst.close();
            con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                } 
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
                    oldpassSf.clear();
                    newpassSf.clear();
                    conpassSf.clear();
                    gpasschngeSf=new Group();
                    gpasschngeSf.getChildren().addAll(imviewlogin,oldpassSf,newpassSf,conpassSf,loldpassSf,lnewpassSf,lconpassSf,savepassSf,backproSf,backSTSflogin);
                    spasschngeSf=new Scene(gpasschngeSf,1000,650);
                    stage.setScene(spasschngeSf);
                }
                else
                {
                    Text t=new Text();
                    t.setText("SOMETHING WENT WRONG!!!");
                    t.setLayoutX(200);
                    t.setLayoutY(400);
                    oldpassSf.clear();
                    newpassSf.clear();
                    conpassSf.clear();
                    gpasschngeSf.getChildren().addAll(t);
                } 
            }
            
            else
            {
                Text t=new Text();
                t.setText("SOMETHING WENT WRONG!!!");
                t.setLayoutX(200);
                t.setLayoutY(400);
                oldpassSf.clear();
                newpassSf.clear();
                conpassSf.clear();
                gpasschngeSf.getChildren().addAll(t);
            }
        }
        if(e.getSource()==backproSf)
        {
            gproSf=new Group();
            gproSf.getChildren().addAll(imviewinfoadd,lproSf1,lproSf11,lproSf2,lproSf22,lproSf3,lproSf4,lproSf5,saveSf,tproSf3,tproSf4,tproSf5,backSTSflogin,probackSf,passSf);
            SproSf=new Scene(gproSf,1000,650);
            stage.setScene(SproSf);
        }
        
        if(e.getSource()==probackSf)
        {
            for ( int i = 0; i<tableshowS2.getItems().size(); i++)
            {
               tableshowS2.getItems().clear();
            }
                    grpuserSf=new Group();
                    grpuserSf.getChildren().addAll(imviewstudentinfo,bcomSf2,lcomSf1,lcomSf2,comSf1,comSf2,showSf,profileSf,backSTSflogin,tableshowS2);
                    suserSf=new Scene(grpuserSf,1000,650);
                    stage.setScene(suserSf);
        }
        
        if(e.getSource()==backSTSflogin)
        {
            if(xx==1)
            {
                loginS=new Group();
                loginS.getChildren().addAll(imviewlogin,tuserS,tpassS,luserS,lpassS,bloginS,backlogin);
                sloginS=new Scene(loginS,1000,650);
                stage.setScene(sloginS);
            }
            if(xx==2)
            {
                loginT=new Group();
                loginT.getChildren().addAll(imviewlogin,tuserT,tpassT,luserT,lpassT,bloginT,backlogin);
                sloginT=new Scene(loginT,1000,650);
                stage.setScene(sloginT);
            }
            if(xx==3)
            {
                loginSf=new Group();
                loginSf.getChildren().addAll(imviewlogin,tuserSf,tpassSf,luserSf,lpassSf,bloginSf,backlogin);
                sloginSf=new Scene(loginSf,1000,650);
                stage.setScene(sloginSf);
            }
            
        }
        
        /*if(e.getSource()==admin)
        {
            login=new Group();
            login.getChildren().addAll(imviewlogin,Lusername,Lpassword,username,password,bLogin,backlogin);
            sLogin=new Scene(login,1000,650);
            stage.setScene(sLogin);
        }*/
        
        
        if(e.getSource()==bLogin)
        {
            String user="firos";
            String pass="123";
            //String kp=new String();
            kp=username.getText();
            String kp1=new String();
            kp1=password.getText();
            //System.out.println(kp.equals(s));
            if(kp.equals(user) && kp1.equals(pass))
            {
                username.clear();
                password.clear();
                root=new Group();
                root.getChildren().addAll(iv1,addupdel,update,backuserlogin);
                startscene=new Scene(root,1000,650);
                stage.setScene(startscene);
            }
            
            else
            {
                Text t=new Text();
                t.setText("INVALID USER_NAME OR PASSWORD!!!");
                //t.setFont(Font.font ("Verdana", 20));
                //t.setFill(Paint.valueOf(Color.blue));
                t.setLayoutX(200);
                t.setLayoutY(400);
                username.clear();
                password.clear();
                login.getChildren().addAll(t);
            }
            
        }
        if(e.getSource()==backlogin)
        {
            xx=0;
            tuserS.clear();
            tpassS.clear();
            tuserT.clear();
            tpassT.clear();
            tuserSf.clear();
            tpassSf.clear();
            username.clear();
            password.clear();
            startroot=new Pane();
            startroot.getChildren().addAll(imview1st,start,startenter);
            scene=new Scene(startroot,1000,650);
            stage.setScene(scene);
        }
        
        /*if(e.getSource()==guest)
        {
            x=1;
            for ( int i = 0; i<tableguest1.getItems().size(); i++)
            {
               tableguest1.getItems().clear();
            }
            for ( int i = 0; i<tableguest2.getItems().size(); i++)
            {
               tableguest2.getItems().clear();
            }
            groupguest=new Group();
            groupguest.getChildren().addAll(imviewstudentinfo,lcomguest1,lcomguest2,comguest1,comguest2,showguest,backguest,tableguest1);
            guestscene=new Scene(groupguest,1000,650);
            stage.setScene(guestscene);
        }*/
        
       
        if(e.getSource()==showguest)
        {
            String s1=new String();
            s1=(String)comguest1.getValue();
                
            if(comguest2.getValue()=="Student")
            {
                for ( int i = 0; i<tableguest1.getItems().size(); i++)
            {
               tableguest1.getItems().clear();
            }
                
                
                String sql = "SELECT S.NAME,S.ROLL,C.CLASS_ID\n" +
"FROM STUDENT S JOIN SECTION SEC\n" +
"ON(S.SECTION_ID=SEC.SECTION_ID)\n" +
"JOIN CLASS C\n" +
"ON(SEC.CLASS_ID=C.CLASS_ID)\n" +
"JOIN SCHOOL SH\n" +
"ON(C.SCHOOL_ID=SH.SCHOOL_ID)\n" +
"WHERE SH.NAME='" +s1+
"'\nORDER BY CLASS_ID ASC,ROLL ASC";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            String s=new String();
            while (rs.next())
            {
                s= Character.toString(rs.getString(3).charAt(rs.getString(3).length()-1));
                dataguest1.add(new Clas(
                        rs.getString(1),
                        rs.getString(2),
                        s
                ));
                tableguest1.setItems(dataguest1);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
            groupguest=new Group();
            groupguest.getChildren().addAll(imviewstudentinfo,lcomguest1,lcomguest2,comguest1,comguest2,showguest,backguest,tableguest1);
            guestscene=new Scene(groupguest,1000,650);
            stage.setScene(guestscene);
            }
            
            else if(comguest2.getValue()=="Assis Teacher" || comguest2.getValue()=="Assis Head" || comguest2.getValue()=="Head Master")
            {
               
                for ( int i = 0; i<tableguest2.getItems().size(); i++)
            {
               tableguest2.getItems().clear();
            }
                String sql1=new String();
                if(comguest2.getValue().equals("Assis Teacher"))
                {
                  sql1 = "SELECT T.NAME,T.AGE,T.SUBJECT,T.CONTACT_NO\n" +
"FROM TEACHER T JOIN SCHOOL S\n" +
"ON(T.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE S.NAME='"+s1+"'";  
                }
                if(comguest2.getValue().equals("Assis Head"))
                {
                  sql1 = "SELECT T.NAME,T.AGE,T.SUBJECT,T.CONTACT_NO\n" +
"FROM ASSIS_HEAD_MASTER T JOIN SCHOOL S\n" +
"ON(T.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE S.NAME='"+s1+"'";  
                }
                if(comguest2.getValue().equals("Head Master"))
                {
                  sql1 = "SELECT T.NAME,T.AGE,T.SUBJECT,T.CONTACT_NO\n" +
"FROM HEAD_MASTER T JOIN SCHOOL S\n" +
"ON(T.SCHOOL_ID=S.SCHOOL_ID)\n" +
"WHERE S.NAME='"+s1+"'";  
                }
                

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql1);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                dataguest2.add(new Event(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                ));
                tableguest2.setItems(dataguest2);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
            groupguest=new Group();
            groupguest.getChildren().addAll(imviewstudentinfo,lcomguest1,lcomguest2,comguest1,comguest2,showguest,backguest,tableguest2);
            guestscene=new Scene(groupguest,1000,650);
            stage.setScene(guestscene);
            }
            else
            {
                
            }
            
        }
        
        if(e.getSource()==backguest)
        {
            x=0;
            startroot=new Pane();
            startroot.getChildren().addAll(imview1st,start,startenter);
            scene=new Scene(startroot,1000,650);
            stage.setScene(scene);
        }
        
        if(e.getSource()==update)
        {
            if(addupdel.getValue()=="Add")
            {
                group1=new Group();
                group1.getChildren().addAll(imviewupdate,backuserlogin,backupdate,school,head,assis,student,teacher,clas,section,result,cr,event,routine,staff,team);
                tablescene=new Scene(group1,1000,650);
                stage.setScene(tablescene);
            }
            else if(addupdel.getValue()=="Update")
            {
                grouptable1=new Group();
                grouptable1.getChildren().addAll(imviewupdate,backuserlogin,backupdate,school1,head1,assis1,student1,teacher1,clas1,section1,result1,cr1,event1,routine1,staff1,team1);
                tablescene1=new Scene(grouptable1,1000,650);
                stage.setScene(tablescene1);
            }
            else if(addupdel.getValue()=="Information")
            {
                x=2;
                group2=new Group();
                group2.getChildren().addAll(imviewupdate,infoHd,infoAssis,infoT,infoC,infoSec,infoR,infoS,infoSch,infoCr,infoEv,infoRou,infoSf,infoTm,backinfo,backuserlogin);
                infoscene=new Scene(group2,1000,650);
                stage.setScene(infoscene);
            }
            else
            {
                
            }
        }
        
        if(e.getSource()==student1)
        {
            t1.clear();
            t2.clear();
            t3.clear();
            t4.clear();
            t5.clear();
            t6.clear();
            t7.clear();
                t1.setPromptText("");
                t2.setPromptText("");
                t3.setPromptText("");
                t4.setPromptText("");
                t5.setPromptText("");
                t6.setPromptText("");
                t7.setPromptText("");  
            groupstudent1=new Group();
            groupstudent1.getChildren().addAll(imviewinfoadd,backuserlogin,studentinfo,l1,l2,l3,l4,l5,l6,l7,upS,t1,t2,t3,t4,t5,t6,t7,backupS1,checkS);
            uptablesceneS1=new Scene(groupstudent1,1000,650);
            stage.setScene(uptablesceneS1);
        }
        
        if(e.getSource()==upS)
        {
            String kp1=new String();
            kp1=t1.getText();
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql = "UPDATE STUDENT SET NAME=?,BDATE=?,SECTION_ID=?,ROLL=?,GENDER=?,CONTACT_NO=? WHERE STUDENT_ID="+kp1 ;
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, t2.getText());
            pst.setString(2, t3.getText());
            pst.setString(3, t4.getText());
            pst.setString(4, t5.getText());
            pst.setString(5, t6.getText());
            pst.setString(6, t7.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            t1.clear();
            t2.clear();
            t3.clear();
            t4.clear();
            t5.clear();
            t6.clear();
            t7.clear();
                t1.setPromptText("");
                t2.setPromptText("");
                t3.setPromptText("");
                t4.setPromptText("");
                t5.setPromptText("");
                t6.setPromptText("");
                t7.setPromptText("");  
                
                
                Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupstudent1.getChildren().addAll(t);
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==checkS)
        {
            //t1.clear();
            
            t2.clear();
            t3.clear();
            t4.clear();
            t5.clear();
            t6.clear();
            t7.clear();
                t1.setPromptText("");
                t2.setPromptText("");
                t3.setPromptText("");
                t4.setPromptText("");
                t5.setPromptText("");
                t6.setPromptText("");
                t7.setPromptText("");
            
            String s=new String();
            int n=0;
            //String kp=new String();
            //kp=tuserSf.getText();
            String kp1=new String();
            kp1=t1.getText();
            String sql = "SELECT * FROM STUDENT";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                if(kp1.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        String sql1 ="SELECT * FROM STUDENT \n" +
"WHERE STUDENT_ID ="+kp1;

            if(n==1)
            {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql1);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                t1.setPromptText(rs.getString(1));
                t2.setPromptText(rs.getString(2));
                t3.setPromptText(rs.getString(3));
                t4.setPromptText(rs.getString(4));
                t5.setPromptText(rs.getString(5));
                t6.setPromptText(rs.getString(6));
                t7.setPromptText(rs.getString(7));
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                groupstudent1=new Group();
                groupstudent1.getChildren().addAll(imviewinfoadd,backuserlogin,studentinfo,l1,l2,l3,l4,l5,l6,l7,upS,t1,t2,t3,t4,t5,t6,t7,backupS1,checkS);
                uptablesceneS1=new Scene(groupstudent1,1000,650);
                stage.setScene(uptablesceneS1);
            }
            
            else
            {
                Text t=new Text();
                t.setText("NOT FOUND!!!");
                
                t.setLayoutX(600);
                t.setLayoutY(94);
                groupstudent1.getChildren().addAll(t);
            }
        }
        if(e.getSource()==backupS1)
        {
            grouptable1=new Group();
            grouptable1.getChildren().addAll(imviewupdate,backuserlogin,backupdate,school1,head1,assis1,student1,teacher1,clas1,section1,result1,cr1,event1,routine1,staff1,team1);
            tablescene1=new Scene(grouptable1,1000,650);
            stage.setScene(tablescene1);
        }
        
        if(e.getSource()==school1)
        {
            t8.clear();
            t9.clear();
            t8.setPromptText("");
            t9.setPromptText("");
            groupschool=new Group();
            groupschool.getChildren().addAll(imviewinfoadd,backuserlogin,schoolinfo,l8,l9,upSch,t8,t9,backupS1,checkSch);
            uptablesceneSch=new Scene(groupschool,1000,650);
            stage.setScene(uptablesceneSch);
        }
        
        if(e.getSource()==upSch)
        {
            String kp1=new String();
            kp1=t8.getText();
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql = "UPDATE SCHOOL SET NAME=? WHERE SCHOOL_ID="+kp1 ;
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, t9.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            t8.clear();
            t9.clear();
                t8.setPromptText("");
                t9.setPromptText("");
                
                
                Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupschool1.getChildren().addAll(t);
                  
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==checkSch)
        {
            //t1.clear();
            
            t9.clear();
            
                t8.setPromptText("");
                t9.setPromptText("");
                
            String s=new String();
            int n=0;
            //String kp=new String();
            //kp=tuserSf.getText();
            String kp1=new String();
            kp1=t8.getText();
            String sql = "SELECT * FROM SCHOOL";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                if(kp1.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        String sql1 ="SELECT * FROM SCHOOL \n" +
"WHERE SCHOOL_ID ="+kp1;

            if(n==1)
            {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql1);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                t8.setPromptText(rs.getString(1));
                t9.setPromptText(rs.getString(2));
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
            groupschool=new Group();
            groupschool.getChildren().addAll(imviewinfoadd,backuserlogin,schoolinfo,l8,l9,upSch,t8,t9,backupS1,checkSch);
            uptablesceneSch=new Scene(groupschool,1000,650);
            stage.setScene(uptablesceneSch);
            }
            
            else
            {
                Text t=new Text();
                t.setText("NOT FOUND!!!");
                
                t.setLayoutX(600);
                t.setLayoutY(94);
                groupschool.getChildren().addAll(t);
            }
        }
        
        if(e.getSource()==head1)
        {
            thd1.clear();
            thd2.clear();
            thd3.clear();
            thd4.clear();
            thd5.clear();
            thd6.clear();
            thd7.clear();
            thd8.clear();
                thd1.setPromptText("");
                thd2.setPromptText("");
                thd3.setPromptText("");
                thd4.setPromptText("");
                thd5.setPromptText("");
                thd6.setPromptText("");
                thd7.setPromptText("");
                thd8.setPromptText("");
            grouphead1=new Group();
            grouphead1.getChildren().addAll(imviewinfoadd,backuserlogin,hdinfo,lhd1,lhd2,lhd3,lhd4,lhd5,lhd6,lhd7,lhd8,upHd,thd1,thd2,thd3,thd4,thd5,thd6,thd7,thd8,backupS1,checkHd);
            uptablesceneH1=new Scene(grouphead1,1000,650);
            stage.setScene(uptablesceneH1);
        }
        
        if(e.getSource()==upHd)
        {
            String kp1=new String();
            kp1=thd1.getText();
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql = "UPDATE HEAD_MASTER SET SCHOOL_ID=?,NAME=?,AGE=?,SUBJECT=?,START_DATE=?,END_DATE=?,CONTACT_NO=? WHERE HDM_ID="+kp1 ;
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, thd2.getText());
            pst.setString(2, thd3.getText());
            pst.setString(3, thd4.getText());
            pst.setString(4, thd5.getText());
            pst.setString(5, thd6.getText());
            pst.setString(6, thd7.getText());
            pst.setString(7, thd8.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            thd1.clear();
            thd2.clear();
            thd3.clear();
            thd4.clear();
            thd5.clear();
            thd6.clear();
            thd7.clear();
            thd8.clear();
                thd1.setPromptText("");
                thd2.setPromptText("");
                thd3.setPromptText("");
                thd4.setPromptText("");
                thd5.setPromptText("");
                thd6.setPromptText("");
                thd7.setPromptText("");
                thd8.setPromptText("");
                
                
                Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            grouphead1.getChildren().addAll(t);
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==checkHd)
        {
            //t1.clear();
            
            thd2.clear();
            thd3.clear();
            thd4.clear();
            thd5.clear();
            thd6.clear();
            thd7.clear();
            thd8.clear();
                thd1.setPromptText("");
                thd2.setPromptText("");
                thd3.setPromptText("");
                thd4.setPromptText("");
                thd5.setPromptText("");
                thd6.setPromptText("");
                thd7.setPromptText("");
                thd8.setPromptText("");
            
            String s=new String();
            int n=0;
            //String kp=new String();
            //kp=tuserSf.getText();
            String kp1=new String();
            kp1=thd1.getText();
            String sql = "SELECT * FROM HEAD_MASTER";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                if(kp1.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        String sql1 ="SELECT * FROM HEAD_MASTER \n" +
"WHERE HDM_ID ="+kp1;

            if(n==1)
            {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql1);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                thd1.setPromptText(rs.getString(1));
                thd2.setPromptText(rs.getString(2));
                thd3.setPromptText(rs.getString(3));
                thd4.setPromptText(rs.getString(4));
                thd5.setPromptText(rs.getString(5));
                thd6.setPromptText(rs.getString(6));
                thd7.setPromptText(rs.getString(7));
                thd8.setPromptText(rs.getString(8));
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                grouphead1=new Group();
                grouphead1.getChildren().addAll(imviewinfoadd,backuserlogin,hdinfo,lhd1,lhd2,lhd3,lhd4,lhd5,lhd6,lhd7,lhd8,upHd,thd1,thd2,thd3,thd4,thd5,thd6,thd7,thd8,backupS1,checkHd);
                uptablesceneH1=new Scene(grouphead1,1000,650);
                stage.setScene(uptablesceneH1);
            }
            
            else
            {
                Text t=new Text();
                t.setText("NOT FOUND!!!");
                
                t.setLayoutX(600);
                t.setLayoutY(94);
                grouphead1.getChildren().addAll(t);
            }
        }
        
        if(e.getSource()==assis1)
        {
            tas1.clear();
            tas2.clear();
            tas3.clear();
            tas4.clear();
            tas5.clear();
            tas6.clear();
            tas7.clear();
            tas8.clear();
                tas1.setPromptText("");
                tas2.setPromptText("");
                tas3.setPromptText("");
                tas4.setPromptText("");
                tas5.setPromptText("");
                tas6.setPromptText("");
                tas7.setPromptText("");
                tas8.setPromptText("");
            groupassis1=new Group();
            groupassis1.getChildren().addAll(imviewinfoadd,backuserlogin,assisinfo,las1,las2,las3,las4,las5,las6,las7,las8,upAssis,tas1,tas2,tas3,tas4,tas5,tas6,tas7,tas8,backupS1,checkAssis);
            uptablesceneA1=new Scene(groupassis1,1000,650);
            stage.setScene(uptablesceneA1);
        }
        
        if(e.getSource()==upAssis)
        {
            String kp1=new String();
            kp1=tas1.getText();
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql = "UPDATE ASSIS_HEAD_MASTER SET SCHOOL_ID=?,NAME=?,AGE=?,SUBJECT=?,START_DATE=?,END_DATE=?,CONTACT_NO=? WHERE ASHDM_ID="+kp1 ;
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, tas2.getText());
            pst.setString(2, tas3.getText());
            pst.setString(3, tas4.getText());
            pst.setString(4, tas5.getText());
            pst.setString(5, tas6.getText());
            pst.setString(6, tas7.getText());
            pst.setString(7, tas8.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            tas1.clear();
            tas2.clear();
            tas3.clear();
            tas4.clear();
            tas5.clear();
            tas6.clear();
            tas7.clear();
            tas8.clear();
                tas1.setPromptText("");
                tas2.setPromptText("");
                tas3.setPromptText("");
                tas4.setPromptText("");
                tas5.setPromptText("");
                tas6.setPromptText("");
                tas7.setPromptText("");
                tas8.setPromptText("");
                
                
                Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupassis1.getChildren().addAll(t);
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==checkAssis)
        {
            
            tas2.clear();
            tas3.clear();
            tas4.clear();
            tas5.clear();
            tas6.clear();
            tas7.clear();
            tas8.clear();
                tas1.setPromptText("");
                tas2.setPromptText("");
                tas3.setPromptText("");
                tas4.setPromptText("");
                tas5.setPromptText("");
                tas6.setPromptText("");
                tas7.setPromptText("");
                tas8.setPromptText("");
            
            String s=new String();
            int n=0;
            //String kp=new String();
            //kp=tuserSf.getText();
            String kp1=new String();
            kp1=tas1.getText();
            String sql = "SELECT * FROM ASSIS_HEAD_MASTER";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                if(kp1.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        String sql1 ="SELECT * FROM ASSIS_HEAD_MASTER \n" +
"WHERE ASHDM_ID ="+kp1;

            if(n==1)
            {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql1);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                tas1.setPromptText(rs.getString(1));
                tas2.setPromptText(rs.getString(2));
                tas3.setPromptText(rs.getString(3));
                tas4.setPromptText(rs.getString(4));
                tas5.setPromptText(rs.getString(5));
                tas6.setPromptText(rs.getString(6));
                tas7.setPromptText(rs.getString(7));
                tas8.setPromptText(rs.getString(8));
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                groupassis1=new Group();
                groupassis1.getChildren().addAll(imviewinfoadd,backuserlogin,assisinfo,las1,las2,las3,las4,las5,las6,las7,las8,upAssis,tas1,tas2,tas3,tas4,tas5,tas6,tas7,tas8,backupS1,checkAssis);
                uptablesceneA1=new Scene(groupassis1,1000,650);
                stage.setScene(uptablesceneA1);
            }
            
            else
            {
                Text t=new Text();
                t.setText("NOT FOUND!!!");
                
                t.setLayoutX(600);
                t.setLayoutY(94);
                groupassis1.getChildren().addAll(t);
            }
        }
        
        if(e.getSource()==teacher1)
        {
            tt1.clear();
            tt2.clear();
            tt3.clear();
            tt4.clear();
            tt5.clear();
            tt6.clear();
            tt7.clear();
            tt8.clear();
                tt1.setPromptText("");
                tt2.setPromptText("");
                tt3.setPromptText("");
                tt4.setPromptText("");
                tt5.setPromptText("");
                tt6.setPromptText("");
                tt7.setPromptText("");
                tt8.setPromptText("");
            groupteacher1=new Group();
            groupteacher1.getChildren().addAll(imviewinfoadd,backuserlogin,tinfo,lt1,lt2,lt3,lt4,lt5,lt6,lt7,lt8,upT,tt1,tt2,tt3,tt4,tt5,tt6,tt7,tt8,backupS1,checkT);
            uptablesceneT1=new Scene(groupteacher1,1000,650);
            stage.setScene(uptablesceneT1);
        }
        
        if(e.getSource()==upT)
        {
            String kp1=new String();
            kp1=tt1.getText();
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql = "UPDATE TEACHER SET SCHOOL_ID=?,NAME=?,AGE=?,SUBJECT=?,START_DATE=?,END_DATE=?,CONTACT_NO=? WHERE TEACHER_ID="+kp1 ;
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, tt2.getText());
            pst.setString(2, tt3.getText());
            pst.setString(3, tt4.getText());
            pst.setString(4, tt5.getText());
            pst.setString(5, tt6.getText());
            pst.setString(6, tt7.getText());
            pst.setString(7, tt8.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            tt1.clear();
            tt2.clear();
            tt3.clear();
            tt4.clear();
            tt5.clear();
            tt6.clear();
            tt7.clear();
            tt8.clear();
                tt1.setPromptText("");
                tt2.setPromptText("");
                tt3.setPromptText("");
                tt4.setPromptText("");
                tt5.setPromptText("");
                tt6.setPromptText("");
                tt7.setPromptText("");
                tt8.setPromptText("");
                
                Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupteacher1.getChildren().addAll(t);
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==checkT)
        {
            
            tt2.clear();
            tt3.clear();
            tt4.clear();
            tt5.clear();
            tt6.clear();
            tt7.clear();
            tt8.clear();
                tt1.setPromptText("");
                tt2.setPromptText("");
                tt3.setPromptText("");
                tt4.setPromptText("");
                tt5.setPromptText("");
                tt6.setPromptText("");
                tt7.setPromptText("");
                tt8.setPromptText("");
            
            String s=new String();
            int n=0;
            //String kp=new String();
            //kp=tuserSf.getText();
            String kp1=new String();
            kp1=tt1.getText();
            String sql = "SELECT * FROM TEACHER";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                if(kp1.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        String sql1 ="SELECT * FROM TEACHER \n" +
"WHERE TEACHER_ID ="+kp1;

            if(n==1)
            {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql1);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                tt1.setPromptText(rs.getString(1));
                tt2.setPromptText(rs.getString(2));
                tt3.setPromptText(rs.getString(3));
                tt4.setPromptText(rs.getString(4));
                tt5.setPromptText(rs.getString(5));
                tt6.setPromptText(rs.getString(6));
                tt7.setPromptText(rs.getString(7));
                tt8.setPromptText(rs.getString(8));
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                groupteacher1=new Group();
                groupteacher1.getChildren().addAll(imviewinfoadd,backuserlogin,tinfo,lt1,lt2,lt3,lt4,lt5,lt6,lt7,lt8,upT,tt1,tt2,tt3,tt4,tt5,tt6,tt7,tt8,backupS1,checkT);
                uptablesceneT1=new Scene(groupteacher1,1000,650);
                stage.setScene(uptablesceneT1);
            }
            
            else
            {
                Text t=new Text();
                t.setText("NOT FOUND!!!");
                
                t.setLayoutX(600);
                t.setLayoutY(94);
                groupteacher1.getChildren().addAll(t);
            }
        }
        
        if(e.getSource()==clas1)
        {
            tc1.clear();
            tc2.clear();
            tc3.clear();
                tc1.setPromptText("");
                tc2.setPromptText("");
                tc3.setPromptText("");
            groupclas1=new Group();
            groupclas1.getChildren().addAll(imviewinfoadd,backuserlogin,cinfo,lc1,lc2,lc3,upC,tc1,tc2,tc3,backupS1,checkC);
            uptablesceneC1=new Scene(groupclas1,1000,650);
            stage.setScene(uptablesceneC1);
        }
        
        if(e.getSource()==upC)
        {
            String kp1=new String();
            kp1=tc1.getText();
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql = "UPDATE CLASS SET SCHOOL_ID=?,NO_OF_STUDENTS=? WHERE CLASS_ID="+kp1 ;
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, tc2.getText());
            pst.setString(2, tc3.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            tc1.clear();
            tc2.clear();
            tc3.clear();
                tc1.setPromptText("");
                tc2.setPromptText("");
                tc3.setPromptText("");
                
                Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupclas1.getChildren().addAll(t);
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==checkC)
        {
            tc2.clear();
            tc3.clear();
                tc1.setPromptText("");
                tc2.setPromptText("");
                tc3.setPromptText("");
            
            String s=new String();
            int n=0;
            //String kp=new String();
            //kp=tuserSf.getText();
            String kp1=new String();
            kp1=tc1.getText();
            String sql = "SELECT * FROM CLASS";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                if(kp1.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        String sql1 ="SELECT * FROM CLASS \n" +
"WHERE CLASS_ID ="+kp1;

            if(n==1)
            {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql1);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                tc1.setPromptText(rs.getString(1));
                tc2.setPromptText(rs.getString(2));
                tc3.setPromptText(rs.getString(3));
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                groupclas1=new Group();
                groupclas1.getChildren().addAll(imviewinfoadd,backuserlogin,cinfo,lc1,lc2,lc3,upC,tc1,tc2,tc3,backupS1,checkC);
                uptablesceneC1=new Scene(groupclas1,1000,650);
                stage.setScene(uptablesceneC1);
            }
            
            else
            {
                Text t=new Text();
                t.setText("NOT FOUND!!!");
                
                t.setLayoutX(600);
                t.setLayoutY(94);
                groupclas1.getChildren().addAll(t);
            }
        }
        
        if(e.getSource()==section1)
        {
            tsec1.clear();
            tsec2.clear();
            tsec3.clear();
            tsec4.clear();
            tsec5.clear();
                tsec1.setPromptText("");
                tsec2.setPromptText("");
                tsec3.setPromptText("");
                tsec4.setPromptText("");
                tsec5.setPromptText("");
            groupsection1=new Group();
            groupsection1.getChildren().addAll(imviewinfoadd,backuserlogin,secinfo,lsec1,lsec2,lsec3,lsec4,lsec5,upSec,tsec1,tsec2,tsec3,tsec4,tsec5,backupS1,checkSec);
            uptablesceneSec1=new Scene(groupsection1,1000,650);
            stage.setScene(uptablesceneSec1);
        }
        
        if(e.getSource()==upSec)
        {
            String kp1=new String();
            kp1=tsec1.getText();
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql = "UPDATE SECTION SET CLASS_ID=?,ROOM_NO=?,CLASS_TEACHER=?,NO_OF_STUDENTS=? WHERE SECTION_ID="+kp1 ;
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, tsec2.getText());
            pst.setString(2, tsec3.getText());
            pst.setString(3, tsec4.getText());
            pst.setString(4, tsec5.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            tsec1.clear();
            tsec2.clear();
            tsec3.clear();
            tsec4.clear();
            tsec5.clear();
                tsec1.setPromptText("");
                tsec2.setPromptText("");
                tsec3.setPromptText("");
                tsec4.setPromptText("");
                tsec5.setPromptText("");
                
                Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupsection1.getChildren().addAll(t);
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==checkSec)
        {
            
            tsec2.clear();
            tsec3.clear();
            tsec4.clear();
            tsec5.clear();
                tsec1.setPromptText("");
                tsec2.setPromptText("");
                tsec3.setPromptText("");
                tsec4.setPromptText("");
                tsec5.setPromptText("");
            
            String s=new String();
            int n=0;
            //String kp=new String();
            //kp=tuserSf.getText();
            String kp1=new String();
            kp1=tsec1.getText();
            String sql = "SELECT * FROM SECTION";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                if(kp1.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        String sql1 ="SELECT * FROM SECTION\n" +
"WHERE SECTION_ID ="+kp1;

            if(n==1)
            {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql1);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                tsec1.setPromptText(rs.getString(1));
                tsec2.setPromptText(rs.getString(2));
                tsec3.setPromptText(rs.getString(3));
                tsec4.setPromptText(rs.getString(4));
                tsec5.setPromptText(rs.getString(5));
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                groupsection1=new Group();
                groupsection1.getChildren().addAll(imviewinfoadd,backuserlogin,secinfo,lsec1,lsec2,lsec3,lsec4,lsec5,upSec,tsec1,tsec2,tsec3,tsec4,tsec5,backupS1,checkSec);
                uptablesceneSec1=new Scene(groupsection1,1000,650);
                stage.setScene(uptablesceneSec1);
            }
            
            else
            {
                Text t=new Text();
                t.setText("NOT FOUND!!!");
                
                t.setLayoutX(600);
                t.setLayoutY(94);
                groupsection1.getChildren().addAll(t);
            }
        }
        
        if(e.getSource()==result1)
        {
            tr1.clear();
            tr2.clear();
            tr3.clear();
            tr4.clear();
            tr5.clear();
                tr1.setPromptText("");
                tr2.setPromptText("");
                tr3.setPromptText("");
                tr4.setPromptText("");
                tr5.setPromptText("");
            groupresult1=new Group();
            groupresult1.getChildren().addAll(imviewinfoadd,backuserlogin,rinfo,lr1,lr2,lr3,lr4,lr5,upR,tr1,tr2,tr3,tr4,tr5,backupS1,checkR);
            uptablesceneRes1=new Scene(groupresult1,1000,650);
            stage.setScene(uptablesceneRes1);
        }
        
        if(e.getSource()==upR)
        {
            String kp1=new String();
            kp1=tr1.getText();
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql = "UPDATE RESULT SET STUDENT_ID=?,FIRST_TERM=?,SECOND_TERM=?,ANNUAL=? WHERE RESULT_ID="+kp1 ;
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, tr2.getText());
            pst.setString(2, tr3.getText());
            pst.setString(3, tr4.getText());
            pst.setString(4, tr5.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            tr1.clear();
            tr2.clear();
            tr3.clear();
            tr4.clear();
            tr5.clear();
                tr1.setPromptText("");
                tr2.setPromptText("");
                tr3.setPromptText("");
                tr4.setPromptText("");
                tr5.setPromptText("");
                
                Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupresult1.getChildren().addAll(t);
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==checkR)
        {

            tr2.clear();
            tr3.clear();
            tr4.clear();
            tr5.clear();
                tr1.setPromptText("");
                tr2.setPromptText("");
                tr3.setPromptText("");
                tr4.setPromptText("");
                tr5.setPromptText("");
            
            String s=new String();
            int n=0;
            //String kp=new String();
            //kp=tuserSf.getText();
            String kp1=new String();
            kp1=tr1.getText();
            String sql = "SELECT * FROM RESULT";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                if(kp1.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        String sql1 ="SELECT * FROM RESULT\n" +
"WHERE RESULT_ID ="+kp1;

            if(n==1)
            {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql1);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                tr1.setPromptText(rs.getString(1));
                tr2.setPromptText(rs.getString(2));
                tr3.setPromptText(rs.getString(3));
                tr4.setPromptText(rs.getString(4));
                tr5.setPromptText(rs.getString(5));
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                groupresult1=new Group();
                groupresult1.getChildren().addAll(imviewinfoadd,backuserlogin,rinfo,lr1,lr2,lr3,lr4,lr5,upR,tr1,tr2,tr3,tr4,tr5,backupS1,checkR);
                uptablesceneRes1=new Scene(groupresult1,1000,650);
                stage.setScene(uptablesceneRes1);
            }
            
            else
            {
                Text t=new Text();
                t.setText("NOT FOUND!!!");
                
                t.setLayoutX(600);
                t.setLayoutY(94);
                groupresult1.getChildren().addAll(t);
            }
        }
        
        if(e.getSource()==cr1)
        {
            tcr1.clear();
            tcr2.clear();
            tcr3.clear();
                tcr1.setPromptText("");
                tcr2.setPromptText("");
                tcr3.setPromptText("");
            groupcr1=new Group();
            groupcr1.getChildren().addAll(imviewinfoadd,backuserlogin,crinfo,lcr1,lcr2,lcr3,upCr,tcr1,tcr2,tcr3,backupS1,checkCr);
            uptablesceneCr1=new Scene(groupcr1,1000,650);
            stage.setScene(uptablesceneCr1);
        }
        
        if(e.getSource()==upCr)
        {
            String kp1=new String();
            kp1=tcr1.getText();
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql = "UPDATE CR SET SECTION_ID=?,NAME=? WHERE CR_ID="+kp1 ;
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, tcr2.getText());
            pst.setString(2, tcr3.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            tcr1.clear();
            tcr2.clear();
            tcr3.clear();
                tcr1.setPromptText("");
                tcr2.setPromptText("");
                tcr3.setPromptText("");
                
                Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupcr1.getChildren().addAll(t);
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==checkCr)
        {
            tcr2.clear();
            tcr3.clear();
                tcr1.setPromptText("");
                tcr2.setPromptText("");
                tcr3.setPromptText("");
            
            String s=new String();
            int n=0;
            //String kp=new String();
            //kp=tuserSf.getText();
            String kp1=new String();
            kp1=tcr1.getText();
            String sql = "SELECT * FROM CR";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                if(kp1.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        String sql1 ="SELECT * FROM CR \n" +
"WHERE CR_ID="+kp1;

            if(n==1)
            {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql1);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                tcr1.setPromptText(rs.getString(1));
                tcr2.setPromptText(rs.getString(2));
                tcr3.setPromptText(rs.getString(3));
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                groupcr1=new Group();
                groupcr1.getChildren().addAll(imviewinfoadd,backuserlogin,crinfo,lcr1,lcr2,lcr3,upCr,tcr1,tcr2,tcr3,backupS1,checkCr);
                uptablesceneCr1=new Scene(groupcr1,1000,650);
                stage.setScene(uptablesceneCr1);
            }
            
            else
            {
                Text t=new Text();
                t.setText("NOT FOUND!!!");
                
                t.setLayoutX(600);
                t.setLayoutY(94);
                groupcr1.getChildren().addAll(t);
            }
        }
        
        if(e.getSource()==event1)
        {
            tev1.clear();
            tev2.clear();
            tev3.clear();
            tev4.clear();
                tev1.setPromptText("");
                tev2.setPromptText("");
                tev3.setPromptText("");
                tev4.setPromptText("");
            groupevent1=new Group();
            groupevent1.getChildren().addAll(imviewinfoadd,backuserlogin,evinfo,lev1,lev2,lev3,lev4,upEv,tev1,tev2,tev3,tev4,backupS1,checkEv);
            uptablesceneEv1=new Scene(groupevent1,1000,650);
            stage.setScene(uptablesceneEv1);
        }
        
        if(e.getSource()==upEv)
        {
            String kp1=new String();
            kp1=tev1.getText();
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql = "UPDATE EVENT SET TEAM_ID=?,TYPE=?,NAME=? WHERE EVENT_ID="+kp1 ;
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, tev2.getText());
            pst.setString(2, tev3.getText());
            pst.setString(3, tev4.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            tev1.clear();
            tev2.clear();
            tev3.clear();
            tev4.clear();
                tev1.setPromptText("");
                tev2.setPromptText("");
                tev3.setPromptText("");
                tev4.setPromptText("");
                
                Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupevent1.getChildren().addAll(t);
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==checkEv)
        {
            
            tev2.clear();
            tev3.clear();
            tev4.clear();
                tev1.setPromptText("");
                tev2.setPromptText("");
                tev3.setPromptText("");
                tev4.setPromptText("");
            
            String s=new String();
            int n=0;
            //String kp=new String();
            //kp=tuserSf.getText();
            String kp1=new String();
            kp1=tev1.getText();
            String sql = "SELECT * FROM EVENT";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                if(kp1.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        String sql1 ="SELECT * FROM EVENT\n" +
"WHERE EVENT_ID ="+kp1;

            if(n==1)
            {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql1);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                tev1.setPromptText(rs.getString(1));
                tev2.setPromptText(rs.getString(2));
                tev3.setPromptText(rs.getString(3));
                tev4.setPromptText(rs.getString(4));
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                groupevent1=new Group();
                groupevent1.getChildren().addAll(imviewinfoadd,backuserlogin,evinfo,lev1,lev2,lev3,lev4,upEv,tev1,tev2,tev3,tev4,backupS1,checkEv);
                uptablesceneEv1=new Scene(groupevent1,1000,650);
                stage.setScene(uptablesceneEv1);
            }
            
            else
            {
                Text t=new Text();
                t.setText("NOT FOUND!!!");
                
                t.setLayoutX(600);
                t.setLayoutY(94);
                groupevent1.getChildren().addAll(t);
            }
        }
        
        if(e.getSource()==routine1)
        {
            trou1.clear();
            trou2.clear();
            trou3.clear();
            trou4.clear();
            trou5.clear();
            trou6.clear();
                trou1.setPromptText("");
                trou2.setPromptText("");
                trou3.setPromptText("");
                trou4.setPromptText("");
                trou5.setPromptText("");
                trou6.setPromptText("");
                grouproutine1=new Group();
                grouproutine1.getChildren().addAll(imviewinfoadd,backuserlogin,rouinfo,lrou1,lrou2,lrou3,lrou4,lrou5,lrou6,upRou,trou1,trou2,trou3,trou4,trou5,trou6,backupS1,checkRou);
                uptablesceneRou1=new Scene(grouproutine1,1000,650);
                stage.setScene(uptablesceneRou1);
        }
        
        if(e.getSource()==upRou)
        {
            String kp1=new String();
            kp1=trou1.getText();
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql = "UPDATE ROUTINE SET SECTION_ID=?,TEACHER_ID=?,SUBJECT=?,TIME=?, RDATE=? WHERE ROUTINE_ID="+kp1 ;
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, trou2.getText());
            pst.setString(2, trou3.getText());
            pst.setString(3, trou4.getText());
            pst.setString(4, trou5.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            trou1.clear();
            trou2.clear();
            trou3.clear();
            trou4.clear();
            trou5.clear();
            trou6.clear();
                trou1.setPromptText("");
                trou2.setPromptText("");
                trou3.setPromptText("");
                trou4.setPromptText("");
                trou5.setPromptText("");
                trou6.setPromptText("");
                
                Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            grouproutine1.getChildren().addAll(t);
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==checkRou)
        {
            trou2.clear();
            trou3.clear();
            trou4.clear();
            trou5.clear();
            trou6.clear();
                trou1.setPromptText("");
                trou2.setPromptText("");
                trou3.setPromptText("");
                trou4.setPromptText("");
                trou5.setPromptText("");
                trou6.setPromptText("");
            
            String s=new String();
            int n=0;
            //String kp=new String();
            //kp=tuserSf.getText();
            String kp1=new String();
            kp1=trou1.getText();
            String sql = "SELECT * FROM ROUTINE";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                if(kp1.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        String sql1 ="SELECT * FROM ROUTINE\n" +
"WHERE ROUTINE_ID ="+kp1;

            if(n==1)
            {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql1);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                trou1.setPromptText(rs.getString(1));
                trou2.setPromptText(rs.getString(2));
                trou3.setPromptText(rs.getString(3));
                trou4.setPromptText(rs.getString(4));
                trou5.setPromptText(rs.getString(5));
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                grouproutine1=new Group();
                grouproutine1.getChildren().addAll(imviewinfoadd,backuserlogin,rouinfo,lrou1,lrou2,lrou3,lrou4,lrou5,lrou6,upRou,trou1,trou2,trou3,trou4,trou5,trou6,backupS1,checkRou);
                uptablesceneRou1=new Scene(grouproutine1,1000,650);
                stage.setScene(uptablesceneRou1);
            }
            
            else
            {
                Text t=new Text();
                t.setText("NOT FOUND!!!");
                
                t.setLayoutX(600);
                t.setLayoutY(94);
                grouproutine1.getChildren().addAll(t);
            }
        }
        
        if(e.getSource()==staff1)
        {
            tsf1.clear();
            tsf2.clear();
            tsf3.clear();
            tsf4.clear();
            tsf5.clear();
                tsf1.setPromptText("");
                tsf2.setPromptText("");
                tsf3.setPromptText("");
                tsf4.setPromptText("");
                tsf5.setPromptText("");
            groupstaff1=new Group();
            groupstaff1.getChildren().addAll(imviewinfoadd,backuserlogin,sfinfo,lsf1,lsf2,lsf3,lsf4,lsf5,upSf,tsf1,tsf2,tsf3,tsf4,tsf5,backupS1,checkSf);
            uptablesceneSf1=new Scene(groupstaff1,1000,650);
            stage.setScene(uptablesceneSf1);
        }
        
        if(e.getSource()==upSf)
        {
            String kp1=new String();
            kp1=tsf1.getText();
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql = "UPDATE STAFF SET SCHOOL_ID=?,NAME=?,AGE=?,TYPE=? WHERE STAFF_ID="+kp1 ;
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, tsf2.getText());
            pst.setString(2, tsf3.getText());
            pst.setString(3, tsf4.getText());
            pst.setString(4, tsf5.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            tsf1.clear();
            tsf2.clear();
            tsf3.clear();
            tsf4.clear();
            tsf5.clear();
                tsf1.setPromptText("");
                tsf2.setPromptText("");
                tsf3.setPromptText("");
                tsf4.setPromptText("");
                tsf5.setPromptText("");
                
                Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupstaff1.getChildren().addAll(t);
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==checkSf)
        {
            tsf2.clear();
            tsf3.clear();
            tsf4.clear();
            tsf5.clear();
                tsf1.setPromptText("");
                tsf2.setPromptText("");
                tsf3.setPromptText("");
                tsf4.setPromptText("");
                tsf5.setPromptText("");
            
            String s=new String();
            int n=0;
            //String kp=new String();
            //kp=tuserSf.getText();
            String kp1=new String();
            kp1=tsf1.getText();
            String sql = "SELECT * FROM STAFF";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                if(kp1.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        String sql1 ="SELECT * FROM STAFF\n" +
"WHERE STAFF_ID ="+kp1;

            if(n==1)
            {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql1);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                tsf1.setPromptText(rs.getString(1));
                tsf2.setPromptText(rs.getString(2));
                tsf3.setPromptText(rs.getString(3));
                tsf4.setPromptText(rs.getString(4));
                tsf5.setPromptText(rs.getString(5));
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                groupstaff1=new Group();
                groupstaff1.getChildren().addAll(imviewinfoadd,backuserlogin,sfinfo,lsf1,lsf2,lsf3,lsf4,lsf5,upSf,tsf1,tsf2,tsf3,tsf4,tsf5,backupS1,checkSf);
                uptablesceneSf1=new Scene(groupstaff1,1000,650);
                stage.setScene(uptablesceneSf1);
            }
            
            else
            {
                Text t=new Text();
                t.setText("NOT FOUND!!!");
                
                t.setLayoutX(600);
                t.setLayoutY(94);
                groupstaff1.getChildren().addAll(t);
            }
        }
        
        if(e.getSource()==team1)
        {
            ttm1.clear();
            ttm2.clear();
            ttm3.clear();
                ttm1.setPromptText("");
                ttm2.setPromptText("");
                ttm3.setPromptText("");
            groupteam1=new Group();
            groupteam1.getChildren().addAll(imviewinfoadd,backuserlogin,tminfo,ltm1,ltm2,ltm3,upTm,ttm1,ttm2,ttm3,backupS1,checkTm);
            uptablesceneTm1=new Scene(groupteam1,1000,650);
            stage.setScene(uptablesceneTm1);
        }
        
        if(e.getSource()==upTm)
        {
            String kp1=new String();
            kp1=ttm1.getText();
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql = "UPDATE TEAM SET SCHOOL_ID=?,NO_OF_MEMBERS=? WHERE TEAM_ID="+kp1 ;
            PreparedStatement pst = con.prepareStatement(sql);
            
            try {
            pst.setString(1, ttm2.getText());
            pst.setString(2, ttm3.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            ttm1.clear();
            ttm2.clear();
            ttm3.clear();
                ttm1.setPromptText("");
                ttm2.setPromptText("");
                ttm3.setPromptText("");
                
                Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupteam1.getChildren().addAll(t);
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==checkTm)
        {
            ttm2.clear();
            ttm3.clear();
                ttm1.setPromptText("");
                ttm2.setPromptText("");
                ttm3.setPromptText("");
            
            String s=new String();
            int n=0;
            //String kp=new String();
            //kp=tuserSf.getText();
            String kp1=new String();
            kp1=ttm1.getText();
            String sql = "SELECT * FROM TEAM";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                s=rs.getString(1);
                if(kp1.equals(s))
                {
                    n=1;
                }
                
                if(n==1)
                {
                    break;
                }
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        String sql1 ="SELECT * FROM TEAM \n" +
"WHERE TEAM_ID="+kp1;

            if(n==1)
            {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql1);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                ttm1.setPromptText(rs.getString(1));
                ttm2.setPromptText(rs.getString(2));
                ttm3.setPromptText(rs.getString(3));
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
                groupteam1=new Group();
                groupteam1.getChildren().addAll(imviewinfoadd,backuserlogin,tminfo,ltm1,ltm2,ltm3,upTm,ttm1,ttm2,ttm3,backupS1,checkTm);
                uptablesceneTm1=new Scene(groupteam1,1000,650);
                stage.setScene(uptablesceneTm1);
            }
            
            else
            {
                Text t=new Text();
                t.setText("NOT FOUND!!!");
                
                t.setLayoutX(600);
                t.setLayoutY(94);
                groupteam1.getChildren().addAll(t);
            }
        }
        
        if(e.getSource()==info)
        {
            
        }
        if(e.getSource()==backuserlogin)
        {
            login=new Group();
            login.getChildren().addAll(imviewlogin,Lusername,Lpassword,username,password,bLogin,backlogin);
            sLogin=new Scene(login,1000,650);
            stage.setScene(sLogin);
        }
       
        if(e.getSource()==infoS)
        {
            grpinfS=new Group();
            if(xx==1 || xx==2 || xx==3)
            {
                grpinfS.getChildren().addAll(imviewstudentinfo,backtoinfo,table,backSTSflogin);
            }
            if(x==2)
            {
                grpinfS.getChildren().addAll(imviewstudentinfo,backtoinfo,table,backuserlogin);
            }
            if(x==1)
            {
                grpinfS.getChildren().addAll(imviewstudentinfo,backtoinfo,table);
            }
            SinfoS=new Scene(grpinfS,1000,650);
            stage.setScene(SinfoS);
             
            String sql = "SELECT * FROM STUDENT";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                data.add(new User2(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                ));
                table.setItems(data);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        }
        
        if(e.getSource()==infoSch)
        { 
            grpinfSch=new Group();
            if(xx==1 || xx==2 || xx==3)
            {
                grpinfSch.getChildren().addAll(imviewstudentinfo,backtoinfo,tableSch,backSTSflogin);
            }
            if(x==2)
            {
                grpinfSch.getChildren().addAll(imviewstudentinfo,backtoinfo,tableSch,backuserlogin);
            }
            if(x==1)
            {
                grpinfSch.getChildren().addAll(imviewstudentinfo,backtoinfo,tableSch);
            }
            
            SinfoSch=new Scene(grpinfSch,1000,650);
            stage.setScene(SinfoSch);
             
            String sql = "SELECT * FROM SCHOOL";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                dataSch.add(new School(
                        rs.getString(1),
                        rs.getString(2)         
                ));
                tableSch.setItems(dataSch);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==infoC)
        {
            grpinfC=new Group();
            if(xx==1 || xx==2 || xx==3)
            {
                grpinfC.getChildren().addAll(imviewstudentinfo,backtoinfo,tableC,backSTSflogin);
            }
            if(x==2)
            {
                grpinfC.getChildren().addAll(imviewstudentinfo,backtoinfo,tableC,backuserlogin);
            }
            if(x==1)
            {
                grpinfC.getChildren().addAll(imviewstudentinfo,backtoinfo,tableC);
            }
            SinfoC=new Scene(grpinfC,1000,650);
            stage.setScene(SinfoC);
             
            String sql = "SELECT * FROM CLASS";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                dataC.add(new Clas(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)
                ));
                tableC.setItems(dataC);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==infoHd)
        {
            grpinfHd=new Group();
            if(xx==1 || xx==2 || xx==3)
            {
                grpinfHd.getChildren().addAll(imviewstudentinfo,backtoinfo,tableHdM,backSTSflogin);
            }
            if(x==2)
            {
                grpinfHd.getChildren().addAll(imviewstudentinfo,backtoinfo,tableHdM,backuserlogin);
            }
            if(x==1)
            {
                grpinfHd.getChildren().addAll(imviewstudentinfo,backtoinfo,tableHdM);
            }
            
            SinfoHd=new Scene(grpinfHd,1000,650);
            stage.setScene(SinfoHd);
         
            String sql = "SELECT * FROM HEAD_MASTER";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                dataHdM.add(new HdM(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)
                ));
                tableHdM.setItems(dataHdM);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==infoAssis)
        {
            grpinfAssis=new Group();
            if(xx==1 || xx==2 || xx==3)
            {
                grpinfAssis.getChildren().addAll(imviewstudentinfo,backtoinfo,tableAssisHdM,backSTSflogin);
            }
            if(x==2)
            {
                grpinfAssis.getChildren().addAll(imviewstudentinfo,backtoinfo,tableAssisHdM,backuserlogin);
            }
            if(x==1)
            {
                grpinfAssis.getChildren().addAll(imviewstudentinfo,backtoinfo,tableAssisHdM);
            }
            
            SinfoAssis=new Scene(grpinfAssis,1000,650);
            stage.setScene(SinfoAssis);
         
            String sql = "SELECT * FROM ASSIS_HEAD_MASTER";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                dataAssisHdM.add(new HdM(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)
                ));
                tableAssisHdM.setItems(dataAssisHdM);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==infoT)
        {
            grpinfT=new Group();
            if(xx==1 || xx==2 || xx==3)
            {
                grpinfT.getChildren().addAll(imviewstudentinfo,backtoinfo,tableT,backSTSflogin);
            }
            if(x==2)
            {
                grpinfT.getChildren().addAll(imviewstudentinfo,backtoinfo,tableT,backuserlogin);
            }
            if(x==1)
            {
                grpinfT.getChildren().addAll(imviewstudentinfo,backtoinfo,tableT);
            }
            
            SinfoT=new Scene(grpinfT,1000,650);
            stage.setScene(SinfoT);
         
            String sql = "SELECT * FROM TEACHER";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                dataT.add(new HdM(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)
                ));
                tableT.setItems(dataT);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==infoSec)
        {
            grpinfSec=new Group();
            if(xx==1 || xx==2 || xx==3)
            {
                grpinfSec.getChildren().addAll(imviewstudentinfo,backtoinfo,tableSec,backSTSflogin);
            }
            if(x==2)
            {
                grpinfSec.getChildren().addAll(imviewstudentinfo,backtoinfo,tableSec,backuserlogin);
            }
            if(x==1)
            {
                grpinfSec.getChildren().addAll(imviewstudentinfo,backtoinfo,tableSec);
            }
            
            SinfoSec=new Scene(grpinfSec,1000,650);
            stage.setScene(SinfoSec);
         
            String sql = "SELECT * FROM SECTION";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                dataSec.add(new Section(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                ));
                tableSec.setItems(dataSec);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==infoR)
        {
            grpinfR=new Group();
            if(xx==1 || xx==2 || xx==3)
            {
                grpinfR.getChildren().addAll(imviewstudentinfo,backtoinfo,tableR,backSTSflogin);
            }
            if(x==2)
            {
                grpinfR.getChildren().addAll(imviewstudentinfo,backtoinfo,tableR,backuserlogin);
            }
            if(x==1)
            {
                grpinfR.getChildren().addAll(imviewstudentinfo,backtoinfo,tableR);
            }
            
            SinfoR=new Scene(grpinfR,1000,650);
            stage.setScene(SinfoR);
         
            String sql = "SELECT * FROM RESULT";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                dataR.add(new Section(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                ));
                tableR.setItems(dataR);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==infoCr)
        {
            grpinfCr=new Group();
            if(xx==1 || xx==2 || xx==3)
            {
                grpinfCr.getChildren().addAll(imviewstudentinfo,backtoinfo,tableCr,backSTSflogin);
            }
            if(x==2)
            {
                grpinfCr.getChildren().addAll(imviewstudentinfo,backtoinfo,tableCr,backuserlogin);
            }
            if(x==1)
            {
                grpinfCr.getChildren().addAll(imviewstudentinfo,backtoinfo,tableCr);
            }
            
            SinfoCr=new Scene(grpinfCr,1000,650);
            stage.setScene(SinfoCr);
         
            String sql = "SELECT * FROM CR";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                dataCr.add(new Clas(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)
                ));
                tableCr.setItems(dataCr);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==infoEv)
        {
            grpinfEv=new Group();
            if(xx==1 || xx==2 || xx==3)
            {
                grpinfEv.getChildren().addAll(imviewstudentinfo,backtoinfo,tableEv,backSTSflogin);
            }
            if(x==2)
            {
                grpinfEv.getChildren().addAll(imviewstudentinfo,backtoinfo,tableEv,backuserlogin);
            }
            if(x==1)
            {
                grpinfEv.getChildren().addAll(imviewstudentinfo,backtoinfo,tableEv);
            }
            
            SinfoEv=new Scene(grpinfEv,1000,650);
            stage.setScene(SinfoEv);
         
            String sql = "SELECT * FROM EVENT";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                dataEv.add(new Event(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                ));
                tableEv.setItems(dataEv);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==infoRou)
        {
            grpinfRou=new Group();
            if(xx==1 || xx==2 || xx==3)
            {
                grpinfRou.getChildren().addAll(imviewstudentinfo,backtoinfo,tableRou,backSTSflogin);
            }
            if(x==2)
            {
                grpinfRou.getChildren().addAll(imviewstudentinfo,backtoinfo,tableRou,backuserlogin);
            }
            if(x==1)
            {
                grpinfRou.getChildren().addAll(imviewstudentinfo,backtoinfo,tableRou);
            }
            
            SinfoRou=new Scene(grpinfRou,1000,650);
            stage.setScene(SinfoRou);
         
            String sql = "SELECT * FROM ROUTINE";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                dataRou.add(new Routine(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
                tableRou.setItems(dataRou);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==infoSf)
        {
            grpinfSf=new Group();
            if(xx==1 || xx==2 || xx==3)
            {
                grpinfSf.getChildren().addAll(imviewstudentinfo,backtoinfo,tableSf,backSTSflogin);
            }
            if(x==2)
            {
                grpinfSf.getChildren().addAll(imviewstudentinfo,backtoinfo,tableSf,backuserlogin);
            }
            if(x==1)
            {
                grpinfSf.getChildren().addAll(imviewstudentinfo,backtoinfo,tableSf);
            }
            
            SinfoSf=new Scene(grpinfSf,1000,650);
            stage.setScene(SinfoSf);
         
            String sql = "SELECT * FROM STAFF";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                dataSf.add(new Section(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                ));
                tableSf.setItems(dataSf);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==infoTm)
        {
            grpinfTm=new Group();
            if(xx==1 || xx==2 || xx==3)
            {
                grpinfTm.getChildren().addAll(imviewstudentinfo,backtoinfo,tableTm,backSTSflogin);
            }
            
            if(x==2)
            {
                grpinfTm.getChildren().addAll(imviewstudentinfo,backtoinfo,tableTm,backuserlogin);
            }
            if(x==1)
            {
                grpinfTm.getChildren().addAll(imviewstudentinfo,backtoinfo,tableTm);
            }
            
            SinfoTm=new Scene(grpinfTm,1000,650);
            stage.setScene(SinfoTm);
         
            String sql = "SELECT * FROM TEAM";

        try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                dataTm.add(new Clas(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3)
                ));
                tableTm.setItems(dataTm);
            }
            
            pst.close();
            con.close();
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==backtoinfo)
        {
            for ( int i = 0; i<table.getItems().size(); i++)
            {
               table.getItems().clear();
            }
            for ( int i = 0; i<tableSch.getItems().size(); i++)
            {
               tableSch.getItems().clear();
            }
            for ( int i = 0; i<tableHdM.getItems().size(); i++)
            {
               tableHdM.getItems().clear();
            }
            for ( int i = 0; i<tableAssisHdM.getItems().size(); i++)
            {
               tableAssisHdM.getItems().clear();
            }
            for ( int i = 0; i<tableT.getItems().size(); i++)
            {
               tableT.getItems().clear();
            }
            for ( int i = 0; i<tableC.getItems().size(); i++)
            {
               tableC.getItems().clear();
            }
            for ( int i = 0; i<tableSec.getItems().size(); i++)
            {
               tableSec.getItems().clear();
            }
            for ( int i = 0; i<tableR.getItems().size(); i++)
            {
               tableR.getItems().clear();
            }
            for ( int i = 0; i<tableCr.getItems().size(); i++)
            {
               tableCr.getItems().clear();
            }
            for ( int i = 0; i<tableEv.getItems().size(); i++)
            {
               tableEv.getItems().clear();
            }
            for ( int i = 0; i<tableRou.getItems().size(); i++)
            {
               tableRou.getItems().clear();
            }
            for ( int i = 0; i<tableSf.getItems().size(); i++)
            {
               tableSf.getItems().clear();
            }
            for ( int i = 0; i<tableTm.getItems().size(); i++)
            {
               tableTm.getItems().clear();
            }
            if(xx==1)
            {
                groupguest=new Group();
                groupguest.getChildren().addAll(imviewupdate,infoHd,infoAssis,infoT,infoC,infoSec,infoR,infoS,infoSch,infoCr,infoEv,infoRou,infoSf,infoTm,backSTSflogin,profileS);
                guestscene=new Scene(groupguest,1000,650);
                stage.setScene(guestscene);
            }
            if(xx==2)
            {
                groupguest=new Group();
                groupguest.getChildren().addAll(imviewupdate,infoHd,infoAssis,infoT,infoC,infoSec,infoR,infoS,infoSch,infoCr,infoEv,infoRou,infoSf,infoTm,backSTSflogin);
                guestscene=new Scene(groupguest,1000,650);
                stage.setScene(guestscene);
            }
            if(xx==3)
            {
                groupguest=new Group();
                groupguest.getChildren().addAll(imviewupdate,infoHd,infoAssis,infoT,infoC,infoSec,infoR,infoS,infoSch,infoCr,infoEv,infoRou,infoSf,infoTm,backSTSflogin);
                guestscene=new Scene(groupguest,1000,650);
                stage.setScene(guestscene);
            }
            if(x==1)
            {
               groupguest=new Group();
               groupguest.getChildren().addAll(imviewstudentinfo,lcomguest1,lcomguest2,comguest1,comguest2,showguest,backguest,tableguest1);
               guestscene=new Scene(groupguest,1000,650);
               stage.setScene(guestscene); 
            }
            
            if(x==2)
            {
               
               group2=new Group();
               group2.getChildren().addAll(imviewupdate,infoHd,infoAssis,infoT,infoC,infoSec,infoR,infoS,infoSch,infoCr,infoEv,infoRou,infoSf,infoTm,backinfo,backuserlogin);
               infoscene=new Scene(group2,1000,650);
               stage.setScene(infoscene);
            }
            
        }
        
        if(e.getSource()==backupdate)
        {
            root=new Group();
            root.getChildren().addAll(iv1,addupdel,update,backuserlogin);
            startscene=new Scene(root,1000,650);
            stage.setScene(startscene);
        }
        
        if(e.getSource()==backupS)
        {
            group1=new Group();
            group1.getChildren().addAll(imviewupdate,backuserlogin,backupdate,school,head,assis,student,teacher,clas,section,result,cr,event,routine,staff,team);
            tablescene=new Scene(group1,1000,650);
            stage.setScene(tablescene);
        }
        
        if(e.getSource()==backupHd)
        {
            group1=new Group();
            group1.getChildren().addAll(imviewupdate,backuserlogin,backupdate,school,head,assis,student,teacher,clas,section,result,cr,event,routine,staff,team);
            tablescene=new Scene(group1,1000,650);
            stage.setScene(tablescene);
        }
        
        if(e.getSource()==backupAssis)
        {
            group1=new Group();
            group1.getChildren().addAll(imviewupdate,backuserlogin,backupdate,school,head,assis,student,teacher,clas,section,result,cr,event,routine,staff,team);
            tablescene=new Scene(group1,1000,650);
            stage.setScene(tablescene);
        }
        
        if(e.getSource()==backupT)
        {
            group1=new Group();
            group1.getChildren().addAll(imviewupdate,backuserlogin,backupdate,school,head,assis,student,teacher,clas,section,result,cr,event,routine,staff,team);
            tablescene=new Scene(group1,1000,650);
            stage.setScene(tablescene);
        }
        
        if(e.getSource()==backupSch)
        {
            group1=new Group();
            group1.getChildren().addAll(imviewupdate,backuserlogin,backupdate,school,head,assis,student,teacher,clas,section,result,cr,event,routine,staff,team);
            tablescene=new Scene(group1,1000,650);
            stage.setScene(tablescene);
        }
        
        if(e.getSource()==backupSec)
        {
            group1=new Group();
            group1.getChildren().addAll(imviewupdate,backuserlogin,backupdate,school,head,assis,student,teacher,clas,section,result,cr,event,routine,staff,team);
            tablescene=new Scene(group1,1000,650);
            stage.setScene(tablescene);
        }
        
        if(e.getSource()==backupR)
        {
            group1=new Group();
            group1.getChildren().addAll(imviewupdate,backuserlogin,backupdate,school,head,assis,student,teacher,clas,section,result,cr,event,routine,staff,team);
            tablescene=new Scene(group1,1000,650);
            stage.setScene(tablescene);
        }
        
        if(e.getSource()==backupC)
        {
            group1=new Group();
            group1.getChildren().addAll(imviewupdate,backuserlogin,backupdate,school,head,assis,student,teacher,clas,section,result,cr,event,routine,staff,team);
            tablescene=new Scene(group1,1000,650);
            stage.setScene(tablescene);
        }
        
        
        if(e.getSource()==student)
        {
            groupstudent=new Group();
            groupstudent.getChildren().addAll(imviewinfoadd,backuserlogin,studentinfo,l1,l2,l3,l4,l5,l6,l7,addS,t1,t2,t3,t4,t5,t6,t7,backupS);
            uptablesceneS=new Scene(groupstudent,1000,650);
            stage.setScene(uptablesceneS);
        }
        
        if(e.getSource()==addS)
        {
            try
        {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            //String sql = "insert into STUDENT (STUDENT_ID, NAME, BDATE, SECTION_ID, ROLL, GENDER, CONTACT_NO) values(?,?,?,?,?,?,?)" ;
            String sql="BEGIN Add_S(?,?,?,?,?,?,?); END;";
            PreparedStatement pst = con.prepareStatement(sql);
            try {
            pst.setString(1, t1.getText());
            pst.setString(2, t2.getText());
            pst.setString(3, t3.getText());
            pst.setString(4, t4.getText());
            pst.setString(5, t5.getText());
            pst.setString(6, t6.getText());
            pst.setString(7, t7.getText());
            pst.executeUpdate();
            pst.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                } 
                
            t1.clear();
            t2.clear();
            t3.clear();
            t4.clear();
            t5.clear();
            t6.clear();
            t7.clear();
            
            
            
            Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupstudent.getChildren().addAll(t);

            
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }
        }
        
        if(e.getSource()==school)
        {
            groupschool=new Group();
            groupschool.getChildren().addAll(imviewinfoadd,backuserlogin,schoolinfo,l8,l9,addSch,t8,t9,backupSch);
            uptablesceneSch=new Scene(groupschool,1000,650);
            stage.setScene(uptablesceneSch);                       
        }
        
        if(e.getSource()==addSch)
        {
             try
        {
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            //String sql1 = "insert into SCHOOL (SCHOOL_ID, NAME) values(?,?)" ;
            String sql1="BEGIN Add_Sch(?,?); END ;";
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            
            try {
            pst1.setString(1, t8.getText());
            pst1.setString(2, t9.getText());
            pst1.executeUpdate();
            pst1.close();
                    con1.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            t8.clear();
            t9.clear();
            
            
            
            Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql = "SELECT * FROM TRIG";
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst.close();
            con.close();
            groupschool.getChildren().addAll(t);
            
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }                    
        }
        
        if(e.getSource()==head)
        {
            grouphead=new Group();
            grouphead.getChildren().addAll(imviewinfoadd,backuserlogin,hdinfo,lhd1,lhd2,lhd3,lhd4,lhd5,lhd6,lhd7,lhd8,addHd,thd1,thd2,thd3,thd4,thd5,thd6,thd7,thd8,backupHd);
            uptablesceneH=new Scene(grouphead,1000,650);
            stage.setScene(uptablesceneH);                       
        }
        
        if(e.getSource()==addHd)
        {
             try
        {
            Connection con2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql2 = "insert into HEAD_MASTER (HDM_ID, SCHOOL_ID, NAME, AGE, SUBJECT, START_DATE, END_DATE, CONTACT_NO,PASSWORD) values(?,?,?,?,?,?,?,?,?)" ;
            PreparedStatement pst2 = con2.prepareStatement(sql2);
            
            try {
            pst2.setString(1, thd1.getText());
            pst2.setString(2, thd2.getText());
            pst2.setString(3, thd3.getText());
            pst2.setString(4, thd4.getText());
            pst2.setString(5, thd5.getText());
            pst2.setString(6, thd6.getText());
            pst2.setString(7, thd7.getText());
            pst2.setString(8, thd8.getText());
            pst2.setString(9, thd1.getText()+"b");
            pst2.executeUpdate();
            pst2.close();
                    con2.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            thd1.clear();
            thd2.clear();
            thd3.clear();
            thd4.clear();
            thd5.clear();
            thd6.clear();
            thd7.clear();
            thd8.clear();
            
            
            
            Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            grouphead.getChildren().addAll(t);
            
            
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }                    
        }
        
        if(e.getSource()==assis)
        {
            groupassis=new Group();
            groupassis.getChildren().addAll(imviewinfoadd,backuserlogin,assisinfo,las1,las2,las3,las4,las5,las6,las7,las8,addAssis,tas1,tas2,tas3,tas4,tas5,tas6,tas7,tas8,backupAssis);
            uptablesceneA=new Scene(groupassis,1000,650);
            stage.setScene(uptablesceneA);                       
        }
        
        if(e.getSource()==addAssis)
        {
            try
        {
            Connection con3 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql3 = "insert into ASSIS_HEAD_MASTER (ASHDM_ID, SCHOOL_ID, NAME, AGE, SUBJECT, START_DATE, END_DATE, CONTACT_NO,PASSWORD) values(?,?,?,?,?,?,?,?,?)" ;
            PreparedStatement pst3 = con3.prepareStatement(sql3);
            
            try {
            pst3.setString(1, tas1.getText());
            pst3.setString(2, tas2.getText());
            pst3.setString(3, tas3.getText());
            pst3.setString(4, tas4.getText());
            pst3.setString(5, tas5.getText());
            pst3.setString(6, tas6.getText());
            pst3.setString(7, tas7.getText());
            pst3.setString(8, tas8.getText());
            pst3.setString(9, tas1.getText()+"b");
            pst3.executeUpdate();
            pst3.close();
                    con3.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            tas1.clear();
            tas2.clear();
            tas3.clear();
            tas4.clear();
            tas5.clear();
            tas6.clear();
            tas7.clear();
            tas8.clear();
            
            
            
            Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupassis.getChildren().addAll(t);
         
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }                       
        }
        
        if(e.getSource()==teacher)
        {
            groupteacher=new Group();
            groupteacher.getChildren().addAll(imviewinfoadd,backuserlogin,tinfo,lt1,lt2,lt3,lt4,lt5,lt6,lt7,lt8,addT,tt1,tt2,tt3,tt4,tt5,tt6,tt7,tt8,backupT);
            uptablesceneT=new Scene(groupteacher,1000,650);
            stage.setScene(uptablesceneT);                       
        }
        
        if(e.getSource()==addT)
        {
            try
        {
            Connection con4 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql4 = "insert into TEACHER (TEACHER_ID, SCHOOL_ID, NAME, AGE, SUBJECT, START_DATE, END_DATE, CONTACT_NO,PASSWORD) values(?,?,?,?,?,?,?,?,?)" ;
            PreparedStatement pst4 = con4.prepareStatement(sql4);
            
            try {
            pst4.setString(1, tt1.getText());
            pst4.setString(2, tt2.getText());
            pst4.setString(3, tt3.getText());
            pst4.setString(4, tt4.getText());
            pst4.setString(5, tt5.getText());
            pst4.setString(6, tt6.getText());
            pst4.setString(7, tt7.getText());
            pst4.setString(8, tt8.getText());
            pst4.setString(9, tt1.getText()+"b");
            pst4.executeUpdate();
            pst4.close();
                    con4.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            tt1.clear();
            tt2.clear();
            tt3.clear();
            tt4.clear();
            tt5.clear();
            tt6.clear();
            tt7.clear();
            tt8.clear();
       
            
            
            Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupteacher.getChildren().addAll(t);
            
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }                    
        }
        
        
        if(e.getSource()==clas)
        {
            groupclas=new Group();
            groupclas.getChildren().addAll(imviewinfoadd,backuserlogin,cinfo,lc1,lc2,lc3,addC,tc1,tc2,tc3,backupC);
            uptablesceneC=new Scene(groupclas,1000,650);
            stage.setScene(uptablesceneC);                       
        }
        
        if(e.getSource()==addC)
        {
             try
        {
            Connection con5 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql5 = "insert into CLASS (CLASS_ID,SCHOOL_ID, NO_OF_STUDENTS) values(?,?,?)" ;
            PreparedStatement pst5 = con5.prepareStatement(sql5);
            
            
            try {
            pst5.setString(1, tc1.getText());
            pst5.setString(2, tc2.getText());
            pst5.setString(3, tc3.getText());
            pst5.executeUpdate();
            pst5.close();
                    con5.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                } 
            tc1.clear();
            tc2.clear();
            tc3.clear();
            
            
            Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupclas.getChildren().addAll(t);
            
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }                     
        }
        
        if(e.getSource()==section)
        {
            groupsection=new Group();
            groupsection.getChildren().addAll(imviewinfoadd,backuserlogin,secinfo,lsec1,lsec2,lsec3,lsec4,lsec5,addSec,tsec1,tsec2,tsec3,tsec4,tsec5,backupSec);
            uptablesceneSec=new Scene(groupsection,1000,650);
            stage.setScene(uptablesceneSec);                       
        }
        
        if(e.getSource()==addSec)
        {
             try
        {
            Connection con6 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql6 = "insert into SECTION (SECTION_ID, CLASS_ID, ROOM_NO, CLASS_TEACHER, NO_OF_STUDENTS) values(?,?,?,?,?)" ;
            PreparedStatement pst6 = con6.prepareStatement(sql6);
            
            try {
            pst6.setString(1, tsec1.getText());
            pst6.setString(2, tsec2.getText());
            pst6.setString(3, tsec3.getText());
            pst6.setString(4, tsec4.getText());
            pst6.setString(5, tsec5.getText());
            pst6.executeUpdate();
            pst6.close();
                    con6.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            tsec1.clear();
            tsec2.clear();
            tsec3.clear();
            tsec4.clear();
            tsec5.clear();
            
            
            Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupsection.getChildren().addAll(t);
            
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }                     
        }
        
        if(e.getSource()==result)
        {
            groupresult=new Group();
            groupresult.getChildren().addAll(imviewinfoadd,backuserlogin,rinfo,lr1,lr2,lr3,lr4,lr5,addR,tr1,tr2,tr3,tr4,tr5,backupR);
            uptablesceneRes=new Scene(groupresult,1000,650);
            stage.setScene(uptablesceneRes);                       
        }
        
        if(e.getSource()==addR)
        {
             try
        {
            Connection con7 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql7= "insert into RESULT (RESULT_ID, STUDENT_ID, FIRST_TERM, SECOND_TERM, ANNUAL,ATTENDANCE) values(?,?,?,?,?,?)" ;
            PreparedStatement pst7 = con7.prepareStatement(sql7);
            
            try {
            pst7.setString(1, tr1.getText());
            pst7.setString(2, tr2.getText());
            pst7.setString(3, tr3.getText());
            pst7.setString(4, tr4.getText());
            pst7.setString(5, tr5.getText());
            pst7.setString(6, "0");
            pst7.executeUpdate();
            pst7.close();
                    con7.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            tr1.clear();
            tr2.clear();
            tr3.clear();
            tr4.clear();
            tr5.clear();
            
            
            Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupresult.getChildren().addAll(t);
            
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }                      
        }
        
        if(e.getSource()==cr)
        {
            groupcr=new Group();
            groupcr.getChildren().addAll(imviewinfoadd,backuserlogin,crinfo,lcr1,lcr2,lcr3,addCr,tcr1,tcr2,tcr3,backupR);
            uptablesceneCr=new Scene(groupcr,1000,650);
            stage.setScene(uptablesceneCr);                       
        }
        
        if(e.getSource()==addCr)
        {
             try
        {
            Connection con7 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql7= "insert into CR (CR_ID, SECTION_ID, NAME) values(?,?,?)" ;
            PreparedStatement pst7 = con7.prepareStatement(sql7);
            
            try {
            pst7.setString(1, tcr1.getText());
            pst7.setString(2, tcr2.getText());
            pst7.setString(3, tcr3.getText());
            pst7.executeUpdate();
            pst7.close();
                    con7.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            tcr1.clear();
            tcr2.clear();
            tcr3.clear();
            
            
            Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupcr.getChildren().addAll(t);
            
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }                      
        }
        
        if(e.getSource()==event)
        {
            groupevent=new Group();
            groupevent.getChildren().addAll(imviewinfoadd,backuserlogin,evinfo,lev1,lev2,lev3,lev4,addEv,tev1,tev2,tev3,tev4,backupR);
            uptablesceneEv=new Scene(groupevent,1000,650);
            stage.setScene(uptablesceneEv);                       
        }
        
        if(e.getSource()==addEv)
        {
             try
        {
            Connection con7 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql7= "insert into EVENT (EVENT_ID, TEAM_ID, TYPE, NAME) values(?,?,?,?)" ;
            PreparedStatement pst7 = con7.prepareStatement(sql7);
            
            try {
            pst7.setString(1, tev1.getText());
            pst7.setString(2, tev2.getText());
            pst7.setString(3, tev3.getText());
            pst7.setString(4, tev4.getText());
            pst7.executeUpdate();
            pst7.close();
                    con7.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            tev1.clear();
            tev2.clear();
            tev3.clear();
            tev4.clear();
            
            
            Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupevent.getChildren().addAll(t);
            
            
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }                      
        }
        
        if(e.getSource()==routine)
        {
            grouproutine=new Group();
            grouproutine.getChildren().addAll(imviewinfoadd,backuserlogin,rouinfo,lrou1,lrou2,lrou3,lrou4,lrou5,lrou6,addRou,trou1,trou2,trou3,trou4,trou5,trou6,backupR);
            uptablesceneRou=new Scene(grouproutine,1000,650);
            stage.setScene(uptablesceneRou);                       
        }
        
        if(e.getSource()==addRou)
        {
             try
        {
            Connection con7 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql7= "insert into ROUTINE (ROUTINE_ID, SECTION_ID, TEACHER_ID, SUBJECT, TIME, RDATE) values(?,?,?,?,?,?)" ;
            PreparedStatement pst7 = con7.prepareStatement(sql7);
            
            try {
            pst7.setString(1, trou1.getText());
            pst7.setString(2, trou2.getText());
            pst7.setString(3, trou3.getText());
            pst7.setString(4, trou4.getText());
            pst7.setString(5, trou5.getText());
            pst7.setString(5, trou6.getText());
            pst7.executeUpdate();
            pst7.close();
                    con7.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            trou1.clear();
            trou2.clear();
            trou3.clear();
            trou4.clear();
            trou5.clear();
            trou6.clear();
            
            
            Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            grouproutine.getChildren().addAll(t);
            
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }                      
        }
        
        if(e.getSource()==staff)
        {
            groupstaff=new Group();
            groupstaff.getChildren().addAll(imviewinfoadd,backuserlogin,sfinfo,lsf1,lsf2,lsf3,lsf4,lsf5,addSf,tsf1,tsf2,tsf3,tsf4,tsf5,backupR);
            uptablesceneSf=new Scene(groupstaff,1000,650);
            stage.setScene(uptablesceneSf);                       
        }
        
        if(e.getSource()==addSf)
        {
             try
        {
            Connection con7 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql7= "insert into STAFF (STAFF_ID, SCHOOL_ID, NAME, AGE, TYPE,PASSWORD) values(?,?,?,?,?,?)" ;
            PreparedStatement pst7 = con7.prepareStatement(sql7);
            
            try {
            pst7.setString(1, tsf1.getText());
            pst7.setString(2, tsf2.getText());
            pst7.setString(3, tsf3.getText());
            pst7.setString(4, tsf4.getText());
            pst7.setString(5, tsf5.getText());
            pst7.setString(6, tsf5.getText()+"c");
            pst7.executeUpdate();
            pst7.close();
                    con7.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            tsf1.clear();
            tsf2.clear();
            tsf3.clear();
            tsf4.clear();
            tsf5.clear();
            
            
            Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupstaff.getChildren().addAll(t);
            
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }                      
        }
        
        if(e.getSource()==team)
        {
            groupteam=new Group();
            groupteam.getChildren().addAll(imviewinfoadd,backuserlogin,tminfo,ltm1,ltm2,ltm3,addTm,ttm1,ttm2,ttm3,backupR);
            uptablesceneTm=new Scene(groupteam,1000,650);
            stage.setScene(uptablesceneTm);                       
        }
        
        if(e.getSource()==addTm)
        {
             try
        {
            Connection con7 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            String sql7= "insert into TEAM (TEAM_ID, SCHOOL_ID, NO_OF_MEMBERS) values(?,?,?)" ;
            PreparedStatement pst7 = con7.prepareStatement(sql7);
            
            try {
            pst7.setString(1, ttm1.getText());
            pst7.setString(2, ttm2.getText());
            pst7.setString(3, ttm3.getText());
            pst7.executeUpdate();
            pst7.close();
                    con7.close();
                } catch (SQLException ex) {
                    Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            ttm1.clear();
            ttm2.clear();
            ttm3.clear();
            
            Text t=new Text();
            t.setLayoutX(220);
            t.setLayoutY(450);
            

            String sql1 = "SELECT * FROM TRIG";
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "firos", "1505084");
            PreparedStatement pst1 = con1.prepareStatement(sql1);
            
            ResultSet rs = pst1.executeQuery();
            while (rs.next())
            {
                
                t.setText(rs.getString(1));
                        
            }
            
            pst1.close();
            con1.close();
            groupteam.getChildren().addAll(t);
        }catch (SQLException ex)
        {
            System.out.println("Connection Failed! Check it from console");
            ex.printStackTrace();
        }                      
        }
        
        if(e.getSource()==backinfo)
        {
            x=0;
            root=new Group();
            root.getChildren().addAll(iv1,addupdel,update,backuserlogin);
            startscene=new Scene(root,1000,650);
            stage.setScene(startscene);
        }
  
    
    }

}
