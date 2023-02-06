package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javax.swing.*;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class Page1 implements Initializable {
    @FXML
    private TextField txt;

    @FXML
    private TextField txt1, txt2, txt3, txt4, txt5;

    @FXML
    private ComboBox cmb, cmb1;
    @FXML
    private RadioButton rdn, rdn1;

    String gender;
    @FXML
    void rdnset (ActionEvent event){
         gender = "M";
    }
    @FXML
    void rdnset1(ActionEvent event){
        gender ="F";
    }
    String pat_Type;
    @FXML
    void rdnset2(ActionEvent event){
        pat_Type="In";
    }
    @FXML
    void rdnset3(ActionEvent event){
        pat_Type="Out";
    }
    @FXML
    void add(ActionEvent event) {
        autoID();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital1", "root", "");
            Statement stmt = con.createStatement();
            String s ="insert into hospital1 values ('" +txt.getText() +"','"+ txt1.getText() +"','" + txt2.getText() +"','" + txt3.getText() +"','"
                    +gender+"','" + pat_Type+"','" + cmb.getValue() +"','"+ cmb1.getValue()+"','"+txt4.getText()+"','"+txt5.getText()+"')";
            stmt.executeUpdate(s);
            JOptionPane.showMessageDialog(null, "Record Added!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error!");
        }
    }

    public void autoID(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital1", "root", "");
            Statement stmt = con.createStatement();

            ResultSet rst = stmt.executeQuery("select Max(id) from hospital1");
            rst.next();
            rst.getString("Max(id)");

            if(rst.getString("Max(id)")==null){
                txt.setText("AT0001");
            }
            else{
                Long id = Long.parseLong(rst.getString("Max(id)").substring(2, rst.getString("Max(id)").length()));
                id++;
                txt.setText("AT0" + String.format("%03d", id));
            }

        }catch(Exception ex){}
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cmb.getItems().addAll("Addis Abeba", "Mekelle", "Gondar", "Bahir Dar", "Hawassa", "Gambella");
        cmb1.getItems().addAll("Bole", "Lafto", "Kirkos", "Lideta", "Yeka");
    }
}
