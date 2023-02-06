package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class Page2 implements Initializable {
    @FXML
    private Button btn;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt3;

    @FXML
    private RadioButton rdn;

    @FXML
    private RadioButton rdn1;

    @FXML
    private RadioButton rdn2;

    @FXML
    private RadioButton rdn3;

    @FXML
    private ComboBox cmb;

    @FXML
    private ComboBox cmb1;

    @FXML
    private TextField txt4;

    @FXML
    private TextField txt5;

    @FXML
    private TextField txt;

    @FXML
    void edit(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital1", "root", "");
//            Statement stmt =con.createStatement();
//            String s ="select* from hospital1";
//            ResultSet rst = stmt.executeQuery(s);
//            while(rst.next()){
//            }
//        }catch(Exception ex){}

        cmb.getItems().addAll("Addis Abeba", "Mekelle", "Gondar", "Bahir Dar", "Hawassa", "Gambella");
        cmb1.getItems().addAll("Bole", "Lafto", "Kirkos", "Lideta", "Yeka");


    }

}
