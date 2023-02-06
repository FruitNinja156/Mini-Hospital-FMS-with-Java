package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javax.swing.*;
import javax.swing.plaf.nimbus.State;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Page6 implements Initializable {
    @FXML
    private TextField txt;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt3;

    @FXML
    private RadioButton rdn;

    @FXML
    private ToggleGroup tgl;

    @FXML
    private RadioButton rdn1;

    @FXML
    private RadioButton rdn2;

    @FXML
    private ToggleGroup tgl1;

    @FXML
    private RadioButton rdn3;

    @FXML
    private TextField txt4;

    @FXML
    private ComboBox cmb;

    @FXML
    private ComboBox cmb1;

    @FXML
    private TextField txt5;

    @FXML
    private Button edit;
        String gender;
    @FXML
    void rdnset1(ActionEvent event) {
            gender ="M";
    }

    @FXML
    void rdnset2(ActionEvent event) {
        gender ="F";
    }
String pat_type;
    @FXML
    void rdnset3(ActionEvent event) {
            pat_type ="In";
    }

    @FXML
    void rdnset4(ActionEvent event) {
            pat_type="Out";
    }

    @FXML
    void edit(ActionEvent event) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital1", "root", "");
            Statement stmt = con.createStatement();
//            String s ="select * form hospital1 WHERE id ='" +txt.getText() +"'";
            String u = "update hospital1 SET name ='"+ txt1.getText() +"'" + "WHERE  id ='" +txt.getText()+"'";
            String u1 = "update hospital1 SET lname ='"+ txt2.getText() +"'" + "WHERE  id ='" +txt.getText()+"'";
            String u2 = "update hospital1 SET gname ='"+ txt3.getText() +"'" + "WHERE  id ='" +txt.getText()+"'";
            String u3 = "update hospital1 SET sex ='"+ gender +"'" + "WHERE  id ='" +txt.getText()+"'";
            String u4 = "update hospital1 SET pat_type ='"+ pat_type +"'" + "WHERE  id ='" +txt.getText()+"'";
            String u5 = "update hospital1 SET city ='"+ cmb.getValue() +"'" + "WHERE  id ='" +txt.getText()+"'";
            String u6 = "update hospital1 SET subcity ='"+ cmb1.getValue() +"'" + "WHERE  id ='" +txt.getText()+"'";
            String u7 = "update hospital1 SET phno ='"+ txt5.getText() +"'" + "WHERE  id ='" +txt.getText()+"'";
            String u8 = "update hospital1 SET age ='"+ txt4.getText() +"'" + "WHERE  id ='" +txt.getText()+"'";
            stmt.executeUpdate(u);
            stmt.executeUpdate(u1);
            stmt.executeUpdate(u2);
            stmt.executeUpdate(u3);
            stmt.executeUpdate(u4);
            stmt.executeUpdate(u5);
            stmt.executeUpdate(u6);
            stmt.executeUpdate(u7);
            stmt.executeUpdate(u8);
            JOptionPane.showMessageDialog(null, "Record Edited!");
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error While Editing!");
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cmb.getItems().addAll("Addis Abeba", "Mekelle", "Gondar", "Bahir Dar", "Hawassa", "Gambella");
        cmb1.getItems().addAll("Bole", "Lafto", "Kirkos", "Lideta", "Yeka");

    }
}
